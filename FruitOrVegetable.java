import java.util.Scanner;

public class FruitOrVegetable {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner scan = new Scanner(System.in);
		
		String FruitOrVegetable = scan.nextLine();
		
		if(FruitOrVegetable.equals("banana")
				|| FruitOrVegetable.equals("kiwi")
				|| FruitOrVegetable.equals("lemon")
				|| FruitOrVegetable.equals("grapes")
				|| FruitOrVegetable.equals("apple")
				|| FruitOrVegetable.equals("cherry")) {
			System.out.println("fruit");
		}else if(FruitOrVegetable.equals("tomato")
				|| FruitOrVegetable.equals("cucumber")
				|| FruitOrVegetable.equals("pepper")
				|| FruitOrVegetable.equals("carrot")
				|| FruitOrVegetable.equals("vegetable")){
			System.out.println("vegetable");
		}else  {
			System.out.println("unknown");
		}
		
		scan.close();
	}

}
