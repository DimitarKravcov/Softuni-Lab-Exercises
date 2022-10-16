import java.util.Scanner;

public class FruitShop {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner scan = new Scanner(System.in);
		String fruit = scan.nextLine();		
		String day = scan.nextLine();
		double quantity = Double.parseDouble(scan.nextLine());
		
		double price = 0;
	
		if(day.equals("Monday")
				|| day.equals("Tuesday")
				|| day.equals("Wednesday")
				|| day.equals("Thursday")
				|| day.equals("Friday")) {
			if(fruit == "banana") {
				System.out.printf("%.2f", quantity * 2.50);
			}else if (fruit.equals("apple")) {
				System.out.printf("%.2f", quantity * 1.20);
			}else if(fruit.equals("orange")) {
				System.out.printf("%.2f", quantity * 0.85);
			}else if (fruit.equals("grapefruit")) {
				System.out.printf("%.2f", quantity * 1.45);
			}else if (fruit.equals("kiwi")) {
				System.out.printf("%.2f", quantity * 2.70);
			}else if (fruit.equals("pineapple")) {
				System.out.printf("%.2f", quantity * 5.50);
			}else if(fruit.equals("grapes")) {
				System.out.printf("%.2f", quantity * 3.85);
			}
		}
		if(day.equals("Saturday")
				|| day.equals("Sunday")) {
			if(fruit == "banana") {
				System.out.printf("%.2f", quantity * 2.70);
			}else if (fruit.equals("apple")) {
				System.out.printf("%.2f", quantity * 1.25);
			}else if(fruit.equals("orange")) {
				System.out.printf("%.2f", quantity * 0.90);
			}else if (fruit.equals("grapefruit")) {
				System.out.printf("%.2f", quantity * 1.60);
			}else if (fruit.equals("kiwi")) {
				System.out.printf("%.2f", quantity * 3.00);
			}else if (fruit.equals("pineapple")) {
				System.out.printf("%.2f", quantity * 5.60);
			}else if(fruit.equals("grapes")) {
				System.out.printf("%.2f", quantity * 4.20);
			}
		}
		if(price > 0) {
			System.out.printf("%.2f", price * quantity);
		}else {
			System.out.println("error");
		}
		scan.close();
		}
	}

