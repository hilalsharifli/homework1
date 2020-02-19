package app;

public class Main {
    public static void main(String[] args) {
        Animal animal = new Animal();
        Cat cat = new Cat();
        Dog dog = new Dog();
        dog.name="Bobby";
        cat.name="Kitty";
        animal.name = "Hatiko";


        animal.print();
        cat.print();
        dog.print();
    }
}
