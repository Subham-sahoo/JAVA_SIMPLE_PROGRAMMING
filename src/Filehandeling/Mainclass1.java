package Filehandeling;

import java.io.File;

public class Mainclass1 {

	public static void main(String[] args) 
	{
		File f1=new File("E:\\subham sahoo29\\raja");
		if(f1.exists())
		{
			System.out.println(f1.length());
		}
		else
		{
			f1.mkdir();
		}
		

	}

}
