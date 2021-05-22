package pl.devcezz.exceptions;

public class Animal {

    private final String name;
    private final int age;

    public Animal(final String name, final int age) throws Exception {
        if (name.contains("g")){
            throw new IllegalArgumentException("Nazwa nie może zawierać 'g'");
        }
        if (age < 0 || age > 12) {
            throw new Exception("Wiek nie może być ujemny albo większy od 12");
        }
        this.name = name;
        this.age = age;
    }
}
