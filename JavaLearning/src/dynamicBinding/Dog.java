package dynamicBinding;
//Static binding
public class Dog {
	public void eat() {
		System.out.println("The dog is eating");
	}
	public static void main(String[] args) {
		Dog d = new Dog();
		d.eat();
	}
}
