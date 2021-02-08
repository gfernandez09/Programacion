package Estanteria;/*
Created by: Gusito
Date: 07/02/2021
Description: 
*/
import java.util.*;
public class Estanteria {
    Llibre llibre;
    ArrayList <Llibre> estanteria = new ArrayList<>(10);
    public Estanteria(){

    }
    public void afegirLlibre(Llibre llibre){
        if (estanteria.size() < 10){
            if(!estanteria.contains(llibre)){
                estanteria.add(llibre);
            }else{
                System.out.println("El llibre ja i és a l'estanteria");
            }
        }else{
            System.out.println("No s'ha pogut afegir el llibre, estanteria plena");
        }
    }
    public void EliminarLlibre(String autor, String titol){
        for (int i = 0; i < estanteria.size(); i++) {
            llibre = estanteria.get(i);
            if(autor.equals(llibre.getAutor()) || titol.equals(llibre.getTitol())){
                System.out.println("****************Llibre Eliminat****************");
                System.out.println("S'ha eliminat el llibre : " + estanteria.get(i).getTitol() + " de l'autor " + estanteria.get(i).getAutor() + " amb qualificacio " + estanteria.get(i).getQualificacio() + ".");
                System.out.println("***********************************************");
                estanteria.remove(i);
            }
        }
        System.out.println("\t");
    }
    public void Top10(){
        System.out.println("*******TOP 10 DE LLIBRES*******");
        estanteria.sort(Comparator.comparing(Llibre::getQualificacio));
        Collections.reverse(estanteria);
        for (Llibre value : estanteria) {
            System.out.println("Titol del Llibre : " + value.titol + " Autor del Llibre : " + value.autor + " Qualificacio del Llibre : " + value.qualificacio);
        }
        System.out.println("\t");
    }
    public void veureEstanteria(){
        System.out.println("Llibres Disponibles dins l'estanteria");
        for (Llibre value : estanteria) {
            System.out.println("Titol del Llibre : " + value.titol + " Autor del Llibre : " + value.autor + " Qualificacio del Llibre : " + value.qualificacio);
        }
        System.out.println("\t");
    }
}
