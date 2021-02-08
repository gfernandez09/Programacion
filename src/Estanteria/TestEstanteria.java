package Estanteria;/*
Created by: Gusito
Date: 07/02/2021
Description: 
*/

public class TestEstanteria {
    public static void main(String[] args) {
        Estanteria e = new Estanteria();
        Llibre l1 = new Llibre("Juanma y su ligue perdido","JuanManuelFdez",10);
        Llibre l2 = new Llibre("Lluc el piraguista","Joshua Mas",8);
        e.afegirLlibre(l1);
        e.afegirLlibre(l2);
        Llibre l3 = new Llibre("El programa imposible de Java","xSastre",2);
        Llibre l4 = new Llibre("Entornos y Windows Server","Miguel Beltran",9);
        Llibre l5 = new Llibre("Como robar a un ladron","Gustavo Mulet",7);
        e.afegirLlibre(l3);
        e.afegirLlibre(l4);
        e.afegirLlibre(l5);
        e.Top10();
        e.EliminarLlibre("xSastre","");
        e.veureEstanteria();

    }
}
