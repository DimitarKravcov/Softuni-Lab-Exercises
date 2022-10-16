import java.util.Scanner;

public class RadiansToDegrees {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Scanner scan = new Scanner(System.in);
		
		double radians = Double.parseDouble(scan.nextLine());
		
		double degrees = radians * 180 /Math.PI;
		System.out.println(degrees);
		
		scan.close();
		
	}

}
