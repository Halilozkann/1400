import java.util.Scanner;

public class Oppgave11 {
    public static void main(String[] args) {

Scanner scanner =new Scanner(System.in);
        // Kullanıcıdan 0 ile 1000 arasında bir sayı girmesini iste
        System.out.println("0 ile 1000 arasında bir sayı girin: ");
        int sayi = scanner.nextInt();

        // Sayının geçerli bir aralıkta olup olmadığını kontrol et
        if (sayi < 0 || sayi > 1000) {
            System.out.println("Sayı 0 ile 1000 arasında olmalıdır.");
            return; // Geçerli aralıkta değilse, programı sonlandır
        }

        // Rakamların toplamını hesapla


        // Sayıyı 100, 10 ve 1 basamağına ayır ve her basamağı toplama ekle
        int yuzler = sayi / 100; // Yüzler basamağı
        int onlar = (sayi % 100) / 10; // Onlar basamağı
        int birler = sayi % 10; // Birler basamağı

        int toplam = yuzler + onlar + birler;

        // Sonucu ekrana yazdır
        System.out.println(sayi + " sayısının rakamlarının toplamı: " + toplam);

    }
}
