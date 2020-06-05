package NewJava_Advance_Runnable;

import java.util.ArrayList;
import java.util.Collections;

public class EmpMainClass {

	public static void main(String[] args) {
	ArrayList<Employee> al=new ArrayList<Employee>();
	al.add(new Employee("raja",1213));
	al.add(new Employee("ram",1214));
	al.add(new Employee("raju",12231));
	al.add(new Employee("raai",12543));
	al.add(new Employee("rinu",12312));
	al.add(new Employee("rigma",13253));
	//System.out.println(al);
	Collections.sort(al,(e1,e2)->e1.Empno<e2.Empno?-1:e1.Empno>e2.Empno?1:0);
	//System.out.println(al);
	}
	
}
