package com.juaracoding.azrjavafundamental.testharian.praktikum1;
/*
Created By Intellij IDEA 2023.2.3 (Community Edition)
Build #IC-232.10072.27, built on October 11, 2023
@Author Allysa Zahra Ramadhina
Java Developer
Created on 31/10/2023 22.05
@Last Modified 31/10/2023 22.05
Version 1.0
*/

import java.util.Scanner;

public class Praktikum1 {
    public static void main(String[] args) {

        Scanner scan = new Scanner(System.in);
        System.out.print("Masukkan Kata : ");
        String strKata = scan.nextLine();
        int sum = 0;

        for(int i = 0; i < strKata.length(); i++)
        {
            char chKata = strKata.charAt(i);
            if(chKata >= 32 && chKata <= 90)
            {
                int intNilai = (int)chKata;
                sum += intNilai;
            }
        }
        System.out.println("Hasil : " + sum);
    }
}
