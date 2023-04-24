package Animal;

public class Cat extends Animal {
    public Cat() {
    }
    public Cat(String name, String color, String type, int age) {
        super(name, color, type, age);
    }
    @Override
    public String talk(){
        return "El animal" + super.getName() + "dice: Miauuu" ;
    }
}
