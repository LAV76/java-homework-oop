class Candy extends Product {
    public Candy(String name, double price, int quantity) {
        super(name, price, quantity);
    }

    @Override
    public String getType() {
        return "Candy";
    }
}