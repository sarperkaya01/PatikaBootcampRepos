package Casting;

import java.util.Scanner;

public class CastingApp {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("Tam sayi giriniz : ");
        int tamSayi = sc.nextInt();
        System.out.println("Ondalikli sayi giriniz : ");
        double doubleSayi = sc.nextDouble();
        double tamSayiToDouble = (double) tamSayi;
        int ondalikliToTam = (int) doubleSayi;

        System.out.println("Tam sayinin double hali: " + tamSayiToDouble);
        System.out.println("Ondalikli sayinin tam hali: " + ondalikliToTam);



    }
}
