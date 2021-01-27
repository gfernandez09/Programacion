package Cinema;/*
Created by: Gusito
Date: 21/01/2021
Description: 
*/

public class Test {
    public static void main(String[] args) {
        long startTime = System.currentTimeMillis();
        Peliculas pelicula = new Peliculas();
        Cine cine = new Cine(pelicula,6);
        cine.salaCine();
        cine.generarEspectador();
        System.out.println("El titulo de la pelicula es: " + pelicula.nombre);
        System.out.println("El director de la pelicula es: " + pelicula.director);
        System.out.println("La duracion de la pelicula es: " + pelicula.duracion + " minutos");
        System.out.println("La edad mínima de la pelicula es: " + pelicula.edadMinima + " años");
        System.out.println("La recaudación total ha sido: " + cine.getRecaudacion() + " euros");
        long stopTime = System.currentTimeMillis();
        System.out.println("El programa tarda en ejecutarse: " + (stopTime - startTime) + " milisegundos");
    }
}
