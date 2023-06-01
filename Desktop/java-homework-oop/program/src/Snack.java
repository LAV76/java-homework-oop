class Snack extends Product {
    public Snack(String name, double price, int quantity) {
        super(name, price, quantity);
    }

    @Override
    public String getType() {
        return "Snack";
    }
}