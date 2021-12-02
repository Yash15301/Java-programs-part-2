import java.util.*;
class abc
{
	public static void main(String args[])
	{
		ArrayList<ArrayList<Integer>> a= new ArrayList<ArrayList<Integer>>();
		ArrayList<Integer>a1=new ArrayList<Integer>();
		ArrayList<Integer>a2=new ArrayList<Integer>();
		a1.add(10);
		a1.add(20);
		a2.add(30);
		a2.add(40);
		a2.add(50);
		//a.add(a1);
		a.add(a2);
		System.out.println(a1.size());
		System.out.println(a2.size());		
		System.out.println(a.size());
		System.out.println(a.get(0));
		System.out.println(a.get(1));
		System.out.println(a.get(2));
		System.out.println(a.get(3));
		System.out.println(a.get(4));
	}
}