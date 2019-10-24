package runTimePoly;
//upcasting
public class Splendor extends Bike {
	public void run() {
	System.out.println("The bike is running at 100kms per hour ");
	}

	public static void main(String[] args) {
		Bike obj = new Splendor();
		obj.run();
	}

}
