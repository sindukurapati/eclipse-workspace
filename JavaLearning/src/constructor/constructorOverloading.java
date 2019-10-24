package constructor;
//Java program to overload constructors  

public class constructorOverloading {
	int id;
	String name;
	int age;
	// creating two arg constructor

	constructorOverloading(int i, String s) {
		id = i;
		name = s;
	}
	// creating three arg constructor
	constructorOverloading(int i, String s,int a) {
		id = i;
		name = s;
		age = a;
	}
	public void display() {
		System.out.println(id+" "+name+" "+age);
		
	}

	public static void main(String[] args) {
		constructorOverloading d = new constructorOverloading(12,"sin");
		constructorOverloading d1 = new constructorOverloading(12,"sin",123);
		d.display();
		d1.display();	

	}

}
