package dynamicBinding;

public class Dogs extends Animal {
	public void eat() {
		System.out.println("Dog eat biscuits");
	}

	public static void main(String[] args) {
		Animal obj = new Dogs();
		obj.eat();
		
		

	}

}
