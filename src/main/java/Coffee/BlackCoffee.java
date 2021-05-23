package Coffee;

public class BlackCoffee implements CoffeeInteface,Dispensable {
    static int stock = 100;

    public String coffeeColor() {
        return "black";
    }

    public int coffeePrice() {
        return 200;
    }

    public void dispense() {
        System.out.println("dispensing black coffee");
    }
}
