class Abc
{

    public void printMethod() 
    {
        System.out.println("Printed in Superclass.");
    }
}


public class new_calss extends Abc
{

    // overrides printMethod in Superclass
    public void printMethod() 
    {
        super.printMethod();
        System.out.println("Printed in Subclass");
    }
    public static void main(String[] args) {
        new_calss s = new new_calss();
        s.printMethod();    
    }
}