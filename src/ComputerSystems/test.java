package ComputerSystems;/*
Created by: Gusito
Date: 10/12/2020
Description: 
*/

public class test {
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
