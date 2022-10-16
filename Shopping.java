import java.util.Scanner;

public class Shopping {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner scan = new Scanner(System.in);
		
		double budget = Double.parseDouble(scan.nextLine());
		int videoCards = Integer.parseInt(scan.nextLine()); 
		int processors = Integer.parseInt(scan.nextLine()); 
		int ramMemory = Integer.parseInt(scan.nextLine()); 

		int videoCard = 250; 
		double processor = 0.35; //percent
		double ram = 0.10; //percent
		
		double finalPrice = videoCards * videoCard;
		double finalPrice1 = (finalPrice * 0.35) * processors;
		double finalPrice2 = (finalPrice1 * 0.1)* ramMemory;
		double finalPrice3 = finalPrice + finalPrice1 + finalPrice2;
		double totalSum = finalPrice3 ;
		if(videoCards > processors) {
			double discount = totalSum * 0.15;
			discount = discount * finalPrice3;
		}	
		if(totalSum <= budget) {
			double totalPrice = budget - totalSum;
			System.out.printf("You have %.2f leva left!", totalPrice);
		}else {
			double totalPrice = budget - totalSum;
			System.out.printf("Not enough money! You need %.2f leva more!", totalPrice);
		}
		
		scan.close();	
	}

}
