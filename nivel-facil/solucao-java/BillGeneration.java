import java.util.Scanner;

//Tom went to a movie with his friends in a multiplex theatre and during
//break time he bought pizzas, puffs and cool drinks. Consider the following prices: 

//Rs.100/pizza
//Rs.20/puffs
//Rs.10/cooldrink

public class BillGeneration {
    public static void main(String[] args) {

        try (Scanner scanner = new Scanner(System.in)) {
            double pizza;
            double puffs;
            double drinks;

            System.out.println("Enter the no of pizzas bought: ");
            pizza = Double.parseDouble(scanner.nextLine());
            System.out.println("Enter the no of puffs bought: ");
            puffs = Double.parseDouble(scanner.nextLine());
            System.out.println("Enter the no of cool drinks bought: ");
            drinks = Double.parseDouble(scanner.nextLine());

            double totalPrice = (pizza * 100 + puffs * 20 + drinks * 10);
            System.out.println("Total price: " + totalPrice);
        } catch (Exception e) {
            e.printStackTrace();
        }

    }
}