import java.util.Scanner;

public class SuppliesForSchool {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		//1. четем от конзолата  
		Scanner scan = new Scanner(System.in);
		
		//2. пресмятаме цената на продуктите
				//- пълната на цена за химикали
				//- пълната на цена за маркери
				//- пълната на цена за препарати
				//-	изчисляваме цената на всички материали
				//- изчисляваме финалната сума като пресметнем намалението 
			int countPenPackets = Integer.parseInt(scan.nextLine());
			int countHighligthers = Integer.parseInt(scan.nextLine());
			int cleaningAgent = Integer.parseInt(scan.nextLine());
			int discount = Integer.parseInt(scan.nextLine());				
				
			double priceForPens = countPenPackets * 5.80;
			double priceForHighligthers = countHighligthers * 7.20;
			double priceForCleaning = cleaningAgent * 1.20 ;
			double sumWithoutDiscount = priceForPens + priceForHighligthers + priceForCleaning;
			double finalSum = sumWithoutDiscount - (sumWithoutDiscount * (discount/100.0));
						
		//принтираме
			System.out.println(finalSum);
			scan.close();
	}

}
