package pl.devcezz.firstlessons;

import java.util.Random;

public class WrapperClass {

    public static void main(String[] args) {
        Random random = new Random();
        int randomInt = random.nextInt(20);
        // boolean -> Boolean
        // char -> Character
        // byte -> Byte
        // short -> Short
        // int -> Integer
        // long -> Long
        // float -> Float
        // double -> Double

        boolean bool = true;
        char c = 'p';
        byte b = 12;
        short s = 16;
        int i = 90;
        long l = 123;
        float f = 1.23f;
        double d = 3.14;

        Boolean wrapperBool = bool;
        Character wrapperC = c;
        Byte wrapperB = b;
        Short wrapperS = s;
        Integer wrapperI = i;
        Long wrapperL = l;
        Float wrapperF = f;
        Double wrapperD = d;

        boolean bool2 = wrapperBool;
        char c2 = wrapperC;
        byte b2 = wrapperB;
        short s2 = wrapperS;
        int i2 = wrapperI;
        long l2 = wrapperL;
        float f2 = wrapperF;
        double d2 = wrapperD;
    }
}
