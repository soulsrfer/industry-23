package basic.coltopic.crud;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.Scanner;

import basic.coltopic.Student;

public class TestApp1 
{
	public static void main(String[] args) 
	{
		ArrayList<Student> list = new ArrayList<Student>(); 
		Scanner sc = new Scanner(System.in);
		// 1) for insert
		// 2) for update
		// 3) for delete
		// 4) display
		// 5) search
		int choice = 0;
		while(choice != 6) 
		{
			System.out.println("1) For Insert");
			System.out.println("2) For update");
			System.out.println("3) For delete");
			System.out.println("4) For display");
			System.out.println("5) For search By Rno");
			System.out.println("6) For Exit");
			choice = sc.nextInt();
			switch (choice)
			{
				case 1: Student s = new Student();
						s.scan();
						list.add(s);
						System.out.println("Success inserted");
						break;
				case 2:
					break;
				case 3:
					break;
				case 4:
						Iterator<Student>itr = list.iterator();
						while(itr.hasNext()) 
						{
							System.out.println(itr.next());
						}	
					break;
				case 5: 
						 boolean flag = true;
						System.out.println("Enter Rno which you want to search : ");
						int search = sc.nextInt();
						
						for (int i = 0; i < list.size(); i++) 
						{
							Student s1 = list.get(i);
							if (s1.getRno() == search) 
							{
								flag = false;
								s1.disp();	
							} 
						}
						if(flag) 
						{
							System.out.println("Given rno nor found in records");
						}
					break;
				default: 
					break;
			}

			
		}
		
		
	}
}
