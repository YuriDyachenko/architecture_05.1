package kurs.command;

public class CommandExample {
    public void run() {
        System.out.println("---------- Command ----------");
        Car car = new Car("Красная машинка");
        System.out.println(car);
        StartMovingCar startCommand = new StartMovingCar(car);
        StopMovingCar stopCommand = new StopMovingCar(car);
        startCommand.run();
        startCommand.run();
        stopCommand.run();
        stopCommand.run();
    }
}
