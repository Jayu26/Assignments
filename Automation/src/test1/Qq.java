package test1;

public class Qq 
{ 
	static int i, j;


	public static void main(String[] args) 
	{
		for (i=1 ; i<=5 ; i++)
		{
			for (j=5; j>=i ; j--)
			{
				System.out.print("*");
				
			}
			
			System.out.print("\n");
		}
		
		if ( i>10)
		{
			System.out.println( "hi");
		}
		else if (i==10)
		{
			System.out.println("hello");
		}
		else
		{
			System.out.println("Thank You");
		}
	}
	
	
}	


	
 