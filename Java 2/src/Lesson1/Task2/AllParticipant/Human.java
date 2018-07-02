package Lesson1.Task2.AllParticipant;


import Lesson1.Task2.Participant;

final public class Human extends Participant {
    public Human(String name) {
        this.name = name;
        this.type = "Человек";
        this.maxJumpHeight = 10;
        this.maxRanDist = 1000;
        this.maxSwimDist = 100;
    }
}
