package testPackage;

public class Map 
{
	private Cell[][] grid;
	private PlayerCell player;
	public Map()
	{
		
		grid = new Cell[20][20];
		for (int r = 0; r < grid.length; r++)
		{
			for (int c = 0; c < grid[0].length; c++)
			{
				grid[r][c] = new Cell();
			}
		}
		player = new PlayerCell("Player", ((int)(Math.random() * 5 + 1)), (int)(Math.random() * 5 + 1));
		grid[player.getRow()][player.getCol()] = player;
	}
	public String getMap()
	{
		String map = "";
		for (int r = 0; r < grid.length; r++)
		{
			for (int c = 0; c < grid[0].length; c++)
			{
				map += grid[r][c].text() + " ";
			}
			map += "\n";
		}
		return map;
	}
	public String processCommand(String text)
	{
		if (text.toUpperCase().equals("W"))
		{
			if (player.getRow() != 0)
			{
				grid[player.getRow()][player.getCol()] = new Cell();
				player.setRow(player.getRow() - 1);
				grid[player.getRow()][player.getCol()] = player;
				return getMap();
			}
			System.out.println("You can't go there!");
			return "";
		}
		else if(text.toUpperCase().equals("S"))
		{
			if (player.getRow() != 19)
			{
				grid[player.getRow()][player.getCol()] = new Cell();
				player.setRow(player.getRow() + 1);
				grid[player.getRow()][player.getCol()] = player;	
				return getMap();
			}
			System.out.println("You can't go there!");
			return "";	
		
		}
		else if(text.toUpperCase().equals("A"))
		{
			if (player.getCol() != 0)
			{
				grid[player.getRow()][player.getCol()] = new Cell();
				player.setCol(player.getCol() - 1);
				grid[player.getRow()][player.getCol()] = player;	
				return getMap();
			}
			System.out.println("You can't go there!");
			return "";
		}
		else if(text.toUpperCase().equals("D"))
		{
			if (player.getCol() != 19)
			{
				grid[player.getRow()][player.getCol()] = new Cell();
				player.setCol(player.getCol() + 1);
				grid[player.getRow()][player.getCol()] = player;	
				return getMap();
			}
			System.out.println("You can't go there!");
			return "";	
		}
		

		return "";
	}
}
