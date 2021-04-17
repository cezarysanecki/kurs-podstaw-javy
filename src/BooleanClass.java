public class BooleanClass {

    public static void main(String[] args) {
        int first = 10;
        int second = 20;

        boolean compare = first < second;
        System.out.println(compare);

        // >, <, >=, <=, ==, !=

        boolean a = 10 != 20;
        boolean b = 10 == 10;
        boolean c = 7 >= 10;
        boolean d = 10 >= 18;
        boolean e = 90 <= 100;

        System.out.println(checkIfNumberIsGreaterThen15(20));
        System.out.println(checkIfNumberIsGreaterThen15(12));
        System.out.println(checkIfNumberIsGreaterThen15(15));

        int intValue = 10;
        long longValue = 20;
        short shortValue = 15;
        byte byteValue = 12;

        System.out.println(longValue < shortValue);
        System.out.println(byteValue >= intValue);

        String help = "a";
        String t1 = "ab";
        String t2 = help + "b";
        System.out.println(t1 == t2);

        System.out.println(checkIfFirstIsLessThenSecond(10, 24));
        System.out.println(checkIfFirstIsLessThenSecond(10, 10));
        System.out.println(checkIfFirstIsLessThenSecond(10, 0));
    }

    public static boolean checkIfNumberIsGreaterThen15(int number) {
        return 15 < number;
    }

    public static boolean checkIfFirstIsLessThenSecond(int first, int second) {
        return first < second;
    }
}
