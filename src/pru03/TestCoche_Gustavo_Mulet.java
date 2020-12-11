package pru03;/*
Created by: Gusito
Date: 06/12/2020
Description: 
*/

public class TestCoche_Gustavo_Mulet {
    public static void main(String[] args) {
        //Creació de l'objecte cotxe
        Coche_Gustavo_Mulet coche = new Coche_Gustavo_Mulet("Mazda", "3",TipusCanvi.CanviManual,EstatsMotorCotxe.Aturat);
        //Proba mitjançant els mètodes de l'utilització del cotxe.
        try{
            coche.arrancarMotor();
            coche.aturarMotor();
            System.out.println(coche.comprovaMotor());
        }
        catch(Exception e){
            System.out.println(e.getMessage());
        }
    }
}
