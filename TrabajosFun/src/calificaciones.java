import java.util.Scanner;
public class calificaciones {
    public static void main(String[] args) {
        Scanner teclado = new Scanner(System.in);
        double promedio,asistencia;
        System.out.println("Ingresa el promedio: ");
        promedio= teclado.nextDouble();
        System.out.println("Ingresa tu porcentaje de asistencia: ");
        asistencia= teclado.nextInt();
        if(promedio>=7.0 && asistencia>=80){
            System.out.println("Aprobaste");
        } else if (promedio>=7.0 && asistencia<80) {
            System.out.println("Reprobado por faltas");
        } else if (promedio<7.0) {
            System.out.println("Reprobado por calificacion");
        }
        else{
            System.out.println("Error");
        }
    }
}
