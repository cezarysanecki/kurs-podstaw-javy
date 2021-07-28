package pl.devcezz.optimalization;

public class StringBuilderClass {

    public static void main(String[] args) {
        String alaMaKota = "Ala" + " " + "ma" + " " + "kota.";
        System.out.println(alaMaKota);

        StringBuilder stringBuilder = new StringBuilder()
                    .append("Ala")
                    .append(" ")
                    .append("ma")
                    .append(" ")
                    .append("kota.");
        String alaMaKotaBuilder = stringBuilder.toString();
        System.out.println(alaMaKotaBuilder);

        System.out.println("=== 1000 ===");
        test(1000);

        System.out.println("=== 10000 ===");
        test(10000);

        System.out.println("=== 100000 ===");
        test(100000);

        StringBuilder stringBuilder1 = new StringBuilder("Ala ma kota.")
                .replace(0, 3, "Kasia")
                .delete(6, 8)
                .insert(6, "posiada");

        System.out.println(stringBuilder1);
        System.out.println(stringBuilder1.charAt(0));
        System.out.println(stringBuilder1.substring(0, 5));
        System.out.println(stringBuilder1.reverse());
    }

    private static void test(int number) {
        long startTime = System.currentTimeMillis();
        String string = "";
        for (int i = 0; i < number; i++) {
            string += "Ala ma kota. ";
        }
        long endTime = System.currentTimeMillis();
        System.out.println("String: " + (endTime - startTime) + "ms.");

        startTime = System.currentTimeMillis();
        StringBuilder stringBuilder1 = new StringBuilder();
        for (int i = 0; i < number; i++) {
            stringBuilder1.append("Ala ma kota. ");
        }
        String stringBuilderEnded = stringBuilder1.toString();
        endTime = System.currentTimeMillis();
        System.out.println("StringBuilder: " + (endTime - startTime) + "ms.");
    }
}
