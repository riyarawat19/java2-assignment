class SumCalculator
{
	int add(int a,int b)
	{
		return a+b;
	}
	int add(int a, int b , int c)
	{
		return a+b+c;
	}
}
public class Q6MethodOverloading {
	public static void main(String []args)
	{
		SumCalculator obj1 = new SumCalculator();
		System.out.println(obj1.add(4,5));
		SumCalculator obj2 = new SumCalculator();
		System.out.println(obj2.add(4, 5,6));
		
	}

}