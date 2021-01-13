package ArrayList;
import java.util.*;
/*
Created by: Gusito
Date: 13/01/2021
Description: Crea un ArrayList amb el nom de 6 companys de classe. A continuació, mostra els noms per pantalla (extrets de l’ArrayList).
Per fer-ho, utilitza un bucle que recorri tot l’ArrayList sense utilitzar cap índex.
*/

public class Exercici1 {
    public static void main(String[] args) {
        ArrayList<String> alumnes = new ArrayList<String>();
        alumnes.add("Gustavo");
        alumnes.add("Juanma");
        alumnes.add("Joshua");
        alumnes.add("Lluc");
        alumnes.add("Adan");
        alumnes.add("Nico");
        for(String nom : alumnes){
            System.out.print(nom + ",");
        }
    }
}
