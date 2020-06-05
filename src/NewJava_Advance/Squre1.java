package NewJava_Advance;

import java.util.function.Function;

public class Squre1 {

	public static void main(String[] args) {
		Function<Integer,Integer> f=i->i*i;
		System.out.println("The squre  number is :"+ f.apply(40) );

	}

}
