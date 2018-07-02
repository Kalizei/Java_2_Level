package Lesson1.Task2;

import Lesson1.Task2.AllObstacle.Cross;
import Lesson1.Task2.AllObstacle.Pool;
import Lesson1.Task2.AllObstacle.Wall;
import Lesson1.Task2.AllParticipant.Cat;
import Lesson1.Task2.AllParticipant.Dog;
import Lesson1.Task2.AllParticipant.Human;

public class Test2 {
    public static void main(String[] args) {
        Course c = new Course(new Cross(200),new Pool(10),new Wall(10));
        Team t = new Team(new Human("Вася"),new Dog("Рекс"),new Cat("Пушок"));
        c.doIt(t);
        t.showResults();
    }
}
