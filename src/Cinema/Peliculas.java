package Cinema;
import java.util.*;
/*
Created by: Gusito
Date: 21/01/2021
Description: 
*/

public class Peliculas {
    //Atributos
    public String nombre;
    public String director;
    public int duracion;
    public int edadMinima;
    //Constructor
    public Peliculas(){
        nombrePeliculas();
        nombreDirectores();
        minutosPeliculas();
        edadMinimaPeli();
    }
    //Generador de Peliculas aleatorios
    public void nombrePeliculas(){
        Random aleatorio = new Random();
        String peliculas[] = {"Harry Potter y la Piedra Filosofal","Harry Potter y La Camara de los Secretos",
                "Harry Potter y El Prisionero de Azkaban","Harry potter y El Caliz de Fuego"};
        int e = aleatorio.nextInt(peliculas.length);
        this.nombre = peliculas[e];
    }
    //Generador de directores aleatorio
    public void nombreDirectores(){
        Random aleatorio2 = new Random();
        String directores[] = {"Gustavo Mulet","Juan Manuel Fernandez","Joshua Mas","Adan Inarejos","Lluc Matas"};
        int e = aleatorio2.nextInt(directores.length);
        this.director = directores[e];
    }
    //Generador Duracion de la Pelicula Aleatorio
    public void minutosPeliculas(){
        Random aleatorio3 = new Random();
        Integer duracionpeli[] = {140,180,230,190};
        int e = aleatorio3.nextInt(duracionpeli.length);
        this.duracion = duracionpeli[e];
    }
    //Generador Edad Minima de la pelicula aleatorio
    public void edadMinimaPeli(){
        Random aleatorio4 = new Random();
        Integer edadminima[] = {5,6,3,8};
        int e = aleatorio4.nextInt(edadminima.length);
        this.edadMinima = edadminima[e];
    }
    //Getters & Setters
    public String getNombre() { return nombre; }
    public void setNombre(String nombre) { this.nombre = nombre; }
    public String getDirector() { return director; }
    public void setDirector(String director) { this.director = director; }
    public int getDuracion() { return duracion; }
    public void setDuracion(int duracion) { this.duracion = duracion; }
    public int getEdadMinima() { return edadMinima; }
    public void setEdadMinima(int edadMinima) { this.edadMinima = edadMinima; }
}
