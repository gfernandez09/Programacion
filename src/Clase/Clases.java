package Clase;/*
Created by: Gusito
Date: 13/11/2020
Description: 
*/

class Clases {
    int numero;
    char caracter;

    public void desplegaValores() {
        System.out.println("numero = " + numero);
        System.out.println("caracter = " + caracter);
    }
}
class Test{
        public static void main(String[] args) {
            Clases clase1 = new Clases();
            clase1.desplegaValores();
        }
    }


