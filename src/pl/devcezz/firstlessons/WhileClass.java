package pl.devcezz.firstlessons;

public class WhileClass {

    public static void main(String[] args) {
        int i = 0;
        while (i < 5) {
            System.out.println(i);
            i++;
        }
        System.out.println("====");
        // i++, ++i, --i, i--

        int j = 10;
        int a = ++j;
        int b = j++;

        System.out.println(a);
        System.out.println(b);
        System.out.println(j);

        System.out.println("====");

        double p = 2.3;

        while (p < 6) {
            System.out.println("p = " + p);
            p++;
        }

        System.out.println("koniec p = " + p);

        System.out.println("====");

        int k = 10;

        do {
            System.out.println("Jestem w do-while");
        } while (k > 999);

        while (k > 999) {
            System.out.println("Jestem w while");
        }

        System.out.println("===");

        print(-10);
    }

    public static void print(int number) {
        if (number < 1) {
            return;
        }

        int counter = 1;
        do {
            System.out.println(counter++);
            if (counter > number) {
                return;
            }
        } while (true);
    }
}
