import java.io.*;
class abc
{
	public static void main(String args[]) throws IOException
	{
		int i;
		FileReader f1=new FileReader("test.txt");
		
		BufferedReader br=new BufferedReader(f1);
		
		
		String s=null;
	
		while((s=br.readLine())!=null)
		{
			System.out.println(s);
		}
		
		
		
		br.close();
		f1.close();
		
	}
	
}