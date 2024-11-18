class Human
{
	void sleep()
	{
		System.out.println("Humans need a good sleep for healthy body");
	}
}
class Student extends Human
{
	void sleep()
	{
		System.out.println("Each and every student should sleep for 8 hours");
	}
}
public class Q7Main {
	public static void main(String []args)
	{
		Student S1 = new Student();
		Human H1 = new Human();
		S1.sleep();
		H1.sleep();
	}

}