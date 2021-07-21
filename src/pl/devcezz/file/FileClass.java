package pl.devcezz.file;

import java.io.*;
import java.nio.charset.StandardCharsets;
import java.util.List;
import java.util.stream.Collectors;

public class FileClass {

    public static void main(String[] args) {
        List<String> song = List.of(
                "Chciałem być marynarzem",
                "Chciałem mieć tatuaże",
                "Podróżować, zwiedzać świat",
                "Pięknie żyć, garściami życie brać"
        );

        writeSong(song);
        readSong("song.txt");

        System.out.println("====");

        writeFilteredSongToFile(song);
        readSong("filtered-song.txt");
    }

    private static void readSong(String filename) {
        BufferedInputStream inputStream = null;
        try {
            inputStream = new BufferedInputStream(new FileInputStream(filename));
            byte[] bytes = new byte[1024];
            int lastByte;
            while ((lastByte = inputStream.read(bytes)) != -1) {
                System.out.println(new String(bytes, 0, lastByte, StandardCharsets.UTF_8));
            }
        } catch (IOException e) {
            System.out.println("Error while operting on file: " + e.getMessage());
            e.printStackTrace();
        } finally {
            try {
                if (inputStream != null) {
                    inputStream.close();
                }
            } catch (IOException e) {
                System.out.println("Error while closing file: " + e.getMessage());
                e.printStackTrace();
            }
        }
    }

    private static void writeSong(List<String> song) {
        BufferedOutputStream outputStream = null;
        try {
            outputStream = new BufferedOutputStream(new FileOutputStream("song.txt"));

            for (String line : song) {
                outputStream.write(line.getBytes(StandardCharsets.UTF_8));
                outputStream.write('\n');
            }
        } catch (IOException e) {
            System.out.println("Error while operating on file: " + e.getMessage());
            e.printStackTrace();
        } finally {
            try {
                if (outputStream != null) {
                    outputStream.close();
                }
            } catch (IOException e) {
                System.out.println("Error while closing stream");
                e.printStackTrace();
            }
        }
    }

    private static void writeFilteredSongToFile(List<String> song) {
        BufferedOutputStream outputStream = null;
        try {
            outputStream = new BufferedOutputStream(new FileOutputStream("filtered-song.txt"));

            List<String> filteredSong = song.stream()
                    .filter(line -> line.contains("Chciałem"))
                    .collect(Collectors.toList());
            for (String line : filteredSong) {
                outputStream.write(line.getBytes(StandardCharsets.UTF_8));
                outputStream.write('\n');
            }
        } catch (IOException e) {
            System.out.println("Error while operating on file: " + e.getMessage());
            e.printStackTrace();
        } finally {
            try {
                if (outputStream != null) {
                    outputStream.close();
                }
            } catch (IOException e) {
                System.out.println("Error while closing stream");
                e.printStackTrace();
            }
        }
    }
}
