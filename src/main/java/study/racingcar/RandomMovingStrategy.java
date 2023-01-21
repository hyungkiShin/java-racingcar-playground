package study.racingcar;

import java.util.Random;

public class RandomMovingStrategy implements MoveStrategy {

    private static final int MAX_BOUND = 10;
    private static final int FORWARD_NUMBER = 4;

    @Override
    public boolean isMove() {
        return getRandomNumber() >= FORWARD_NUMBER;
    }

    private int getRandomNumber() {
        Random random = new Random();
        return random.nextInt(MAX_BOUND);
    }
}
