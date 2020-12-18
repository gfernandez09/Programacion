package pru03;/*
Created by: Gusito
Date: 06/12/2020
Description: 
*/

public class TestCoche_Gustavo_Mulet {
    public static void main(String[] args) {
        /*//Creació de l'objecte cotxe
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
        */
        //Creació de l'objecte de coche1 el qual es un BMW M2, per això l'hi anomenam m2.
        CotxeSegonaPart_Gustavo_Mulet m2 = new CotxeSegonaPart_Gustavo_Mulet("BMW","M2",TipusCanvi.CanviManual,EstatsMotorCotxe.EnMarxa, marxaAutomatic.N, marxesManual.N);
             try{
                 System.out.println(m2.getmarxaManual());
                 m2.canviarMarxaManual('+');
                 System.out.println(m2.getmarxaManual());
                 m2.canviarMarxaManual('+');
                 System.out.println(m2.getmarxaManual());
                 m2.canviarMarxaManual('-');
                 System.out.println(m2.getmarxaManual());
             }
        catch(Exception e){
                 System.out.println(e.getMessage());
             }
        //Creació de l'objecte de coche1 el qual es un BMW 3, per això l'hi anomenam m3.
        CotxeSegonaPart_Gustavo_Mulet m3 = new CotxeSegonaPart_Gustavo_Mulet("BMW", "M3", TipusCanvi.CanviAutomatic, EstatsMotorCotxe.EnMarxa, marxaAutomatic.N, marxesManual.N);
        try{
            m3.canviarMarxaAutomatic('+');
            System.out.println(m3.getmarxaAutomatic());
            m3.canviarMarxaAutomatic('-');
            System.out.println(m3.getmarxaAutomatic());
            m3.canviarMarxaAutomatic('-');
            System.out.println(m3.getmarxaAutomatic());
        }
        catch(Exception e){
            System.out.println(e.getMessage());
        }
    }
}
