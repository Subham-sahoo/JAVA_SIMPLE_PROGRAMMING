package practicechapter;

public class Createethod 
{
public static void character(char c) {
	System.out.println("c method execute");
	return  ;
}
public static void number(int i) {
	System.out.println("i method execute");
	return ;
}
public static void main(String[] args) {
	System.out.println("main");
	character('a');
	number(10);
}

}
