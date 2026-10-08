import java.util.Scanner;
public class Clima {
    
        public static void main(String[] args) {
            Scanner sc = new Scanner(System.in);

            System.out.println("Ingresar temperatura en °C");
            double celcius = sc.nextDouble();

            if (celcius < 10) {
                System.out.println("Frío extremo");
            } else if (celcius <= 20) {
                System.out.println("Clima fresco");
            } else if (celcius <= 30) {
                System.out.println("Clima agradable");
            } else {
                System.out.println("Calor extremo");
            }

        }
    }


