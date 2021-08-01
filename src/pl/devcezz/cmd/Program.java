package pl.devcezz.cmd;

import java.util.ArrayList;
import java.util.List;

public class Program {

    private final List<Option> options;

    public Program() {
        this.options = new ArrayList<>();

        this.options.add(new Option(1, "Play", "Playing..."));
        this.options.add(new Option(2, "Settings", "Setting up..."));
        this.options.add(new Option(3, "About", "Author: DevCezz"));
        this.options.add(new Option(4, "Exit", "Goodbye!"));
    }

    public boolean stillRunning(int cmd) {
        return options.get(3).value != cmd;
    }

    public void printOptions() {
        System.out.println("=== Available options ===");
        options.forEach(System.out::println);
    }

    public void handleChoice(int cmd) {
        options.stream()
                .filter(option -> option.value == cmd)
                .findFirst()
                .orElseThrow(IllegalArgumentException::new)
                .run();
    }

    private static class Option {

        private final int value;
        private final String desc;
        private final String program;

        public Option(int value, String desc, String program) {
            this.value = value;
            this.desc = desc;
            this.program = program;
        }

        public void run() {
            System.out.println(program);
        }

        @Override
        public String toString() {
            return " " + value + ". " + desc;
        }
    }
}
