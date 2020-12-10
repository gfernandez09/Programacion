package ComputerSystems;/*
Created by: Gusito
Date: 10/12/2020
Description: 
*/
import java.util.ArrayList;
import java.util.Random;
import java.util.Scanner;
public class RandomNumber {
    public static void main(String[] args) {
        Random random = new Random();
        Scanner consola = new Scanner(System.in);
        int randomNumber = random.nextInt(100);
        for (int intentos = 5; intentos > 0; intentos--){
            ArrayList<Integer> nintento = new ArrayList<Integer>();
            nintento.add(intentos);
            System.out.println("Quedan " + intentos + " intentos");
            System.out.println("Introduce un numero del 0 al 100");
            int numero = consola.nextInt();
            if (numero == randomNumber){
                System.out.println("Has ganado! ");
                break;
            }else if(numero < randomNumber){
                System.out.println("El numero es mas grande");
            }else{
                System.out.println("El numero es mas pequeño");
            }

        }
        System.out.println("La partida ha acabado");
        System.out.println("El numero era " + randomNumber);
    }
}
