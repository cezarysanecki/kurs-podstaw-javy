package pl.devcezz.resources;

import java.io.*;
import java.nio.charset.StandardCharsets;
import java.util.List;

public class TryWithResourcesClass {

    public static void main(String[] args) {
        List<String> poem = List.of(
                "Mieszkała stonoga pod Biała,",
                "Bo tak się jej podobało.",
                "Raz przychodzi liścik mały",
                "Do stonogi,",
                "Że proszona jest do Białej",
                "Na pierogi.",
                "Ucieszyło to stonogę,",
                "Więc ruszyła szybko w drogę."
        );

        try (BufferedWriter outputStream = new BufferedWriter(new OutputStreamWriter(new FileOutputStream("poem.txt")))) {
            for (String line : poem) {
                outputStream.write(line);
                outputStream.newLine();
            }
        } catch (IOException e) {
            System.out.println("Error while operating on file: " + e.getMessage());
            e.printStackTrace();
        }

        try (BufferedReader reader = new BufferedReader(new InputStreamReader(new FileInputStream("poem.txt")))) {
            String line;
            while ((line = reader.readLine()) != null) {
                System.out.println(line);
            }
        } catch (IOException e) {
            System.out.println("Error while processing file: " + e.getMessage());
            e.printStackTrace();
        }

        System.out.println("====");

        try (Chest chest = new Chest()) {
            System.out.println("Opening chest");
        }
    }
}
