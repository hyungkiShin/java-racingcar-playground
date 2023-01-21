package study.racingcar.domain;

import java.util.Objects;

public class Position {

    private int locate;

    public Position() {
        this.locate = 0;
    }

    public Position(int locate) {
        if (locate < 0) {
            throw new IllegalArgumentException();
        }
        this.locate = locate;
    }

    public int getLocate() {
        return this.locate;
    }

    @Override
    public boolean equals(final Object o) {
        if (this == o) return true;
        if (!(o instanceof Position)) return false;
        final Position position1 = (Position) o;
        return getLocate() == position1.getLocate();
    }

    @Override
    public int hashCode() {
        return Objects.hash(getLocate());
    }

    public void move() {
        this.locate += 1;
    }

    public boolean isSame(Position maxPosition) {
        return this.locate == maxPosition.getLocate();
    }

    public boolean lessThan(final Position maxPosition) {
        return this.locate < maxPosition.locate;
    }
}
