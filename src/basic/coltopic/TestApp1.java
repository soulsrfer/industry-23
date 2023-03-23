package basic.coltopic;

import java.util.ArrayList;
import java.util.Iterator;

public class TestApp1 
{
	public static void main(String[] args) 
	{
		Student s1 = new Student(1, "abc", 12);
		
		ArrayList<Student>list = new ArrayList<Student>();
//		list.add(true);//0
//		list.add(12);//1
//		list.add(12.21);//2
//		list.add(43.543f);//3		
//		list.add('R');// 4
//		list.add("rahul");//5
		list.add(s1);//6

		System.out.println("list.size() - " + list.size());
		
		
		// 1) simple for 
	
//		for (int i = 0; i < list.size(); i++) 
//		{
//			System.out.println(list.get(i));
//		}
		
		// 2) for each
//		for (Object object : list) 
//		{
//			if (object instanceof Student) 
//			{
//				Student s = (Student)object;
//				s.disp();
//			} else 
//			{
//				System.out.println(object);
//			}
//		}
		// 3) iterator
		
		
		
		Iterator<Student>itr = 	list.iterator();
		while(itr.hasNext())
		{                  
			Object object = itr.next();
			if (object instanceof Student)        
			{                                     
				Student s = (Student)object;      
				s.disp();                         
			} else                                
			{                                     
				System.out.println(object);       
			}                                     
		}                                         
		
		
		
		
		
		
		
		
		
		
		
		
		
	}
}
