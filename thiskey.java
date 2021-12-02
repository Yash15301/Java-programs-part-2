class abc
{
    int a;
	void s()
	{
		int a=20;
		//System.out.println(a);
		System.out.println(this.a);
	}
}

class a
{
	public static void main(String args[])
	{
		abc a1=new abc();
		a1.a=30;
		a1.s();
	}
}