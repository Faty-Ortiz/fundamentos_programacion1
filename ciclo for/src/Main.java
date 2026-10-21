import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
 Scanner teclado= new Scanner(System.in);
        int pmas=0,pmenos=0;
        double pts, prom,acumular=0;
        for (int i = 1; i <= 7; i++) {
            System.out.println("Ingresa tu puntuacion obtenida en la partida # "+i);
            pts= teclado.nextDouble();
            acumular=acumular+pts;
            if(pts>1000){
                pmas=pmas+1;
            }
            else{
                pmenos=pmenos+1;
            }

        }
        prom= acumular/7;
        System.out.println("Puntos acumulados: "+acumular);
        System.out.println("Promedio de puntuación: "+prom);
        System.out.println("Partidas con más de 1000 puntos: "+pmas);
        System.out.println("Partidas con 1000 puntos o menos: "+pmenos);
    }
}