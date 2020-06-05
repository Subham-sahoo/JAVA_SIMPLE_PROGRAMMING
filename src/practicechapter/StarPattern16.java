package practicechapter;

public class StarPattern16 {

	public static void main(String[] args) {
		int n=5;char c='a',x='a';
for(int i=1;i<=n;i++) {
	
	if(i%2==0) {
		c='O';
	}else {
		c=x++;
	}
		
	for(int j=1;j<=i;j++) {
		System.out.print(c + " ");
	}
	System.out.println();
}
	}

}
