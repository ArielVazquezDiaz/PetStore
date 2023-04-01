public class Perro extends Animal {
    private String sound;

    public Perro() {
    }
    public Perro(String name, String race, String type, short age) {
        super(name, race, type, age);
    }
    public Perro(String name, String race, String type, short age, String sound) {
        super(name, race, type, age);
        this.sound = sound;
    }
    public String getSound() {
        return sound;
    }
    public void setSound(String sound) {
        this.sound = sound;
    }
    public String toString() {
        System.out.println("Se llama: " + getName());
        System.out.println("La raza es: " + getRace());
        System.out.println("El tipo es: " + getType());
        System.out.println("Tiene: " + getAge() + " Años");
        System.out.println("Y hace : " + getSound());
    return "Soy un animal terrestre";
    }
}
