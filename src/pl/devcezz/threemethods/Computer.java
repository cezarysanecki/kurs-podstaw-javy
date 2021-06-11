package pl.devcezz.threemethods;

import java.util.Objects;

public class Computer {

    private final String name;
    private final int ram;
    private final Processor processor;

    public Computer(String name, int ram, Processor processor) {
        this.name = name;
        this.ram = ram;
        this.processor = processor;
    }

    public static void main(String[] args) {
        Computer computer = new Computer("My Computer", 2048, Processor.INTEL);
        Computer computer2 = new Computer("My Computer", 2048, Processor.INTEL);
        System.out.println(computer.equals(computer2));
        System.out.println(computer.hashCode());
        System.out.println(computer2.hashCode());

        System.out.println("====");

        // zwrotna
        System.out.println("computer.equals(computer)");
        System.out.println(computer.equals(computer));

        // symatryczna
        System.out.println("computer.equals(computer2) == computer2.equals(computer)");
        System.out.println(computer.equals(computer2) == computer2.equals(computer));

        // przechodnia
        Computer computer3 = new Computer("My Computer", 2048, Processor.INTEL);
        System.out.println("computer.equals(computer2) == computer2.equals(computer3) == computer3.equals(computer)");
        System.out.println(computer.equals(computer2) == computer2.equals(computer3) == computer3.equals(computer));

        // spójna
        System.out.println("fori");
        for (int i = 0; i < 10; i++) {
            System.out.println(computer.equals(computer2));
        }

        // null -> false
        System.out.println("null == computer");
        System.out.println(computer.equals(null));

        System.out.println("hashCode");
        for (int i = 0; i < 10; i++) {
            System.out.println(computer.hashCode());
        }

        System.out.println("hashCode ==");
        System.out.println(computer.equals(computer2));
        System.out.println(computer.hashCode() == computer2.hashCode());

        System.out.println("hashCode !=");
        Computer computer4 = new Computer("Your Computer", 2048, Processor.AMD);
        System.out.println(computer.equals(computer4));
        System.out.println(computer.hashCode() == computer4.hashCode());

        System.out.println(computer);

        System.out.println("ABC".equalsIgnoreCase("aBc"));

        checkEqualityAndHashCode(new Object(), computer);
        checkEqualityAndHashCode(computer, computer);
        checkEqualityAndHashCode(computer, computer4);
    }

    public static void checkEqualityAndHashCode(Object o1, Object o2) {
        if (o1.equals(o2)) {
            if (o1.hashCode() == o2.hashCode()) {
                System.out.println("EQUALS: TAK, HASHCODE: TAK");
            } else {
                System.out.println("EQUALS: TAK, HASHCODE: NIE");
            }
        } else {
            if (o1.hashCode() == o2.hashCode()) {
                System.out.println("EQUALS: NIE, HASHCODE: TAK");
            } else {
                System.out.println("EQUALS: NIE, HASHCODE: NIE");
            }
        }
    }

    @Override
    public String toString() {
        return "Komputer '" + name + "' ma procesor " + processor + " i " + ram + "MB RAM.";
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Computer computer = (Computer) o;
        return ram == computer.ram && processor == computer.processor;
    }

    @Override
    public int hashCode() {
        return Objects.hash(ram);
    }
}
