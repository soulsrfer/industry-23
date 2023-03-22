package basic.exceptiontopic;

import java.io.FileNotFoundException;
import java.util.Scanner;

public class TestApp1 
{
	public static void main(String[] args) 
	{
		Scanner sc = new Scanner(System.in);

		System.out.println("Enter no1 : ");
		int no1 = sc.nextInt();
		System.out.println("Enter no2 : ");
		int no2 = sc.nextInt();
		int ans = 0 ;

		try 
		{
			
			try 
			{
				ans = no1/no2;
				
			} catch (Exception e) 
			{
				e.printStackTrace();
			}

			try 
			{
				int a[] = new int[5];
				a[2] = 10;
				
			} catch (Exception e) 
			{
				e.printStackTrace();
			}

			
			String name = null;
			
			System.out.println(name.length());
			
			
		}
		catch (ArithmeticException | ArrayIndexOutOfBoundsException e) 
		{
			System.out.println("ArryaIndexOutofBoundException--catch block Handled");
			e.printStackTrace();
		}catch (Exception e) 
		{
			System.out.println("Exception -- catch Block");
			e.printStackTrace();
		}
		System.out.println("Addition : " + ans);
	}
}
