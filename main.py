from utils.jplag_runner import run_jplag
from utils.result_parser import parse_results
from utils.tablegenerator import generate_comparison_table
from utils.style_table import style_table
import os
from pathlib import Path
import webbrowser

# Get the absolute path of the project root
PROJECT_ROOT = Path(__file__).resolve().parent

# Absolute Paths for params of methods 
JPLAGPATH = PROJECT_ROOT / "jplag" / "jplag.jar"
SOURCEDIR = PROJECT_ROOT / "data" / "Ficha03_041"
OUTPUTDIR = PROJECT_ROOT / "output" / "results.zip"
JSONFILEPATH = PROJECT_ROOT / "output" / "comparisons.json"
TABLEOUTPUT = PROJECT_ROOT / "output"
TABLEPATH = PROJECT_ROOT / "output" / "comparison_table.html"

def main():

    # Checks if theres a previous table on TABLEPATH
    if TABLEPATH.exists():
        try:
            TABLEPATH.unlink()
        except Exception as e:
            print(f"Error deleting {TABLEPATH}: {e}")


    # Run Jplag calling run_jplag method
    run_jplag(JPLAGPATH,SOURCEDIR,OUTPUTDIR)

    # Parse the results of JPLAG 
    parse_results(OUTPUTDIR,JSONFILEPATH)

    # Generates a HTMl link with the table of comparisons
    dF = generate_comparison_table(JSONFILEPATH,TABLEOUTPUT)

    # Style the table
    html_content  = style_table(dF)

    # Save the styled HTML to the table output path
    with open(TABLEPATH, 'w') as f:
        f.write(html_content)

    # Opens the comparison table after creation
    try:
        webbrowser.open(f"file://{TABLEPATH.resolve()}")
    except Exception as e:
        print(f"Error opening the file in browser: {e}")

    # After generating table, deletes auxiliary files
    delete_files_except(TABLEOUTPUT,[TABLEPATH])

def delete_files_except(folder_path, keep_files):
    """
    Deletes files in a folder except the ones to keep.
    """
    if not isinstance(keep_files, list):
        keep_files = [keep_files]

    # Ensure all paths are absolute and convert to strings for comparison
    keep_files = [str(Path(folder_path) / f.name if isinstance(f, Path) else f) for f in keep_files]
    keep_files.append(str(Path(folder_path) / '.gitignore'))  # Keep .gitignore
    
    for filename in os.listdir(folder_path):
        file_path = str(Path(folder_path) / filename)
        if os.path.isfile(file_path) and file_path not in keep_files:
            try:
                os.remove(file_path)
                print(f"Deleted: {filename}")
            except Exception as e:
                print(f"Error deleting {filename}: {e}")


if __name__ == "__main__":
    main()