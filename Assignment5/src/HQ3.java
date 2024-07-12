import java.util.Scanner;
public class HQ3 {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter a degree in radians: ");
		double x=sc.nextDouble();
		double term=x,sum=x,error=0.000001;
		int i=3;
		while(Math.abs(term)>error) {
			term=-term*(x*x)/((i-1)*i);
			sum=sum+term;
			i=i+2;
		}
		System.out.println("sin("+x+")="+sum);

	}

}
