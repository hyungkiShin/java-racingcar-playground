package study.racingcar;

public class Car {

    private final String name;
    private int position = 0;

    public Car(final String name) {
        this.name = nameValidate(name);
    }

    public void move(MoveStrategy moveStrategy) {
        if (moveStrategy.isMove()) {
            this.position += 1;
        }
    }

    public int getPosition() {
        return this.position;
    }

    private String nameValidate(String input) {

        if (input.length() > 5) {
            throw new IllegalArgumentException("자동차의 이름은 5글자가 넘을 수 없습니다.");
        }

        return input;
    }
}
