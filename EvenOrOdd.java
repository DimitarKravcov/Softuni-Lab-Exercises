import java.util.Scanner;

public class EvenOrOdd {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner scan = new Scanner(System.in);
		
		int number = Integer.parseInt(scan.nextLine());
		boolean isEven = number % 2 == 0;
		if(isEven) {
			System.out.println("even");
		}else {
			System.out.println("odd");
		}
		
		
		scan.close();
	}

}
