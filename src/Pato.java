public class Pato extends Animal {
    private String Squawk;

    public Pato() {
    }
    public Pato(String name, String race, String type, short age) {
        super(name, race, type, age);
    }
    public Pato(String name, String race, String type, short age, String squawk) {
        super(name, race, type, age);
        Squawk = squawk;
    }
    public String getSquawk() {
        return Squawk;
    }
    public void setSquawk(String squawk) {
        Squawk = squawk;
    }
    public String toString() {
        System.out.println("Se llama: " + getName());
        System.out.println("La raza es: " + getRace());
        System.out.println("El tipo es: " + getType());
        System.out.println("Tiene: " + getAge() + " Años");
        System.out.println("Y hace : " + getSquawk());
        return"Soy un animal terrestre y acuifero";
    }
}
