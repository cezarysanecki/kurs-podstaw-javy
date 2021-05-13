package pl.devcezz.firstlessons;

public class ForClass {

    public static void main(String[] args) {
        for (int i = 0; i < 10; i++) {
            System.out.println(i);
        }

        System.out.println("====");

        String[] names = { "Jane", "John", "Frank" };
        for (String name : names) {
            System.out.println(name);
        }

        System.out.println("====");

        int[] numbers = { 1, 2, 3, 4, 5, 6 };

        for (int number : numbers) {
            if (number == 2) {
                System.out.println("Skip 2");
                continue;
            }
            System.out.println(number);
            if (number == 5) {
                System.out.println("Break after 5");
                break;
            }
        }

        System.out.println("====");
        print(4);
    }

    public static void print(int sideWidth) {
        for (int i = 0; i < sideWidth; i++) {
            for (int j = 0; j < sideWidth; j++) {
                System.out.print("#");
            }
            System.out.println();
            // System.out.println(); == System.out.print('\n');
        }
    }
}
