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
}
