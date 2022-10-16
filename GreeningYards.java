import java.util.Scanner;

public class GreeningYards {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		try (Scanner scanner = new Scanner(System.in)) {
			
			double area = Double.parseDouble(scanner.nextLine());
			
			double priceNoDiscount = 7.61*area;
			double discount = priceNoDiscount * 0.18;
			
			double finalPrice = priceNoDiscount - discount;
			
			System.out.printf("The final price is: %f lv.%n"
					, finalPrice);
			System.out.printf("The discount is: %f lv.", discount);
		} catch (NumberFormatException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
		
	}

}
