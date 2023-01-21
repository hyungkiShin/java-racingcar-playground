package study.racingcar;

import org.junit.jupiter.api.Test;

import static org.assertj.core.api.Assertions.assertThat;

class CarTest {

    @Test
    void 이동() {
        // given
        Car car = new Car("pobi");

        // when
        car.move(4);
        // then
        assertThat(car.getPosition()).isEqualTo(1);
    }

    @Test
    void 정지() {
        // given
        Car car = new Car("pobi");
        // when
        car.move(3);
        // then
        assertThat(car.getPosition()).isZero();
    }

}
