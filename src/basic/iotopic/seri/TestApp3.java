package basic.iotopic.seri;

import java.io.FileOutputStream;
import java.io.ObjectOutputStream;

public class TestApp3 
{
	public static void main(String[] args) 
	{
		Student s[] = new Student[5];
		for (int i = 0; i < s.length; i++) 
		{
			s[i] = new Student();
			s[i].scan();
		}
		try (
				FileOutputStream fout = new FileOutputStream("listofrecords.txt");
				ObjectOutputStream out = new ObjectOutputStream(fout);	
			)
		{
			out.writeObject(s);
			System.out.println("success");
		} catch (Exception e) 
		{
			e.printStackTrace();
		}
		
		
		
	}
}
