from utils.jplag_runner import run_jplag
from utils.result_parser import parse_results
from utils.tablegenerator import generate_comparison_table

from pathlib import Path

# Get the absolute path of the project root
PROJECT_ROOT = Path(__file__).resolve().parent

JPLAGPATH = PROJECT_ROOT / "jplag" / "jplag.jar"
SOURCEDIR = PROJECT_ROOT / "data" / "Ficha03_041"
OUTPUTDIR = PROJECT_ROOT / "output" / "results.zip"
JSONFILEPATH = PROJECT_ROOT / "output" / "comparisons.json"
TABLEOUTPUT = PROJECT_ROOT / "output"

def main():
    # Run Jplag calling run_jplag method
    run_jplag(JPLAGPATH,SOURCEDIR,OUTPUTDIR)

    # Parse the results of JPLAG 
    parse_results(OUTPUTDIR,JSONFILEPATH)

    # Generates a HTMl link with the table of comparisons
    generate_comparison_table(JSONFILEPATH,TABLEOUTPUT)



if __name__ == "__main__":
    main()