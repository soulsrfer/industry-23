package basic.coltopic;

import java.util.ArrayList;
import java.util.Collections;

public class TestApp4 
{
	public static void main(String[] args) 
	{
		Student s1 = new Student(1, "rahul", 9);
		Student s2 = new Student(2, "ankur", 8);
		Student s3 = new Student(3, "sagar", 11);
		Student s4 = new Student(4, "rakesh", 12);
		Student s5 = new Student(5, "ramesh", 10);
		
		ArrayList<Student> list = new ArrayList<Student>();
		list.add(s1);
		list.add(s2);
		list.add(s3);
		list.add(s4);
		list.add(s5);
		Collections.sort(list, new StdWiseStudentComparator());
		for (int i = 0; i < list.size(); i++) 
		{
			Student s = list.get(i);
			System.out.println(s.getRno() + "  " + s.getName() +  " "+s.getStd());
		} 
		System.out.println("Namewise Sorting : ");
		Collections.sort(list, new NameWiseStudentComparator());

		for (int i = 0; i < list.size(); i++) 
		{
			Student s = list.get(i);
			System.out.println(s.getRno() + "  " + s.getName() +  " "+s.getStd());
		} 
	}
}
