








public class Main {
    public static void main(String[] args) {
        VendingMachine vendingMachine = new VendingMachine();

        Drink coke = new Drink("Coke", 1.5, 5);
        Snack chips = new Snack("Chips", 2.0, 3);
        Candy candy = new Candy("Candy", 1.0, 0);

        vendingMachine.addProduct(coke);
        vendingMachine.addProduct(chips);
        vendingMachine.addProduct(candy);

        vendingMachine.displayProducts();

        vendingMachine.buyProduct(chips);
        vendingMachine.buyProduct(candy);
        vendingMachine.buyProduct(candy);
        vendingMachine.buyProduct(coke);
        vendingMachine.buyProduct(coke);
        vendingMachine.buyProduct(coke);
        vendingMachine.buyProduct(coke);
    }
}
