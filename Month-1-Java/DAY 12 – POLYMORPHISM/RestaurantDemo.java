class RestaurantDemo {
    public static void main(String[] args) {

        Food f;

        f = new Pizza();
        f.prepare();

        f = new Burger();
        f.prepare();

        f = new Biryani();
        f.prepare();
    }
}
