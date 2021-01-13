package ArrayList;/*
Created by: Gusito
Date: 13/01/2021
Description: Realitza un programa equivalent a l’anterior però en aquest cas, el programa ha d’ordenar paraules en lloc de nombres.
*/

import java.util.ArrayList;
import java.util.Collections;
import java.util.Scanner;

public class Exercici4 {
    public static void main(String[] args) {
        ArrayList<String> arrayParaules = new ArrayList<>();
        Scanner sc = new Scanner(System.in);
        //Creacion del bucle para añadir las palabras al arrayList
        for (int i = 0; i < 10;i++){
            System.out.println("Introduce un palabra: ");
            String palabra = sc.next();
            arrayParaules.add(palabra);
        }
        //Ordenación de las palabras
        Collections.sort(arrayParaules);
        //Print del ArrayList para obtener las palabras
        System.out.println(arrayParaules);
    }
}
