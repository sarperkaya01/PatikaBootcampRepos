package MukemmelSayilar;

import java.util.Scanner;

public class MukemmelApp {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Mukemmeligini sorgulamak istediginiz sayi nedir?");
        int N = sc.nextInt();
        int check =0;
        for (int i = 1; i < N; i++) {

            if (N%i == 0) {
                check +=i;
            }
        }
        if (check == N) {
            System.out.println(N+" mukemmeldir.");
        } else {
            System.out.println(N+" mukemmel degildirdir.");
        }


    }
}
