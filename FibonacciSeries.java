package july2021;

import java.util.Scanner;

public class FibonacciSeries {

	public static void main(String[] args) {
		// without recursion
		
		int a=0 ,b=1,c;
		
		Scanner scanner = new Scanner (System.in);
		System.out.println(" Please enter the value of n");
		int n = scanner.nextInt();
		System.out.print(a+ " "+b);
		for(int i =1; i<=n; i++){
			c =a+b;
			System.out.print(" "+c);
			a=b;
			b=c;
			
		}
	
		
		

	}

}
