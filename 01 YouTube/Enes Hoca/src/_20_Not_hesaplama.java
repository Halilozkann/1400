import java.util.Scanner;

public class _20_Not_hesaplama {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Adinizi girin: ");
        String isim = scanner.nextLine();

        System.out.print("Soyadinizi Girin: ");
        String soyisim = scanner.nextLine();

        System.out.println("Dersi Girin: ");
        String dersismi = scanner.nextLine();

        System.out.print("Vize1 notunu gir: ");
        double vize1 = scanner.nextDouble();

        System.out.print("Vize2 notunu gir: ");
        double vize2 = scanner.nextDouble();

        System.out.print("Final notunu gir: ");
        double finalNot = scanner.nextDouble();

        double sonuc = (vize1*0.3) + (vize2*0.3) + (finalNot*0.4);

        if(sonuc>=60){
            System.out.println(isim + " " + soyisim + " " + dersismi + " dersinden " + sonuc + " ortalamayla gecti.");
        }
        else {
            System.out.println(isim + " " + soyisim + " " + dersismi + " dersinden " + sonuc + " ortalamayla kaldi.");

        }





    }
}
