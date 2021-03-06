package CalculDies;/*
Created by: Gusito
Date: 16/12/2020
Description: Com podeu veure aquesta classe només implementa el mètode nombreDiesTotals que a més a més és final i per tant no el podeu modificar. La resta de mètodes els haureu d’implementar vosaltres a la vostra subclasse.
Per altra banda, se vos adjunta la classe DataXS (amb codi obert) per facilitar el tractament de dates i que és el tipus de dades (per tractar dates) que heu de fer servir durant l’exercici.
Teniu en compte que per comprovar el correcte funcionament de la vostra subclasse bastarà crear una classe de test que únicament haurà d’invocar nombreDiesTotals.
OBSERVACIÓ: Per comprovar el nombre de dies entre dues dates i verificar que el vostre codi sigui correcte, podeu fer servir un full de càlcul com el que està adjunt a l’enunciat.

*/

public class DiesEntreDates_Gustavo_Mulet extends CalcularDiesEntreDates {
        int diesMesInicial, diesMesDesti, diesMes, diesNumAnysComplets, diesResteAnyInicial, diesResteAnyDesti;
        boolean anyDeTraspas;
    @Override
    protected int diesMes(int mes) {
        int diesDelMes = 0;
        switch(mes){
            case 1: case 3: case 5: case 7: case 8: case 10: case 12:
                diesDelMes = 31;
                break;
            case 2:
                diesDelMes = 28;
                break;
            case 4: case 6: case 9: case 11:
                diesDelMes = 30;
        }
        return diesDelMes;
        }

    @Override
    protected int diesMesInicial(DataXS dataXS) {
        return diesMes(dataXS.mes) - dataXS.dia;
    }

    @Override
    protected int diesMesDesti(DataXS dataXS) {
             return dataXS.dia;
    }

    @Override
    protected int diesResteAnyInicial(DataXS datainicial) {
        int diesresteinici = 0;
        datainicial.mes++;
        while(datainicial.mes <= 12){
            diesresteinici += diesMes(datainicial.mes);
            datainicial.mes++;
        }
        return diesresteinici;
    }

    @Override
    protected int diesResteAnyDesti(DataXS datadesti) {
        int diesrestefin = 0;
        datadesti.mes--;
        while(datadesti.mes >= 1){
            diesrestefin += diesMes(datadesti.mes);
            datadesti.mes--;
        }
        return diesrestefin;
    }

    @Override
    protected int diesNumAnysComplets(DataXS datainicial, DataXS datadesti) {
        return 365 * ((datadesti.any - datainicial.any) - 1);
    }

    @Override
    protected int numDiesPerAnysdeTraspas(DataXS datainicial, DataXS datadesti) {
        int diesTraspas = 0;
        for(int i = 0; i <= ((datadesti.any - datainicial.any)-1); i++){
            if(anyDeTraspas(datainicial.any + i)){
                diesTraspas++;
            }
        }
        if(anyDeTraspas(datadesti.any)){
            diesTraspas++;
        }
        return diesTraspas;
    }

    @Override
    protected boolean anyDeTraspas(int any) {
        if((any % 400 == 0) || ((any % 4 == 0) && !(any % 100 == 0))){
            this.anyDeTraspas = true;
        }else{
            this.anyDeTraspas = false;
        }
        return this.anyDeTraspas;
    }

}
