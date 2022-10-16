import java.util.Scanner;

public class WorldSwimmingRecord {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner scan = new Scanner(System.in);
		
		double recordForSeconds = Double.parseDouble(scan.nextLine());
		double recordForMeters = Double.parseDouble(scan.nextLine());
		double timeFromSecondsForOneMeter = Double.parseDouble(scan.nextLine());
		
		double neededTimeToSwim = Math.floor((recordForMeters / 15)) * 12.5;
		double result = (recordForMeters  * timeFromSecondsForOneMeter) + neededTimeToSwim;
		
		if(recordForSeconds > result) {
			System.out.printf("Yes, he succeeded! The new world record is %.2f seconds.", result);
		}else {
			double diff = result - recordForSeconds  ;
			System.out.printf("No, he failed! He was %.2f seconds slower.", diff);
		}
		
		scan.close();
		
	}

}
