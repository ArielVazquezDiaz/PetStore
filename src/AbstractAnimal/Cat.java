package AbstractAnimal;

public class Cat extends Animal{
    public Cat() {
    }
    public Cat(String name, String color, int age) {
        super(name, color, age);
    }
   @Override
    public String talk() {
        return " Miau ";
    }
   @Override
    public String toString() {
        return super.name + " Es un gato " +
                " de color " + super.color +
                " tiene " + super.age +
                " y dice " + this.talk();
    }
}
