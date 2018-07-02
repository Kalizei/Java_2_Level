package Lesson1.Task2.AllObstacle;

import Lesson1.Task2.Competitor;
import Lesson1.Task2.Obstacle;

final public class Wall extends Obstacle {
    int height_wall;

    public Wall(int height_wall) {
        this.height_wall = height_wall;
    }

    @Override
    public void doIt(Competitor competitor) {
        competitor.jump(this.height_wall);
    }
}
