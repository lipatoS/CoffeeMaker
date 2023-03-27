package Order;

public class Order {
    private Drink drink;
    public void setDrink(Drink drink){this.drink = drink;}
    public void getOrder(){drink.choise();}
}
