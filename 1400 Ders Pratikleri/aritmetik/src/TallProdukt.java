import java.util.Scanner;

public class TallProdukt {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Hente inn et heltall fra bruker
        System.out.print("Vennligst oppgi et heltall: ");
        int heltall = scanner.nextInt();

        // Hente inn et desimaltall fra bruker
        System.out.print("Vennligst oppgi et desimaltall: ");
        double desimaltall = scanner.nextDouble();

        // Beregn produktet av tallene
        double produkt = heltall * desimaltall;

        // Spør bruker om de tror produktet er større enn 111.5
        System.out.print("Tror du at produktet (" + produkt + ") er større enn 111.5? (ja/nei): ");
        String brukerSvar = scanner.next();

        // Sjekk brukerens svar og skriv ut resultatet
        System.out.println("Produktet er: " + produkt);
        System.out.println("Du trodde: " + brukerSvar);

        // Kontroller om produktet er større enn 111.5
        if (produkt > 111.5) {
            System.out.println("Produktet er større enn 111.5.");
            if (brukerSvar.equalsIgnoreCase("ja")) {
                System.out.println("Du hadde rett!");
            } else {
                System.out.println("Du hadde feil.");
            }
        } else {
            System.out.println("Produktet er ikke større enn 111.5.");
            if (brukerSvar.equalsIgnoreCase("nei")) {
                System.out.println("Du hadde rett!");
            } else {
                System.out.println("Du hadde feil.");
            }
        }

        // Lukk scanner
        scanner.close();
    }
}
