import java.util.Scanner;

public class TimePlus15Minutes {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner scan = new Scanner(System.in);
		
		int hours = Integer.parseInt(scan.nextLine());
		int minutes = Integer.parseInt(scan.nextLine());
				
		int totalMinutes = (hours * 60 + minutes) + 15;
		
		int newHours = totalMinutes / 60;
		int newMinutes = totalMinutes % 60;
		
		if(newHours >= 24) {
			newHours = 0;
			System.out.printf("%d:%02d", newHours, newMinutes);
		}else {
			System.out.printf("%d:%02d", newHours, newMinutes);
		}
		scan.close();
	}

}
