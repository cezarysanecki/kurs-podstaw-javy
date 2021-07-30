package pl.devcezz.inner;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;

public class PencilCase {

    private final List<Pencil> pencils = new ArrayList<>();

    public void addPencil(String name) {
        pencils.add(new Pencil(name));
    }

    public void print() {
        String pencilNames = pencils.stream()
                .map(pencil -> pencil.name)
                .collect(Collectors.joining(", "));

        System.out.println(pencilNames);
    }

    private class Pencil {

        private final String name;

        public Pencil(String name) {
            this.name = name;
        }
    }
}
