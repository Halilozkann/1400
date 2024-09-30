import java.util.Scanner;

public class oppgave5 {
    public static void main(String[] args) {
        //Lag et program som regner om fra fahrenheit til celsius.
        // Les inn verdien for fahrenheit og regn ut tilsvarende celsius med følgende formel:
        // C = (F-32)/1.8. Skriv så ut resultatet i Celsius.
        Scanner scanner = new Scanner(System.in);

        System.out.println("Skriv inn temperaturen i fahrenheit: ");
        double fahrenheit = scanner.nextDouble();

        double celcius = Math.round((fahrenheit - 32) / 1.8) ;

        System.out.println(fahrenheit + " Fahrenheit tilsvarer " + celcius + " celcius: ");
    }
}
