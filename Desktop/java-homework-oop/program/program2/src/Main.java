
public class Main {
    public static void main(String[] args) {
        Cat[] cats = {
                new Cat("Barsik", 5),
                new Cat("Murzik", 10),
                new Cat("Tom", 8)
        };

        Plate plate = new Plate(15);
        plate.info();

        for (Cat cat : cats) {
            cat.eat(plate);
            System.out.println(cat.getName() + " is satiety: " + cat.isSatiety());
        }

        plate.addFood(10);
        plate.info();
    }
}
