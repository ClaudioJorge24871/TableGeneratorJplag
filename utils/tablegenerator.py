import json
import numpy as np
import pandas as pd

def generate_comparison_table(json_file_path):
    """
    Generates the comparison table given the path to the json file created
    The table has a list of students as its rows and columns
    
    Similarity Column is set by the max value of similarity the student got in a comparison

    Originality Column represents the % of originality. 
        - Its calculated by dividing 100 with the number of times the student got similarity above the threshold 

    PARAMS:
        json_file_path - path to the json file which contains the data to set on the table
    """
    THRESHOLD = 90

    # Reads json file and loads the data
    with open(json_file_path,'r') as f:
        data = json.load(f)

    # Hashset to store the students "ids"
    students = set()

    # HashMap to store the similaritys of the students by id
    SimilarityMap = {}
    
    # Extracts the students ids from data and stores in students set
    for comparison in data:
        students.add(comparison['id1'])
        students.add(comparison['id2'])

    # Transform all unique ids into sorted list to ensure that 
    # the order of students is the same in both the rows and columns
    students = sorted(list(students)) 

    # Number of different students to use as number of rows and cols  
    n = len(students)
    # Create the similarity matrix/table using numpy
    similarity_matrix = np.zeros((n,n))

    np.fill_diagonal(similarity_matrix,np.nan) # Diagonal is non value (self-comparison)

    # Fill the matrix with the values of comparison between two students 
    for comparison in data:
        index_student1 = students.index(comparison['id1'])
        index_student2 = students.index(comparison['id2'])
        similarity = round(100*float(comparison['MAX']),1)
        similarity_matrix[index_student1,index_student2] = similarity
        similarity_matrix[index_student2,index_student1] = similarity

        # Adds the similarity to the student map 
        SimilarityMap.setdefault(index_student1, []).append(similarity)
        SimilarityMap.setdefault(index_student2, []).append(similarity)


    # Creating dataframe (pandas) which rows and columns consists of the list of students
    df = pd.DataFrame(similarity_matrix,
                      index=students,
                      columns=students)
    
    # Creates similarity and originality columns
    similarity_column = []
    originality_column = []

    for student_index in range(len(students)):
        similarities = SimilarityMap.get(student_index,[]) # Locates similarities by student index
        max_similarity = max(similarities)
        similarity_column.append(max_similarity)

        # Classifies as high_similarity if has a value above or equal to THRESHOLD
        high_similarities = [sim for sim in similarities
                             if sim >= THRESHOLD]
        
        # Originality values as the times there was a high_similarity (starts at 100%) 
        originality = (int) (100 / len(high_similarities)) if high_similarities else 100
        originality_column.append(originality)

    # Add the Student Column to the DataFrame
    df['Student'] = students
        
    # Add the similarity and originality columns to the DataFRAME~
    df['Similarity'] = similarity_column
    df['Originality'] = originality_column


    return df
