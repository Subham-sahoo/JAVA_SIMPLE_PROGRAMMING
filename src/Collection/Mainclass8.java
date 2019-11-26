package Collection;
import java.util.ArrayList;
import java.util.ListIterator;

public class Mainclass8 {

	public static void main(String[] args) 
	{
   ArrayList al=new ArrayList();
   al.add(10);
   al.add(12);
   al.add(13);
   al.add("java");
   al.add(null);
   al.add("raja");
   al.add(10);
   al.add("ram");
  ListIterator i1= al.listIterator();
  while(i1.hasNext())
  {
	  System.out.println(i1.next());
  }
  System.out.println("------------");
  while(i1.hasPrevious())
  {
	  System.out.println(i1.previous());
  }
	}
}


