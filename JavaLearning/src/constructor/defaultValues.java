package constructor;

public class defaultValues {
	int id;
	String name;

	public void display() {
		System.out.println(id + " " + name);
	}

	public static void main(String[] args) {
		
		defaultValues d1 = new defaultValues();
		defaultValues d2 = new defaultValues();
		d1.display();
		d2.display();

	}

}
