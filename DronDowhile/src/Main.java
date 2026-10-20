import java.util.Scanner;

//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {
Scanner teclado = new Scanner(System.in);
        int opc;
        int pts=100;
        do{
            System.out.println("1. Ganar 20 puntos");
            System.out.println("2. Gastar 15 puntos");
            System.out.println("3. Consultar puntos");
            System.out.println("4. Salir");
            System.out.println("Ingresa una opcion:");
            opc = teclado.nextInt();
            switch (opc){
                case 1:
                    System.out.println("Se suman 20 puntos!");
                    pts=pts+20;
                    break;
                case 2:
                    if(pts>=15){
                        pts=pts-15;
                    }else{
                        System.out.println("No tienes suficientes puntos para gastar");
                    }
                    break;
                case 3:
                    System.out.println("Tus puntos son: "+pts);
                    break;
                case 4:
                    System.out.println("Saliendo...");
                    break;
                default:
                    System.out.println("Numero de opcion invalido");
                    break;

            }
        }
        while(opc!=4);


    }
}