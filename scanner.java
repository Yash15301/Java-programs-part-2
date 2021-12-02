import java.io.*;
class abc
{
	public static  void main(String args[]) throws IOException
	{
		InputStreamReader a1=new InputStreamReader(System.in);
		
		BufferedReader br=new BufferedReader(a1);
		
		System.out.println("print a string:");
		
		String s=br.readLine();
		
		System.out.println(s);
	}
}