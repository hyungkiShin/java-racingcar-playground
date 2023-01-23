package study.racingCarRemaster.model;

import java.util.Objects;

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

    @Override
    public boolean equals(final Object o) {
        if (this == o) return true;
        if (!(o instanceof Car)) return false;
        final Car car = (Car) o;
        return Objects.equals(name, car.name) && Objects.equals(getLocation(), car.getLocation());
    }

    @Override
    public int hashCode() {
        return Objects.hash(name, getLocation());
    }
}
