import java.util.Scanner;

public class FruitShop1 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String fruit = scanner.nextLine() ;
        String day = scanner.nextLine() ;
        double quantity = Double.parseDouble(scanner.nextLine()) ;

        double price = 0 ;

        if("Monday".equals(day) ||
                "Tuesday".equals(day)||
                "Wednesday".equals(day)||
                "Thursday".equals(day)||
                "Friday".equals(day)) {
        if ("banana".equals(fruit)) {
            price = 2.50 ;
        }else if ("apple".equals(fruit)){
            price = 1.20 ;

        }else if ("orange".equals(fruit)){
            price = 0.85 ;

        }else if ("grapefruit".equals(fruit)){
            price = 1.45 ;
        }else if ("kiwi".equals(fruit)){
            price = 2.70 ;

        }else if ("pineapple".equals(fruit)) {
            price = 5.50 ;

        }else if ("grapes".equals(fruit)){
            price = 3.85 ;
        }
        }
        
        else if ("Saturday".equals(day)
        		|| "Sunday".equals(day)){
        if ("banana".equals(fruit)) {
            price = 2.70;
        }else if ("apple".equals(fruit)){
            price = 1.25 ;
        }else if ("orange".equals(fruit)){
            price = 0.90 ;
        }else if ("grapefruit".equals(fruit)){
            price = 1.60 ;
        }else if ("kiwi".equals(fruit)){
            price = 3.00 ;
        }else if ("pineapple".equals(fruit)) {
            price = 5.60 ;
        }else if ("grapes".equals(fruit)){
            price = 4.20 ;
        }
        }
        if (price > 0){
            System.out.printf("%.2f", price * quantity);
        }else {
            System.out.println("error");
        }
    }
}