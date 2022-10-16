import java.util.Scanner;

public class VacationBooksList {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner scan = new Scanner(System.in);
		
		int numOfPages = Integer.parseInt(scan.nextLine());
		int pages = Integer.parseInt(scan.nextLine());
		int numOfDays = Integer.parseInt(scan.nextLine());
		
		int hoursPerBook = numOfPages / pages;
		int needHoursPerDay = hoursPerBook / numOfDays;  
		
		System.out.println(needHoursPerDay);
		
		scan.close();
	}

}
