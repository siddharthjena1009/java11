
//Write a java program to create an array of size N and store the random values in it and find the sum and average.
//random values considered: 0 and 100
import java.util.Scanner;

public class Q1 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter size of array:");
		int n = sc.nextInt();

		int a[] = new int[n];
		storerandomValues(a);
		display(a);

		int sum = findSum(a);
		double avg = (double) sum / n;
		System.out.println("Sum=" + sum + " avg=" + avg);
	}

	public static void display(int a[]) {
		System.out.print("Array is: ");
		for (int i = 0; i < a.length; i++) {
			System.out.print(a[i] + " ");
		}
		System.out.println();
	}

	public static void storerandomValues(int a[]) {
		for (int i = 0; i < a.length; i++) {
			a[i] = (int) (Math.random() * 100);
		}
	}

	public static int findSum(int a[]) {
		int s = 0;
		for (int i = 0; i < a.length; i++) {
			s = s + a[i];
		}
		return s;
	}
}
