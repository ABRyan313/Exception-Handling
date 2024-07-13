package throwTest3;


      class UserDefinedException extends Exception{
	
	public UserDefinedException(String str) {
		super(str);
	}
	

}

public class Throwtest3 {

	public static void main(String[] args) {
		try {
			
			 throw new UserDefinedException("This is User Defined exception");
		}
		
		catch(UserDefinedException ude) {
			System.out.println("Caught the exception");
			System.out.println(ude.getMessage());
		}
	  

	}

}
