package Array;
import java.security.SecureRandom;
public class CalidadComida {
        public static void main(String[] args) {
            SecureRandom random = new SecureRandom();
            int[] calif = new int[6];
            final int ALUMNOS = 30;
            int calidad;
            calif[1] = 0;
            calif[2] = 0;
            calif[3] = 0;
            calif[4] = 0;
            calif[5] = 0;

            for (int i = 0; i < ALUMNOS; i++) {
                calidad = random.nextInt(5) + 1;
                calif[calidad] = calif[calidad] + 1;
            }
            System.out.println("Solo a "+calif[5]+" alumnos calificaron como (5) EXCELENTE la comida de la cafeteria");
            System.out.println("Solo a "+calif[4]+" alumnos calificaron como (4) BUENO la comida de la cafeteria");
            System.out.println("Solo a "+calif[3]+" alumnos calificaron como (3) REGULAR la comida de la cafeteria");
            System.out.println("Solo a "+calif[2]+" alumnos calificaron como (2) MALO la comida de la cafeteria");
            System.out.println("Solo a "+calif[1]+" alumnos calificaron como (1) PESIMO la comida de la cafeteria");
        }
    }


