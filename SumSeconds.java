import java.util.Scanner;

public class SumSeconds {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner scan = new Scanner(System.in);
		
		int firstSeconds = Integer.parseInt(scan.nextLine()); 
		int secondSeconds = Integer.parseInt(scan.nextLine()); 
		int thirdSeconds = Integer.parseInt(scan.nextLine()); 

		int sumSeconds = firstSeconds + secondSeconds + thirdSeconds;
		
		int minutes = sumSeconds / 60;
		int seconds = sumSeconds % 60;
		
		if(seconds < 10) {
			System.out.printf("%d:0%d", minutes, seconds);
		}else{
			System.out.printf("%d:%d", minutes, seconds);
		}
		scan.close();
	}

}
