package Metodlar;

public class Return {

    public static void main(String[] args) {

//        int metoddanGelenSonuc = carp(5, 7);

        String donenDeger = isimDondur("Enes");
    }
    public static String isimDondur(String isim){
        return isim;
    }

    public static int carp(int sayi1, int sayi2) {
        int sonuc = sayi1 * sayi2;
        return sonuc;
    }
}