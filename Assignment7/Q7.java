//Write a java program to convert a decimal integer to its corresponding octal representation.

import java.util.Scanner;

public class Q7 {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter an integer value:");
		int n=sc.nextInt();
				
		int a[]=convertToOctal(n);
				
		System.out.println("Octal number is:");
		display(a);
	}
	public static void display(int a[])
	{
		for(int i=0;i<a.length;i++)
		{
			System.out.print(a[i]);
		}
		System.out.println();
	}
	public static int[] convertToOctal(int n)
	{
		int a[]=new int[32/3+1];
		int i=a.length-1;
		while(n>0)
		{
			int r=n%8;
			a[i--]=r;
			n=n/8;
		}
		return a;
	}
}
