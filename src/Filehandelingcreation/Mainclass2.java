package Filehandelingcreation;

import java.io.File;
import java.io.IOException;

public class Mainclass2 {

	public static void main(String[] args)throws IOException
	{
		File f1=new File("E:\\subham sahoo29\\raja\\demo.txt");
		if(f1.exists())
		{
		System.out.println(f1.length());	
		}
		else
			
		{
			f1.createNewFile();
	}
}
	}
