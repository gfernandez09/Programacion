package JuegoAdivinanza;/*
Created by: Gusito
Date: 15/12/2020
Description: 
*/
import java.util.*;
import java.util.Random;
public class juegoAdivinanza {
    private int dineroMaquina = 20;
    private int dineroJugador = 0;


    public void menu() {
        Scanner menu = new Scanner(System.in);
        System.out.println("Bienvenido al menú del juego ");
        System.out.println("Qué opción desea escoger? ");
        System.out.println("1- Jugar al juego");
        System.out.println("2- Dejar de jugar y retirar el dinero ganado");
        System.out.println("3- Jugar al juego en versión lite ");
        System.out.println("4- Consulta el dinero acumulado");
        int comandos = menu.nextInt();
        switch (comandos) {
            case 1:
                jugarJuego();
                break;
            case 2:
                if (this.dineroJugador > 0) {
                    System.out.println("Ha ganado " + this.dineroJugador + "€.");
                    retirarDineroJugador();
                    menu();
                } else {
                    System.out.println("Usted no ha tenido ninguna ganancia y/o no ha jugado al juego ");
                    menu();
                }
            case 3:
                jugarJuego2();
                break;
            case 4:
                System.out.println("El dinero total de la maquina es: "+getDineroMaquina());
                menu();
                break;
            default:
                System.out.println("Indique un numero valido porfavor");
                menu();
        }

    }
    public int getDineroMaquina(){
        return this.dineroMaquina;
    }
    public void jugarJuego2() {
        Scanner consola2 = new Scanner(System.in);
        System.out.println("Introduzca 1€ por favor.");
        int insertarEuro2 = consola2.nextInt();
        if (insertarEuro2 == 1) {
            Random random2 = new Random();
            int numeroRandom2 = random2.nextInt(8 + 1);
            ArrayList<Integer> intentos2 = new ArrayList<>();
            System.out.println(numeroRandom2);
            boolean bandera = true;
            int i = 5;
            System.out.println("Bienvenido al juego! ");
            while (bandera) {
                System.out.println("Introduzca un numero del 1 al 9");
                System.out.println("Te quedan " + i + " intentos.");
                int numero2 = consola2.nextInt();
                intentos2.add(numero2);
                if (i == 1 && numero2 != numeroRandom2) {
                    System.out.println("Ha perdido la partida.");
                    bandera = false;
                } else {
                    if (numero2 == numeroRandom2) {
                        System.out.println("Has ganado la partida, enhorabuena.");
                        this.dineroJugador += 5;
                        bandera = false;
                    } else if (numero2 < numeroRandom2) {
                        System.out.println("El numero es mas grande.");
                    } else {
                        System.out.println("El numero es mas pequeño");
                    }
                }
                i--;
            }
            System.out.println("El numero aleatorio era " + numeroRandom2 + "!");
            System.out.print("Sus intentos han sido: ");
            for (Integer intento : intentos2) {
                System.out.print(intento + " ");
            }
            System.out.println("\n");
            menu();
        }
    }

    private void retirarDineroJugador() {
        this.dineroMaquina -= this.dineroJugador;
        this.dineroJugador = 0;
    }

    public void jugarJuego() {
        Scanner consola = new Scanner(System.in);
        System.out.println("Introduzca 1€ por favor.");
        int insertarEuro = consola.nextInt();
        if (insertarEuro == 1) {
            this.dineroMaquina++;
            Random random = new Random();
            int randomnumber = random.nextInt(99 + 1);
            ArrayList<Integer> intentos = new ArrayList<>();
            //System.out.println(randomnumber);
            boolean bandera = true;
            int i = 5;
            System.out.println("Bienvenido al juego! ");
            while (bandera) {
                System.out.println("Introduzca un numero del 1 al 100");
                System.out.println("Te quedan " + i + " intentos.");
                int numero = consola.nextInt();
                intentos.add(numero);
                if (i == 1 && numero != randomnumber) {
                    System.out.println("Ha perdido la partida.");
                    bandera = false;
                }else{
                    if (numero == randomnumber) {
                        System.out.println("Has ganado la partida, enhorabuena.");
                        this.dineroJugador += 3;
                        bandera = false;
                    }else if (numero < randomnumber) {
                        System.out.println("El numero es mas grande.");
                    }else {
                        System.out.println("El numero es mas pequeño");
                    }
                    if(numero == randomnumber && numero == intentos.get(0)){
                    System.out.println("Enhorabuena! Por acertarlo a la primera recibes 5 monedas extra");
                    this.dineroJugador += 5;
                }else if(numero == randomnumber && numero == intentos.get(1)){
                    System.out.println("Enhorabuena! Por acertarlo a la segunda recibes 3 monedas extra");
                    this.dineroJugador += 3;
                }else if(numero == randomnumber && numero == intentos.get(2)) {
                        System.out.println("Enhorabuena! Por acertarlo a la tercera recibes 2 monedas extra");
                        this.dineroJugador += 2;
                    } else if(i == 1 && numero != randomnumber){
                    System.out.println("Ha perdido la partida.");
                    bandera = false;
                }
            }
                i--;
            }
            System.out.println("El numero aleatorio era " + randomnumber + "!");
            System.out.print("Sus intentos han sido: ");
            for (Integer intento : intentos) {
                System.out.print(intento + " ");
            }
            System.out.println("\n");
            menu();
        } else {
            System.out.println("Introduzca un euro porfavor.");
            jugarJuego();
        }
    }

}
