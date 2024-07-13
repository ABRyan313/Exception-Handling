package customException;
import java.util.*;
public class Main {

	public static void main(String[] args) {
		TestCustomException t=new TestCustomException();
		
		
		Scanner In=new Scanner(System.in);
		System.out.println("Enter Age");
		int n=In.nextInt();
		In.close();
		
		try {
			t.validate(n);
		}
		
		catch(MyException ex) {
			System.out.println("Caught the Exception");
			System.out.println("Exception occured:"+ ex);
		}
		
		System.out.println("Haua");

	}

}
