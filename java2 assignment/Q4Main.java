class StudentData
{
       private String name;
    private int age;
	public StudentData()
	{
		System.out.println("Default constructor is called");
		name="Rahul";
		age=18;
		System.out.println("Name of the Student is:"+name);
		System.out.println("Age of the Student is:"+age);
	}
	public StudentData(String Name)
	{
		System.out.println(" Constructor having one argumnet is called");
		this.name=Name;
		age=20;
		System.out.println("Name of the Student is:"+Name);
		System.out.println("Age of the Student is:"+age);
		
	}
	public StudentData(String Name , int Age)
	{
		System.out.println(" Constructor having two argumnets is called");
		this.name=Name;
		this.age=Age;
		System.out.println("Name of the Student is:"+Name);
		System.out.println("Age of the Student is:"+Age);
		
	}
	
	
}
public class Q4Main {
	public static void main(String []args)
	{
		StudentData S1= new StudentData();
		StudentData S2= new StudentData("Nitin");
		StudentData S3= new StudentData("Raman",21);
	}

}