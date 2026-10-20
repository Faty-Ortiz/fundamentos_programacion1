import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Scanner teclado = new Scanner(System.in);
        int pila, contador = 0;
        System.out.println("Ingresa la pila del dron:");
        pila = teclado.nextInt();

        if (pila >= 7) {
            System.out.println("Bateria inicial:" + pila);
            while (pila >= 7) {
                contador = contador + 1;
                pila = pila - 7;
                System.out.println("Minuto " + contador + " " + pila + "%");
            }
            System.out.println("se agoto la bateria del dron, este dejo de volar!");
        } else if (pila < 0) {
            System.out.println("No se admite pila con un numero negativo ");
        } else {
            System.out.println("No ingresaste pila suficiente");


        }
    }
}