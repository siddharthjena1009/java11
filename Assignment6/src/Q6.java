import java.util.Scanner;
public class Q6 {
	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter a string:");
		String str=sc.next();
		System.out.println("Enter a character for frequency count:");
		char ch=sc.next().charAt(0);
		int cnt=count(str,ch);
		System.out.println("Frequency of "+ch+" is "+cnt);
	}
	public static int count(String str, char ch)
	{
		int c=0;
		for(int i=0;i<str.length();i++)
		{
			if(str.charAt(i)==ch)
				c++;
		}
		return c;
	}
}
