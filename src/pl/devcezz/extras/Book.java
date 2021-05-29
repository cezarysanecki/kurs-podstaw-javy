package pl.devcezz.extras;

import pl.devcezz.extras.exception.ConnectionException;
import pl.devcezz.extras.exception.NotFoundBookException;

public class Book {

    private final BookType type;

    public Book(BookType type) {
        this.type = type;
    }

    public static void main(String[] args) {
        Book book = new Book(BookType.FANTASY);

        switch (book.type) {
            case HISTORY -> System.out.println("And the king is...");
            case SCI_FI -> System.out.println("Is it Frankenstein?");
            case FANTASY -> System.out.println("Try to deal with my sword!");
            case COOKBOOK -> System.out.println("Let's cook some tuna.");
            default -> System.out.println("Unknown book type");
        }

        try {
            System.out.println("We are in try block");
        } catch (NotFoundBookException exception) {
            System.out.println("We are in catch block");
        } finally {
            System.out.println("we are in finally block");
        }

        method();
    }

    public static String method() {
        try {
            throw new ConnectionException("Cannot connect");
        } catch (ConnectionException exception) {
            System.out.println("Error with message: " + exception.getMessage());
            return "Found error";
        } finally {
            System.out.println("Is finally needed?");
        }
    }
}
