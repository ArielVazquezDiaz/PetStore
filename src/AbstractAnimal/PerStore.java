package AbstractAnimal;

public class PerStore {
    public static void main(String[] args) {

        Cat garfield=new Cat("Garfield","Naranga",3);
        Cat felix=new Cat("Felix","Blanco",1);
        Dog Firulaise=new Dog( "Firulaise", "Negro", 2);
        Rooster Claudio=new Rooster( "Claudio", "Blanco", 4);

        System.out.println("Ejemplo de polimorfismo usando clases abstractas");
        System.out.println("Invocando al metodo toString");
        System.out.println(garfield.toString());
        System.out.println(felix.toString());
        System.out.println(Firulaise.toString());
        System.out.println(Claudio.toString());
    }
}
