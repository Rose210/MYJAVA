package july2021;

import java.util.Scanner;

public class FibonacciSeries2 {
	//with recursion
	 static int a=0,b=1,c;    
	 static void printFibonacci(int n){
		
	    if(n>0){    
	         c = a + b;    
	         a = b;    
	         b = c;    
	         System.out.print(" "+c);   
	         printFibonacci(n-1);    
	     }
	 }

	public static void main(String[] args) {
		 Scanner scanner = new Scanner(System.in);
		 System.out.println("Enter value of n");
		  int n = scanner.nextInt();
		      
		  System.out.print(a+" "+b);  
		  printFibonacci(n-2);  
		 }  
		

	

}

