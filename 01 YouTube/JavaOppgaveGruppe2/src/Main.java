public class Main {
    public static void main(String[] args) {
        Verden verden = new Verden(5.0, true);

        Robot robot1 = new Robot("RobotA", 50.0, 3.0, "Standard");

        robot1.gaTilParken(verden);
        System.out.println("Batterinivå etter parkbesøk: " + robot1.getBatteriNiva() + "%");

        robot1.deltaPaDanseKlubb(verden);
        System.out.println("Batterinivå etter danseklubben: " + robot1.getBatteriNiva() + "%");
    }
}
