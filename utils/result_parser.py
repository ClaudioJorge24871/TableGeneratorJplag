import json
import zipfile
import os

def parse_results(zip_file_path,output_directory):
    """
    Creates a JSON file ease to transform later in table 
      given the path to the results file 
    
    PARAMS:
        zip_file_path - path to the zip file results created by JPLAG 
        output_directory - path to the output folder
    """

    # Open and extract all files to the specified output_directory
    with zipfile.ZipFile(zip_file_path, 'r') as zip_ref:

        # List all files of the output_directory that end with ".json"
        json_files = [f for f in zip_ref.namelist() if f.endswith('.json')]

        for json_file in json_files:
            zip_ref.extract(json_file, output_directory)

        print(f"Files extracted to {output_directory}")

    # Stores the extrated data
    extracted_data = []

    # Iterate extrated files 
    for file_name in json_files:
        file_path = os.path.join(output_directory, file_name)  # Creates the full path to file
    
        # Ignores the files options, overview and submissionFileIndex
        if file_name not in {"options.json", "overview.json", "submissionFileIndex.json"}: 
            try:
                with open(file_path, 'r', encoding='utf-8') as f:
                    data = json.load(f)
                    id1 = data["id1"]
                    id2 = data["id2"]
                    max_value = data.get('similarities').get('MAX', '')
                        
                    # Appends to the extracted_data the json of the current comparison
                    extracted_data.append({'id1':id1, 'id2':id2, 'MAX':max_value})
                    
            except Exception as e:
                print(f"Error processing {file_name}: {e}")

        # Clears the files on output directory
        os.remove(file_path)

    # Creates a file named mydata.json
    with open("./output/mydata.json", "w") as final:
        # Serializes obj to JSON 
        json.dump(extracted_data, final)
        