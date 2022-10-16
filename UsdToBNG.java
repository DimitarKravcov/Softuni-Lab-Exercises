import java.util.Scanner;

public class UsdToBNG {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Scanner scanner = new Scanner(System.in);
		
		double usd = Double.parseDouble(scanner.nextLine());
		
		double bgn = usd * 1.79549;
		
		System.out.println(bgn);
		
		scanner.close();
		
	}

}
