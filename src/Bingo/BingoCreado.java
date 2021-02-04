package Bingo;/*
Created by: Gusito
Date: 04/02/2021
Description: 
*/

import java.util.*;
public class BingoCreado {
    private Jugadores jugadores;
    ArrayList<Integer> numerosregistrados = new ArrayList<>();
    public int generadorNumero(){
        return (int) (Math.random() * 99 + 1);
    }
    public void jugarBingo(){
        Jugadores jugador1 = new Jugadores();
        Jugadores jugador2 = new Jugadores();
        jugador1.generarCartolina();
        System.out.println("\n");
        jugador2.generarCartolina();
        while (!jugador1.cartolina.isEmpty() && !jugador2.cartolina.isEmpty()){
            generadorNumero();
            if(jugador1.cartolina.contains(generadorNumero())){
                jugador1.cartolina.remove(Integer.valueOf(generadorNumero()));
            }else{
                numerosregistrados.add(generadorNumero());
            }
            if(jugador2.cartolina.contains(generadorNumero())){
                jugador2.cartolina.remove(Integer.valueOf(generadorNumero()));
            }else{
                numerosregistrados.add(generadorNumero());
            }
        }
        if(jugador2.cartolina.isEmpty()){
            System.out.println("\n");
            System.out.println("El Ganador ha sido el jugador 2 !");
        }else if(jugador1.cartolina.isEmpty()){
            System.out.println("\n");
            System.out.println("El Ganador ha sido el jugador 1 !");
        }
        System.out.println(jugador1.cartolina);
        System.out.println(jugador2.cartolina);
    }
}
