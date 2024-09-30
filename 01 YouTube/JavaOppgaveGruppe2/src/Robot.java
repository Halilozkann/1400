public class Robot {
    private String navn;
    private double batteriNiva;
    private double avstandTilPark;
    private String type;

    public Robot(String navn, double batteriNiva, double avstandTilPark, String type) {
        this.navn = navn;
        this.batteriNiva = batteriNiva;
        this.avstandTilPark = avstandTilPark;
        this.type = type;
    }

    public void gaTilParken(Verden verden) {
        if (batteriNiva >= 20 && avstandTilPark <= verden.getParkAvstand()) {
            System.out.println(navn + " går til parken.");
            batteriNiva -= 20;
        } else {
            System.out.println(navn + " har ikke nok batteri eller er for langt unna parken.");
        }
    }

    public void deltaPaDanseKlubb(Verden verden) {
        if (verden.isDansKlubbApen() && batteriNiva >= 10) {
            System.out.println(navn + " deltar på danseklubben.");
            batteriNiva -= 10;
        } else {
            System.out.println(navn + " kan ikke delta på danseklubben (klubben er stengt eller batteri er for lavt).");
        }
    }

    public double getBatteriNiva() {
        return batteriNiva;
    }
}
