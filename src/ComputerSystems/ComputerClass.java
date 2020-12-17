
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
        if(operatingSystem != null && operatingSystem.getosSpaceRequirement() < this.hardDisk && operatingSystem.getosRamMemoryRequirement() < this.ramMemory){
            this.hardDisk -= operatingSystem.getosSpaceRequirement();
            this.ramMemory -= operatingSystem.getosRamMemoryRequirement();
            this.operatingSystem = operatingSystem;
        }else{
            System.out.println("No tienes espacio para instalar el S.O");
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
