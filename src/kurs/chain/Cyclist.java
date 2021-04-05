package kurs.chain;

public class Cyclist extends Participant {

    public Cyclist(int distance) {
        super(distance);
    }

    @Override
    public String getName() {
        return "Велосипедист";
    }
}
