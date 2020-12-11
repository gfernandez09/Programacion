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
        //Instalacion del Primer Programa
        //Si el discoduro disponible es mayor que el espacio que ocupa el software y la ram disponible es mayor de lo que consume de ram el programa
        //entonces instala el software y cambia los valores disponibles de setHard y setRam
        if (c1.getHard()>s1.getsoftwareSpaceRequirement()&&c1.getRam()>s1.getsoftwareRamMemoryRequirement()){
            c1.getOS().SoftwareInstallation(s1);
            c1.setHard(c1.getHard()-s1.getsoftwareSpaceRequirement());
            c1.setRam(c1.getRam()-s1.getsoftwareRamMemoryRequirement());
        }else{
            System.out.println("No tienes espacio para instalar el software");
        }
        //Instalacion del Segundo Programa
        if(c1.getHard()>=s2.getsoftwareSpaceRequirement()&&c1.getRam()>=s2.getsoftwareRamMemoryRequirement()){
            c1.getOS().SoftwareInstallation(s2);
            c1.setHard(c1.getHard()-s2.getsoftwareSpaceRequirement());
            c1.setRam(c1.getRam()-s2.getsoftwareRamMemoryRequirement());
        }else{
            System.out.println("No tienes espacio para instalar el software");
        }
        System.out.println("Quedan " + c1.getHard() + " GB de disco duro y quedan " + c1.getRam() + " GB de memoria RAM");
        for (int i = 0; i < os1.getosSoftware().size();i++){
            System.out.println("El programa actualmente instalado es: " + os1.getosSoftware().get(i).getsoftwareName());
        }

        c1.getOS().SoftwareInstallation(s1);
        c1.getOS().SoftwareInstallation(s2);
        c1.setHard(c1.getHard()+s2.getsoftwareSpaceRequirement());
        c1.setRam(c1.getRam()+s2.getsoftwareRamMemoryRequirement());
        c1.setHard(c1.getHard()+s1.getsoftwareSpaceRequirement());
        c1.setRam(c1.getRam()+s1.getsoftwareRamMemoryRequirement());
        c1.formateo();
        System.out.println("Quedan " + c1.getHard() + " GB de disco duro y quedan " + c1.getRam() + " GB de memoria RAM");

    }
}
