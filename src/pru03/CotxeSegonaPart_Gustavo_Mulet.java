package pru03;
import java.util.*;
/*
Created by: Gusito
Date: 11/12/2020
Description: 
*/

public class CotxeSegonaPart_Gustavo_Mulet extends Coche_Gustavo_Mulet {
    protected CanviarMarxaManual marxaManual;
    protected CanviarMarxaAutomatic marxaAutomatica;
    public CotxeSegonaPart_Gustavo_Mulet(String marca, String model, TipusCanvi tipusCanvi, EstatsMotorCotxe estatCotxe, CanviarMarxaAutomatic marxaAutomatica, CanviarMarxaManual marxaManual) {
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
        if(tipuscanvi == TipusCanvi.CanviManual && marxaManual == CanviarMarxaManual.R && marxa == '+'){
            this.marxaManual = CanviarMarxaManual.N;
        }else if(tipuscanvi == TipusCanvi.CanviManual && marxaManual == CanviarMarxaManual.N && marxa == '+'){
            this.marxaManual = CanviarMarxaManual.Primera;
        }else if(tipuscanvi == TipusCanvi.CanviManual && marxaManual == CanviarMarxaManual.Primera && marxa == '+'){
            this.marxaManual = CanviarMarxaManual.Segona;
        }else if(tipuscanvi == TipusCanvi.CanviManual && marxaManual == CanviarMarxaManual.Segona && marxa == '+'){
            this.marxaManual = CanviarMarxaManual.Tercera;
        }else if(tipuscanvi == TipusCanvi.CanviManual && marxaManual == CanviarMarxaManual.Tercera && marxa == '+'){
            this.marxaManual = CanviarMarxaManual.Quarta;
        }else if (tipuscanvi == TipusCanvi.CanviManual && marxaManual == CanviarMarxaManual.Quarta && marxa == '+'){
            this.marxaManual = CanviarMarxaManual.Quinta;
        }else if(tipuscanvi == TipusCanvi.CanviManual && marxaManual == CanviarMarxaManual.Quinta && marxa == '+'){
            this.marxaManual = CanviarMarxaManual.Sexta;
        }else if(tipuscanvi == TipusCanvi.CanviManual && marxaManual == CanviarMarxaManual.Sexta && marxa == '-'){
            this.marxaManual = CanviarMarxaManual.Quinta;
        }else if(tipuscanvi == TipusCanvi.CanviManual && marxaManual == CanviarMarxaManual.Quinta && marxa == '-'){
            this.marxaManual = CanviarMarxaManual.Quarta;
        }else if(tipuscanvi == TipusCanvi.CanviManual && marxaManual == CanviarMarxaManual.Quarta && marxa == '-'){
            this.marxaManual = CanviarMarxaManual.Tercera;
        }else if(tipuscanvi == TipusCanvi.CanviManual && marxaManual == CanviarMarxaManual.Tercera && marxa == '-'){
            this.marxaManual = CanviarMarxaManual.Segona;
        }else if(tipuscanvi == TipusCanvi.CanviManual && marxaManual == CanviarMarxaManual.Segona && marxa == '-'){
            this.marxaManual = CanviarMarxaManual.Primera;
        }else if(tipuscanvi == TipusCanvi.CanviManual && marxaManual == CanviarMarxaManual.Primera && marxa == '-'){
            this.marxaManual = CanviarMarxaManual.N;
        }else if(tipuscanvi == TipusCanvi.CanviManual && marxaManual == CanviarMarxaManual.N && marxa == '-'){
            this.marxaManual = CanviarMarxaManual.R;
        } else {
            throw new Exception("No s'ha pogut identificar la marxa");
        }
    }
    public void canviarMarxaAutomatic(char marxa) throws Exception{
        ///-----------------------------------
        ///Això es el canvi de marxa automàtic
        ///-----------------------------------
        if(tipuscanvi == TipusCanvi.CanviAutomatic && marxaAutomatica == CanviarMarxaAutomatic.R && marxa == '+'){
            this.marxaAutomatica = CanviarMarxaAutomatic.N;
        }else if(tipuscanvi == TipusCanvi.CanviAutomatic && marxaAutomatica == CanviarMarxaAutomatic.N && marxa == '+'){
            this.marxaAutomatica = CanviarMarxaAutomatic.F;
        }else if(tipuscanvi == TipusCanvi.CanviAutomatic && marxaAutomatica == CanviarMarxaAutomatic.F && marxa == '-'){
            this.marxaAutomatica = CanviarMarxaAutomatic.N;
        }else if(tipuscanvi == TipusCanvi.CanviAutomatic && marxaAutomatica == CanviarMarxaAutomatic.N && marxa == '-'){
            this.marxaAutomatica = CanviarMarxaAutomatic.R;
        }
    }
    public CanviarMarxaManual getmarxaManual(){
        return marxaManual;
    }
    public CanviarMarxaAutomatic getmarxaAutomatic(){
        return marxaAutomatica;
    }
}
