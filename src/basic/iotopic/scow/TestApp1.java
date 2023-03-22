package basic.iotopic.scow;

import java.io.FileWriter;
import java.io.IOException;
import java.util.Scanner;

public class TestApp1 
{
	public static void main(String[] args) 
	{
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter Name : ");
		String name = sc.nextLine();

		try 
		{
			FileWriter fw = new FileWriter("test2.txt");
			
			fw.write(name);
		
			fw.close();
			System.out.println("Success");
		} catch (IOException e) 
		{
			e.printStackTrace();
		}
	}
}
