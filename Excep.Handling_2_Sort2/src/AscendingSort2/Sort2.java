package AscendingSort2;
import java.util.*;

public class Sort2 {
	
	
	public static int Enter() {
		
		try  {
			
			Scanner sc = new Scanner(System.in);
			int temp;
			System.out.println("Enter the three number");
			int a=sc.nextInt();
			int b=sc.nextInt();
			int c=sc.nextInt();
			sc.close();
			
		
				
				if(a>b || a>c) {
					temp=a;
					a=b;
					b=temp;
				}
				
				else if(b>c||b>a) {
					temp=b;
					b=c;
					c=temp;
				}
				
			
				System.out.println(a+" "+b+" "+c);
			
			
			return 0;
			
		}

				
			
			
			catch(Exception e) {
				System.out.println("the user has entered an illegal number");
				
			}
		
		
		return 0;
	}
	

	public static void main(String[] args) {
		
		Enter();

	}

}
