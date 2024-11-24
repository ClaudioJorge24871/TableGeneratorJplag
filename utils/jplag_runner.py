import subprocess

def run_jplag(jplag_path, dir_source, dir_output):
    """
    Runs jplag 
    given the path of jplag, the source/data and the directory of output 
    
    PARAMS:
    jplag_path - path to the jplag jar executable
    dir_source - directory to the code submissions
    dir_output - directory to the code results  
    """

    # Language required by jplag, must be the language of the submitted codes 
    language = "java"

    # Creates the prompt to be executed to run jplag
    prompt = [
        "java","-jar",jplag_path,
        "-l",language,
        dir_source,
        "-r",dir_output
    ]

    # Try-Catch to run the prompt 
    try:
        subprocess.run(prompt,check=True)
    except subprocess.CalledProcessError as e: # handle error with return code (check = True)
        print(f"The prompt failed with the return code: {e.returncode}")
