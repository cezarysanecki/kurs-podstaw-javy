package pl.devcezz.firstlessons;

import java.util.Random;
import java.util.Scanner;

public class UserClass {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        Random random = new Random();
        String[] answers = {
                "Mój wywiad donosi: NIE",
                "Wygląda dobrze",
                "Kto wie?",
                "Zapomnij o tym",
                "Tak - w swoim czasie",
                "Prawie jak tak",
                "Nie teraz",
                "YES, YES, YES",
                "To musi poczekać",
                "Mam pewne wątpliwości",
                "Możesz na to liczyć",
                "Zbyt wcześnie aby powiedzieć",
                "Daj spokój",
                "Absolutnie",
                "Chyba żatrujesz?",
                "Na pewno nie",
                "Zrób to",
                "Prawdopodobnie",
                "Dla mnie rewelacja",
                "Na pewno tak"
        };

        for (int i = 5; i >= 1; i--) {
            System.out.println("Zadaj pytanie magicznej kuli nr 8 (pozostało " + i + " pytań): ");
            String question = scanner.nextLine();
            String answer = answers[random.nextInt(answers.length)];
            System.out.println("Odpowiedź na pytanie '" + question + "' to: " + answer);
        }
    }
}
