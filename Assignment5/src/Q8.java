import java.util.*;

class Q8 {
	
	static int sumOfSeries(int n)
	{
		int sum = 0;
		for (int i = 1 ; i <= n ; i++)
			for (int j = 1 ; j <= i ; j++)
				sum += j;
		return sum;
	}
	
	public static void main(String[] args) 
	{
		int n = 20;
		System.out.println(sumOfSeries(n)); 
		
	}
}

