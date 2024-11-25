import json
import zipfile
import os

#path to zip file
zip_file_path = "./output/results.zip"
output_directory = "./output"

# Open and extract all files to the specified output_directory
with zipfile.ZipFile(zip_file_path, 'r') as zip_ref:

    # List all files of the output_directory that end with ".json"
    json_files = [f for f in zip_ref.namelist() if f.endswith('.json')]

    for json_file in json_files:
        zip_ref.extract(json_file, output_directory)

    print(f"Files extracted to {output_directory}")

#stores the extrated data
extracted_data = []

# Iterate extrated files 
for file_name in json_files:
    file_path = os.path.join(output_directory, file_name)  # Creates the full path to file
   
    #ignores the files options, overview and submissionFileIndex
    if file_name not in {"options.json", "overview.json", "submissionFileIndex.json"}: 
        try:
            with open(file_path, 'r', encoding='utf-8') as f:
                data = json.load(f)
                id1 = data["id1"]
                id2 = data["id2"]
                max_value = data.get('similarities').get('MAX', '')
                    
                extracted_data.append({'id1':id1, 'id2':id2, 'MAX':max_value})
                
            """
            Algoritmo 
            retirar de data os parametros: id1, id2 e MAX
            adicionar ao ficheiro json criado anteriormente os valores dos parametros 
            """
        except Exception as e:
            print(f"Erro ao processar {file_name}: {e}")

    os.remove(file_path)

with open("./output/mydata.json", "w") as final:
	json.dump(extracted_data, final)