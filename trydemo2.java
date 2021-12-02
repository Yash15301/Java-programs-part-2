class abc
{
	public static void main(String args[])
	{
		int a[] = new int [3] ;
		int i;
		
		try
		{
			/*for(i=1;i<=3;i++)
			{
				a[i]=i*i;
			}*/
			
			for(i=0;i<3;i++)
			{
				a[i]=i/i;
			}
		}
		catch(ArrayIndexOutOfBoundsException e)
		{
			System.out.println("index is not proper");
		}
		catch(ArithmeticException e)
		{
			System.out.println("please check for mathematical errors");
		}
	}
}