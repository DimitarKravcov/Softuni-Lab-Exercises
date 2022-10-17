import java.util.Scanner;

public class newHouse {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		
		String flowers = scan.nextLine();		
		int countFlowers = Integer.parseInt(scan.nextLine());
		int budget = Integer.parseInt(scan.nextLine());
		
		double price = 0;
		
		switch(flowers) {
		case "Roses":
			price = countFlowers * 5;
			if (countFlowers > 80) {
				price = price - price * 0.1;
			}
			break;
		case "Dahlias":
			price = countFlowers * 3.80;
			if (countFlowers > 90) {
				price = price - price * 0.15;
			}
			break;
		case "Tulips":
			price = countFlowers * 2.80;
			if(countFlowers > 80) {
				price = price - price * 0.15;
			}
			break;
		case "Narcissus":
			price = countFlowers * 3;
			if(countFlowers < 120){
				price = price + price * 0.15;
			}
			break;
		case "Gladiolus":
			price = countFlowers * 2.50;
			if(countFlowers < 80) {
				price = price + price * 0.2;
			}
			break;
		}
		double differnce = Math.abs(budget - price);
		if(price <= budget) {
			
			System.out.printf("Hey, you have a great garden with %d %s and %.2f leva left."
						,countFlowers , flowers, differnce);
		}else {
			System.out.printf("Not enough money, you need %.2f leva more.", differnce);
		}
		
		scan.close();
	}

}