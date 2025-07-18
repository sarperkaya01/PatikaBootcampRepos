package CinZodyagi;

import java.util.Scanner;

public class CinZodyagiApp {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        while (true) {

            System.out.print("Lutfen bir yil giriniz : ");
            int date = sc.nextInt();
            String[] zodiac = {"Maymun", "Horoz", "Köpek", "Domuz", "Fare", "Öküz", "Kaplan", "Tavşan", "Ejderha", "Yılan", "At", "Koyun"};
            for (int i = 0; i < zodiac.length; i++) {
                if (date % 12 == i) {
                    System.out.println("Cin burcunuz : " + zodiac[i]);

                }
            }
        }
    }
}
