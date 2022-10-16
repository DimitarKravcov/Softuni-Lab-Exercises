import java.util.Scanner;

public class GodzilaVsKong {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner scan = new Scanner(System.in);
		double budgetForMovie = Double.parseDouble(scan.nextLine());
		int numForStaticks = Integer.parseInt(scan.nextLine());
		double priceForOneStaticks = Double.parseDouble(scan.nextLine());
		
		double fromTheBudget = 0.10;
		
		double decoration = budgetForMovie - 0.10;
		double priceForOutfit = numForStaticks / priceForOneStaticks;
		double discount = priceForOutfit * 0.10;
		double totalPrice = decoration + priceForOutfit;
		double finalPrice =	decoration - totalPrice;
		if(numForStaticks > 150) {
			double priceForOutfit1 = priceForOutfit * 0.10;	
			priceForOutfit = priceForOutfit - priceForOutfit1;
		}
	
		if(finalPrice >= budgetForMovie ) {
			double notOkay = totalPrice - budgetForMovie;
			System.out.println("Not enough money!");
			System.out.printf("Wingard needs %.2f leva more.", notOkay);
		}else if (finalPrice <= budgetForMovie){
			double okay = totalPrice - budgetForMovie;
			System.out.println("Action!");
			System.out.printf("Wingard starts filming with %.2f leva left.", okay);
		}
		
		scan.close();
	}

}
