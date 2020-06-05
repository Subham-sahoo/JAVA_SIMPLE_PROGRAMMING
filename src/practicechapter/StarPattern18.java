package practicechapter;

public class StarPattern18 {

	public static void main(String[] args) {
		String s="RAJA";
int n=s.length();
for(int i=1;i<=n;i++) {
	for(int j=1;j<=i;j++) {
		System.out.print(s.charAt(j-1)+ " ");
	}
	
	System.out.println();
}
	}

}


