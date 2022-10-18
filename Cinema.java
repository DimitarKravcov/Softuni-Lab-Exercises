import java.util.Scanner;

public class Cinema {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner scan = new Scanner(System.in);
		String projection = scan.nextLine();
		int rows = Integer.parseInt(scan.nextLine());
		int columns = Integer.parseInt(scan.nextLine());
		double income = 0.0;
		
		if("Premiere".equals(projection)) {
			income = rows * columns * 12;
		}else if ("Normal".equals(projection)) {
			income = rows * columns * 7.50;
		}else if ("Discount".equals(projection)) {
			income = rows * columns * 5;
		}
		System.out.printf("%.2f leva", income);
		
		
		
		scan.close();
	}

}
