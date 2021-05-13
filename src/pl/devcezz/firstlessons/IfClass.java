package pl.devcezz.firstlessons;

public class IfClass {

    public static void main(String[] args) {
        String result = method(-10);

        System.out.println(result);
    }

    public static String method(int a) {
        if (a >= 10) {
            return "Jestem większy bądź równy 10";
        } else if (a >= 5) {
            return "Jestem większy bądź równy 5";
        } else if (a >= 3) {
            return "Jestem większy bądź równy 3";
        } else {
            return "Jestem mniejszy od 3";
        }
    }
}
