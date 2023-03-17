package basic.stringtopic;

public class TestApp4 
{
	public static void main(String[] args) 
	{
		String value = "royal technosoft pvt lt";
//                      0123456789012345
		char a[]= new char[10];
		

		value.getChars(6, 16, a, 0);

		for (int i = 0; i < a.length; i++) 
		{
			System.out.print(a[i]);
		}
		
		
	} 
}
