package ArtikYil;

import java.util.Scanner;

public class ArtikYilApp {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int yil;

        while (true) {
            System.out.print("4 basamaklı bir yil girin: ");
            String input = scanner.nextLine();

            // Input yalnizca rakamlardan mi olusuayor mi?
            if (!input.matches("\\d+")) {//input.hasNextInt() alternatifi ancak inputun tamamini  tipine gore degil her bir karakterin tipini inceliyor
                System.out.println("Hatalı giriş! Lütfen sadece rakam girin.");
                continue;
            }

            // 4 basamaklı mı
            if (input.length() == 4) {
                yil = Integer.parseInt(input);
                break; // artık geçerli, döngüden çık
            } else {
                System.out.println("Lütfen 4 basamaklı bir sayı girin!");
            }
        }

        if (yil % 100==0 && yil % 400==0) {
             if (yil % 4==0) {

                System.out.println(yil+" bir artık yıldır !");
            }
        }  else {
            System.out.println(yil+" bir artık yıl degildir !");
        }
        scanner.close();
    }
}
