package pl.devcezz.recursion;

public class RecursionClass {

    public static void main(String[] args) {
        System.out.println(sumDecrementing(100));

        // 10 + sumDecrementing(9)
        // 10 + 9 + sumDecrementing(8)
        // 10 + 9 + 8 + sumDecrementing(7)
        // itd.
        // 10 + 9 + 8 + 7 + 6 + 5 + 4 + 3 + 2 + 1

        //            #
        //           ###
        //          #####
        //         #######
        //        #########

        System.out.println("====");

        drawChristmasTree(3);

        System.out.println("====");

        drawChristmasTree(5);

        System.out.println("====");

        drawChristmasTree(10);
    }

    private static void drawChristmasTree(int levels) {
        drawLevel(levels - 1, 1);
    }

    private static void drawLevel(int spaces, int tree) {
        System.out.print(" ".repeat(spaces));
        System.out.print("#".repeat(tree));
        System.out.print(" ".repeat(spaces));
        System.out.println();
        if (spaces == 0) {
            return;
        }
        drawLevel(spaces - 1, tree + 2);
    }

    private static int sumDecrementing(int number) {
        if (number < 2) {
            return 1;
        }
        return number + sumDecrementing(--number);
    }
}
