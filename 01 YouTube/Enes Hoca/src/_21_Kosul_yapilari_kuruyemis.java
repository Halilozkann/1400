public class _21_Kosul_yapilari_kuruyemis {
    public static void main(String[] args) {

        double leblebi = 3.5;
        double findik = 15.7;
        double badem = 22;

        double maliyetTutar = (leblebi*12) + (findik*25) + (badem*40);
        double satisTutar = ((leblebi*1.5)*12) + ((findik*1.4)*25) + ((badem*1.6)*40);

        double karTutar = satisTutar - maliyetTutar;

        if (karTutar>500){
            System.out.println("kira paran cikti!");
        }
        else {
            System.out.println("Kira paran cikmadi.");
        }

        System.out.println("Maliyet tutar: " + maliyetTutar);
        System.out.println("Satis Tutar " + satisTutar);
        System.out.println("Kazanc Tutar" + karTutar);

    }
}
