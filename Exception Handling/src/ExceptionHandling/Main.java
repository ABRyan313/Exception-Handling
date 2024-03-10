package ExceptionHandling;
import java.util.*;

public class Main {
	
	public static int Enter() {
		
		try {
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter the numbers:");
		
		int a=sc.nextInt();
		int b=sc.nextInt();
	    sc.close();
		int c;
		if(a>b) {
			c=a;
			a=b;
			b=c;
		}
		
		System.out.println(a+" "+b);
		
		}
		
		
		catch(Exception e) {
			//return 0;
			System.out.println("Hi there, u fuckin idiot");
		}
		
		return 0;
	
		
	}

	public static void main(String[] args) {
		
		Enter();

	}

}
