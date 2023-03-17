package basic.oops;

public class TestApp1 
{
	public static void main(String[] args) 
	{
		Student s1 = new Student();
		
		System.out.println("s1.toString() --- "+s1.toString());
		System.out.println("s1---" + s1);
		
		Student s[] = new Student[5];
		System.out.println("s.getClass().getName()---" + s.getClass().getName());

		for (int i = 0; i < s.length; i++) 
		{
			s[i] = new Student();
			s[i].scanData();
		}
		for (int i = 0; i < s.length; i++) 
		{
			s[i].disp();
		}
	}
}
