import java.util.Scanner;
public class Ejercicio10 {
    public static void main(String[] args) {
        Scanner consola = new Scanner(System.in);
        System.out.println("Introduzca una nota: ");
        double numero = consola.nextInt();
        double sumatorio = 0;
        int contador = 0;
        while (numero >= 0) {
            sumatorio += numero;
            System.out.println("Introduzca una nota: ");
            numero = consola.nextInt();
            contador++;
        }
        double mitjana = sumatorio / contador;
        System.out.println("mitjana = " + mitjana);
    }
}
