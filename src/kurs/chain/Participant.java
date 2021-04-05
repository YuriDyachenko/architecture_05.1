package kurs.chain;

public abstract class Participant {
    private Participant nextParticipant;
    private final int distance;

    public Participant(int distance) {
        this.distance = distance;
        nextParticipant = null;
    }

    int getDistance() {
        return distance;
    }

    public abstract String getName();

    public Participant link(Participant participant) {
        nextParticipant = participant;
        return nextParticipant;
    }

    public boolean take(int distance) {
        if (canTake(distance)) {
            System.out.printf("  Я - %s - преодолеваю расстояние %d (могу %d)\n", this,
                    distance, getDistance());
            return true;
        } else {
            return takeNext(distance);
        }
    }

    private boolean takeNext(int distance) {
        if (nextParticipant == null) {
            System.out.printf("  Я - %s - не могу преодолеть расстояние %d (могу только %d)\n",
                    this, distance, getDistance());
            System.out.printf("  Никто из участников не смог преодолеть расстояние %d\n", distance);
            return true;
        }
        System.out.printf("  Я - %s - не могу преодолеть расстояние %d (могу только %d), передаю: %s\n",
                this, distance, getDistance(), nextParticipant);
        return nextParticipant.take(distance);
    }

    private boolean canTake(int distance) {
        return this.distance >= distance;
    }

    @Override
    public String toString() {
        return "{" + getName() + " " + distance + "}";
    }
}
