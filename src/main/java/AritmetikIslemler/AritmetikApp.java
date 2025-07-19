package AritmetikIslemler;

import java.util.Scanner;

public class AritmetikApp {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int[] sayilar = new int[3];
        for (int i = 0; i < 3; i++) {
            System.out.println((i+1)+". sayiyi giriniz: ");

            sayilar[i]=sc.nextInt();
        }
        System.out.println("Islem sonucunuz = "+(sayilar[0]+sayilar[1]*sayilar[2]-sayilar[1]));

    }
}
