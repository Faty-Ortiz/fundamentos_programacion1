import java.util.Scanner;

public class Elevador {
    public static void main(String[] args) {
        Scanner teclado = new Scanner(System.in);
        int pinicio,pdestino;
        int pisos=10;

        System.out.println("En que piso estas?");
        pinicio = teclado.nextInt();
        System.out.println("A que piso vas?");
        pdestino = teclado.nextInt();

        if(pinicio<=pisos && pdestino<=pisos) {
            if (pinicio < pdestino && pinicio > 0 && pdestino>0) {
                while (pinicio <= pdestino) {
                    System.out.println("Piso:" + pinicio);
                    pinicio = pinicio + 1;
                }
            } else if (pinicio > pdestino && pinicio > 0 && pdestino > 0) {
                while (pinicio >= pdestino) {
                    System.out.println("Piso:" + pinicio);
                    pinicio = pinicio - 1;
                }
            } else {
                System.out.println("No existen pisos con un numero negativo o igual a 0");

            }
        }
        else{
            System.out.println("Este edificio solo tiene 10 pisos");
        }




        }

}
