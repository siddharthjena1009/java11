// Input 10 integers from the keyboard into an array. The number to be searched is entered through
// the keyboard by the user. Write a java program to find if the number to be searched is present in
// the array and if it is present, display the number of times it appears in the array.

import java.util.Scanner;
public class Q3 {
	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter size of array:");
		int n=sc.nextInt();
		
		int a[]=new int[n];
		input(a);
		display(a);
		
		System.out.println("Enter element to search:");
		int ele=sc.nextInt();
		
		int cnt=searchAndCount(a,ele);	
		
		System.out.println("Number of times "+ele+" appears in the array is "+cnt);
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
	public static int searchAndCount(int a[],int ele)
	{
		int c=0;
		for(int i=0;i<a.length;i++)
		{
			if(a[i]==ele)
				c++;
		}
		return c;
	}
}
