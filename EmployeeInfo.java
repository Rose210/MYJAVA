package classesandobject;

public class EmployeeInfo {

	public static void main(String[] args) {
		
		
		
		Employee emp = new Employee ();
		Employee emp1 = new Employee ("Robert" , 1994 ,  "         64C-Walls Street");
		Employee emp2 = new Employee ( " Sam", 2000 , "         68D-Walls Street");
		Employee emp3 = new Employee (" John " ,1999 , "         26B-Walls Street");
		
		emp.Info ();
		
		 System.out.println(emp1.name + " \t " + emp1.year + " \t " + emp1.address + " \t " );
		 System.out.println(emp2.name + " \t " + emp2.year + " \t " + emp2.address + " \t " );
		 System.out.println(emp3.name + " \t " + emp3.year + " \t " + emp3.address + " \t ");
		
		
		
		

	}

}
