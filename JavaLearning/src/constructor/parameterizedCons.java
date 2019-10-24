package constructor;
//Java Program to demonstrate the use of the parameterized constructor.  
public class parameterizedCons {
	int id;
	String name;
	 //creating a parameterized constructor  
	parameterizedCons(int i, String n) {
		id = i;
		name = n;
	}
    //method to display the values
	public void display() {
		System.out.println(id + " " + name);
	}

	public static void main(String[] args) {
		//creating objects and passing values  
		parameterizedCons d1 = new parameterizedCons(111, "sindu");
		parameterizedCons d2 = new parameterizedCons(222, "sin");
		parameterizedCons d3 = new parameterizedCons(333, "si");
		//calling method to display the values of object  
		d1.display();
		d2.display();
		d3.display();

	}

}
