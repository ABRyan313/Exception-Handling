package customException;

public class TestCustomException {
	
	public void validate (int age) throws MyException{
		
		if(age<18)
			throw new MyException("Soto khoka boro hou");
		else {
			System.out.println("hala buira!!");
		}
		
	}

}
