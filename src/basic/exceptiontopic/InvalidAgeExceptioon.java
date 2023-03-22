package basic.exceptiontopic;

public class InvalidAgeExceptioon extends RuntimeException
{
	public InvalidAgeExceptioon(String errorMsg) 
	{
		super(errorMsg);
	}
}
