package KitleIndex;

import java.util.Scanner;

public class KitleIndexApp {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("Lütfen boyunuzu (metre cinsinde) giriniz :");
        double boy = input.nextDouble();

        System.out.println("Lütfen kilonuzu giriniz :");
        double kg = input.nextDouble();

        double kitleIndex = kg / Math.pow(boy,2);
        System.out.println("Vücut Kitle İndeksiniz : " + kitleIndex);
    }
}
