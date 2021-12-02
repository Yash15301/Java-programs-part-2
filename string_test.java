import java.util.*;
import java.io.*;

class abc
{
	public static void main(String args[])
	{
	String[] str= {"hello", "world"};
		System.out.println("Before ");
		System.out.println(Arrays.toString(str));
		str[0]=str[0].substring(0,1) + 'x' + str[0].substring(2);
		System.out.println("after");
		System.out.println(Arrays.toString(str));
	}
}