package study.racingCarRemaster.model;

import java.util.Objects;

public class CarName {

    private String name;

    public CarName(final String name) {
        validateName(name);
        this.name = name;
    }

    private void validateName(String name) {
        if (name.length() >= 6) {
            throw new IllegalArgumentException("자동차의 이름은 5글자를 넘을 수 없습니다.");
        }
    }

    @Override
    public boolean equals(final Object o) {
        if (this == o) return true;
        if (!(o instanceof CarName)) return false;
        final CarName carName = (CarName) o;
        return Objects.equals(name, carName.name);
    }

    @Override
    public int hashCode() {
        return Objects.hash(name);
    }
}
