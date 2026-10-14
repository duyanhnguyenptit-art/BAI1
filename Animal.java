// 1. Tạo lớp Animal có thuộc tính name và phương thức makeSound()
abstract class Animal {
    protected String name;

    public Animal(String name) {
        this.name = name;
    }

    public abstract void makeSound();
}
