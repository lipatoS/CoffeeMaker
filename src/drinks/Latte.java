package drinks;

import Order.Drink;

public class Latte implements Drink {
    @Override
    public void choise() {
        System.out.println("Your drink Latte. Enjoy :)");
    }
}