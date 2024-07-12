//You can compute the standard deviation with the following formula; you have to store the
//individual numbers using an array, so that they can be used after the mean is obtained.

import java.util.Scanner;

public class Q9 {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter number of terms:");
		int n=sc.nextInt();
		
		double x[]=new double[n];
		input(x);
		display(x);
		
		double sd=deviation(x);
		System.out.println("Standard deviation="+sd);
	}
	public static void display(double a[])
	{
		System.out.print("Array is: ");
		for(int i=0;i<a.length;i++)
		{
			System.out.print(a[i]+" ");
		}
		System.out.println();
	}
	public static void input(double a[])
	{
		Scanner sc=new Scanner(System.in);
		System.out.println("Input array elements:");
		for(int i=0;i<a.length;i++)
		{
			a[i]=sc.nextInt();
		}
	}
	public static double mean(double[] x)
	{
		double s=0;
		int n=x.length;
		for(int i=0;i<x.length;i++)
		{
			s=s+x[i];
		}
		return s/n;
	}
	public static double deviation(double[] x)
	{
		double s=0;
		int n=x.length;
		double mn=mean(x);
		System.out.println("Mean="+mn);
		for(int i=0;i<x.length;i++)
		{
			s=s+Math.pow((x[i]-mn),2);
		}
		double sd=Math.sqrt(s/(n-1));
		return sd;
	}
	
}
