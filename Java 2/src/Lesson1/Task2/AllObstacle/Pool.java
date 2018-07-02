package Lesson1.Task2.AllObstacle;

import Lesson1.Task2.Competitor;
import Lesson1.Task2.Obstacle;

final public class Pool extends Obstacle {
    protected int lenght_pool;

    public Pool(int lenght_pool) {
        this.lenght_pool = lenght_pool;
    }

    @Override
    public void doIt(Competitor competitor) {
        competitor.swim(lenght_pool);
    }
}
