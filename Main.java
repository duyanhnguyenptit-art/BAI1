public class Main {
    public static void main(String[] args) {
        // 4. Trong hàm main(), tạo mảng Animal[] gồm một Dog và một Cat
        Animal[] animals = new Animal[] {
            new Dog("Doggy"),
            new Cat("Kitty")
        };

        // Duyệt mảng và gọi makeSound()
        for (Animal animal : animals) {
            animal.makeSound();
        }
    }
}