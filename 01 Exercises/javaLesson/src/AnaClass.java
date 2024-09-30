public class KarekokHesaplayici {

    // Bu fonksiyon bir sayının karekökünü alır ve sonucu döndürür
    public static double karekokAl(double sayi) {
        return Math.sqrt(sayi); // Math.sqrt() karekök hesaplamak için kullanılır
    }

    public static void main(String[] args) {
        double sayi = 25.0;
        double sonuc = karekokAl(sayi);

        System.out.println(sayi + " sayısının karekökü: " + sonuc);
    }
}
