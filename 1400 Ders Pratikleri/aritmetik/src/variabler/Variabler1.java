package variabler;

public class Variabler1 {
    private static Object variabler;

    public static void main(String[] args) {
        // en .java fil må starte med et package-navn


        // for å kunne kjøre en .java fil må den inneholde en main-metode.

        double tall1 = 1;
        double tall2 = 2;
        double resultat;
        resultat = tall1 * 4 + (tall2 * 2 + tall1) / (tall2 - tall1 * 3);
        System.out.println(resultat);

    }
}
