public class throw
{
	public static void calculate(int a,int b)
	{
		int c;
		
		if(b==0)
		{
			throw new ArithmeticException("cannot divide by zero");
		}
		
		else
		{
			c=a/b;
		}
	}
	
	public static void main(String args[])
	{
		calculate(5,0);
	}
}