import java.util.Scanner;
public class Q1 {
public static void main(String[] args) {
	int fds=0,sds=0,firstNumber,secondNumber;
	Scanner sc=new Scanner(System.in);
	System.out.println("Enter the first number:");
	firstNumber = sc.nextInt();
	System.out.println("Enter the second number");
	secondNumber = sc.nextInt();
	for(int i=1;i<firstNumber;i++) {
		if(firstNumber % i==0)
		{
			fds=fds+i;
		}
	}
	for(int i=1;i<secondNumber;i++) {
		 if (secondNumber % i==0)
		 {
		sds =sds + i;
		if(( firstNumber == sds) && (secondNumber == fds)) {
			System.out.println(firstNumber+","+ secondNumber+"are amicable number..");	
		}
		else {
			System.out.println(firstNumber+","+secondNumber+"are not amicable numbers.");
		}	 
		 }
		}
	}
}
