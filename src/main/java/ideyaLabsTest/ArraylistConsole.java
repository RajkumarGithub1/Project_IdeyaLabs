package ideyaLabsTest;

import java.util.ArrayList;
import java.util.Scanner;

public class ArraylistConsole 
{
	public static void main(String[] args) 
	{
		Scanner input=new Scanner(System.in);
		ArrayList<String> al=new ArrayList<>();
		System.out.println("Enter String values");
		boolean b=true;
		
		while(b)
		{
			String s=input.next();
			if(s.equals("exit"))
			{
				break;
			}
			else
			{
				al.add(s);
				b=input.hasNext();
			}
				
		}
		
		System.out.println(al);
		
	}
}
