import java.util.Scanner;

public class BasketballEquipment {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner scan = new Scanner(System.in);
		
		int yearForTrainBasketball = Integer.parseInt(scan.nextLine());
		
		double basketballShoes = yearForTrainBasketball -yearForTrainBasketball * 0.4;
		double basketballOutfit = basketballShoes - yearForTrainBasketball * 0.2;
		double ball = basketballOutfit * 0.25;
		double accesories = ball * 0.2;
		double totalSum = yearForTrainBasketball + basketballShoes +
				basketballOutfit + ball + accesories ;
		
		System.out.println(totalSum);
	
		scan.close();
		
	}

}
