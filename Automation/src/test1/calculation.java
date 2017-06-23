package test1;


class A
{
	public int a =100;
    void jaya()
	{
		System.out.println("Hello");
	}
}

class B extends A
{
void aa()
	{
	System.out.println("Hi");
	super.jaya();
	}
	
}


public class calculation extends B
{
	  void zzss()
	{
		super.aa() ;
		
	}
	
	
		public static void main(String[] args) 
		{
			         //System.out.println("Value is :" + z); 
			
			//calculation ref = new calculation ();
			//System.out.println("Value is" + ref.a);
			calculation tt = new calculation ();
			tt.zzss();
		}


		private static void zz() {
			// TODO Auto-generated method stub
			
		}
			
 }
		
		

