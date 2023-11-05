package com.juaracoding.azrjavafundamental.testharian.praktikum2;
/*
IntelliJ IDEA 2023.2.3 (Community Edition)
Build #IC-232.10072.27, built on October 11, 2023
@Author Allysa Zahra Ramadhina
Java Developer
Created on 11/4/2023 3:00 PM
@Last Modified 11/4/2023 3:00 PM
Version 1.0
*/

import java.util.Scanner;

public class Praktikum2 {

    public static void main(String[] args) {

        Scanner scan = new Scanner(System.in);
        int sum = 0;
        int jmlAngka = 0;
        boolean isInput = true;

        System.out.println("Masukkan Angka : ");

        while(isInput){
            try{
                int intAngka = scan.nextInt();
                sum += intAngka;
                jmlAngka++;
            } catch(Exception e){
                if(jmlAngka > 0){
                    double rataRata = (double) sum/jmlAngka;
                    System.out.println("Rata-rata : "+rataRata);
                } else{
                    System.out.println("Angka Belum Dimasukkan.");
                }
                break;
            }
        }
    }
}


