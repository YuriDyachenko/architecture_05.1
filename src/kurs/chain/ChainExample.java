package kurs.chain;

public class ChainExample {
    public void run() {
        System.out.println("---------- Chain of Responsibility ----------");
        Runner runner = new Runner(100);
        System.out.println(runner);
        Cyclist cyclist = new Cyclist(500);
        System.out.println(cyclist);
        Driver driver = new Driver(10000);
        System.out.println(driver);
        runner.link(cyclist).link(driver);
        System.out.println(" runner.take(80)");
        runner.take(80);
        System.out.println(" runner.take(300)");
        runner.take(300);
        System.out.println(" runner.take(5000)");
        runner.take(5000);
        System.out.println(" runner.take(15000)");
        runner.take(15000);
    }
}
