import java.util.*;
class abc
{
	public static void main(String args[])
	{
		int ans=0;
		String str = args[0].replaceAll(" ","");
		str = str.replaceAll("\\+","#+#");
		str = str.replaceAll("\\-","#-#");
		str = str.replaceAll("\\*","#*#");
		str = str.replaceAll("\\/","#/#");
		args=str.split("#");
		if(args.length!=3)
		{
			System.out.println("wrong input");
			System.exit(0);
		}
		
		switch(args[1].charAt(0))
		{
			case '+':ans=Integer.parseInt(args[0])+Integer.parseInt(args[2]);
			break;
			case '-':ans=Integer.parseInt(args[0])-Integer.parseInt(args[2]);
			break;
			case '*':ans=Integer.parseInt(args[0])*Integer.parseInt(args[2]);
			break;
			case '/':ans=Integer.parseInt(args[0])/Integer.parseInt(args[2]);
			break;
		}
		System.out.println(args[0]+" "+args[1]+" "+args[2]+" = "+ans);
		
	}
}