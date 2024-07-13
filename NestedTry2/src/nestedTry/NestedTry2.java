package nestedTry;

public class NestedTry2 {

	public static void main(String[] args) {
		
		try {
			System.out.println("Going to devide by zero");
			
			try {
				int a=30/0;
			}
			
			catch(ArithmeticException e) {
				System.out.println(e);
			}
			
			try {
				int []a=new int[5];
				a[5]=4;
			}
			
			catch(ArrayIndexOutOfBoundsException e ) {
				System.out.println(e);
			}
			
			System.out.println("other statement");
		}
		
		catch(Exception e) {
			System.out.println("Handled the exception");
		}
		
		System.out.println("normal flow");

	}

}
