import java.util.Scanner;

public class Oppgave7 {
    public static void main(String[] args) {
        //Les inn verdier for antall pizza, antall personer og antallSlicesPerPizza.
        // Regn så ut hvor mange pizza-slices hver person får dersom man deler likt gitt at en pizza har
        // f.eks 6 slices hver. Hvor mange slices er det til overs dersom man deler likt?
        // Bruk modulus operatoren. Skriv ut resultatet på følgende form:
        // ”Dersom man er 4 personer og har 3 pizzaer får hver person 4 slices og 2 blir til overs”.

        Scanner scanner = new Scanner(System.in);

        System.out.println("Skriv inn hvor mange pizza er det: ");
        int antallPizza = scanner.nextInt();
        System.out.println("Skriv inn hvor mange personer er det: ");
        int antallPersonerr = scanner.nextInt();

        int antallSlicesPerPizza = antallPizza*6;
        int antallPizzaPerson = antallSlicesPerPizza/antallPersonerr;
        int antallOvers = antallSlicesPerPizza%antallPersonerr;

        System.out.println("Dersom man er " + antallPersonerr + " personer og har " + antallPizza
                + " pizzaer får hver person " + antallPizzaPerson + " slices og "
        + antallOvers + " blir til overs");
    }
}
