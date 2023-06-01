class Drink extends Product {
    public Drink(String name, double price, int quantity) {
        super(name, price, quantity);
    }

    @Override
    public String getType() {
        return "Drink";
    }
}