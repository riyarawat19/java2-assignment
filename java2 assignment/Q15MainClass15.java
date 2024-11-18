class Animal
{
	public Animal()
	{
		System.out.println("Default constructor of animal class.");
	}
	public Animal(int a)
	{   this();
		System.out.println("Parametized constructor of animal class.");
	}
}
public class Q15MainClass15 {
	public static void main(String []args)
	{
		Animal A1=new Animal();
		Animal A2=new Animal(4);
		
	}
}

