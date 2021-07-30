package pl.devcezz.inner;

public class TestClass {

    public static void main(String[] args) {
        OuterClass outerClass = new OuterClass();
        OuterClass.InnerNonStaticClass innerNonStaticClass = outerClass.new InnerNonStaticClass(10);
        OuterClass.InnerNonStaticClass innerNonStaticClass2 = new OuterClass().new InnerNonStaticClass(10);
        OuterClass.InnerNonStaticClass innerNonStaticClass3 = outerClass.new InnerNonStaticClass(10);

        innerNonStaticClass.shout();

        System.out.println("====");

        OuterClass.InnerStaticClass innerStaticClass = new OuterClass.InnerStaticClass(20);

        innerStaticClass.shout();

        OuterClassSecond outerClassSecond = new OuterClassSecond();

        class A {
            public void shout() {
                System.out.println("Hello from A class!");
            }
        }
        A a = new A();
        a.shout();

        System.out.println("====");

        PencilCase pencilCase = new PencilCase();
        pencilCase.addPencil("HB");
        pencilCase.addPencil("H");
        pencilCase.addPencil("B");
        pencilCase.addPencil("2H");
        pencilCase.addPencil("3B");

        pencilCase.print();
    }
}
