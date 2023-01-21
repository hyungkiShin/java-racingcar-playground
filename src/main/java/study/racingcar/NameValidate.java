package study.racingcar;

public class NameValidate {

    private static final String DELIMITER = ",";

    public static String[] InputValidate(String input) {

        final String[] parseItem = input.split(DELIMITER);
        for (String item : parseItem) {
            if (item.length() > 5) {
                throw new IllegalArgumentException("자동차의 이름은 5글자가 넘을 수 없습니다.");
            }
        }

        return parseItem;
    }
}
