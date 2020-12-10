package ComputerSystems;/*
Created by: Gusito
Date: 10/12/2020
Description: 
*/

import java.util.ArrayList;

public class OperatingSystem {
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
