class VendingMachine {
    private List<Product> products;

    public VendingMachine() {
        products = new ArrayList<>();
    }

    public void addProduct(Product product) {
        products.add(product);
    }

    public void removeProduct(Product product) {
        products.remove(product);
    }

    public void displayProducts() {
        System.out.println("Available products:");
        for (Product product : products) {
            System.out.println(product.getType() + ": " + product.getName() + " - $" + product.getPrice());
        }
    }

    public boolean buyProduct(Product product) {
        if (products.contains(product)) {
            if (product.getQuantity() > 0) {
                product.setQuantity(product.getQuantity() - 1);
                System.out.println("You bought " + product.getName() + ". Enjoy!");
                return true;
            } else {
                System.out.println("Sorry, " + product.getName() + " is out of stock.");
            }
        } else {
            System.out.println("Product not available in the vending machine.");
        }
        return false;
    }
}
