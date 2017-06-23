package Google_Search;

/*package Google_Search;

public class hashcode
    {
      static float a ;
	
	public static void main(String[] args) {
	hashcode ref	= new hashcode();
	a = ref.hashCode();
	System.out.println("Hashcode is :" + a);

	}

}*/


class Parent
{
	private int a = 50 ;

	public int getA() {
		return a;
	}

	public void setA(int a) {
		this.a = a;
	}
	
	
	
}

class Child
{
	public static void main (String[] args)
	{
	Parent ref = new Parent() ;
	ref.setA(70);
	ref.getA();
	System.out.println("The value of A is :" + ref.getA());
	}
}