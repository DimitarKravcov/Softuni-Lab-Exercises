import java.util.Scanner;

public class Grade {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Scanner scan = new Scanner(System.in);
		
		int grade = Integer.parseInt(scan.nextLine());
		
		if(grade >= 5){
			System.out.println("Excellent!");
		}
		
		
		scan.close();
		
		
	}

}
