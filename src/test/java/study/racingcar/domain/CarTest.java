package study.racingcar.domain;

import org.junit.jupiter.api.Test;

import static org.assertj.core.api.Assertions.assertThat;

class CarTest {

    @Test
    void 이동() {
        // given
        Car car = new Car("람보르기니");
        // when
        car.move(() -> true);
        // then
        assertThat(car.getPosition().getLocate()).isEqualTo(1);
    }

    @Test
    void 정지() {
        // given
        Car car = new Car("터보3");
        // when
        car.move(() -> false);
        // then
        assertThat(car.getPosition().getLocate()).isZero();
    }

}
