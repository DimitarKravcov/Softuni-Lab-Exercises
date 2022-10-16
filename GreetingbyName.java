import java.util.Scanner;

public class GreetingbyName {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Scanner scanner = new Scanner(System.in);
		
		String name = scanner.nextLine();
		
		System.out.println("Hello, " + name + "!");
		scanner.close();
	}
}
