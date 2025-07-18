package BiletApp;

import java.util.LinkedHashMap;
import java.util.Map;
import java.util.Scanner;

public class BiletApp {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        Profile profile = new Profile();


        int secim = -1;

        while (true) {
            System.out.println("Bilet tipi secin : \n 1) Tek Yön \n 2) Gidiş-Dönüş");

            if (sc.hasNextInt()) {
                secim = sc.nextInt();

                if (secim == 1 || secim == 2) {
                    profile.ticket = (secim == 1) ? TicketType.ONE_WAY : TicketType.ROUND_TRIP;
                    break;

                } else {
                    System.out.println("Yanlış sayı girdiniz. Lütfen sadece 1 ya da 2 giriniz.");
                }
            } else {
                System.out.println("Lütfen sadece sayısal ifade giriniz.");
                sc.next();
            }
        }
        System.out.println("Yasiniz :");

        while (true) {

            if (sc.hasNextInt()) {
                profile.age = sc.nextInt();
                sc.nextLine();//inputtan int aldiktan sonra satirini - cahralari sifirlamak icin nex t line uyapmak gerekli consume
                break;
            } else {
                System.out.println("Lütfen sadece tam sayi giriniz ifade giriniz.");
                sc.next();
            }
        }
        for (String key : RouteAndDistances.guzergah.keySet()) {
            System.out.print(key + " ");
        }
        System.out.println();
        System.out.println("Bir guzergah yaziniz : ");


        while (true) {

            String route = sc.nextLine().toLowerCase().trim();

            if (RouteAndDistances.guzergah.containsKey(route)) {
                profile.distance = RouteAndDistances.guzergah.get(route);
                break;
            } else {
                System.out.println("Lütfen listede bulunan güzergahlardan birini yazınız.(sayisal ifade kullanmayin)");
            }
        }


        System.out.println(RouteAndDistances.CalculatePayment(profile) );

        //sc.close();

    }

}

class Profile {
    public TicketType ticket;
    public int age;
    public int distance;


}

enum TicketType {
    ONE_WAY,        // Tek yön
    ROUND_TRIP      // Gidiş-Dönüş
}

class RouteAndDistances {
    static String CalculatePayment(Profile pp) {

        double ageDiscount = 1;
        if (pp.age < 12) {
            ageDiscount = 0.5;
        } else if (pp.age >= 12 && pp.age < 24) {
            ageDiscount = 0.9;
        } else if (pp.age > 65) {
            ageDiscount = 0.8;
        }
        double roundTrip = pp.ticket == TicketType.ROUND_TRIP ? 0.8 : 1;

        double payment = ageDiscount * roundTrip * (pp.distance * 0.1);


        return "Odeyeceginiz tutar: " + String.format("%.2f", payment) + " TL\nKeyfili yolculukar dileriz...";
    }

    static Map<String, Integer> guzergah = new LinkedHashMap<>() {{
        put("adana", 490);
        put("madrid", 3400);
        put("isparta", 140);
        put("nurnberg", 2100);
        put("ordu", 740);
        put("hiresun", 770);
        put("londra", 2900);
        put("urfa", 810);
        put("capeTown", 8600);
        put("ottawa", 7500);
        put("diyerbakir", 960);
        put("ibiza", 2800);
        put("nigde", 360);
        put("granada", 3300);
    }};
}
