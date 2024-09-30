import java.util.Scanner;

public class Oppgave10 {
    public static void main(String[] args) {
        //Lag et program som leser inn et heltall, alder.
        // Avhengig av hva denne er så skal det skrives ut en tekst tilsvarende :
        // ”Du kan ta førerkortet for bil da du er gammel nok” eller
        // ”Du er for ung til å ta førerkort for bil”.
        // Gjør dette ved bruk to if-setninger.

        Scanner scanner = new Scanner(System.in);

        System.out.println("Skriv inn din alder: ");
        int heltallAlder = scanner.nextInt();

        if (heltallAlder>=18) {
            System.out.println("Du kan ta førerkortet for bil da du er gammel nok");
        }
       if (heltallAlder<18) {
           System.out.println("Du er for ung til å ta førerkort for bil");
       }
    }
}
