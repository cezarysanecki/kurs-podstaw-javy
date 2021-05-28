package pl.devcezz.inheritance.dev;

import pl.devcezz.inheritance.Worker;

public class Developer extends Worker {

    public Developer(String name, int salary) {
        super(name, salary);
    }

    @Override
    public void work() {
        System.out.println(name + ": Writing some code for " + salary);
    }

    @Override
    protected String getThoughts() {
        return "I want to laptop";
    }
}
