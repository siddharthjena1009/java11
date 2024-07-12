//Write a method that finds the smallest element in an array of double values.

import java.util.Scanner;

public class Q4 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter size of array:");
		int n = sc.nextInt();

		double a[] = new double[n];
		input(a);
		display(a);

		double m = min(a);

		System.out.println("Smallest number is: " + m);
	}

	public static void display(double a[]) {
		System.out.print("Array is: ");
		for (int i = 0; i < a.length; i++) {
			System.out.print(a[i] + " ");
		}
		System.out.println();
	}

	public static void input(double a[]) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Input array elements:");
		for (int i = 0; i < a.length; i++) {
			a[i] = sc.nextDouble();
		}
	}

	public static double min(double a[]) {
		double s = a[0];
		for (int i = 1; i < a.length; i++) {
			if (a[i] < s)
				s = a[i];
		}
		return s;
	}
}
