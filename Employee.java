package classesandobject;

public class Employee {
	String name;
	int year;
	String address;
	
	Employee(){
		
		System.out.println(" Information of three employees :");
		
	}
	
	Employee( String n , int y , String a){
		
		name=n;
		year=y;
		address=a;
	}
    
	 void Info (){
		  
		 System.out.println( "NAME" + "\t" + " YEAR OF JOINING " + " ADDRESS");
	 }


	

}
