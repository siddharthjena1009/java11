import java.util.Scanner;
public class HQ4 {
	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter a string (line):");
		String str=sc.nextLine();
		int cnt=countWords(str);
		System.out.println("Number of words = "+cnt);
	}
	public static int countWords(String str)
	{
		String words[]=str.split(" ");		
		return words.length;
	}
}
