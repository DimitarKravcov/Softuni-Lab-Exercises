import java.util.Scanner;

public class DepositCalculator {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Scanner scan = new Scanner(System.in);
		
		double depositAmount = Double.parseDouble(scan.nextLine());
		int months = Integer.parseInt(scan.nextLine());
		double interestRate = Double.parseDouble(scan.nextLine());
		
		double profitPerMonth = (depositAmount * (interestRate/100))/12;
		double totalSum = depositAmount + profitPerMonth * months;
		
		System.out.println(totalSum);
		scan.close();
		
			
	}

}
