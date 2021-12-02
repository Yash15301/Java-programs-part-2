import java.io.*;
class abc
{
	public static void main(String args[]) throws IOException
	{
		int i;
		FileReader f1=new FileReader("test.txt");
		
		BufferedReader br=new BufferedReader(f1);
		
		
		String s=br.readLine();
		
		System.out.println(s);
		
		String s1=br.readLine();
		
		System.out.println(s1);
		
		br.close();
		f1.close();
		
	}
	
}