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

        for (int i = 0; i < 10;i++){
            System.out.println("Introduce un palabra: ");
            String palabra = sc.next();
            arrayParaules.add(palabra);
        }
        Collections.sort(arrayParaules);
        System.out.println(arrayParaules);
    }
}
