package basic.oops.encaptopic;

import basic.oops.Student;

public class TestApp1 
{
	public static void main(String[] args) 
	{
		Employee e = new Employee();
		
		e.setId(1);
		e.setName("rahul");
		e.setSalary(10000);
		e.setDsgn("ABC");
		
				
		System.out.println(e.getId() + " " +e.getName() + " " +e.getSalary() + " " + e.getDsgn());
		
	}

}
