import java.util.Scanner;

public class HQ1 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter a string:");
		String str = sc.nextLine();
		int x = firstNonRepeatedCharacter(str);
		if (x != -1)
			System.out.println("First Non Repeated Character Is:" + str.charAt(x));
		else
			System.out.println("First Non Repeated Character Is not present");
	}

	public static int firstNonRepeatedCharacter(String str) {
		int c = 0, i, j;
		for (i = 0; i < str.length(); i++) {
			for (j = 0; j < str.length(); j++) {
				if (i != j && str.charAt(i) == str.charAt(j))
					break;
			}
			if (j == str.length())
				return i;
		}
		return -1;
	}
}