package basic.stringtopic;

import java.util.Scanner;

public class TestApp2 
{
	public static void main(String[] args) 
	{
		Scanner sc = new Scanner(System.in);
		
		System.out.println("Enter Name1 : ");
		String name1 = sc.nextLine();// abc
		System.out.println("Enter Name2 : ");
		String name2 = sc.nextLine();// ABC
		
		name1 = "RAHUL";
		
		System.out.println(name1);
		System.out.println(name2);
		
		
		
//		System.out.println(name1.compareTo(name2));
//		System.out.println(name1.equals(name2));
		// both strings are same---0
		//  1
		// -1
		
		
	}
}
