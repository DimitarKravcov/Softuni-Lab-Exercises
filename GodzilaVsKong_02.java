import java.util.Scanner;

public class GodzilaVsKong_02 {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        double budget = Double.parseDouble(scan.nextLine());
        int statist = Integer.parseInt(scan.nextLine());
        double priceClothesStatist = Double.parseDouble(scan.nextLine());

        double expenses = statist * priceClothesStatist + budget * 0.10;
        if (statist > 150){
            expenses = statist * priceClothesStatist * 0.90 + budget * 0.10;
        }

        if (expenses > budget){
            System.out.printf("Not enough money!%n");
            System.out.printf("Wingard needs %.2f leva more.", expenses - budget);
        }else {
            System.out.println("Action!");
            System.out.printf("Wingard starts filming with %.2f leva left.", budget - expenses);
    
        }
        scan.close();
    }
    
}
