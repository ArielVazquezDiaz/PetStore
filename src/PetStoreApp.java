public class PetStoreApp {
    public static void main(String[] args) {
        Perro dog= new Perro("Hades","pitbull","perro",(short) 2);
        dog.setSound("Guau, Guau");
        Pato duck= new Pato("duck","pato","Ganzo",(short)1);
        duck.setSquawk("Cuac,Cuac");

        System.out.println("El toString() de Perro es: " + dog.toString());
        System.out.println("El toString() de Pato es: " + duck.toString());
    }
}
