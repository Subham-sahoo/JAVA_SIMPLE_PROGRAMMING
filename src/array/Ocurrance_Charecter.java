package array;

public class Ocurrance_Charecter {

	public static void main(String[] args) 
	{
	char[] ch = { 'N','e','w','s','p','a','p','e','r'};
	int count=0;
	int j=0;
for(int i=0;i<=ch.length-1;i++) 
{

if(ch[i]==ch[j+1]) 
{
	j++;
	System.out.println(j);
}
}

	}

}
