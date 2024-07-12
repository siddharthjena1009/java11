import java.util.Scanner;

public class HQ3 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter a string:");
		String str = sc.next();
		int x = middleCharacter(str);
		System.out.println("Middle character is = " + str.charAt(x));
	}

	public static int middleCharacter(String str) {
		return (str.length() / 2);
	}
}
