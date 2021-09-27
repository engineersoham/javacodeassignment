
public class countdigit {
	public static void main(String[] args) {
		
		int n = 45938, count=0;
		for (int i = n; i>0; i=i/10 ) {
			count++;
			
			
		}
		System.out.println("The number has " +count+" digits");

	}
}
