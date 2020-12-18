package Clase;/*
Created by: Gusito
Date: 16/11/2020
Description: 
*/

public class Cavall {
    String nombre = "Juanma";
    String raza = "maricon";
    String razaPadre = "mariconsupremo";
    String razaMadre = "maricona";
    String color = "gay";
    String altura = "1 metro";
    public void despliegaInformacionCaballo(){
        System.out.println("nombre = " + nombre);
        System.out.println("raza = " + raza);
        System.out.println("razaPadre = " + razaPadre);
        System.out.println("razaMadre = " + razaMadre);
        System.out.println("color = " + color);
        System.out.println("altura = " + altura);
    }
}
class Test2{
    public static void main(String[] args) {
        Cavall caballo1 = new Cavall();
        caballo1.despliegaInformacionCaballo();
    }
}


