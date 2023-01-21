package study.racingcar.domain;

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

    public int getPosition() {
        return this.position.getPosition();
    }
}
