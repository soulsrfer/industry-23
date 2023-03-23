package basic.coltopic;

import java.util.ArrayList;
import java.util.ListIterator;

public class TestApp3 
{
	public static void main(String[] args) 
	{
		ArrayList<String> list = new ArrayList<String>();
		list.add("ankur");
		list.add("rakesh");
		list.add("ramesh");
		list.add("ajay");
		list.add("sagar");
		list.add("kiran");
		
		ListIterator<String> ltr = 	list.listIterator();
		while (ltr.hasNext()) 
		{
			String name = (String) ltr.next();
			System.out.println(name);
		}
		System.out.println("------------------------------");

		while (ltr.hasPrevious()) 
		{
			String name = (String) ltr.previous();
			System.out.println(name);
		}
	
	}
}
