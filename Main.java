public class Main {
    public static void main(String[] args) {
        Animal[] animals = new Animal[] {
            new Dog("Doggy"),
            new Cat("Kitty")
        };


        for (Animal animal : animals) {
            animal.makeSound();
        }
    }
}
