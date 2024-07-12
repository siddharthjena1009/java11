//Write a java program that implements the array reversal algorithm

import java.util.Scanner;

public class Q6 {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter size of array:");
		int n=sc.nextInt();
		
		int a[]=new int[n];
		input(a);
		display(a);
		
		reverse(a);	
		
		System.out.println("After reversing:");
		display(a);
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
	public static void reverse(int a[])
	{
		for(int i=0,j=a.length-1;i<j;i++,j--)
		{
			int t=a[i];
			a[i]=a[j];
			a[j]=t;
		}
	}

}
