package Coffee;

public class Cappicino implements CoffeeInteface {
    static int stock = 100;
    public String coffeeColor() {
        return "brown";
    }

    public int coffeePrice() {
        return 100;
    }
    public void dispense() {
        System.out.println("dispensing black coffee");
    }
}
