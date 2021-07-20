package pl.devcezz.optional;

import java.util.Optional;

public class OptionalClass {

    public static void main(String[] args) {
        printLowercaseString(null);

        System.out.println(optionalMethod("Peter"));
        System.out.println(optionalMethod("Jane"));
        System.out.println(optionalMethod("Tom"));
    }

    public static void printLowercaseString(String param) {
        Integer integer = Optional.ofNullable(param)
                .map(String::toLowerCase)
                .map(String::length)
                .orElse(0);
        System.out.println(integer);
    }

    public static int optionalMethod(String param) {
        return Optional.ofNullable(param)
                .map((string) -> {
                    System.out.println(string);
                    return string.length();
                })
                .filter((length) -> length > 3)
                .orElseThrow(IllegalArgumentException::new);
    }
}
