package Animal;

public class Cat extends Animal {
    public Cat() {
    }

    public Cat(String name, String color, String type, int age) {
        super(name, color, type, age);
    }

    @Override
    public String talk() {
        return " El animal " + super.getName() + " dice: Miauuu ";
    }

    @Override
    public String toString() {
        return " El animal " + this.getName() + " es de colo " + this.getColor() + " y tiene " + this.getAge() + " años " +
                " dice: Miauuu ";
    }
}