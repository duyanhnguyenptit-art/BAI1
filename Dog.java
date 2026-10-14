// 2. Tạo lớp Dog kế thừa từ Animal
class Dog extends Animal {
    public Dog(String name) {
        super(name);
    }

    // 3. Ghi đè phương thức makeSound() in ra "Gau gau"
    @Override
    public void makeSound() {
        System.out.println("Gau gau");
    }
}
