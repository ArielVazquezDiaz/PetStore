package Animal;

public class PetStore{
    public static void main(String[] args) {
        Cat garfield=new Cat("Garfield","Naranja","Gato", 5);
        Dog firulais=new Dog("firulais","Manchado","Perro", 3);
        Rooster claudio=new Rooster("Claudio","Blnaco","Gallo", 1);

        System.out.println(" Ejemplo de polimorfismo ");
        System.out.println(garfield.talk());
        System.out.println(firulais.talk());
        System.out.println(claudio.talk());
        System.out.println(" Invocando al metodo to String de la clase animal ");
        System.out.println(garfield.toString());
        System.out.println(firulais.toString());
        System.out.println(claudio.toString());
    }
}
