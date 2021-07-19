package july2021;

import java.util.Scanner;
public class ExeMin {

	public static void main(String[] args) {
	
		Scanner scanner = new Scanner (System.in);
		System.out.println("Please enter number in minutes :");
		double min = scanner.nextDouble();

		double y = 60*24*365;
		long d=60*24;
		 
		long years=(long)(min/y);
		int days= (int)(min/d)%365;
		
		System.out.println((int)min + " minutes is approximately "+ years + " years and " + days + " days ");
		
		
	}
	

	}

