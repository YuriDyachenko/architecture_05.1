package kurs.chain;

public class Runner extends Participant {

    public Runner(int distance) {
        super(distance);
    }

    @Override
    public String getName() {
        return "Бегун";
    }
}
