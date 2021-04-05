package kurs.chain;

public class Driver extends Participant {

    public Driver(int distance) {
        super(distance);
    }

    @Override
    public String getName() {
        return "Водитель";
    }
}
