package Parking;
import java.io.*;
import java.util.*;
import java.util.regex.Pattern;
import java.util.regex.Matcher;
/*
Created by: Gusito
Date: 23/01/2021
Description:
*/
public class Parking_Gustavo_Mulet {

    enum TipusPlacesParking{ Discapacitat,No_Discapacitat }
    public static class Parking {
        /* ATRIBUTOS DE LA CLASE */
        HashMap<Integer, String> matricules_cotxesDisc = new HashMap<>(this.places_discapacitats);
        HashMap<Integer, String> matricules_cotxesNoDisc = new HashMap<>(this.places_no_discapacitats);
        int places_no_discapacitats;
        int places_discapacitats;
        private BufferedReader b;
        /* CONSTRUCTOR DE LA CLASE QUE PERMITE ASIGNAR LAS PLAZAS DE LOS 2 TIPOS DE PARKING */
        public Parking(int places_no_discapacitats, int places_discapacitats) {
            this.places_no_discapacitats = places_no_discapacitats;
            this.places_discapacitats = places_discapacitats;
        }
        /* DETECTOR PLAZA NO DISCAPACITADOS PARA LUEGO PODER BORRAR EL COCHE DEL HASH MAP*/
        private int dKeyNoDisc(){
            int k = 0;
            for (Map.Entry<Integer, String> dKey : matricules_cotxesNoDisc.entrySet()) {
                k = dKey.getKey();
            }
            return k;
        }
        /* DETECTOR PLAZA DISCAPACITADOS PARA LUEGO PODER BORRAR EL COCHE DEL HASH MAP */
        private int dKeyDisc(){
            int k = 0;
            for (Map.Entry<Integer, String> dKey : matricules_cotxesDisc.entrySet()) {
                k = dKey.getKey();
            }
            return k;
        }
        /* MÉTODO QUE PERMITE LEER MATRICULAS A PARTIR DE UN ARCHIVO EXISTENTE EN EL EQUIPO */
        /* Primero, el método mira si el archivo existe y si no, salta una alerta */
        /* Después, comprueba que no esté vacio para luego comprobar si las matriculas han sido introducidas correctamente */
        /* Si son correctas, mediante una aleatoriedad, asigna las matriculas aleatoriamente a un tipo de plaza u otra. */
        public void llegirMatricules(String path) throws Exception {
            Random random = new Random();
            try{
                b = new BufferedReader(new FileReader(path));
            }catch (Exception e){
                throw new Exception("ALERTA ======> Fitxer incorrecte o inexistent");
            }
            int numeroRandom2 = random.nextInt(10);
                String cadena = b.readLine();
                while(cadena != null){
                    if(numeroRandom2 < 3){
                        entraCotxe(cadena);
                    }else{
                        entraCotxeDiscapacitat(cadena);
                    }
                    cadena = b.readLine();
                }
                b.close();
        }
        /* MÉTODO QUE PERMITE LA ENTRADA DE COCHES NO DISCAPACITADOS */
        /* Primero, el método comprueba si la matricula proporcionada es correcta */
        /* Después, comprueba si la matricula ya no ha sido introducida anteriormente para luego proceder a comprobar si tiene "espacio" para añadirla. */
        /* Si tiene espacio, mediante una aleatoriedad, puede ser que un coche quiera meterse en una plaza que no es la suya, es decir */
        /* al ser no discapacitado, querer meterse en los discapacitados, si eso ocurre, el programa salta una alerta y exhibe la plaza de */
        /* dicho garrulo */
        /* Si el parking está apunto de alcanzar el 85% de ocupación, manda una alerta para avisar de dicho suceso */
        public int entraCotxe(String matricula) throws Exception {
            Pattern pattern = Pattern.compile("^[0-9]{4}[A-Z]{3}$");
            Random random = new Random();
            Matcher matcher = pattern.matcher(matricula);
                if(matcher.find()){
                    if(!this.matricules_cotxesNoDisc.containsValue(matricula)){
                        if(matricules_cotxesNoDisc.size() < places_no_discapacitats){
                            int numGarrulo = random.nextInt(50);
                            if(numGarrulo  > 10){
                                matricules_cotxesNoDisc.put(matricules_cotxesNoDisc.size(),matricula);
                            }else{
                                entraCotxeDiscapacitat(matricula);
                                throw new Exception("ALERTA =====> Garrulo detected!!! Ha aparcat a la plaça:" + matricules_cotxesDisc.size());
                            }
                        }else{
                            throw new Exception("ALERTA =====> Parking per no discapacitats ple.");
                        }
                    }else{
                        throw new Exception("ALERTA =====> El cotxe ja està al parking.");
                    }
                }else{
                    throw new Exception("ALERTA =====> Matrícula incorrecte.");
                }
                if(((matricules_cotxesNoDisc.size() * 100) / places_no_discapacitats) >= 85){
                    System.out.println("ALERTA =====> Ocupació de places per no discapacitats supera el 85%.");
                }
            return matricules_cotxesNoDisc.size();

        }
        /* MÉTODO QUE PERMITE LA ENTRADA DE COCHES DISCAPACITADOS */
        /* Primero, el método comprueba si la matricula proporcionada es correcta */
        /* Después, comprueba si la matricula ya no ha sido introducida anteriormente para luego proceder a comprobar si tiene "espacio" para añadirla */
        /* Si tiene espacio para entrar, añade la matricula al hash map matricules_cotxesDisc para almacenar el coche */
        /* Si el parking está apunto de alcanzar el 85% de ocupación, manda una alerta para avisar de dicho suceso */
        public int entraCotxeDiscapacitat(String matricula) throws Exception{
            Pattern pattern = Pattern.compile("^[0-9]{4}[A-Z]{3}$");
            Matcher matcher = pattern.matcher(matricula);
                if(matcher.find()){
                    if(!matricules_cotxesDisc.containsValue(matricula)){
                        if(matricules_cotxesDisc.size() < this.places_discapacitats){
                            matricules_cotxesDisc.put(matricules_cotxesDisc.size(), matricula);
                        }else{
                            matricules_cotxesNoDisc.put(matricules_cotxesNoDisc.size(), matricula);
                            throw new Exception("ALERTA =====> Parking per discapacitats ple. Ha ocupat la plaza normal num:  " + matricules_cotxesNoDisc.size());
                        }
                    }else{
                        throw new Exception("ALERTA =====> El cotxe ja està al parking.");
                    }
                }else{
                    throw new Exception("ALERTA =====> Matrícula incorrecte.");
                }
                if(((matricules_cotxesDisc.size() * 100) / (this.places_discapacitats) >= 85)){
                    throw new Exception("ALERTA =====> Ocupació de places per no discapacitats supera el 85%.");
                }
            return matricules_cotxesDisc.size();
        }

