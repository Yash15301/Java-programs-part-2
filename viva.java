import java.util.*;
class abc
{
	public static void main(String args[])
	{
		HashMap<String,Integer,Integer> phoneBook= new HashMap<String,Integer,Integer>();
		String name="yash";
		int phone=12345678;
		int rollno=41;
		phoneBook.put(name,phone,rollno);
		Scanner scan=new Scanner(System.in);
		String s=scan.next();
		Integer PhoneNumber=phoneBook.get(s);
		System.out.println(PhoneNumber);
	}
}