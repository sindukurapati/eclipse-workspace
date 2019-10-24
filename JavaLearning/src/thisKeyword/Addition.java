package thisKeyword;

public class Addition {
	int num1;
	int num2;
	
	
	public Addition(int num1, int num2) {
		this.num1 = num1;
		this.num2 = num2;
		System.out.println(num1 + num2);
	}

	public static void main(String[] args) {
		Addition obj = new Addition(10,20);
		
		
	}

}

