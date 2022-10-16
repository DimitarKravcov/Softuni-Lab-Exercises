import java.util.Scanner;

public class InchsToCentimeters {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner scanner = new Scanner(System.in);
		
		double inches = Double.parseDouble(scanner.nextLine());
		double centimeters = inches * 2.54;
		
		
		System.out.println(centimeters);
		scanner.close();
	
	}

}
