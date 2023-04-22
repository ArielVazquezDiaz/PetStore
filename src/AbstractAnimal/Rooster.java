package AbstractAnimal;

public class Rooster extends Animal{
    public Rooster() {
    }
    public Rooster(String name, String color, int age) {
        super(name, color, age);
    }
    @Override
    public String talk() {
        return " KiKiriKi ";
    }
    @Override
    public String toString() {
        return super.name + "Es un Gallo" +
                " de color " + super.color +
                " tiene " + super.age +
                " y dice " + this.talk();
    }
}

