package testPackage;

public class PlayerCell extends Cell
{
	private String name;
	private int col;
	private int row;
	public PlayerCell(String name, int col, int row)
	{
		this.col = col;
		this.row = row;
		this.name = name;
	}
	public String text()
	{
		return "Y";
	}
	public int getCol()
	{
		return col;
	}
		public int getRow()
	{
		return row;
	}
	public String getInv()
	{
		return "";
	}
	public void setCol(int col)
	{
		this.col = col;
	}
	public void setRow(int row)
	{
		this.row = row;
	}
}
