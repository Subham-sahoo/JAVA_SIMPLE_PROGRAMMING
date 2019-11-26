package Encapsulation;

public class Mainclass1 {

	public static void main(String[] args) {
		Employee emp = new Employee();
		System.out.println(emp.getId());
		System.out.println(emp.getName());
		System.out.println(emp.getAddress());

		System.out.println("--------------------");
		emp.setId(12);
		emp.setName("ram");
		emp.setAddress("kshe");
		System.out.println(emp.getId());
		System.out.println(emp.getName());
		System.out.println(emp.getAddress());
		System.out.println("--------------------------");
		emp.setId(15);
		emp.setName("raj");
		System.out.println(emp.getId());
		System.out.println(emp.getName());
		System.out.println(emp.getAddress());

	}
}
