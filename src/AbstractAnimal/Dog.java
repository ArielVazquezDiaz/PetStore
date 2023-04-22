package AbstractAnimal;

public class Dog extends Animal{
    public Dog() {
    }
    public Dog(String name, String color, int age) {
        super(name, color, age);
    }
    @Override
    public String talk() {
        return " Guau ";
    }
    @Override
    public String toString() {
        return super.name + " Es un perro " +
                " de color " + super.color +
                " tiene " + super.age +
                " y dice " + this.talk();
    }
}

