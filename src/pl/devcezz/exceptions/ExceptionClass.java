package pl.devcezz.exceptions;

import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.util.InputMismatchException;
import java.util.Scanner;

public class ExceptionClass {

    public static void main(String[] args) throws FileNotFoundException {
        try {
            System.out.println(10 / 0);
        } catch (ArithmeticException ex) {
            System.out.println(ex.getMessage());
        }

//        Scanner scanner = new Scanner(System.in);
//        System.out.print("Podaj liczbę: ");
//        try {
//            int number = scanner.nextInt();
//
//            if (number < 0) {
//                throw new IllegalArgumentException("Liczba nie może być mniejsza od zera.");
//            }
//        } catch (InputMismatchException ex) {
//            System.out.println("Prosiłem, podaj liczbę.");
//        } catch (IllegalArgumentException ex) {
//            System.out.println(ex.getMessage());
//        }

//        handleException();

        try {
            Animal animal = new Animal("cat", -4);
        } catch (Exception e) {
            System.out.println(e.getMessage());
        }
    }

    public static void handleException() throws FileNotFoundException {
        throw new FileNotFoundException("Nie znaleziono podanego pliku.");
    }
}
