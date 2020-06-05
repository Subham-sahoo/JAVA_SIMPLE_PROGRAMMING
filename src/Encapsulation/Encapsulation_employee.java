package Encapsulation;

import org.omg.CORBA.PRIVATE_MEMBER;

public class Encapsulation_employee 
{
private int emp_Id;
private String emp_name;
private double emp_salary;

public void setEmp_Id(int emp_Id) {
	this.emp_Id = emp_Id;
}
public void setEmp_name(String emp_name) {
	this.emp_name = emp_name;
}
public void setEmp_salary(double emp_salary) {
	this.emp_salary = emp_salary;
}
public int getEmp_Id() {
	return emp_Id;
}
public String getEmp_name() {
	return emp_name;
}
public double getEmp_salary() {
	return emp_salary;
}

}
