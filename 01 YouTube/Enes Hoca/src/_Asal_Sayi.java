public class _Asal_Sayi {
    public static void main(String[] args) {

        System.out.println(2);
        System.out.println(3);
        System.out.println(5);
        System.out.println(7);
        for (int i = 2; i < 101; i++) {
            if (i % 2 != 0 && i % 3 != 0 && i % 5 != 0 && i % 7 != 0) {
                System.out.println(i);
            }

        }


    }
}
