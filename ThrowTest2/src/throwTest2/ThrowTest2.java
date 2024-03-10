package throwTest2;
import java.io.*;

public class ThrowTest2 {
	
	static void method()throws FileNotFoundException{
		FileReader file=new FileReader("E:\\DOCS\\R@1n.txt");
		BufferedReader fileInput=new BufferedReader(file);
		
		throw new FileNotFoundException();
	}

	public static void main(String[] args) {
		try {
			method();
		}
		catch(FileNotFoundException e) {
			e.printStackTrace();
		}
		
		System.out.println("Rest of the codes");

	}

}
