import java.util.Scanner;
class ThreeDObject
{
	double wholeSurfaceArea()
	{
		System.out.println("This method will return the total Surface area of the object");
		return 0;
	}
	double volume()
	{
		System.out.println("This method will return the volume of the object");
		return 0;
	}
}
class Box extends ThreeDObject
{
	double length;
	double breadth;
	double height;
	public Box(double a,double b,double c)
	{
		length=a;
		breadth=b;
		height=c;
	}
	double wholeSurfaceArea()
	{
		 double TSA=2*(length*breadth+breadth*height+height*length);
		 return TSA;
	}
	double volume()
	{
		double v=length*breadth*height;
		return v;
	}
}
class Cube extends ThreeDObject
{
	double side;
	public Cube(double a)
	{
		side=a;
	}
	double wholeSurfaceArea()
	{
		 double TSA=6*side*side;
		 return TSA;
	}
	double volume()
	{
		double v=side*side*side;
		return v;
	}
}
class Cylinder extends ThreeDObject
{
	double radius;
	double height;
	public Cylinder(double a,double b)
	{
		radius=a;
		height=b;
	}
	double wholeSurfaceArea()
	{
		 double TSA=2*3.14*radius*(radius+height);
		 return TSA;
	}
	double volume()
	{
		double v=3.14*radius*radius*height;
		return v;
	}
}
class Cone extends ThreeDObject
{
	double radius;
	double height;
	double slantheight;
	public Cone(double a,double b, double c)
	{
		radius=a;
		height=b;
		slantheight=c;
	}
	double wholeSurfaceArea()
	{
		 double TSA=3.14*radius*(radius+slantheight);
		 return TSA;
	}
	double volume()
	{
		double v=3.14*radius*radius*slantheight;
		return v;
	}
}
public class Q9MainClass {
	public static void main(String []args)
	{
		Scanner scan = new Scanner(System.in);
		System.out.println("Enter Dimensions of a box:");
		double a=scan.nextDouble();
		double b=scan.nextDouble();
		double c=scan.nextDouble();
		Box B1 = new Box(a,b,c);
		System.out.println("Total surface area of the box is"+B1.wholeSurfaceArea());
		System.out.println("Volume of the box is:"+B1.volume());
		System.out.println("Enter Dimensions of a cube:");
		double obj=scan.nextDouble();
		Cube C1 = new Cube(obj);
		System.out.println("Total surface area of the cube is"+C1.wholeSurfaceArea());
		System.out.println("Volume of the cube is:"+C1.volume());
		System.out.println("Enter Dimensions of a Cylinder:");
		double obj1=scan.nextDouble();
		double obj2=scan.nextDouble();
	    Cylinder C2 = new Cylinder(obj1,obj2);
		System.out.println("Total surface area of the cyclinder is"+C2.wholeSurfaceArea());
		System.out.println("Volume of the cyclinder is:"+C2.volume());
		System.out.println("Enter Dimensions of a Cone:");
		double obj3=scan.nextDouble();
		double obj4=scan.nextDouble();
		double obj5= scan.nextDouble();
	    Cone C3 = new Cone(obj3,obj4,obj5);
		System.out.println("Total surface area of the cone is"+C3.wholeSurfaceArea());
		System.out.println("Volume of the cone is:"+C3.volume());
		
	}

}