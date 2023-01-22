package study.racingCarRemaster.model;

public class Car {

    private String name;
    private int location;

    public Car(final String name, final int location) {
        this.name = name;
        this.location = location;
    }

    public int getLocation() {
        return location;
    }

    public void move(final MoveStrategy moveStrategy) {
        if (moveStrategy.isMove()) {
            this.location += 1;
        }
    }
}
