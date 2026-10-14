// 2. Tạo lớp Cat kế thừa từ Animal
class Cat extends Animal {
    public Cat(String name) {
        super(name);
    }

    // 3. Ghi đè phương thức makeSound() in ra "Meo meo"
    @Override
    public void makeSound() {
        System.out.println("Meo meo");
    }
}