package transport;

public class Transport {

	public static void main(String[] args) {
		test();

	}
	
	private static void test(){
		
		try {
		
		Counter counter1=create("Syamoli",new Roots("Dhaka-Khulna", 10), new Bus[] {new Bus("Dhaka Metro LA-243923", "Jamal"), new Bus("Dhaka Metro LA-243024", "Kudu")});
		print(counter1);
		}
		catch(Exception E) {
			System.out.println(E.getMessage());
		}
		
	}	
		
	
	
	private static Counter create(String counterno, Roots root, Bus ... bus) {
		Counter counter= new Counter(counterno,root,bus);
		return counter;
	}
	
	private static void print(Counter counter) {
		
		System.out.println(counter.toString());
		
	}

}
