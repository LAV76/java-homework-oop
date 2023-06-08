

public class Main {
    public static void main(String[] args) {
        Box<Apple> appleBox1 = new Box<>();
        appleBox1.addFruit(new Apple());
        appleBox1.addFruit(new Apple());
        appleBox1.addFruit(new Apple());

        Box<Apple> appleBox2 = new Box<>();
        appleBox2.addFruit(new Apple());
        appleBox2.addFruit(new Apple());

        Box<Orange> orangeBox = new Box<>();
        orangeBox.addFruit(new Orange());
        orangeBox.addFruit(new Orange());
        orangeBox.addFruit(new Orange());

        System.out.println("Вес коробки с яблоками1: " + appleBox1.getWeight());
        System.out.println("Вес коробки с яблоками2: " + appleBox2.getWeight());
        System.out.println("Вес коробки для апельсинов: " + orangeBox.getWeight());

        System.out.println("Равны ли по весу appleBox1 и appleBox2? " + appleBox1.compare(appleBox2));
        System.out.println("Равны ли по весу appleBox1 и orangeBox? " + appleBox1.compare(orangeBox));

        Box<Apple> appleBox3 = new Box<>();
        appleBox3.addFruit(new Apple());
        appleBox3.addFruit(new Apple());
        appleBox3.addFruit(new Apple());

        System.out.println("Вес appleBox3 перед передачей: " + appleBox3.getWeight());
        System.out.println("Вес appleBox2 перед переноса: " + appleBox2.getWeight());

        appleBox3.transferFruitsTo(appleBox2);

        System.out.println("Вес appleBox3 после передачей: " + appleBox3.getWeight());
        System.out.println("Вес appleBox2 после переноса: " + appleBox2.getWeight());
    }
}
