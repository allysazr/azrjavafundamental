package com.juaracoding.azrjavafundamental.testharian.praktikum3;
/*
IntelliJ IDEA 2023.2.3 (Community Edition)
Build #IC-232.10072.27, built on October 11, 2023
@Author Allysa Zahra Ramadhina
Java Developer
Created on 09/11/2023 15:18
@Last Modified 09/11/2023 15:18
Version 1.0
*/

import java.util.Random;

public class Praktikum3 {

    public static void main(String[] args) {

        Random random = new Random();
        int intLength = 0;
        String strKarakter = "";
        String strVokal = "aiueo";
        String strKonsonan = "bcdfghjklmnpqrstvwxyz";

        intLength = random.nextInt(12, 26);

        for(int i = 0; i < 8; i++)
        {
            if(i % 2 == 0)
            {
                strKarakter = strKarakter + strVokal.charAt(random.nextInt(1, 6)-1);
            }
            else
            {
                strKarakter = strKarakter + strKonsonan.charAt(random.nextInt(1, 22)-1);
            }
        }

        for(int i = 7; i < intLength; i++)
        {
            if(i % 2 == 0)
            {
                strKarakter = strKarakter + strVokal.charAt(random.nextInt(1, 6)-1);
            }
            else
            {
                strKarakter = strKarakter + strKonsonan.charAt(random.nextInt(1, 22)-1);
            }
        }

        String strHurufAwal = strKarakter.substring(0, 1).toUpperCase();
        String strHurufLainnya = strKarakter.substring(1);
        String strKata = strHurufAwal + strHurufLainnya;
        System.out.println(strKata);
    }
}
