import java.util.Scanner;

public class PoolDay {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner scan = new Scanner(System.in);
		
		int people = Integer.parseInt(scan.nextLine());
		double tax = Double.parseDouble(scan.nextLine());
		double sunLounger = Double.parseDouble(scan.nextLine());
		double umbrellas = Double.parseDouble(scan.nextLine());
		
		double firstSum = people * tax;
		double disc = Math.ceil(people * 0.75);
		double disc1 = Math.ceil(people / 2.0);
		 double finalPrice = firstSum + disc * 
				 sunLounger + disc1 * umbrellas;		
		System.out.printf("%.2f lv.", finalPrice);
		
		
		scan.nextLine();
	}

}
