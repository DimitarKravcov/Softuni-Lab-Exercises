import java.util.Scanner;

public class BonusScore {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner scan = new Scanner(System.in);
		
		int number = Integer.parseInt(scan.nextLine());
		
		double bonus = 0;
		
		if(number <= 100) {
			bonus = 5 ;
		}else if (number <= 1000) {
			bonus = number * 0.2;
		}else {
			bonus = number * 0.1;
		}
		if (number % 2 == 0){
			bonus = bonus + 1;
		}else if (number % 10 == 5){
			bonus = bonus + 2;
		}
		double sum = number + bonus;
		
		System.out.printf("%.1f%n", bonus);
		System.out.printf("%.1f",sum);
		scan.close();
	}

}
