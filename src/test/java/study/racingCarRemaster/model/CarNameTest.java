package study.racingCarRemaster.model;

import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

import static org.assertj.core.api.Assertions.assertThat;
import static org.assertj.core.api.Assertions.assertThatThrownBy;

class CarNameTest {

    @Test
    @DisplayName("자동차 이름은 5글자를 넘을 수 없다.")
    void nameValidTest() {
        // given & when & then
        assertThatThrownBy(() -> new CarName("123456"))
                .isInstanceOf(IllegalArgumentException.class)
                .hasMessage("자동차의 이름은 5글자를 넘을 수 없습니다.");
    }

    @Test
    @DisplayName("자동차는 이름을 갖는다")
    void carNameTest() {
        // given
        String name = "형기차";
        final CarName carName = new CarName(name);
        // when & then
        assertThat(carName)
                .isEqualTo(new CarName(name));
    }

}
