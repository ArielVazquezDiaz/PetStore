package Animal;
public class Animal{
    private String name;
    private String color;
    private String type;
    private int age;

    public Animal() {
    }
    public Animal(String name, String color, String type, int age) {
        this.name = name;
        this.color = color;
        this.type = type;
        this.age = age;
    }
    public String getName() {
        return name;
    }
    public void setName(String name) {
        this.name = name;
    }
    public String getColor() {
        return color;
    }
    public void setColor(String color) {
        this.color = color;
    }
    public String getType() {
        return type;
    }
    public void setType(String type) {
        this.type = type;
    }
    public int getAge() {
        return age;
    }
    public void setAge(int age) {
        this.age = age;
    }
    public String talk() {
        String s =" El animla "+this.getName()+" Dice: " ;
        return s;
    }

}
