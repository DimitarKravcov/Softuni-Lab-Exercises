import java.util.Scanner;

public class Aquarium {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		
		try (Scanner scan = new Scanner(System.in)) {
			int length = Integer.parseInt(scan.nextLine());
			int	wight = Integer.parseInt(scan.nextLine());
			int height = Integer.parseInt(scan.nextLine());
			double percent = Double.parseDouble(scan.nextLine());
			
			int volume = length * wight * height;
			double fullTankLiter = volume * 0.001;
			
			double neededLiters = fullTankLiter * (1 - percent/100);

			System.out.println(neededLiters);
		} catch (NumberFormatException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	
		
	}

}
