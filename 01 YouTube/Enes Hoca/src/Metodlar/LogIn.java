package Metodlar;

import java.util.Scanner;

public class LogIn {

    static boolean aktif = true;
    static int hakSayisi = 3;

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Kullanıcının giriş yapma hakkı olduğu sürece devam et
        while (aktif && hakSayisi > 0) {
            System.out.println("Kullanici Adiniz: ");
            String username = scanner.nextLine();

            System.out.println("Sifreniz: ");
            String password = scanner.nextLine();

            boolean sonuc = login(username, password);
            if (sonuc) {
                System.out.println("Giris Basarili.");
                break; // Giriş başarılı ise döngüden çık
            } else {
                hakSayisi--; // Hakkı bir azalt
                if (hakSayisi == 0) {
                    aktif = false; // Hak sayısı doldu
                }
                System.out.println("Kullanici adi veya sifre yanlis! Kalan hak: " + hakSayisi);
            }
        }

        // Giriş hakkı dolduğunda
        if (!aktif) {
            System.out.println("Hak Sayiniz Doldu, hesap bloke oldu!");
        }

        // Scanner nesnesini kapat
        scanner.close();
    }

    public static boolean login(String username, String password) {
        // Doğru kullanıcı adı ve şifre kontrolü
        return username.equals("enes") && password.equals("123");
    }
}
