package drinks;

import Order.Drink;

public class Espresso implements Drink {
    @Override
    public void choise() {
        System.out.println("Your drink Espresso. Enjoy :)");
    }
}