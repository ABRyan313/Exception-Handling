package transport;
import java.util.*;

public class Counter {
	
	private String counterno;
	private Roots root;
	private ArrayList <Bus> bus=new ArrayList<>();
	
	public Counter(String counterno, Roots root, Bus ... bus ) {
		
		this.counterno = counterno;
		this.root = root;
		this.bus = new ArrayList<>(Arrays.asList(bus));
	}

	public String getCounterno() {
		return counterno;
	}

	public void setCounterno(String counterno) {
		this.counterno = counterno;
	}

	public ArrayList<Bus> getBus() {
		return bus;
	}

	public void setBus(ArrayList<Bus> bus) {
		this.bus = bus;
	}
	


	@Override
	public String toString() {
		return "counterno=" + counterno + ", root=" + root  + bus ;
	}

	

}
