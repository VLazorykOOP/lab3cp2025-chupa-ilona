import java.util.ArrayList;

public class Main {
    public static void main(String[] args) {
        task1();
        task2();
        task3();

    }

    public static void task1(){
        String[] skills = {"Сила","Витривалість"};
        Warrior original = new Warrior("Айвенго",4, "Меч", skills);
        Warrior prototype= original.clone();
        prototype.setName("Ланцелот");
        prototype.setLevel(99);
        prototype.setWeapon("Рушниця");
    }

    public static void task2(){
        Coffee espresso = new Espresso();
        Coffee milkCoffee = new MilkDecorator(espresso);
        Coffee chocolateMilkCoffee = new ChocolateDecorator(milkCoffee);

        System.out.println(chocolateMilkCoffee.getDescription()); // Espresso, milk, chocolate
        System.out.println(chocolateMilkCoffee.cost()); // 25 + 5 + 7 = 37.0

    }

    public static void task3(){
        ArrayList<Person> people = new ArrayList<>();
        people.add(new Person("Ілона", 22));
        people.add(new Person("Микита", 17));
        people.add(new Person("Оксана", 19));
        people.add(new Person("Сергій", 15));

        AdultPersonIterator iterator = new AdultPersonIterator(people);

        System.out.println("Дорослі користувачі:");
        while (iterator.hasNext()) {
            System.out.println(iterator.next());
        }
    }

}