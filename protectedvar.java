class abc
{
     void s()
	 {
		 protected int a=10;
		 System.out.println(a);
	 }
}

class xyz extends abc
{	
	void s1()
	{
		int b =20;
		System.out.println(b);
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
		x1.s();
	}
}
