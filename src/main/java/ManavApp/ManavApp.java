package ManavApp;

import java.util.Scanner;

public class ManavApp {
    public static void main(String[] args) {
        double Armut = 2.14;
        double Elma = 3.67;
        double Domates = 1.1;
        double Muz = 0.95;
        double Patlican = 5.00;

        Scanner input = new Scanner(System.in);
        System.out.print("Armut Kaç Kilo ?:");
        double armKg = input.nextDouble();

        System.out.print("Elma Kaç Kilo ?:");
        double elmKg = input.nextDouble();
        System.out.print("Domates Kaç Kilo ?:");
        double dmtKg = input.nextDouble();
        System.out.print("Muz Kaç Kilo ?:");
        double muzKg = input.nextDouble();
        System.out.print("Patlican Kaç Kilo ?:");
        double patKg = input.nextDouble();

        double total = (armKg*Armut) +(elmKg*Armut) +(dmtKg*Armut) +(muzKg*Armut) +(patKg*Armut) ;
        System.out.print("Toplam Tutar : " + total);
    }
}
