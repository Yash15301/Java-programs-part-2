import java.util.*;
class abc
{
	public static void main(String args[])
	{
		String str=args[0];
		str=str.replaceAll("\\+","#+#");
		args=str.split("#");
		System.out.println(args.length);
		
	}
}