package kurs.command;

public class StartMovingCar implements Command{
    private final Car car;

    public StartMovingCar(Car car) {
        this.car = car;
    }

    @Override
    public void run() {
        car.startMoving();
    }
}
