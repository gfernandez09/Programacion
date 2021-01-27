package Cinema;/*
Created by: Gusito
Date: 19/01/2021
Description: 
*/
import java.util.*;

public class Cine {
    //Atributos
    public Peliculas pelicula;
    public int precio;
    public ArrayList asientos;
    public int recaudacion;
    //Constructor
    public Cine(Peliculas pelicula, int precio) {
        this.pelicula = pelicula;
        this.precio = precio;
    }
    //Getters & Setters
    public Peliculas getPelicula() { return pelicula; }

    public int getRecaudacion() { return recaudacion; }

    public void setRecaudacion(int recaudacion) { this.recaudacion = recaudacion; }

    public double getPrecio() { return precio; }

    public void setPrecio(int precio) { this.precio = precio; }

    //Creamos la sala de cine
    public void salaCine(){
        ArrayList<String> asientos = new ArrayList<String>();
        int numeroasiento = 8;
        char letraasiento = 'A';
            while(numeroasiento > 0){
                int bajarletras = 9;
                while(letraasiento < 'J'){
                    String numeroaString = Integer.toString(numeroasiento);
                    String numeroLetra = numeroaString + letraasiento;
                    asientos.add(numeroLetra);
                    letraasiento++;
                }
                letraasiento -= bajarletras;
                numeroasiento--;
            }
            this.asientos = asientos;
        }
        //Generamos el espectador
    public void generarEspectador(){
        while(!this.asientos.isEmpty()){
            Espectador espectador = new Espectador();
            llenarSala(espectador,this.pelicula);
        }
    }
    //Llenamos la sala de espectadores
    public void llenarSala(Espectador espectador, Peliculas pelicula){
        Random random = new Random();
        if (espectador.getEdad() >= pelicula.edadMinima && espectador.getDinero() >= this.precio){
            int randomnumber = random.nextInt(this.asientos.size());
            this.asientos.remove(randomnumber);
            this.recaudacion += precio;
        }
        generarEspectador();
    }

}
