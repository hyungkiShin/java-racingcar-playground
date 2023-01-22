package study.racingCarRemaster.model;

public class Car {

    private CarName name;
    private Location location;

    public Car(final String name, final int location) {
        this.name = new CarName(name);
        this.location = new Location(location);
    }

    public int getLocation() {
        return location.getLocation();
    }

    public void move(final MoveStrategy moveStrategy) {
        if (moveStrategy.isMove()) {
            this.location.move();
        }
    }
}
