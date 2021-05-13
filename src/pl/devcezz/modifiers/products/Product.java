package pl.devcezz.modifiers.products;

class Product {

    int price;

    Product() {
    }

    public void shout() {
        System.out.println("I'm for sale!");
    }

    public static void methodA() {
        System.out.println("pl.devcezz.firstlessons.Method A");
    }

    protected static void methodB() {
        System.out.println("pl.devcezz.firstlessons.Method B");
    }

    static void methodC() {
        System.out.println("pl.devcezz.firstlessons.Method C");
    }

    private static void methodD() {
        System.out.println("pl.devcezz.firstlessons.Method D");
    }
}
