public class Main {
    public static void main(String[] args) {
        System.out.println("Hello world!");

        class Robot {
            private String navn;
            private int batteriNivå;
            private double avstandTilParken;
            private String type;

            // Constructor (Yapıcı metot)
            public Robot(String navn, int batteriNivå, double avstandTilParken, String type) {
                this.navn = navn;
                this.batteriNivå = batteriNivå;
                this.avstandTilParken = avstandTilParken;
                this.type = type;
            }

            // Getter for navn (Adı almak için metot)
            public String getNavn() {
                return navn;
            }

            // Metod for checking if robot can go to park (Robotun parka gidip gidemeyeceğini kontrol eden metot)
            public boolean kanGåTilParken() {
                // Sjekk om roboten har nok batteri og er nær nok til å gå til parken
                return batteriNivå > 50 && avstandTilParken < 10;
            }
        }

        class Verden {
            // Constructor (Yapıcı metot)
            public Verden() {
            }

            // Method for checking robot state (Robotun durumunu kontrol eden metot)
            public void sjekkRobotTilstand(Robot robot) {
                if (robot.kanGåTilParken()) {
                    System.out.println(robot.getNavn() + " kan gå til parken!");
                } else {
                    System.out.println(robot.getNavn() + " har ikke nok batteri eller er for langt unna.");
                }
            }
        }



    }
}