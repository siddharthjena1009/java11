import java.util.Scanner;
public class Q10 {
	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter base and height of a triangle:");
		int b=sc.nextInt();
		int h=sc.nextInt();
		System.out.println("Area of triangle is: "+area(b,h));
		
		System.out.println("Enter side length of square:");
		int a=sc.nextInt();
		System.out.println("Area of square is: "+area(a));
		
		System.out.println("Enter radius of circle:");
		double r=sc.nextDouble();
		System.out.println("Area of circle is: "+area(r));
		
		System.out.println("Enter side lengths of rectangle:");
		double x=sc.nextDouble();
		double y=sc.nextDouble();
		System.out.println("Area of rectangle is: "+area(x,y));
	}
	public static double area(int b,int h)
	{
		return 0.5*b*h;
	}
	public static int area(int a)
	{
		return a*a;
	}
	public static double area(double r)
	{
		return Math.PI*r*r;
	}
	public static double area(double x,double y)
	{
		return x*y;
	}
}
