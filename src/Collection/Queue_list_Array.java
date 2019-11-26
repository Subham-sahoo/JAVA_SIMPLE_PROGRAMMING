package Collection;

import java.util.LinkedList;
import java.util.Queue;

public class Queue_list_Array {

	public static void main(String[] args) {
Queue q=new LinkedList();
q.add("java");
q.add("ram");
q.add("12");
q.add("15");
q.add(new student());
System.out.println(q.contains("q"));
for(Object obj:q)
{
	System.out.println(obj);
}

	}

}
