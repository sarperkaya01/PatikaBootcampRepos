package MaxMin;

import java.util.ArrayList;
import java.util.Collection;
import java.util.Collections;
import java.util.Scanner;

public class MaxMinValue {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Kaç tane sayı gireceksiniz: ");
        int arrayCount = sc.nextInt();

        ArrayList<Integer> saymaSayilari = new ArrayList<>();
        for (int i = 0; i < arrayCount; i++) {
            System.out.println((i+1)+". Sayıyı giriniz: ");
            if (sc.hasNextInt()) {
                int checkValue = sc.nextInt();
                saymaSayilari.add(checkValue);

            }
            else {
                sc.next();
            }

        }
        int max = Collections.max(saymaSayilari);
        int min = Collections.min(saymaSayilari);
        System.out.println("En buyuk sayi : "+max);
        System.out.println("En kucuk sayi : "+min);

    }
}
