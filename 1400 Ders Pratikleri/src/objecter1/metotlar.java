package objecter1;

import javax.xml.transform.Source;
import java.util.Scanner;

public class metotlar {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("--Hesap Kitap Yapma--");

        System.out.println("a sayisini giriniz: ");
        double a = scanner.nextDouble();

        System.out.println("b sayisini giriniz: ");
        double b = scanner.nextDouble();

        scanner.nextLine();

        System.out.println("Yapilacak islemi giriniz T:toplam F:fark C:carpma B:bolme");
        String islemTuru = scanner.nextLine();

        System.out.println("Sonuc: " + sayi(a, b, islemTuru));

    }

    public static double sayi(double a, double b, String islemTuru) {
        if (islemTuru.equals("T")) {
            return a + b;
        } else if (islemTuru.equals("F")) {
            if (a - b > 0) {
                return a - b;
            } else {
                return b - a;
            }
        }
        else if(islemTuru.equals("C")){
            return a*b;
        }
        else if (islemTuru.equals("B")){
            return a/b;
        }
        else {
            return 0;
        }

    }


}
