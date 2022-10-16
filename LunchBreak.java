import java.util.Scanner;

public class LunchBreak {

	public static void main(String[] args) {
	
		Scanner scan = new Scanner (System.in);
		
		String name = scan.nextLine();		
		int timeForEpisode = Integer.parseInt(scan.nextLine());
		int timeForBreak = Integer.parseInt(scan.nextLine());
		
		double timeForEat = timeForBreak / 8.0;
		double timeForRest = timeForBreak / 4.0;
		
		double timeLeft = timeForBreak - timeForEat - timeForRest;
		
		if(timeLeft >= timeForEpisode) {
			System.out.printf("You have enough time to watch %s and left with %.0f minutes free time."
					, name , Math.ceil(timeForEat - timeForEpisode));
		}else {
			System.out.printf("You don't have enough time to watch %s, you need %.0f more minutes."
					, name , Math.ceil(timeForEat - timeLeft ));
		}
		
		scan.close();
		
	}
}
