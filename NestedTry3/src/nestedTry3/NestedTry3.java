package nestedTry3;

public class NestedTry3 {

	public static void main(String[] args) {
		
		 // main block
		try {
			 // inner block1	
			try {
				// inner block2
				try {
					int []a= {1,2,3,4,5};
					System.out.println(a[10]);
				}
				catch(ArithmeticException e) {
					System.out.println("Arithmatic Exception");
					System.out.println("inner block 2");
				}
				
			}catch(ArithmeticException e) {
				System.out.println("Arithmatic Exception");
				System.out.println("inner block 1");
				}
			
		

	}
		catch(ArrayIndexOutOfBoundsException e4 ) {
			System.out.println(e4);
			System.out.println("main block");
		}
		
		catch(Exception e) {
		
		System.out.println("Handled");
		}
		
		System.out.println("keep going AB come on");
}
}
