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
        //Creacion del bucle para añadir los numeros al arrayList
        for (int i = 0; i < 10;i++){
            System.out.println("Introduce un numero: ");
            int numeros = sc.nextInt();
            arrayNumeros.add(numeros);
        }
        //Ordenación de los numeros
        Collections.sort(arrayNumeros);
        //Print del ArrayList para obtener los numeros
        System.out.println(arrayNumeros);
    }
}
