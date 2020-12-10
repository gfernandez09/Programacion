
package ComputerSystems;
import java.util.ArrayList;
import java.util.Scanner;
/*
Created by: Gusito
Date: 03/12/2020
Description: 
*/

public class ComputerClass {
    private String name;
    private int ramMemory;
    private int hardDisk;
    private OperatingSystem operatingSystem;

    public ComputerClass(){

    }
    public ComputerClass(String name, int ramMemory, int hardDisk) {
        this.name = name;
        this.ramMemory = ramMemory;
        this.hardDisk = hardDisk;
        this.operatingSystem = operatingSystem;
    }
    //Setters y Getters
    public void setName(String name){
        this.name = name;
    }
    public void setRam(int ramMemory){
        this.ramMemory = ramMemory;
    }
    public void setHard(int hardDisk){
        this.hardDisk = hardDisk;
    }
    public void OperatingSystemInstall(OperatingSystem operatingSystem){
        if(operatingSystem != null){
            this.hardDisk -= operatingSystem.getosSpaceRequirement();
            this.ramMemory -= operatingSystem.getosRamMemoryRequirement();
            this.operatingSystem = operatingSystem;
        }
    }
    public String getName(){
        return this.name;
    }
    public int getRam(){
        return this.ramMemory;
    }
    public int getHard(){
        return this.hardDisk;
    }

    public OperatingSystem getOS(){
        return this.operatingSystem;
    }
    //Metodo para formatear el equipo
    public void formateo(){
        this.hardDisk = hardDisk + operatingSystem.getosSpaceRequirement();
        this.operatingSystem = operatingSystem;
        this.ramMemory = ramMemory + operatingSystem.getosRamMemoryRequirement();
    }
}
class OperatingSystem{
        private String osName;
        private String osVersion;
        private String osArchitecture;
        private boolean osOnlyCommand;
        private int osSpaceRequirement;
        private int osRamMemoryRequirement;
        private ArrayList<Software> osSoftware = new ArrayList<Software>();

        //Constructor Vacio de OperatingSystem
        public OperatingSystem(){

        }
        public OperatingSystem(String osName, String osVersion, String osArchitecture, boolean osOnlyCommand, int osSpaceRequirement, int osRamMemoryRequirement){
            this.osName = osName;
            this.osVersion = osVersion;
            this.osArchitecture = osArchitecture;
            this.osOnlyCommand = osOnlyCommand;
            this.osSpaceRequirement = osSpaceRequirement;
            this.osRamMemoryRequirement = osRamMemoryRequirement;
        }
        //Setters y Getters
        public void setosName(String osName){
            this.osName = osName;
        }
        public void setosVersion(String osVersion){
            this.osVersion = osVersion;
        }
        public void setosArchitecture(String osArchitecture){
            this.osArchitecture = osArchitecture;
        }
        public void setosOnlyCommand(boolean osOnlyCommand){
            this.osOnlyCommand = osOnlyCommand;
        }
        public void setosSpaceRequirement(int osSpaceRequirement){
            this.osSpaceRequirement = osSpaceRequirement;
        }
        public void setosRamMemoryRequirement(int osRamMemoryRequirement){
            this.osRamMemoryRequirement = osRamMemoryRequirement;
        }
        public String getosName(){
            return this.osName;
        }
        public String getosVersion(){
            return this.osVersion;
        }
        public String getosArchitecture(){
            return this.osArchitecture;
        }
        public boolean getosOnlyCommand(){
            return this.osOnlyCommand;
        }
        public int getosSpaceRequirement(){
            return this.osSpaceRequirement;
        }
        public int getosRamMemoryRequirement(){
            return this.osRamMemoryRequirement;
        }

        //Recorremos el Array para instalarle/desintalar los programas
        public ArrayList<Software> getosSoftware(){
            return osSoftware;
        }
        public void SoftwareInstallation (Software osSoftware){
            this.osSoftware.add(osSoftware);
        }
        public void SoftwareUninstallation (Software osSoftware){
            this.osSoftware.remove(osSoftware);
        }


    }

