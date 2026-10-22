import java.text.DecimalFormat;
import java.util.Scanner;

//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {
        Scanner teclado = new Scanner(System.in);
        DecimalFormat df= new DecimalFormat("#.##");
        double horas, cobro,total=0,prom;
        int contador=0,condesc=0;
        do {
            System.out.println("Introduce la cantidad de horas que estuvo estacionado");
            horas = teclado.nextDouble();
            cobro = horas * 15;
            contador= contador+1;
            if(horas>5){
                cobro=cobro-10;
                System.out.println("tienes un descuento de $10 ");
                condesc=condesc+1;
                System.out.println("por estas horas pagaras: $"+cobro);
                System.out.println("__________________________________________");
                total=total+cobro;


            } else if (horas<0) {
                System.out.println("No se permite ingresar en horas un numero negativo");
                contador=contador-1;
            } else if (horas==0) {
                System.out.println("saliendo...");
                System.out.println(" ");
                contador=contador-1;

            } else {
                System.out.println("por estas horas pagaras: $" + cobro);
                System.out.println("__________________________________________");
                total = total + cobro;
            }
        }

        while(horas!=0);
        prom= total/contador;
        System.out.println("Automoviles atendidos: "+contador);
        System.out.println("Total de dinero recaudado: $"+total);
        System.out.println("Automoviles que recibieron descuento: "+condesc);
        System.out.println("Promedio pagado por automovil: $"+ df.format(prom));





    }
}