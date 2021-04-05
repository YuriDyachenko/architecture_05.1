package kurs.command;

public class Car {
    private final String name;
    private boolean moving;
    private long startTime;
    private long stopTime;

    public Car(String name) {
        this.name = name;
        moving = false;
    }

    public void startMoving() {
        if (moving) {
            System.out.printf("%s: тормоз, я и так уже давно (нс=%d) еду!\n",
                    name, System.nanoTime() - startTime);
            return;
        }
        System.out.printf("%s: начинаю движение...\n", name);
        moving = true;
        startTime = System.nanoTime();
    }

    public void stopMoving() {
        if (!moving) {
            System.out.printf("%s: тормоз, я и так уже давно (нс=%d) остановилась!\n",
                    name, System.nanoTime() - stopTime);
            return;
        }
        System.out.printf("%s: останавливаюсь...\n", name);
        moving = false;
        stopTime = System.nanoTime();
    }

    @Override
    public String toString() {
        return "{" + name +"}";
    }
}
