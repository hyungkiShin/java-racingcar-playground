package study.racingcar.domain;

public class Validate {

    public static String nameValidate(String input) {

        if (input.length() > 5) {
            throw new IllegalArgumentException("자동차의 이름은 5글자가 넘을 수 없습니다.");
        }

        return input;
    }
}
