import strategy.DriveStrategy;
import strategy.SportDriveStrategy;

public class SportsVehicle extends Vehicle{
    public SportsVehicle() {
        super(new SportDriveStrategy());
    }
}
