package basic.stringtopic;

public class TestApp3 
{
	public static void main(String[] args) 
	{
		String mainStr = "abcdefgh";
//                        9797
		byte b[] = mainStr.getBytes();
		
		for (int i = 0; i < b.length; i++) 
		{
			System.out.println(mainStr.charAt(i) + " "+ b[i]);
		}

		
	}
}
