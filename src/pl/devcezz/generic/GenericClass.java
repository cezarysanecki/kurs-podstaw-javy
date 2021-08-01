package pl.devcezz.generic;

public class GenericClass {

    public static void main(String[] args) {
        Cage<Cat> catCage = new Cage<>(new Cat("Filek"));
        catCage.print();

        Cage<Dog> dogCage = new Cage<>(new Dog("Azor"));
        dogCage.print();

        Cage<Animal> animalCage = new Cage<>(new Dog("Burek"));
        animalCage.print();

//        Cage<String> stringCage = new Cage<>("Strange...");
//        stringCage.print();

        printDog(dogCage);
//        printDog(animalCage);

        printSomething(dogCage);
        printSomething(animalCage);
        printSomething(catCage);

        Cage<Terrier> terrierCage = new Cage<>(new Terrier("Klopsik"));
        printDogBreed(terrierCage);
        printDogBreed(dogCage);
//        printDogBreed(catCage);

        Cage<ManchesterTerrier> manchesterTerrierCage = new Cage<>(new ManchesterTerrier("Pączek"));
//        print(manchesterTerrierCage);
        print(terrierCage);
        print(dogCage);
        print(animalCage);
//        print(catCage);

        MyMap<String, Double> map = new MyMapImpl<>();
        map.put("ABC", 123.2);
        System.out.println(map.get("ABC"));
    }

    public static void printDog(Cage<Dog> cageWithDog) {
        System.out.println("There is dog in cage");
    }

    public static void printSomething(Cage<?> cageWithSomething) {
        System.out.println("There is something in cage");
    }

    public static void printDogBreed(Cage<? extends Dog> cageWithDog) {
        System.out.println("There is something in cage");
    }

    public static void print(Cage<? super Terrier> cage) {
        System.out.println("There is something in cage");
    }
}

class Terrier extends Dog {
    public Terrier(String name) {
        super(name);
    }
}

class ManchesterTerrier extends Terrier {
    public ManchesterTerrier(String name) {
        super(name);
    }
}