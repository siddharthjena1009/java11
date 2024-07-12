//Bubble sort

import java.util.Scanner;

public class Q10 {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter size of array:");
		int n=sc.nextInt();
		
		int a[]=new int[n];
		input(a);
		display(a);
		
		sort(a);	
		
		System.out.println("After sorting:");
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
	public static void sort(int a[])
	{
		int n=a.length;				
		for(int i=0;i<n-1;i++)
		{
			for(int j=0;j<n-i-1;j++)
			{
				if(a[j]>a[j+1])
				{
					int t=a[j];
					a[j]=a[j+1];
					a[j+1]=t;
				}
			}
		}	
	}

}
