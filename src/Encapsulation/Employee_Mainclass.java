package Encapsulation;

public class Employee_Mainclass {

	public static void main(String[] args) {
		Encapsulation_employee Ee=new Encapsulation_employee();
		System.out.println(Ee.getEmp_Id());
		System.out.println(Ee.getEmp_name());
		System.out.println(Ee.getEmp_salary());
		
		
		Ee.setEmp_Id(10);
		Ee.setEmp_name("raja");
		Ee.setEmp_salary(30000.00);
		
		System.out.println(Ee.getEmp_Id());
		System.out.println(Ee.getEmp_name());
		System.out.println(Ee.getEmp_salary());
		
	
	}
	

}
