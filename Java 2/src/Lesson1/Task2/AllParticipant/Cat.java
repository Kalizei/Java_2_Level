package Lesson1.Task2.AllParticipant;

import Lesson1.Task2.Participant;

final public class Cat extends Participant {
    public Cat(String name) {
        this.name = name;
        this.type = "Кот";
        this.maxJumpHeight = 5;
        this.maxRanDist = 500;
        this.maxSwimDist = 0;
    }
}
