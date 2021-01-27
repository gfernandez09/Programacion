package Cinema;/*
Created by: Gusito
Date: 21/01/2021
Description: 
*/

public class Espectador {
    //Atributos
    private int edad;
    private int dinero;

    //Constructores
    public Espectador() {
        setDinero();
        setEdad();
    }

    public Espectador(int edad, int dinero) {
        this.dinero = dinero;
        this.edad = edad;
    }
    //Getters & Setters
    public int getEdad() {
        return edad;
    }
    public int getDinero() {
        return dinero;
    }
    public void setEdad(){
        this.edad = (int) (Math.random() * 35 + 1);
    }
    public void setDinero(){
        this.dinero = (int) (Math.random() * 100 + 1);
    }

}