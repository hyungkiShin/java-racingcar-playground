package study.racingcar;

import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

import static org.assertj.core.api.Assertions.assertThat;
import static org.assertj.core.api.Assertions.assertThatThrownBy;

class ValidateTest {

    @Test
    @DisplayName("자동차이름을 입력받아 parsing 한뒤 String 배열에 담는다.")
    void inputParseTest() {
        // given
        String input = "pobi";
        // when
        final String invalidString = Validate.nameValidate(input);
        // then
        assertThat(invalidString).hasSize(4);
    }

    @Test
    @DisplayName("자동차 이름은 5자를 초과할 수 없다.")
    void inputParseValidateTest() {
        // given
        String input = "pobi,crong,123456";
        // when & then
        assertThatThrownBy(() -> Validate.nameValidate(input))
                .isInstanceOf(IllegalArgumentException.class)
                .hasMessage("자동차의 이름은 5글자가 넘을 수 없습니다.");
    }

}
