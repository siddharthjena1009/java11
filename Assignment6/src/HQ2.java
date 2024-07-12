import java.util.Scanner;
public class HQ2 {
	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter side of the cube:");
		int s=sc.nextInt();
		System.out.println("Area of cube is: "+area(s));
		
		System.out.println("Enter radius of sphere:");
		double r=sc.nextDouble();
		System.out.println("Area of sphere is: "+area(r));
		
		System.out.println("Enter Length,Breadth,Height of cuboid:");
		double l=sc.nextDouble();
		double b=sc.nextDouble();
		double h=sc.nextDouble();
		System.out.println("Area of rectangle is: "+area(l,b,h));
	}
	public static double area(int s)
	{
		return s*s*s;
	}
	public static double area(double r)
	{
		return (4.0/3)*Math.PI*r*r*r;
	}
	public static double area(double x,double y,double z)
	{
		return x*y*z;
	}
}
