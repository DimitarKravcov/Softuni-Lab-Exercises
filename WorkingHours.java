import java.util.Scanner;

public class WorkingHours {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner scan = new Scanner(System.in);
		int hour = Integer.parseInt(scan.nextLine());
		String day = scan.nextLine();
		
		if(hour >= 10 && hour <= 18) {
			switch(day) {
				case "Monday":
				case "Tuesday":
				case "Wednesday":
				case "Thursday":
				case "Friday":
				case "Saturday":
				System.out.println("open");
				break;
				case "Sunday":	
				default:
				System.out.println("closed");
				break;
			}
		}else {
			System.out.println("closed");
		}
		scan.close();
	}

}
