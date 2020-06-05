package NewJava_Advance_Runnable;

public class Employee {
	String empname;
	int Empno;
	Employee(String empname,int Empno){
		this.empname=empname;
		this.Empno=Empno;
		
	}
	@Override
	public String toString() {
		return "Employee [empname=" + empname + ", Empno=" + Empno + "]";
	}

}
