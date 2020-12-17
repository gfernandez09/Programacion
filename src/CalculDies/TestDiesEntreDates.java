package CalculDies;/*
Created by: Gusito
Date: 16/12/2020
Description: 
*/

public class TestDiesEntreDates {
    public static void main(String[] args) {

        try {
            DiesEntreDates_Gustavo_Mulet d1 = new DiesEntreDates_Gustavo_Mulet();
            DataXS data1 = new DataXS("12/12/2017");
            DataXS data2 = new DataXS("01/01/2018");
            System.out.println(d1.diesMesInicial);
            System.out.println(d1.diesMesDesti);
            System.out.println(d1.diesResteAnyInicial);
            System.out.println(d1.diesResteAnyDesti);
            System.out.println(d1.diesNumAnysComplets);
            System.out.println(d1.nombreDiesTotals(data1,data2));
        } catch (Exception e){
            System.out.println(e.getMessage());
        }
    }
}
