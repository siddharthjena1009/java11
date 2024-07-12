import java.util.Scanner;
	public class Q2{

	public static void main(String[] args){
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter no of pentagonal numbers to print:");
		int num=sc.nextInt();
		for(int n=1;n<=num;n++) 
		{
			int p=getPentagonalNumber(n);
			System.out.print(p+"\t");
			if(n%10==0)
			System.out.println();
		}
		
	}
	public static int getPentagonalNumber(int n) 
	{
	return n*(3*n-1)/2;
}
			
		
		

	}


