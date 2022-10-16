import java.util.Scanner;

public class ToyShop {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner scan = new Scanner(System.in);
		
		double vacation = Double.parseDouble(scan.nextLine());
		int puzzels = Integer.parseInt(scan.nextLine());
		int speechDols = Integer.parseInt(scan.nextLine());
		int bears = Integer.parseInt(scan.nextLine());
		int minions = Integer.parseInt(scan.nextLine());
		int trucks = Integer.parseInt(scan.nextLine());
		
		double puzzel = 2.60; //lv 
		int doll = 3; //lv
		double bear = 4.10; //lv
		double minion = 8.20; //lv
		int truck = 2; //lv
		
		double price = puzzels * puzzel + speechDols * doll + bears * bear + minions * minion+ trucks * truck;
		
		double numberOfToys = puzzels + speechDols + bears + minions + trucks ;
		
		if(numberOfToys >= 50) {
			double discount = price * 0.25;
			price = price - discount;
		}
		double rent = price * 0.1;
		double profit = price - rent;
		if(profit >= vacation) {
			double left = profit - vacation;
			System.out.printf("Yes! %.2f lv left.", left);
		}else {
			double needed = profit - vacation;
			System.out.printf("Not enough money! %.2f lv needed.", needed);
		}
		
		scan.close();
	}
}