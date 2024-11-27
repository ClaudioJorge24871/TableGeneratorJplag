import pandas as pd

def style_table(df):
    if df is None:
        raise ValueError("The DataFrame is None, cannot style a NoneType object.")
    
    def color_similarity(val):
        """Assign color classes based on similarity value."""
        if isinstance(val, (int, float)):
            if val <= 20:
                return 'background-color: green; color: white;'
            elif val <= 70:
                return 'background-color: yellow; color: black;'
            else:
                return 'background-color: red; color: white;'
        return ''
    
    df = df.round(1)

    # Create styled DataFrame
    styled_df = df.style\
        .applymap(color_similarity, subset=pd.IndexSlice[:, df.columns[:-2]])\
        .applymap(color_similarity, subset=['Similarity', 'Originality'])\
        .set_table_attributes('style="border-collapse: collapse;"')\
        .set_table_styles([
            {'selector': 'th', 'props': [('background-color', 'lightblue'), 
                                         ('color', 'black'), 
                                         ('border', '1px solid black')]},
            {'selector': 'td', 'props': [('border', '1px solid gray'), 
                                         ('text-align', 'center')]}
        ])

    styled_df = styled_df.format({col: '{:.1f}' for col in df.select_dtypes(include=['float64', 'int64']).columns})


    # Generate HTML
    html_content = styled_df.to_html(index=True)

    # Optional: Wrap with full HTML structure
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