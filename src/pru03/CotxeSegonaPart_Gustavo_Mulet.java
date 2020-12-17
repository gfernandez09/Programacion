package pru03;
import java.util.*;
/*
Created by: Gusito
Date: 11/12/2020
Description: 
*/
enum marxaAutomatic{
    F, N, R
}
enum marxesManual {
    R, N, Primera, Segona, Tercera, Quarta, Quinta, Sexta
}
public class CotxeSegonaPart_Gustavo_Mulet extends Coche_Gustavo_Mulet {
    protected marxesManual marxaManual;
    protected marxaAutomatic marxaAutomatica;
    public CotxeSegonaPart_Gustavo_Mulet(String marca, String model, TipusCanvi tipusCanvi, EstatsMotorCotxe estatCotxe, marxaAutomatic marxaAutomatica, marxesManual marxaManual) {
        super(marca, model, tipusCanvi, estatCotxe);
        this.marxaManual = marxaManual;
        this.marxaAutomatica = marxaAutomatica;

    }

    //Mètode per pujar/baixar marxes al tipus de canvi manual. Lo primer que feim es posar la marxa manual a R i desprès pujar fins a Sexta i desprès baixar una
    //altra vegada fins a R per completar la pujada/baixada de marxes.
    public void canviarMarxaManual(char marxa) throws Exception {

        if (estatCotxe.equals(EstatsMotorCotxe.EnMarxa)) {
            if (tipuscanvi == TipusCanvi.CanviManual && marxaManual == marxesManual.R && marxa == '+') {
                this.marxaManual = marxesManual.N;
            } else if (tipuscanvi == TipusCanvi.CanviManual && marxaManual == marxesManual.N && marxa == '+') {
                this.marxaManual = marxesManual.Primera;
            } else if (tipuscanvi == TipusCanvi.CanviManual && marxaManual == marxesManual.Primera && marxa == '+') {
                this.marxaManual = marxesManual.Segona;
            } else if (tipuscanvi == TipusCanvi.CanviManual && marxaManual == marxesManual.Segona && marxa == '+') {
                this.marxaManual = marxesManual.Tercera;
            } else if (tipuscanvi == TipusCanvi.CanviManual && marxaManual == marxesManual.Tercera && marxa == '+') {
                this.marxaManual = marxesManual.Quarta;
            } else if (tipuscanvi == TipusCanvi.CanviManual && marxaManual == marxesManual.Quarta && marxa == '+') {
                this.marxaManual = marxesManual.Quinta;
            } else if (tipuscanvi == TipusCanvi.CanviManual && marxaManual == marxesManual.Quinta && marxa == '+') {
                this.marxaManual = marxesManual.Sexta;
            } else if (tipuscanvi == TipusCanvi.CanviManual && marxaManual == marxesManual.Sexta && marxa == '-') {
                this.marxaManual = marxesManual.Quinta;
            } else if (tipuscanvi == TipusCanvi.CanviManual && marxaManual == marxesManual.Quinta && marxa == '-') {
                this.marxaManual = marxesManual.Quarta;
            } else if (tipuscanvi == TipusCanvi.CanviManual && marxaManual == marxesManual.Quarta && marxa == '-') {
                this.marxaManual = marxesManual.Tercera;
            } else if (tipuscanvi == TipusCanvi.CanviManual && marxaManual == marxesManual.Tercera && marxa == '-') {
                this.marxaManual = marxesManual.Segona;
            } else if (tipuscanvi == TipusCanvi.CanviManual && marxaManual == marxesManual.Segona && marxa == '-') {
                this.marxaManual = marxesManual.Primera;
            } else if (tipuscanvi == TipusCanvi.CanviManual && marxaManual == marxesManual.Primera && marxa == '-') {
                this.marxaManual = marxesManual.N;
            } else if (tipuscanvi == TipusCanvi.CanviManual && marxaManual == marxesManual.N && marxa == '-') {
                this.marxaManual = marxesManual.R;
            } else {
                throw new Exception("No s'ha pogut identificar la marxa");
            }
        }else{
            throw new Exception("El cotxe ha d'estar encès ");
        }
    }
    public void canviarMarxaAutomatic(char marxa) throws Exception {
        ///-----------------------------------
        ///Això es el canvi de marxa automàtic
        //Feim el mateix que el canviMarxaManual
        ///-----------------------------------
        if (estatCotxe.equals(EstatsMotorCotxe.EnMarxa)) {
            if (tipuscanvi == TipusCanvi.CanviAutomatic && marxaAutomatica == marxaAutomatic.R && marxa == '+') {
                this.marxaAutomatica = marxaAutomatic.F.N;
            } else if (tipuscanvi == TipusCanvi.CanviAutomatic && marxaAutomatica == marxaAutomatic.N && marxa == '+') {
                this.marxaAutomatica = marxaAutomatic.F;
            } else if (tipuscanvi == TipusCanvi.CanviAutomatic && marxaAutomatica == marxaAutomatic.F && marxa == '-') {
                this.marxaAutomatica = marxaAutomatic.N;
            } else if (tipuscanvi == TipusCanvi.CanviAutomatic && marxaAutomatica == marxaAutomatic.N && marxa == '-') {
                this.marxaAutomatica = marxaAutomatic.R;
            }else {
                throw new Exception("No s'ha pogut identificar la marxa");
            }
        }else{
            throw new Exception("El cotxe ha d'estar encès ");
        }
    }
    //Getters
    public marxesManual getmarxaManual(){ return marxaManual; }
    public marxaAutomatic getmarxaAutomatic(){ return marxaAutomatica;
    }
}
