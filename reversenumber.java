import java.util.*;
public class reversenumber
{
	public static void main(String args [])
	{
		Scanner sc=new Scanner(System.in);
		int a[]=new int [10];
		int i,j;
		System.out.println("enter 10 numbers:");
		for(i=0;i<a.length;i++)
		{
			a[i]=sc.nextInt();
		}
		for(i=0;i<a.length;i++)
		{
		System.out.println(" "+a[i]);
		}
	
			reverse(a);
			System.out.println("numbers in reverse order are:");
			for(i=0;i<a.length;i++)
			{
				System.out.println(" "+a[i]);
			}
	}
	public static void reverse(int[] b)
	{
		int temp;
		for(int i=0,j=b.length-1; i<b.length/2; i++,j--)
		{
			temp=b[i];
			b[i]=b[j];
			b[j]=temp;
		}
		
		
	}
}