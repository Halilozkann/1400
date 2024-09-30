import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        System.out.println("Skriv inn fornavnet: ");
        String fornavn = scanner.nextLine();

        System.out.println("Skriv inn etternavnet: ");
        String etternavn = scanner.nextLine();

        String fultnavn = fornavn + etternavn;
        System.out.println("Dette er ditt fultnavn: " + fultnavn);





    }

}