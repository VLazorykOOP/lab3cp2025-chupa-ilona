public class MilkDecorator extends CoffeeDecorator {
    public MilkDecorator(Coffee coffee) {
        super(coffee);
    }

    public String getDescription() {
        return coffee.getDescription() + ", milk";
    }

    public double cost() {
        return coffee.cost() + 5.0;
    }
}
