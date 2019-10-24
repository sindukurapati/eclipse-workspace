package methodOverloading;
//Different Number of parameters in argument list
public class DisplayOverloading {
	public void display(int a, int b) {
		System.out.println(a+b);
		
	}
	public void display(int a, int b, int c) {
		System.out.println(a+b+c);
	}

	public static void main(String[] args) {
		DisplayOverloading obj = new DisplayOverloading();
		obj.display(5, 10);
		obj.display(12, 23,34);

	}

}
