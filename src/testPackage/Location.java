package testPackage;

public class Location 
{

	public String cellName;
	public int row;
	public int col;
    public Location(String cellName)
    {
    	this.cellName = cellName;
    	row = Integer.parseInt(cellName.substring(1));
    	col = getColumnNumberFromColumnLetter(cellName.substring(0,1));
    }
    public int getRow()
    {
        return row-1;
    }
    public int getCol()
    {
    	return col;
    }
	public static int getColumnNumberFromColumnLetter(String columnLetter)
	{
		return Character.toUpperCase(columnLetter.charAt(0)) - 'A';
	}

	
    

}
