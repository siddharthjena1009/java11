import java.util.Scanner;
public class HQ5 {
	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter 3 integers:");
		int a=sc.nextInt();
		int b=sc.nextInt();
		int c=sc.nextInt();
		boolean res=areConsecutive(a,b,c);
		System.out.println(a+" "+b+" "+c+" "+" are consecutive: "+ res);
	}
	public static boolean areConsecutive(int a,int b,int c)
	{
		if(a==b-1 && b==c-1)
			return true;
		else
			return false;
	}
}
