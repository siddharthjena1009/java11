import java.util.Scanner;
public class HQ5 {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter the number of terms you want in fibonacci series:");
		int n=sc.nextInt();
		System.out.println("Fibonacci Series is : ");
		int a=0,b=1;
		for(int i=0;i<n;i++) {
			System.out.print(a+" ");
			int c=a+b;
			a=b;
			b=c;		
		}
	}
}
