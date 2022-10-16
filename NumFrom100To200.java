import java.util.Scanner;

public class NumFrom100To200 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner scan = new Scanner(System.in);
		
		int number = Integer.parseInt(scan.nextLine());
		
		if(number < 100) {
			System.out.println("Less than 100");
		}else if(number <= 200 ) {
			System.out.println("Between 100 and 200");
		}else if (number > 200) {
			System.out.println("Greater than 200");
		}
		
		scan.close();
	}

}
