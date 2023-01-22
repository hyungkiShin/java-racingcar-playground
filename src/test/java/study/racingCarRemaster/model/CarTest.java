package study.racingCarRemaster.model;

import org.junit.jupiter.api.Test;

import static org.assertj.core.api.Assertions.assertThat;

class CarTest {

    @Test
    void 자동차_이동_테스트() {
        // given
        Car car = new Car("자동차 이름", 0);
        // when
        car.move();
        // then
        assertThat(car.getLocation()).isEqualTo(1);
    }
}
