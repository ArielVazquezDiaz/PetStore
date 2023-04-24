package Animal;

public class Dog extends Animal{
    public Dog() {
    }
    public Dog(String name, String color, String type, int age) {
        super(name, color, type, age);
    }
    @Override
    public String talk(){
        return "El animal" + super.getName() + "dice: Guauuu" ;
    }
}
