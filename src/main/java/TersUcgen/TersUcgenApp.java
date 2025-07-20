package TersUcgen;

import java.util.Scanner;

public class TersUcgenApp {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Olusturmak istediginiz ucgen icin basamak sayisi girin : ");

        int triSize = sc.nextInt();
        String star = "";

        for (int i = triSize; i > 0; i--) {
            for (int j =  0; j < 2*i-1; j++) {
                star += "*";
            }
            System.out.println(star);
            star = "";
        }

    }
}
