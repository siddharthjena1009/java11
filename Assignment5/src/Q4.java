import java.util.Scanner;

public class Q4
{
    public static void main(String args[]) {

        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the first number: ");
        int n1 = sc.nextInt();
        int n2 = sc.nextInt();
        
        
        for(int j=n1;j<=n2;j++)
        {
        	
        	int factorial=1;
        	
        	for(int i=1;i<=j;i++)
        	{
        
        factorial = factorial*i;
        	}
        	System.out.println("factorial of +j+ is:"+factorial);