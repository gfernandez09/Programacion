package Parking;
import java.util.*;
/*
Created by: Gusito
Date: 24/01/2021
Description: 
*/

public class ParkingTest_Gustavo_Mulet {
    public static void main(String[] args) {
        Parking_Gustavo_Mulet.Parking test1 = new Parking_Gustavo_Mulet.Parking(10,10);
        boolean bandera = true;
        Scanner consola = new Scanner(System.in);
        String path;
        /* EJECUTAMOS UN BUCLE WHILE DE TIPO BANDERA PARA QUE SE EJECUTE HASTA QUE EL USUARIO LO DESEE*/
        /* MENÚ PARA QUE EL USUARIO ELIJA LA OPCION QUE DESEA Y SEGÚN LA OPCIÓN, EJECUTE UN MÉTODO U OTRO */
        while(bandera){
            try{
                System.out.println("----------------------------------------------");
                System.out.println("---------Welcome to the Parking---------");
                System.out.println();
                System.out.println("1.-Omplir parking a partir de fitxer*");
                System.out.println("2.-Entrar Cotxe");
                System.out.println("3.-Entrar Cotxe Discapacitat");
                System.out.println("4.-Sortir Cotxe");
                System.out.println("5.-Sortir Cotxe Discapacitat");
                System.out.println("6.-Guardar llistat de matricules en fitxer*");
                System.out.println("7.-Sortir");
                System.out.println("Tria una de les següents opcions: ");
                int seleccion = consola.nextInt();
                consola.nextLine(); //LIMPIAMOS EL BUFFER DEL SCANNER
                switch (seleccion) {
                    case 1 -> {
                        System.out.println("Indique el path del fichero: ");
                        path = consola.nextLine();
                        test1.llegirMatricules(path);
                    }
                    case 2 -> {
                        System.out.println("Indique la matricula del coche: ");
                        String matricula = consola.nextLine();
                        test1.entraCotxe(matricula);
                    }
                    case 3 -> {
                        System.out.println("Indique la matricula del coche: ");
                        String matriculaDisc = consola.nextLine();
                        test1.entraCotxeDiscapacitat(matriculaDisc);
                    }
                    case 4 -> {
                        System.out.println("Indique la matricula del coche: ");
                        String matricula2 = consola.nextLine();
                        test1.surtCotxe(matricula2);
                    }
                    case 5 -> {
                        System.out.println("Indique la matricula del coche: ");
                        String matricula3 = consola.nextLine();
                        test1.surtCotxeDiscapacitats(matricula3);
                    }
                    case 6 -> {
                        System.out.println("Indique el path del fichero: ");
                        path = consola.nextLine();
                        test1.guardarMatricules(path);
                    }
                    case 7 -> bandera = false;
                }
            }catch(Exception e){
                System.out.println(e.getMessage());
            }
        }
    }
}
