package throwTest;


public class ThrowTest {
	
	public static void Validate(int n) {
		
		
		if(n<18) {
		throw new ArithmeticException("Not Eligible");
		}
		
		else {
			System.out.println("Eligible");
		}
	}
		

	public static void main(String[] args) {
		
		int age=Integer.parseInt(args[0]);
		Validate(age);
		System.out.println("Rest of the code");

	}

}
