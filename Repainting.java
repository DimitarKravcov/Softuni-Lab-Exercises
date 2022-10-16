import java.util.Scanner;

public class Repainting {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner scan = new Scanner(System.in);
		
		int nailon = Integer.parseInt(scan.nextLine());
		int paint = Integer.parseInt(scan.nextLine());
		int razreditel = Integer.parseInt(scan.nextLine());
		int hours = Integer.parseInt(scan.nextLine());

		double nailonPrice = 1.50; // kv. metur
		double paintPrice = 14.50;  //za litur
		double razreditelPrice = 5.00; //za litur
		double torbichki = 0.40;
		double extraPaint = 1.1;  // percent
		int extraNailon = 2; //kv.m.
		double maistorPricePerHour = 0.3; //percent
		
		double totalNailonPrice = (nailon + extraNailon) * nailonPrice; 
		double totalPaintPrice = paint * extraPaint * paintPrice;
		double totalRazreditelPrice = razreditel * razreditelPrice;
		double totalPriceForMaterials = totalNailonPrice + totalPaintPrice + totalRazreditelPrice + torbichki;
		double totalMaistori = (totalPriceForMaterials * maistorPricePerHour) * hours;
		double totalPrice = totalPriceForMaterials + totalMaistori;
		
		System.out.println(totalPrice);
		
		scan.close();
	}

}
