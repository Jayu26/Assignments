package test1;

 class Methods
{
	
	void abc()
	{
		System.out.println("This is Method1");
	}
	
	void abc( int a, float b)
	{
		System.out.println("This is method2");
	}
	
	void abc(float c, int d)
	{
		System.out.println("This is method3");
	}
	void Jaya()
	{
		System.out.println("Hello, this is Jaya");
	}
}

 public class Call1 extends Methods
 {
	 void Jaya()
		{
			System.out.println("Hello, this is Jayashree");
		}
	public static void main(String[] args)
	{
	Call1 ref = new Call1();
    //ref.abc();
	//ref.abc(3,0.2f);
	//ref.abc(5.6f,8);
	ref.Jaya();
	
	Methods obj = new Call1();
	obj.Jaya();
	}
}
