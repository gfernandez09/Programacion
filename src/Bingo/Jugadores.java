package Bingo;/*
Created by: Gusito
Date: 21/01/2021
Description:
*/

import java.util.ArrayList;
import java.util.Collections;

public class Jugadores {
    //Atributos
    public final ArrayList<Integer> cartolina = new ArrayList<>();
    //Constructores
    public Jugadores() {
    }
    public void generarCartolina(){
        //Genera 10 números al azar para rellenar la primera cartulina
        for (int i = 1; i <= 10; i++) {
            int numeroRandom = (int) (Math.random() * 99 + 1);
            if (cartolina.contains(numeroRandom)) {
                i--;
            } else {
                cartolina.add(numeroRandom);
            }
        }
        Collections.sort(cartolina);
        for(Integer number: cartolina) {
            System.out.print(number + " ");
        }
    }
}