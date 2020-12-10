package ComputerSystems;/*
Created by: Gusito
Date: 10/12/2020
Description: 
*/

public class Software {
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
