package Animal;

public class Rooster extends Animal {
    public Rooster() {
    }
    public Rooster(String name, String color, String type, int age) {
        super(name, color, type, age);
    }
    @Override
    public String talk(){
        return "El animal" + super.getName() + "dice: Kikirikiiii" ;
    }
    public String toString() {
        return " El animal " + this.getName() + " es de colo " + this.getColor() + " y tiene " + this.getAge() + " años " +
                " dice: Kikirikiiii ";
    }
}
