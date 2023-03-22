package basic.iotopic.sbow;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;

public class TestApp2 
{
	public static void main(String[] args) 
	{
		StringBuilder sb = new StringBuilder();
		FileInputStream fin = null;
		try 
		{
			fin = new FileInputStream("C:\\Users\\Royal\\eclipse-workspace\\ism-2023\\src\\basic\\iotopic\\sbow\\TestApp1.java");

			int temp ;
			
			while(	(temp = fin.read())	!= -1	) 
			{
				sb.append((char)temp);
			}
		} catch (FileNotFoundException e) 
		{
			e.printStackTrace();
		} catch (IOException e) 
		{
			e.printStackTrace();
		}
		System.out.print("Final String : "+ sb);
	}
}
