//Write a java program to find the second largest value in an array of n elements.

import java.util.Scanner;

public class Q5 {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter size of array:");
		int n=sc.nextInt();
		
		int a[]=new int[n];
		input(a);
		display(a);
		
		int sl=find2ndLargest(a);	
		
		System.out.println("Second largest element is: "+sl);
	}
	public static void display(int a[])
	{
		System.out.print("Array is: ");
		for(int i=0;i<a.length;i++)
		{
			System.out.print(a[i]+" ");
		}
		System.out.println();
	}
	public static void input(int a[])
	{
		Scanner sc=new Scanner(System.in);
		System.out.println("Input array elements:");
		for(int i=0;i<a.length;i++)
		{
			a[i]=sc.nextInt();
		}
	}
	public static int find2ndLargest(int a[])
	{
		int max=a[0];
		int smax=0;
		for(int i=1;i<a.length;i++)
		{
			if(a[i] > max)
			{
				smax=max;
				max=a[i];
			}
			else if(a[i] > smax)
			{
				smax=a[i];
			}
		}
		return smax;
	}
}
