import java.io.*;
class abc
{
	public static void main(String args[]) throws IOException
	{
		
		FileReader f1=new FileReader("test.txt");
		
		BufferedReader br=new BufferedReader(f1);
		
		
		String s=br.readLine();
		
		
		System.out.println(s);
		
		br.close();
		f1.close();
		
	}
	
}