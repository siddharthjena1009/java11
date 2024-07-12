//Design and develop a menu driven java program for the following array operations.
//	a. Create an array of N integers
//	b. Display the array elements
//	c. Insert an element at specific position
//	d. Delete an element at a given position
//	e. Exit

import java.util.Scanner;

public class Q8 {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		int n=0,ele=0,pos=0;
		System.out.println("Enter max size of array:");
		int max=sc.nextInt();
		
		int a[]=new int[max];
		
		while(true)
		{
			System.out.println("a. Input array of N integers\n"
							 + "b. Display the array elements\n"
							 + "c. Insert an element at specific position\n"
							 + "d. Delete an element at a given position\n"
							 + "e. Exit\n");
			System.out.println("Enter your option:");
			char op=sc.next().charAt(0);
			
			switch(op)
			{
				case 'a':	System.out.println("Enter number of elements in array (n<max):");
				            n=sc.nextInt();
							input(a,n); 	
							break;
				case 'b':	display(a);	break;
				case 'c':	System.out.println("Enter the element and index to insert:");
				  			ele=sc.nextInt();
				  			pos=sc.nextInt();
				  			insert(a,n,ele,pos);
				  			n++;
				  			break;
				case 'd':	System.out.println("Enter the element's  index to delete:");
	  						pos=sc.nextInt();
	  						delete(a,n,pos);
	  						n--;
	  						break;
				case 'e': return;
			}
		}
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
	public static void input(int a[],int n)
	{
		Scanner sc=new Scanner(System.in);
		System.out.println("Input array elements:");
		for(int i=0;i<n;i++)
		{
			a[i]=sc.nextInt();
		}
	}
	public static void insert(int a[],int n,int ele,int pos)
	{
		for(int i=n-1;i>=pos;i--)
		{
			a[i+1]=a[i];
		}
		a[pos]=ele;
	}
	public static void delete(int a[],int n,int pos)
	{
		for(int i=pos;i<n;i++)
		{
			a[i]=a[i+1];
		}
		a[n-1]=0;
	}
}
