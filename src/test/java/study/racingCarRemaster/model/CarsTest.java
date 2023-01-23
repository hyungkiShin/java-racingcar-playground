package study.racingCarRemaster.model;

import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

import java.util.Arrays;
import java.util.List;

import static org.assertj.core.api.Assertions.assertThat;

class CarsTest {

    @Test
    @DisplayName("자동차 생성 테스트")
    void createCarsTest() {
        // given
        final List<Car> cars1 = Arrays.asList(
                new Car("test1", 0),
                new Car("test2", 0),
                new Car("test3", 0)
        );

        // when & then
        assertThat(cars1)
                .isEqualTo(Arrays.asList(
                        new Car("test1", 0),
                        new Car("test2", 0),
                        new Car("test3", 0)
                        )
                );
    }
}
