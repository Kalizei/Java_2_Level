package Lesson1.Task2.AllObstacle;

import Lesson1.Task2.Competitor;
import Lesson1.Task2.Obstacle;

final public class Cross extends Obstacle {
    protected int lenght_cross;

    public Cross(int lenght_cross) {
        this.lenght_cross = lenght_cross;
    }

    @Override
    public void doIt(Competitor competitor) {
        competitor.run(lenght_cross);
    }
}
