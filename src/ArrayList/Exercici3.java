package ArrayList;
import java.util.*;
/*
Created by: Gusito
Date: 13/01/2021
Description: Escriu un programa que ordeni 10 nombres enters introduïts per teclat i emmagatzemats en un objecte de la classe ArrayList.
*/

public class Exercici3 {
    public static void main(String[] args) {
        ArrayList<Integer> arrayNumeros = new ArrayList<>();
        Scanner sc = new Scanner(System.in);

        for (int i = 0; i < 10;i++){
            System.out.println("Introduce un numero: ");
            int numeros = sc.nextInt();
            arrayNumeros.add(numeros);
        }
        Collections.sort(arrayNumeros);
        System.out.println(arrayNumeros);
    }
}
