import java.util.Scanner;
class Employee
{
	int emp_id;
	String emp_name;
	double basic_salary;
	Employee(int a , String b , double c)
	{
		emp_id=a;
		emp_name=b;
		basic_salary=c;
	}
	void gross_salary()
	{
		double a= basic_salary-(18*basic_salary)/100;
		System.out.println("Gross salary after deducting 18 percent gst: "+ a);
	}
}
public class Q14MainClass14 {
	public static void main(String []args)
	{   Scanner scan = new Scanner(System.in);
	    System.out.println("Enter Employee id ,employee name and salary");
	    int a=scan.nextInt();
	    String b= scan.next();
	    double c=scan.nextDouble();
		Employee E1 = new Employee(a,b,c);
		E1.gross_salary();
	}

}