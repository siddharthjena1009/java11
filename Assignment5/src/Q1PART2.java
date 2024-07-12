import java.util.Scanner;
public class Q1PART2 {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter first number:");
		int a=sc.nextInt();
		System.out.println("Enter second number:");
		int b=sc.nextInt();
		int s1=sumOfFactors(a);
		int s2=sumOfFactors(b);
		if(s1==b && s2==a)
			System.out.println(a+" and "+b+" are amicable numbers.");
		else
			System.out.println(a+" and "+b+" are not amicable numbers.");

	}
	public static int sumOfFactors(int n)
	{
		int s=0;
		for(int i=1;i<=n/2;i++)
			if(n%i==0)
				s=s+i;
		return s;
	}
}
