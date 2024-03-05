package testPackage;

import java.util.Scanner;

public class main 
{
	public static void main(String[] args)
	{
		Map map = new Map();
		System.out.print(map.getMap());
		Scanner con = new Scanner(System.in);
		String text = con.nextLine();
	    while(!text.equals("quit"))
	    {
	    	System.out.println(map.processCommand(text));
	    	text = con.nextLine();
	    }
	}
}	
