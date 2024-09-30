import java.util.Scanner;

public class f3_aritmetokk_oppgave {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Vennligst oppgi et heltall: ");
        int heltall = scanner.nextInt();

        System.out.println("Vennligst oppgi et desimaltall: ");
        double desimaltall = scanner.nextDouble();

        double produkt = heltall * desimaltall;

        System.out.println("Tror du at produktet" +" " + produkt +" "+ "er større enn 111.5? (ja/nei): ");
        String brukerSvar = scanner.next();

        System.out.println("produktet er: " + produkt);
        System.out.println("Du trodde: " + brukerSvar);

        if (produkt>115.5) {
            System.out.println("produktet er større enn 111.5.");
            if (brukerSvar.equalsIgnoreCase("ja")){
                System.out.println("Du hadde rett!");
            } else {
                System.out.println("Du hadde feil.");
            }
        } else {
            System.out.println("produktet er ikke større enn 111.5.");
            if (brukerSvar.equalsIgnoreCase("nei")){
                System.out.println("Du hadde rett!");
            } else {
                System.out.println("Du tok feil.");
            }
        }


    }
}
