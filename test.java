import java.util.*;
class abc
{
	public static void main(String args[])
	{
		Scanner sc=new Scanner(System.in);
		System.out.println("enter number to convert");
		String a[]=new String[10];
		for(int i=0;i<1;i++)
		{
			a[i]= sc.next();
		}	
		long b=Long.parseLong(a[0]);
		System.out.println(b);
	}
}