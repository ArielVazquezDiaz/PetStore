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
    public String toString() {
        return " El animal " + this.getName() + " es de colo " + this.getColor() + " y tiene " + this.getAge() + " años " +
                " dice: Guauuu ";
    }
}
