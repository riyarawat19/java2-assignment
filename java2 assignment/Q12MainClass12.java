class Distance
{
	double distanceInMiles;
	void travelTime(double x)
	{   distanceInMiles=x;
		double time=distanceInMiles/60;
		System.out.println("The time taken to cover "+ distanceInMiles+"miles is "+time+" hours");
	}
}
class DistanceMKS extends Distance 
{
	void travelTime(double x)
	{   distanceInMiles=x;
		double time=distanceInMiles*1.609/100;
		System.out.println("The time taken to cover "+ distanceInMiles*1.609+ " km is"+ time+" hours when speed is 100 km per hour");
	}
}
public class Q12MainClass12 {
	public static void main(String []args)
	{
		Distance D1 = new Distance();
		DistanceMKS D2 = new DistanceMKS();
		D1.travelTime(100);
		D2.travelTime(100);
	}

}