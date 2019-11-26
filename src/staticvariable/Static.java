package staticvariable;
public class Static
{
static int i=100;
public static void M()
{
System.out.println("static function member");
}
public static void main(String[]args) {
System.out.println("i value is"+i);
Static.M();
System.out.println("---------------------");
System.out.println("i value is"+i);
M();
}
	}

