package CalculDies;/*
Created by: Gusito
Date: 16/12/2020
Description: 
*/

public class TestDiesEntreDates {
    public static void main(String[] args) {

        try {
            DiesEntreDates_Gustavo_Mulet d1 = new DiesEntreDates_Gustavo_Mulet();
            DataXS data1 = new DataXS("09/04/2000");
            DataXS data2 = new DataXS("17/12/2020");
            System.out.println("Hi ha una diferencia de "+d1.nombreDiesTotals(data1,data2)+ " dies");
        } catch (Exception e){
            System.out.println(e.getMessage());
        }
    }
}
