package pl.devcezz.extras.exception;

public class ExceptionClass {

    public static void main(String[] args) {
        try {
            throw new ConnectionException("Cannot connect to database");
        } catch (ConnectionException e) {
            System.out.println(e.getMessage());
        }

//        throw new NotFoundBookException(new IllegalArgumentException(new RuntimeException("Message")));
    }
}
