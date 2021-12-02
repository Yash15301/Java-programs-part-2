import java.io.*;
import java.util.*;
class abc
{
	public static void main(String args[])
	{
		int n=5;
		int binary;
		char str[];
		int arr[];
		str=Integer.toBinaryString(n).toCharArray();
		for(int i=0;i<str.length;i++)
		{
			arr[i]=Integer.parseInt(String.valueOf(str[i]));
		}
		String final_binary=Arrays.toString(arr);
		System.out.println(final_binary);
		
	}
}