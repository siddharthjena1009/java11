import java.util.Scanner;
public class Q2PART2 {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter a number:");
		int n=sc.nextInt();
		int rev=findReverse(n);
		if(isPrime(n) && isPrime(rev))
		    System.out.println(n+"is Twisted prime");
		else
			System.out.println(n+"is not Twisted prime");
	}
	public static int findReverse(int n) {
		int rev=0;
		while(n!=0)
		{
			rev=rev*10+n%10;
			n=n/10;
		}
		return rev;
	}
	public static boolean isPrime(int n) {
		for(int i=2;i<=(int)Math.sqrt(n);i++) {
			if(n%i==0)
				return false;
		}
		return true;
	}
	
}