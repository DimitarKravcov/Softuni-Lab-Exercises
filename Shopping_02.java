import java.util.Scanner;

public class Shopping_02 {
   	
	public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        double budget = Double.parseDouble(scanner.nextLine());
        int gpu = Integer.parseInt(scanner.nextLine());
        int cpu = Integer.parseInt(scanner.nextLine());
        int ram = Integer.parseInt(scanner.nextLine());
 
        double gpuPrice = gpu * 250;
        double cpuPrice = gpuPrice * 35/100 * cpu;
        double ramPrice = gpu * 10/100 * ram;
        double totalPrice = gpuPrice + cpuPrice + ramPrice;
        if(gpu > cpu) {
        	totalPrice = totalPrice * 15/100;
        }  
        double diff = Math.abs(budget - totalPrice);
        if(budget <= diff) {   
        	double needed = budget - totalPrice;
        	System.out.printf("You have %.2f leva left!",needed);
        }else {
        	double needed1 = budget - totalPrice;
        	System.out.printf("Not enough money! You need %.2f leva more!",needed1);
     
        }
        scanner.close();
    }
	
}
 