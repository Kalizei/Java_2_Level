package Lesson1.Task2.AllParticipant;

import Lesson1.Task2.Participant;

final public class Dog extends Participant {
    public Dog(String name) {
    this.name = name;
        this.type = "Пес";
        this.maxJumpHeight = 2;
        this.maxRanDist = 2000;
        this.maxSwimDist = 50;
    }
}
