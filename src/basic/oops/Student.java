package basic.oops;

import java.util.Scanner;

// class - User Defined DataType
public class Student 
{
	// scope---> [default]----private protected public
	
	// class object--->scope--->class Properties = 1) Dm's 2) Mf's
	
	// 1) Dm's 
	private int rno;
	private String name;
	private int std;
	
	public void scanData() 
	{
		Scanner sc  = new Scanner(System.in);
		System.out.println("Enter Rno : ");
		rno = sc.nextInt();
		sc.nextLine();
		System.out.println("Enter Name : ");
		name = sc.nextLine();
		System.out.println("Enter Std : ");
		std = sc.nextInt();
	}
	public void disp() 
	{
		System.out.println(rno + " "+name + " "+std + "----->" + this);
	}
}
