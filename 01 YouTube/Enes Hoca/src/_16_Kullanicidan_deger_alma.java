import java.util.Scanner;

public class _16_Kullanicidan_deger_alma {
    public static void main(String[] args) {
        /*
        nextLine() -> String
        nextInt() -> Integer
        nextByte() -> Byte
        nextFloat -> Float
        nextDouble -> Double */

        Scanner scanner = new Scanner(System.in);
        /*
        System.out.println("Adinizi Girin.");
        String isim = scanner.nextLine();
        System.out.println("Soyadinizi Girin.");
        String soyisim = scanner.nextLine();
        System.out.println("Adiniz ve soyadiniz: " + isim + " " + soyisim);
         */

       /* System.out.print("Yasini gir:");
        int yas = scanner.nextInt();
        System.out.println("Yasiniz: " + yas);*/

        System.out.print("Kilonuzu giriniz: ");
        double kilo = scanner.nextDouble();
        System.out.println("Kilonuz: " + kilo);
    }
}
