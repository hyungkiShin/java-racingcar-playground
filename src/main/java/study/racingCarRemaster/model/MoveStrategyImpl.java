package study.racingCarRemaster.model;

import java.util.Random;

public class MoveStrategyImpl implements MoveStrategy {

    private static final int BOUND_NUMBER = 10;
    private static final int MOVE_STRATEGY_NUMBER = 4;

    @Override
    public boolean isMove() {
        return getRandomNumber() >= MOVE_STRATEGY_NUMBER;
    }

    private int getRandomNumber() {
        Random random = new Random();
        return random.nextInt(BOUND_NUMBER);
    }
}
