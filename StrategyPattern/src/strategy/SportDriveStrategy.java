package strategy;

public class SportDriveStrategy implements DriveStrategy{
    @Override
    public void drive() {
        System.out.println("Sports Strategy");
    }
}
