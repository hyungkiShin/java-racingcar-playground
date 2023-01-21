package study.racingcar;

public class Name {
    private final static int MAX_NAME_LENGTH = 5;

    private String name;

    public Name(final String name) {
        this.nameValidate(name);
        this.name = name;
    }

    private void nameValidate(String input) {
        if (input.isEmpty()) {
            throw new IllegalArgumentException("자동차의 이름은 값이 존재 해야 됩니다.");
        }
        if (input.length() > MAX_NAME_LENGTH) {
            throw new IllegalArgumentException("자동차의 이름은 5글자가 넘을 수 없습니다.");
        }
    }

    public String getName() {
        return name;
    }
}
