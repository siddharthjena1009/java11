import java.util.Scanner;
	public class Q4{

	public static void main(String[] args){
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter lower and upper range of years:");
		int r1=sc.nextInt();
		int r2=sc.nextInt();
		for(int y=r1;y<=r2;y++) {
			int d=numberOfDaysInAYear(y);
			System.out.println("Number of days in year"+y+":"+d);
		}
	}
	public static int numberOfDaysInAYear(int y)
	{
		if(isLeapYear(y))
			return 366;
		else
			return 365;
		
	}
	public static boolean isLeapYear(int y) {
		if(y%100==0)
		{
			if(y%400==0)
				return true;
			else
				return false;
		}
		
		else {
			if(y%4==0)
				return true;
			else
				return false;
		}
	}

}
