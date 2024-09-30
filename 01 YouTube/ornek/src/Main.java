// Main class to run the program (Programı çalıştırmak için ana sınıf)
public class Main {
    public static void main(String[] args) {
        // Creating a new Robot object (Yeni bir robot nesnesi yaratma)
        Robot robot1 = new Robot("Robot A", 60, 5.0, "Type 1");

        // Creating a new Verden object (Yeni bir Verden nesnesi yaratma)
        Verden verden = new Verden();

        // Checking the robot's state in the world (Robotun dünyadaki durumunu kontrol etme)
        verden.sjekkRobotTilstand(robot1);
    }
}
