package basic.iotopic.seri;

import java.io.FileInputStream;
import java.io.ObjectInputStream;

public class TestApp2 
{
	public static void main(String[] args) 
	{
		try (
				FileInputStream fin = new FileInputStream("C:\\Users\\Royal\\eclipse-workspace\\ism-2023\\list.txt");
				ObjectInputStream oin = new ObjectInputStream(fin);
			)
		{
			Student studObj = (Student)oin.readObject();
			studObj.disp();

//			Object obj = oin.readObject();
//			Student studObj = (Student)obj;
			
			
		} catch (Exception e) 
		{
			e.printStackTrace();
		}
	}
}
