import java.io.*;
class abc
{
	public static void main(String args[]) throws IOException
	{
		File f1=new File("test.txt");
		
		f1.createNewFile();
		
		FileWriter f=new FileWriter("test.txt");
		
		BufferedWriter b=new BufferedWriter(f);
		
		InputStreamReader a1=new InputStreamReader(System.in);
		
		BufferedReader br=new BufferedReader(a1);
		
		System.out.println("print a string:");
		
		String s=br.readLine();
		
		b.write(s);
		b.close();
		a1.close();
		f.close();
	}
}