        /* MÉTODO QUE PERMITE LA SALIDA DE UN COCHE INTRODUCIENDO UNA MATRICULA */
        /* Mediante una comparación con una expresion regular, comparamos que la matricula esté bien introducida y acto seguido */
        /* miramos si en el hash map "matricules_cotxesNoDisc" está la matricula, para saber si el coche está dentro del parking y luego mediante el método */
        /* dKeyNoDisc que nos permite averiguar la plaza dónde se encuentra dicha matricula, sacar el "coche" del parking. */
        public void surtCotxe(String matricula) throws Exception {
            Pattern pattern = Pattern.compile("^[0-9]{4}[A-Z]{3}$");
            Matcher matcher = pattern.matcher(matricula);
            boolean regexpress = matcher.find();
            if(regexpress){
                if(matricules_cotxesNoDisc.containsValue(matricula)){
                    matricules_cotxesNoDisc.remove(dKeyNoDisc(),matricula);
                    System.out.println("ALERTA =====> El cotxe ha sortit del parking.");
                }else{
                    System.out.println("ALERTA =====> El cotxe no es troba al parking.");
                }

            }else{
                System.out.println("ALERTA =====> Matrícula incorrecte.");
            }
        }
        /* MÉTODO QUE PERMITE LA SALIDA DE UN COCHE INTRODUCIENDO UNA MATRICULA */
        /* Mediante una comparación con una expresion regular, comparamos que la matricula esté bien introducida y acto seguido */
        /* miramos si en el hash map "matricules_cotxesDisc" está la matricula, para saber si el coche está dentro del parking y luego mediante el método */
        /* dKeyDisc que nos permite averiguar la plaza dónde se encuentra dicha matricula, sacar el "coche" del parking. */
        public void surtCotxeDiscapacitats(String matricula) throws Exception {
            Pattern pattern = Pattern.compile("^[0-9]{4}[A-Z]{3}$");
            Matcher matcher = pattern.matcher(matricula);
            boolean regexpress = matcher.find();
            if(regexpress){
                if(matricules_cotxesDisc.containsValue(matricula)){
                    matricules_cotxesDisc.remove(dKeyDisc(),matricula);
                    System.out.println("ALERTA =====> El cotxe ha sortit del parking.");
                }else{
                    System.out.println("ALERTA =====> El cotxe no es troba al parking.");
                }

            }else{
                System.out.println("ALERTA =====> Matrícula incorrecte.");
            }
        }
        /* MÉTODO QUE PERMITE OBTENER LAS PLAZAS OCUPADAS SEGÚN TEL TIPO */
        /* Según el tipo de plaza que sea, el método detecta que, dependiendo del tipo proporcionado por el parámetro */
        /* muestra las plazas ocupadas por los no discapacitados, o los discapacitados. */
        public int getPlacesOcupades(TipusPlacesParking tipus) throws Exception{
            if (tipus.equals(TipusPlacesParking.No_Discapacitat)){
                return matricules_cotxesNoDisc.size();
            }else{
                //SI EL TIPO PROPORCIONADO ES DISCAPACITAT, ENSEÑA EL TAMAÑO DEL HASH MAP
                return matricules_cotxesDisc.size();
            }
        }
        /* MÉTODO QUE PERMITE OBTENER LAS PLAZAS LIBRES SEGÚN TEL TIPO */
        /* Según el tipo de plaza que sea, el método detecta que, dependiendo del tipo proporcionado por el parámetro */
        /* muestra las plazas libres por los no discapacitados, o los discapacitados. */
        public int getPlacesLliures(TipusPlacesParking tipus) throws Exception{
            if (tipus.equals(TipusPlacesParking.No_Discapacitat)){
                return (places_no_discapacitats-matricules_cotxesNoDisc.size());
            }else{

                return (places_discapacitats-matricules_cotxesDisc.size());
            }
        }
        /* MÉTODO QUE PERMITE GUARDAR LAS MATRICULAS DE LOS COCHES EN UN FICHERO */
        /* Primero, el programa detectará el path del archivo para saber dónde guardar las matriculas */
        /* Después, mediante la clase de Java BufferedWriter que nos permite escribir en un fichero, */
        /* Ejecutamos dos bucles for que permitirán primero, escribir las matriculas que hay dentro del hash map de no discapacitados */
        /* y posteriormente hará lo mismo para las matriculas de los no discapacitados. */
        public void guardarMatricules(String path) throws Exception {
            BufferedWriter bw = new BufferedWriter(new FileWriter(path));
            for (Map.Entry<Integer, String> entry : matricules_cotxesNoDisc.entrySet()) {
                bw.write(entry.getValue());
                bw.newLine();
            }
            for (Map.Entry<Integer, String> entry2 : matricules_cotxesDisc.entrySet()) {
                bw.write(entry2.getValue());
                bw.newLine();
            }
            bw.close();
        }
    }
}

