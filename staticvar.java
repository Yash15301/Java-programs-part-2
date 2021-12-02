class abc
{
	 void s()
	{
		static int a=10;
		a++;
		System.out.println(a);
	}
}

class xyz 
{
	void s1()
	{
		int a=20;
		a++;
		System.out.println(a);
	}
}

class abc
{
	public static void main(String args[])
	{
		abc a1=new abc();
		xyz x1=new xyz();
		a1.s();
		x1.s1();
	}
}
	