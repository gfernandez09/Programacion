package ArrayList;
import java.util.*;
/*
Created by: Gusito
Date: 13/01/2021
Description: Realitza un programa que introdueixi n (essent n un nombre aleatori entre 10 i 20 ambdós inclosos)
valors aleatoris (entre 0 i 100) en un ArrayList i després en calculi la suma, la mitjana, el màxim i el mínim d’aquests nombres.
*/

public class Exercici2 {
    public static void main(String[] args) {
        ArrayList<Integer> numeros = new ArrayList<>();
        int sum = 0;
        int mitjana = 0;
        double valorEntero = Math.floor(Math.random()*(20-10+1)+10);
        for (int contador = 0; contador < valorEntero; contador++){
            Random random = new Random();
            int nRandom = random.nextInt(99 + 1);
            numeros.add(nRandom);

        }
        System.out.println(numeros);
        for(int d : numeros)
            sum += d;
            mitjana = sum / numeros.size();
        int numMax = Collections.max(numeros);
        int numMin = Collections.min(numeros);
        System.out.println("Suma de los numeros del ArrayList: " + sum);
        System.out.println("Media de los numeros del ArrayList: " + mitjana);
        System.out.println("El número máximo es " + numMax);
    System.out.println("El número mínimo es " + numMin);
    }
}