class Software{
    private String softwareName;
    private String softwareVersion;
    private int softwareSpaceRequirement;
    private int softwareRamMemoryRequirement;
    public Software(){

    }
    public Software(String softwareName, String softwareVersion, int softwareSpaceRequirement, int softwareRamMemoryRequirement){
        this.softwareName = softwareName;
        this.softwareVersion = softwareVersion;
        this.softwareSpaceRequirement = softwareSpaceRequirement;
        this.softwareRamMemoryRequirement = softwareRamMemoryRequirement;
    }
    //Setters y Getters
    public void setsoftwareName(String softwareName){
        this.softwareName = softwareName;
    }
    public void setsoftwareVersion(String softwareVersion){
        this.softwareVersion = softwareVersion;
    }
    public void setsoftwareSpaceRequirement(int softwareSpaceRequirement){
        this.softwareSpaceRequirement = softwareSpaceRequirement;
    }
    public void setsoftwareRamMemoryRequirement(int softwareRamMemoryRequirement){
        this.softwareRamMemoryRequirement = softwareRamMemoryRequirement;
    }
    public String getsoftwareName(){
        return this.softwareName;
    }
    public String getSoftwareVersion(){
        return this.softwareVersion;
    }
    public int getsoftwareSpaceRequirement(){
        return this.softwareSpaceRequirement;
    }
    public int getsoftwareRamMemoryRequirement(){
        return this.softwareRamMemoryRequirement;
    }
}
class test{
    public static void main(String[] args) {
        //Creacion del ordenador y los programas a instalar
        ComputerClass c1 = new ComputerClass("Gustavo",4,100);
        OperatingSystem os1 = new OperatingSystem("Windows","2.0","64Bits",true,20,2);
        Software s1 = new Software("Steam", "2.0", 1,1);
        Software s2 = new Software("Chrome","2.0",1,1);
        //Instalacion del Sistema Operativo
        c1.OperatingSystemInstall(os1);
        //Instalacion del Primer Programa
        if (c1.getHard()>s1.getsoftwareSpaceRequirement()&&c1.getRam()>s1.getsoftwareRamMemoryRequirement()){
            c1.getOS().SoftwareInstallation(s1);
            c1.setHard(c1.getHard()-s1.getsoftwareSpaceRequirement());
            c1.setRam(c1.getRam()-s1.getsoftwareRamMemoryRequirement());
        }else{
            System.out.println("No tienes espacio");
        }
        //Instalacion del Segundo Programa
        if(c1.getHard()>=s2.getsoftwareSpaceRequirement()&&c1.getRam()>=s2.getsoftwareRamMemoryRequirement()){
            c1.getOS().SoftwareInstallation(s2);
            c1.setHard(c1.getHard()-s2.getsoftwareSpaceRequirement());
            c1.setRam(c1.getRam()-s2.getsoftwareRamMemoryRequirement());
        }else{
            System.out.println("No tienes espacio");
        }
        System.out.println("Quedan " + c1.getHard()+ " GB de disco duro y " + c1.getRam()+ " GB de memoria RAM");
        for (int i = 0; i < os1.getosSoftware().size();i++){
            System.out.println("Los programas actualmente instalados son: " + os1.getosSoftware().get(i).getsoftwareName());
        }

        c1.getOS().SoftwareUninstallation(s1);
        c1.getOS().SoftwareUninstallation(s2);
        c1.setHard(c1.getHard()+s2.getsoftwareSpaceRequirement());
        c1.setRam(c1.getRam()+s2.getsoftwareRamMemoryRequirement());
        c1.setHard(c1.getHard()+s1.getsoftwareSpaceRequirement());
        c1.setRam(c1.getRam()+s1.getsoftwareRamMemoryRequirement());
        c1.formateo();
        System.out.println("Quedan " + c1.getHard() + " GB de disco duro y quedan " + c1.getRam() + " GB de memoria RAM");

    }
}