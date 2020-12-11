package pru03;/*
Created by: Gusito
Date: 06/12/2020
Description: 
*/

public class Coche_Gustavo_Mulet extends CotxeAbstracte {
    protected EstatsMotorCotxe estatCotxe;
    public Coche_Gustavo_Mulet(String marca, String model, TipusCanvi tipusCanvi, EstatsMotorCotxe estatCotxe){
        super(marca,model,tipusCanvi);
        this.estatCotxe = estatCotxe;
    }

    @Override
    public void arrancarMotor() throws Exception {
        //Això ho utilitzam per arrancar el motor del cotxe o ja posar-ho aturat.
        if(estatCotxe == EstatsMotorCotxe.Aturat){
            this.estatCotxe = EstatsMotorCotxe.EnMarxa;
            System.out.println("El coche ya está en marcha.");
        } else{
            throw new Exception("El coche ya esta arrancado.");
        }
    }

    @Override
    //mètode per comprovar l'estat del motor que ens dirà si està en marxa o aturat.
    public EstatsMotorCotxe comprovaMotor() {
        return estatCotxe;
    }

    @Override
    public int getRevolucions() {
        if(estatCotxe.equals(EstatsMotorCotxe.Aturat)){
            return 0;
        }else{
            return (int)(Math.random()*6500+1);
        }
    }

    @Override
    //Mètode per aturar el motor del cotxe.
    public void aturarMotor() throws Exception {
        if(estatCotxe.equals(EstatsMotorCotxe.Aturat)){
            throw new Exception("El coche ya está parado.");
        }
        this.estatCotxe = EstatsMotorCotxe.Aturat;
        System.out.println("El coche está parado.");
    }
}
