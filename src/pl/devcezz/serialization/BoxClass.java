package pl.devcezz.serialization;

import java.io.*;

public class BoxClass {

    public static void main(String[] args) {
        Box box = new Box(10, 14, 22, new Thing("image"));
        System.out.println(box.calculateVolume());

        try(ObjectOutputStream outputStream = new ObjectOutputStream(new FileOutputStream("box.bin"))) {
            box.print();
            box.checkWhatsInside();
            outputStream.writeObject(box);
        } catch (IOException e) {
            System.out.println("Error while writing to file: " + e.getMessage());
            e.printStackTrace();
        }

        try (ObjectInputStream inputStream = new ObjectInputStream(new FileInputStream("box.bin"))) {
            Box boxInput = (Box) inputStream.readObject();
            boxInput.print();
            boxInput.checkWhatsInside();
            System.out.println(boxInput.calculateVolume());
        } catch (IOException | ClassNotFoundException e) {
            System.out.println("Error while reading object from file: " + e.getMessage());
            e.printStackTrace();
        }
    }
}
