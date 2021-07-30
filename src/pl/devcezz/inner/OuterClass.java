package pl.devcezz.inner;

public class OuterClass {

    private static final String STATIC_VARIABLE = "static variable";
    private final String variable = "variable";

    public class InnerNonStaticClass {

        private final String VAR = "InnerNonStaticClass";
        private final int number;

        public InnerNonStaticClass(int number) {
            this.number = number;
        }

        public void shout() {
            System.out.println("Outer static: " + STATIC_VARIABLE);
            System.out.println("Outer: " + variable);
            System.out.println("My number is " + number);
            System.out.println(VAR);
        }
    }

    public static class InnerStaticClass {

        private final String VAR = "InnerStaticClass";
        private final int number;

        public InnerStaticClass(int number) {
            this.number = number;
        }

        public void shout() {
            System.out.println("Outer static: " + STATIC_VARIABLE);
//            System.out.println("Outer: " + variable);
            System.out.println("My number is " + number);
            System.out.println(VAR);
        }
    }
}

class OuterClassSecond {

}

class OuterClassThird {

}
