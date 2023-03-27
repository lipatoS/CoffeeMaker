import Order.Order;
import drinks.Cappuccino;
import drinks.Espresso;
import drinks.Latte;
import utils.Validations;

import java.util.Scanner;

public class app {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("""
                Choose a drink:
                     1 - Espresso
                     2 - Cappuccino
                     3 - Latte""");
        int choice = Validations.getValid(scanner);
        Order order = new Order();

        switch (choice){
            case 1 -> {
                order.setDrink(new Espresso());
                order.getOrder();
            }
            case 2 -> {
                order.setDrink(new Cappuccino());
                order.getOrder();
            }
            case 3 -> {
                order.setDrink(new Latte());
                order.getOrder();
            }
        }
    }

}
