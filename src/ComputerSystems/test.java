package ComputerSystems;/*
Created by: Gusito
Date: 10/12/2020
Description: 
*/

public class test {
    public static void main(String[] args) {
        //Creacion del ordenador y los programas a instalar
        ComputerClass c1 = new ComputerClass("Gustavo",8,100);
        OperatingSystem os1 = new OperatingSystem("Windows","2.0","64",true,20,2);
        Software s1 = new Software("Steam", "2.0", 1,1);
        Software s2 = new Software("Chrome","2.0",1,1);
        //Instalacion del Sistema Operativo
        c1.OperatingSystemInstall(os1);
        System.out.println("El S.O instalado en el equipo es: " + os1.getosName() + "\n" + "Su tamaño es: " + os1.getosSpaceRequirement() + " GB de memoria y " + os1.getosRamMemoryRequirement() + " GB de RAM");
        //Instalacion de los programas
        c1.getOS().SoftwareInstallation(s1,c1);
        c1.getOS().SoftwareInstallation(s2,c1);
        for (int i = 0; i < os1.getosSoftware().size();i++){
            System.out.println("El programa actualmente instalado es: " + os1.getosSoftware().get(i).getsoftwareName());
        }
        System.out.println("Quedan " + c1.getHard() + " GB de disco duro y quedan " + c1.getRam() + " GB de memoria RAM");
        c1.getOS().SoftwareUninstallation(s1,c1);
        c1.getOS().SoftwareUninstallation(s2,c1);
        System.out.println("Procedemos a formatear el equipo");
        c1.formateo();
        System.out.println("Quedan " + c1.getHard() + " GB de disco duro y quedan " + c1.getRam() + " GB de memoria RAM");

    }
}
