//Write a java program using an array that reads the integers between 1 and 100 and counts the occurrences of each. Assume the input ends with 0. 

import java.util.Scanner;

public class Q2 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);

		int a[] = new int[100];

		while (true) {
			System.out.println("Enter the integers between 1 and 100:");
			int n = sc.nextInt();
			if (n == 0)
				break;
			else
				a[n]++;
		}

		for (int i = 0; i < a.length; i++) {
			if (a[i] != 0)
				System.out.println(i + " occurs " + a[i] + " times");
		}
	}
}
