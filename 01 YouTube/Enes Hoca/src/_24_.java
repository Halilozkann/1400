import javax.swing.plaf.synth.SynthOptionPaneUI;
import java.util.Scanner;

public class _24_ {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        String islemsecenekleri = "Bakiye goruntuleme icin >> 1" + " "
                + "Para cekmek icin >> 2" + " "
                + "Farkli bi hesaba para yatirma icin >> 3" + " "
                + "Cikis icin q tusuna basiniz";

        double bilalBakiye = 2450;
        String bilalIban = "TR1234 1234 1234 1234 1234";
        String bilalKullanici = "bilal12";
        String bilalSifre = "123";

        double enesBakiye = 2450;
        String enesIban = "TR5678 5678 5678 5678 5678";
        String enesKullanici = "enes55";
        String enesSifre = "456";

        System.out.println("ATM'YE HOSGELDINIZ");
        System.out.println("Lutfen Bilgilerinizi Buraya Giriniz.");

        System.out.println("Kullanici Adi");
        String kullaniciAdi = scanner.nextLine();

        System.out.println("Sifre: ");
        String sifre = scanner.nextLine();

        if (kullaniciAdi.equals("bilal12") && sifre.equals("123")) {
            System.out.println("Bilal Camur hesanina Giris Yapildi.");
            System.out.println(islemsecenekleri);

            System.out.println("Lutfen Bie secim yapiniz: ");
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
                        System.out.println("kalan tutar: " + bilalBakiye);
                    } else {
                        System.out.println("Bakiyenizden fazla para cekemezsiniz.");
                    }
                    break;
                case "3":
                    System.out.println("Ne kadar para yatirmak istiyorsunuz?");
                    int yatirilacakTutar = scanner.nextInt();
                    scanner.nextLine();
                    if (yatirilacakTutar <= bilalBakiye) {
                        System.out.println("Iban giriniz: ");
                        System.out.println();
                        String yatirilacakIban = scanner.nextLine();
                        if (yatirilacakIban.equals(enesIban)) {
                            System.out.println("Para enes Bayrama yatiriliyor.");
                            bilalBakiye -= yatirilacakTutar;
                            enesBakiye += yatirilacakTutar;
                        }
                    }
                    break;
            }
        } else if (kullaniciAdi.equals("enes55") && sifre.equals("456")) {
            System.out.println("Enes bayram hesabina Giris yapildi.");
            System.out.println(islemsecenekleri);
        } else {
            System.out.println("Kullanici Adi Veya Sifreniz Yanlis!");
        }


    }
}
