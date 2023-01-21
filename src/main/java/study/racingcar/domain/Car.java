package study.racingcar.domain;

import java.util.Objects;

public class Car {

    private Name name;
    private Position position;

    public Car(final String name) {
        this.name = new Name(name);
        this.position = new Position(0);
    }

    public void move(MoveStrategy moveStrategy) {
        if (moveStrategy.isMove()) {
            this.position.move();
        }
    }

    public Position getPosition() {
        return this.position;
    }


    public Position getMaxPosition(final Position maxPosition) {
        if (position.lessThan(maxPosition)) {
            return maxPosition;
        }
        return this.position;
    }

    public boolean isWinner(Position maxPosition) {
        return position.isSame(maxPosition);
    }

    @Override
    public boolean equals(final Object o) {
        if (this == o) return true;
        if (!(o instanceof Car)) return false;
        final Car car = (Car) o;
        return Objects.equals(name, car.name) && Objects.equals(getPosition(), car.getPosition());
    }

    @Override
    public int hashCode() {
        return Objects.hash(name, getPosition());
    }
}
