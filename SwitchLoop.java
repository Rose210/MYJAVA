package july2021;

import java.util.Scanner;

public class SwitchLoop {

	public static void main(String[] args) {
		
		System.out.println("Please enter two number");
		
		System.out.println("Enter first number");
        Scanner scanner =new Scanner (System.in);
		int a = scanner.nextInt();
		
		
		System.out.println("Enter second number");
		Scanner sc = new Scanner (System.in);
		int b = sc.nextInt();
		
		System.out.println(" The numbers are " + a + " and " + b);
		
		
		int choice;
		System.out.println("Pick one : 1.Add   2. Subtract   3.Divide    4.Multiply" );
		Scanner c = new Scanner (System.in);
		choice = c.nextInt();
		
		switch(choice){
		
		case 1: int sum = a+b;
		        System.out.println(sum);
		        break;
		        
		case 2: int sub = a-b;
		        System.out.println(sub);
		        break;
		        
		case 3: int div = a/b;
		        System.out.println(div);
		        break;
		        
		case 4: int mult =a*b;
		        System.out.println(mult);
		        break;
		        
		default : System.out.println ("Invalid Choice");
		          System.out.println(" Please enter valid choice");
		         break;
		        
		}
		
		
		

	}

}
