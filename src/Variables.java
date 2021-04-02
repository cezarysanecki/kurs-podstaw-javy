public class Variables {

    public static void main(String[] args) {
        int firstNumber = 12;
        int secondNumber = 7;

        int sum = firstNumber + secondNumber;
        System.out.println(firstNumber + " + " + secondNumber + " = " + sum);
        // +, -, *, /, %
        /* To jest komentarz */
        System.out.println(firstNumber - secondNumber);
        System.out.println(firstNumber * secondNumber);
        System.out.println(firstNumber / secondNumber);
        System.out.println(firstNumber % secondNumber);

        short s;
        byte b;
        long l;
        int i;
        float f = 4.13f;
        double d = 3.14;
        boolean t;

        double answer = 10 / 4.0;
        System.out.println(answer);

        String sentence = "Witaj " + "Czarek!";
        System.out.println(sentence);

        answer = 3.14;
        System.out.println(answer);

        final int dontChange = 10;
        // dontChange = 12;

        char o = 'k';
    }
}
