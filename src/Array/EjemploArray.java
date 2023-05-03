package Array;

public class EjemploArray {
        public static void main(String[] args) {
            String[] zoo = {"Monkey", "Chimp","Donkey", "Elephant", "Panda","Leon"};
            System.out.println("Mis zoologico tiene " + zoo.length + " Animales");
            System.out.println("Que son:");

            for (int i = 0; i < zoo.length; i++) {
                System.out.println(i+1 +"." + zoo[i]);
            }
        }
    }

