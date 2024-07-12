import java.util.Scanner;
public class Q8 {
	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter a string:");
		String str=sc.next();
		String rev=reverse(str);
		if(str.compareTo(rev)==0)
			System.out.println(str+" is a pallindrome string");
		else
			System.out.println(str+" is a not pallindrome string");
	}
	public static String reverse(String str)
	{
		String rev="";
		for(int i=0;i<str.length();i++)
		{
			rev=str.charAt(i)+rev;
		}
		return rev;
	}
}


