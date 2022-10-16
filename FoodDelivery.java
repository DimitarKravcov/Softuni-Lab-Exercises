import java.util.Scanner;

public class FoodDelivery {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Scanner scan = new Scanner(System.in);
		
		int numForChickenMenu = Integer.parseInt(scan.nextLine());
		int numForFishMenu = Integer.parseInt(scan.nextLine());
		int numForVegeterianMenu = Integer.parseInt(scan.nextLine());
		
		double chickenMenu = 10.35; //lv.
		double fishMenu = 12.40;	//lv.
		double vegeterianMenu = 8.15;	//lv.
		double priceForDesert = 0.2; //percent
		double priceForDelivery = 2.50; //on condition
		
		double chickenMenus = numForChickenMenu *  chickenMenu;
		double fishMenus = numForFishMenu *  fishMenu;
		double vegeterianMenus = numForVegeterianMenu *  vegeterianMenu;
		double totalPriceForMenus = chickenMenus + fishMenus + vegeterianMenus;
		double priceDesert = priceForDesert * totalPriceForMenus;
		double totalPriceForDelivery = totalPriceForMenus + priceDesert + priceForDelivery;
		
		System.out.println(totalPriceForDelivery);
		
				
		scan.close();
	}

}
