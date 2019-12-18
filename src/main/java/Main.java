
public class Main {

	public static void main(String[] args) {
		System.out.println("Hello Main!");
	}
	
	public String getMessage(boolean bigger) {
		if (bigger) {
			return "Hello Universe!";
		} else {
			return "Hello World!";
		}
	}

}
