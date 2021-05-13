package pl.devcezz.firstlessons;

public class ArrayClass {

    public static void main(String[] args) {
        int[] a = { 1, 2, 3 };
        int[] b = new int[3];
        int[] c = new int[] { 1, 2, 3 };

        String[] z = { "Hi", "Hey", "Hello" };
        String y[] = { "Hi", "Hey", "Hello" };
        String [] x = { "Hi", "Hey", "Hello" };

        double[] temp = new double[3];

        // 0, 1, 2 ...
//        System.out.println(temp[1]);
//        System.out.println(temp[2]);
//        System.out.println(temp[3]);

        System.out.println(temp[0]);
        System.out.println(temp[1]);
        System.out.println(temp[2]);

        temp[0] = 2.5;
        temp[1] = -2.3;
        temp[2] = 12.9;

        System.out.println("====");

        System.out.println(temp[0]);
        System.out.println(temp[1]);
        System.out.println(temp[2]);

        System.out.println("====");

        char c1 = getCharacter(-2);
        char c2 = getCharacter(2);
        char c3 = getCharacter(17);

        System.out.println(c1);
        System.out.println(c2);
        System.out.println(c3);

        int[][] p = {
                {1, 2, 3},
                {4, 5, 6},
                {7, 8, 9},
        };

        System.out.println(p[1][2]);
    }

    public static char getCharacter(int index) {
        char[] chars = { 'a', 'b', 'c' };

        // !, &&, &, ||, |, ^
        if (index > chars.length - 1 || index < 0) {
            return 'x';
        }

        return chars[index];
    }

    public static boolean methodA() {
        System.out.println("methodA");
        return true;
    }

    public static boolean methodB() {
        System.out.println("methodB");
        return false;
    }
}
