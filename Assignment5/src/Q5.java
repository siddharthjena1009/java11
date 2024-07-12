import java.util.Scanner;
 
public class Q5{ 
	

    public static void main(String[] args){
    	Scanner sc=new Scanner(System.in);
    	System.out.println("Enter two numbers : ");
    	int n1=sc.nextInt();
    	int n2=sc.nextInt();
    	System.out.println("Multiplication Table:");
    	
    	for(int j=n1;j<=n2;j++)
    	{
    		System.out.println("Multiplication Table of "+j+":");
    		for(int i=1;i<=10;i++);
    		{
				System.out.println(j+"*"+i+"is m"+(j*i));
    		}
    		System.out.println();
    	}
    	
    }
}