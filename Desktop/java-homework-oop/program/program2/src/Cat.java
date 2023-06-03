public class Cat {
    private String name;
    private int appetite;
    private boolean satiety;

    public Cat(String name, int appetite) {
        this.name = name;
        this.appetite = appetite;
    }

    public class Cat {
        private String name;
        private int appetite;
        private boolean satiety;

        public Cat(String name, int appetite) {
            this.name = name;
            this.appetite = appetite;
            this.satiety = false;
        }

        public void eat(Plate plate) {
            if (plate.getFood() >= appetite) {
                plate.decreaseFood(appetite);
                satiety = true;
            } else {
                System.out.println(name + " не может покушать, в тарелке недостаточно еды.");
            }
        }

        public boolean isSatiety() {
            return satiety;
        }
    }
}