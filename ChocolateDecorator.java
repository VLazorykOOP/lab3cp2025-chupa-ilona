public class ChocolateDecorator extends CoffeeDecorator {
    public ChocolateDecorator(Coffee coffee) {
        super(coffee);
    }

    public String getDescription() {
        return coffee.getDescription() + ", chocolate";
    }

    public double cost() {
        return coffee.cost() + 7.0;
    }
}
