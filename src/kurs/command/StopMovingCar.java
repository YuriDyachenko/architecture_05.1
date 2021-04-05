package kurs.command;

public class StopMovingCar implements Command {
    private final Car car;

    public StopMovingCar(Car car) {
        this.car = car;
    }

    @Override
    public void run() {
        car.stopMoving();
    }
}
