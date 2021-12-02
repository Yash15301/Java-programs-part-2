class abc{
	public static void main(String args[])
	{
		try
		{
			int a=Integer.parseInt(args[0]);
			int b=Integer.parseInt(args[1]);
			int ans=0;
			
			try
			{
				ans=a/b;
				System.out.println("result is "+ ans);
			}
			catch(ArithmeticException e)
			{
				System.out.println("divide by zero");
			}
		}
		catch(NumberFormatException e)
		{
			System.out.println("incorrect type of data");
		}
		
	}
}