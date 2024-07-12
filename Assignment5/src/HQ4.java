import java.util.Scanner;
public class HQ4 {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter a degree in radians: ");
		double x=sc.nextDouble();
		double term=1,sum=1,error=0.000001;
		int i=2;
		while(Math.abs(term)>error) {
			term=-term*(x*x)/((i-1)*i);
			sum=sum+term;
			i=i+2;
		}
		System.out.println("cos("+x+")="+sum);

	}

}
