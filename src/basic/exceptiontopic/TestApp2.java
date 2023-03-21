package basic.exceptiontopic;

public class TestApp2 
{
	public static void isValidAgeforVote(int age) 
	{
		if (age < 18) 
		{
			// raise exception
			throw new InvalidAgeExceptioon("Invalid Age ,\n\tPLease enter age gretera than 18");
			
		} else 
		{
			System.out.println("Welcome for Vote");
		}
	}
	
	public static void main(String[] args) 
	{
		isValidAgeforVote(5);
	}
}
