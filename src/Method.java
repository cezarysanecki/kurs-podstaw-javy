public class Method {

    public static void main(String[] args) {
        String message = print("Message");
        System.out.println(message);
    }

    public static int method(int variable) {
        return 14 + variable;
    }

    public static int countNumberOfCandies(final int numberOfColleagues) {
        return 3 * numberOfColleagues;
    }

    public static String print(String variable) {
        System.out.println(variable);
        return variable + " after method";
    }
}
