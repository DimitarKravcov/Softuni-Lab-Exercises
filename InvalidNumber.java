import java.util.Scanner;

public class InvalidNumber {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner scan = new Scanner(System.in);
		
		int n = Integer.parseInt(scan.nextLine());
		boolean isValid = n >= 100 && n <= 200 || n == 0;
		if(!isValid) {
			System.out.println("invalid");
		}
		
		
		scan.close();
	}
}
