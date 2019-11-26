package Collection;
import java.util.HashSet;
public class Sorting_Number {
public static void main(String[] args) {
   int[] a= {1,3,4,2,3,3,4,5,5};
     HashSet<Integer> hs=new HashSet<Integer>();
     for(int i=0;i<a.length;i++)
     {
    	 hs.add(a[i]); 
     }
     for(int i1:hs) 
     {
    	 System.out.println(i1);
	}

     
     stringvalidation();
	}

private static void stringvalidation() {
	
String[] s= {"raja","rinu","jinu","jinu","rinu"};
	  
	     HashSet<String> hs=new HashSet<String>();
	     for(int i=0;i<s.length;i++)
	     {
	    	 hs.add(s[i]); 
	     }
	     for(String i1:hs) 
	     {
	    	 System.out.println(i1);
		}

}


	  }
