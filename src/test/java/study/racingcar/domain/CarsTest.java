package study.racingcar.domain;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

import java.util.Arrays;
import java.util.List;

import static org.assertj.core.api.Assertions.assertThat;

public class CarsTest {

    Car car;
    Car car2;
    Car car3;

    @BeforeEach
    void setup() {
        car = new Car("일등차");
        car.move(() -> true);
        car.move(() -> true);
        car.move(() -> true);

        car2 = new Car("이등차");
        car2.move(() -> true);
        car2.move(() -> true);

        car3 = new Car("공동이등차");
        car3.move(() -> true);
        car3.move(() -> true);
    }

    @Test
    @DisplayName("자동차 우승자 테스트")
    void carWinnerTest() {
        // given
        List<Car> settingCars = Arrays.asList(car, car2, car3);
        Cars cars = new Cars(settingCars);
        // when & then
        assertThat(cars.findWinners()).containsExactly(car);
    }
}
