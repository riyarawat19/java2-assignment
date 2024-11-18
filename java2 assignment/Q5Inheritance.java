class ParentClass
{
	void Method1()
	{
		System.out.println("METHOD OF PARENT CLASS");
	}
}
class ChildClass extends ParentClass
{
	void Method2()
	{
		System.out.println("METHOD OF CHILD CLASS");
	}
}
public class Q5Inheritance {
	public static void main(String []args)
	{
		ChildClass obj= new ChildClass();
		obj.Method1();//We created the object of child class and accessing the method of parent class. 
		              //This is possible because of the concept of inheritance.
		obj.Method2();
	}

}