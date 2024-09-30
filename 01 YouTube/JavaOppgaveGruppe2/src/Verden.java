public class Verden {
    private double parkAvstand;
    private boolean dansKlubbApen;

    public Verden(double parkAvstand, boolean dansKlubbApen) {
        this.parkAvstand = parkAvstand;
        this.dansKlubbApen = dansKlubbApen;
    }

    public double getParkAvstand() {
        return parkAvstand;
    }

    public boolean isDansKlubbApen() {
        return dansKlubbApen;
    }
}
