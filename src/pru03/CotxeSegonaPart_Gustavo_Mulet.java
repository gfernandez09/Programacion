package pru03;
import java.util.*;
/*
Created by: Gusito
Date: 11/12/2020
Description: 
*/
enum marxaAutomatic{
    F,
    N,
    R
}
enum marxesManual {
    R,
    N,
    Primera,
    Segona,
    Tercera,
    Quarta,
    Quinta,
    Sexta
}
public class CotxeSegonaPart_Gustavo_Mulet extends Coche_Gustavo_Mulet {
    protected marxesManual marxaManual;
    protected marxaAutomatic marxaAutomatica;
    public CotxeSegonaPart_Gustavo_Mulet(String marca, String model, TipusCanvi tipusCanvi, EstatsMotorCotxe estatCotxe, marxaAutomatic marxaAutomatica, marxesManual marxaManual) {
        super(marca, model, tipusCanvi, estatCotxe);
        if (tipuscanvi == TipusCanvi.CanviAutomatic){
            this.marxaAutomatica = marxaAutomatica;
            this.marxaManual = null;
        }
        else {
            this.marxaAutomatica = null;
            this.marxaManual = marxaManual;
        }
    }

    public void canviarMarxaManual(char marxa) throws Exception{
        if(tipuscanvi == TipusCanvi.CanviManual && marxaManual == marxesManual.R && marxa == '+'){
            this.marxaManual = marxesManual.N;
        }else if(tipuscanvi == TipusCanvi.CanviManual && marxaManual == marxesManual.N && marxa == '+'){
            this.marxaManual = marxesManual.Primera;
        }else if(tipuscanvi == TipusCanvi.CanviManual && marxaManual == marxesManual.Primera && marxa == '+'){
            this.marxaManual = marxesManual.Segona;
        }else if(tipuscanvi == TipusCanvi.CanviManual && marxaManual == marxesManual.Segona && marxa == '+'){
            this.marxaManual = marxesManual.Tercera;
        }else if(tipuscanvi == TipusCanvi.CanviManual && marxaManual == marxesManual.Tercera && marxa == '+'){
            this.marxaManual = marxesManual.Quarta;
        }else if (tipuscanvi == TipusCanvi.CanviManual && marxaManual == marxesManual.Quarta && marxa == '+'){
            this.marxaManual = marxesManual.Quinta;
        }else if(tipuscanvi == TipusCanvi.CanviManual && marxaManual == marxesManual.Quinta && marxa == '+'){
            this.marxaManual = marxesManual.Sexta;
        }else if(tipuscanvi == TipusCanvi.CanviManual && marxaManual == marxesManual.Sexta && marxa == '-'){
            this.marxaManual = marxesManual.Quinta;
        }else if(tipuscanvi == TipusCanvi.CanviManual && marxaManual == marxesManual.Quinta && marxa == '-'){
            this.marxaManual = marxesManual.Quarta;
        }else if(tipuscanvi == TipusCanvi.CanviManual && marxaManual == marxesManual.Quarta && marxa == '-'){
            this.marxaManual = marxesManual.Tercera;
        }else if(tipuscanvi == TipusCanvi.CanviManual && marxaManual == marxesManual.Tercera && marxa == '-'){
            this.marxaManual = marxesManual.Segona;
        }else if(tipuscanvi == TipusCanvi.CanviManual && marxaManual == marxesManual.Segona && marxa == '-'){
            this.marxaManual = marxesManual.Primera;
        }else if(tipuscanvi == TipusCanvi.CanviManual && marxaManual == marxesManual.Primera && marxa == '-'){
            this.marxaManual = marxesManual.N;
        }else if(tipuscanvi == TipusCanvi.CanviManual && marxaManual == marxesManual.N && marxa == '-'){
            this.marxaManual = marxesManual.R;
        } else {
            throw new Exception("No s'ha pogut identificar la marxa");
        }
    }
    public void canviarMarxaAutomatic(char marxa) throws Exception{
        ///-----------------------------------
        ///Això es el canvi de marxa automàtic
        ///-----------------------------------
        if(tipuscanvi == TipusCanvi.CanviAutomatic && marxaAutomatica == marxaAutomatic.R && marxa == '+'){
            this.marxaAutomatica = marxaAutomatic.F.N;
        }else if(tipuscanvi == TipusCanvi.CanviAutomatic && marxaAutomatica == marxaAutomatic.N && marxa == '+'){
            this.marxaAutomatica = marxaAutomatic.F;
        }else if(tipuscanvi == TipusCanvi.CanviAutomatic && marxaAutomatica == marxaAutomatic.F && marxa == '-'){
            this.marxaAutomatica = marxaAutomatic.N;
        }else if(tipuscanvi == TipusCanvi.CanviAutomatic && marxaAutomatica == marxaAutomatic.N && marxa == '-'){
            this.marxaAutomatica = marxaAutomatic.R;
        }
    }
    public marxesManual getmarxaManual(){
        return marxaManual;
    }
    public marxaAutomatic getmarxaAutomatic(){
        return marxaAutomatica;
    }
}
