package study.racingCarRemaster.model;

import org.junit.jupiter.api.Test;

import static org.assertj.core.api.Assertions.assertThat;
import static org.assertj.core.api.Assertions.assertThatThrownBy;

class LocationTest {

    @Test
    void carLocationTest() {
        // given & when
        Location location = new Location(3);

        // then
        assertThat(location)
                .isEqualTo(new Location(3));
    }
}
