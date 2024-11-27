import pandas as pd

def style_table(df):
    """
    Style the comparison table given by the DataFrame

    PARAMS:
        df - Dataframe 
    """
    # Raise an error if DataFrame doesnt exist
    if df is None:
        raise ValueError("The DataFrame is None, cannot style a NoneType object.")
    
    def color_similarity(val, is_originality=False):
        """Assign color classes based on similarity or originality value."""
        if isinstance(val, (int, float)):
            if is_originality:  # Logic for Originality (inverse colors)
                if val <= 50 and val > 0:
                    op = 1 - (val / 70)
                    return f'background-color: rgba(255,113,70,{op}); color: white;'  
                elif val <= 90 and val > 0:
                    op = (val / 90)
                    return f'background-color: rgba(255,174,0,{op}); color: black;' 
                elif val <= 100 and val > 0:
                    op = (val / 100)
                    return f'background-color: rgba(128,255,128,{op}); color: black;'  
                else:
                    return 'background-color: rgb(173,216,230); color: black;'  # Default Light Blue
            else:  # Logic for Similarity (original colors)
                if val <= 50 and val > 0:
                    op = 1 - (val / 70)
                    return f'background-color: rgba(128,255,128,{op}); color: black;'  
                elif val <= 90 and val > 0:
                    op = (val / 90)
                    return f'background-color: rgba(255,174,0,{op}); color: black;' 
                elif val <= 100 and val > 0:
                    op = (val / 100)
                    return f'background-color: rgba(255,113,70,{op}); color: white;'  
                else:
                    return 'background-color: rgb(173,216,230); color: black;'  # Default Light Blue
        return ''
    
    def highlight_students(val):
        """Apply light-blue background to Students column."""
        return 'background-color: lightblue; color: black;'
    

    # Create styled DataFrame
    styled_df = df.style\
        .applymap(highlight_students, subset=['Student'])\
        .applymap(lambda val: color_similarity(val, is_originality=False), subset=pd.IndexSlice[:, df.columns[:-2]])\
        .applymap(lambda val: color_similarity(val, is_originality=True), subset=['Originality'])\
        .applymap(lambda val: color_similarity(val, is_originality=False), subset=['Similarity'])\
        .set_table_attributes('style="border-collapse: collapse;"')\
        .set_table_styles([
            {'selector': 'th', 'props': [('background-color', 'lightblue'), 
                                        ('color', 'black'), 
                                        ('border', '1px solid black')]},
            {'selector': 'td', 'props': [('border', '1px solid gray'), 
                                        ('text-align', 'center')]},
        ])

    # Dict to format the DF with 1 decimal point on numbers and % on Originality Column
    format_dict = {
        col: ('{:.1f}' if col != "Originality" else lambda x: f"{x:.1f}%")
        for col in df.select_dtypes(include=['float64', 'int64']).columns
    }       
    styled_df = styled_df.format(format_dict)

    # Generate HTML
    html_content = styled_df.to_html(index=True)

    # Wrap with full HTML structure
    full_html = f"""
    <html>
    <head>
        <style>
            table {{ border-collapse: collapse; width: 100%; }}
            th, td {{ border: 1px solid black; padding: 8px; text-align: center; }}
            th {{ background-color: lightblue; }}
        </style>
    </head>
    <body>
        <h1>Comparison Table</h1>
        {html_content}
    </body>
    </html>
    """

    return full_html