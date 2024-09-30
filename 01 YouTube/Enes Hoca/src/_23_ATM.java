import java.util.Scanner;


public class _23_ATM {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        String islemSecenekleri = "Bakiye Goruntuleme icin -->1" + " "
                + "Para Cekmek icin -->2" + " "
                + "Farkli Hesaba Para Yatirmak icin -->3" + " "
                + "Cikis icin q tusuna basiniz";

        double bilalBakiye = 2450;
        String bilalIban = "TR1234 1234 1234 1234 1234";
        String bilalKullanici = "bilal12";
        String bilalSifre = "123";

        double enesBakiye = 1200;
        String enesIban = "TR5678 5678 5678 5678 5678";
        String enesKullanici = "enes55";
        String enesSifre = "456";

        System.out.println("ATM'YE HOSGELDINIZ");
        System.out.println("Lutfen Bilgilerinizi Giriniz.");

        System.out.println("Kullanici Adi");
        String kullaniciAdi = scanner.nextLine();

        System.out.println("Sifre: ");
        String sifre = scanner.nextLine();

        if (kullaniciAdi.equals("bilal12") && sifre.equals("123")) {
            System.out.println("Bilal Camur Hesabina giris Yapildi.");
            System.out.println(islemSecenekleri);

            System.out.print("Lutfen Bir Secim Yapiniz: ");
            String secim = scanner.nextLine();

            switch (secim) {
                case "1":
                    System.out.println("Bakiyeniz: " + bilalBakiye);
                    break;
                case "2":
                    System.out.println("Cekmek istediginiz tutari giriniz: ");
                    int cekilecekTutar = scanner.nextInt();
                    scanner.nextLine();
                    if (bilalBakiye >= cekilecekTutar) {
                        bilalBakiye -= cekilecekTutar;
                        System.out.println("Kalan tutar: " + bilalBakiye);
                    } else {
                        System.out.println("Bakiyenizden fazla para cekemezsiniz.");
                    }
                    break;
                case "3":
                    System.out.print("Ne kadar para yatirmak istiyorsunuz?");
                    int yatirilacakTutar = scanner.nextInt();
                    scanner.nextLine();
                    if (yatirilacakTutar <= bilalBakiye) {
                        System.out.println("Iban giriniz: ");
                        System.out.println();
                        String yatirilacakIban = scanner.nextLine();
                        if (yatirilacakIban.equals(enesIban)) {
                            System.out.println("Para Enes Bayram a yatiriliyor.");
                            bilalBakiye -= yatirilacakTutar;
                            enesBakiye += yatirilacakTutar;
                        }
                    }
                    break;
            }
        } else if (kullaniciAdi.equals("enes55") && sifre.equals("456")) {
            System.out.println("Enes Bayram Hesabina giris Yapildi.");
            System.out.println(islemSecenekleri);
        } else {
            System.out.println("Kullanici Adiniz veya Sifreniz Yanlis!");
        }

    }
}
