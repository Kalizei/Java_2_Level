package Lesson1.Task2;

public class Course {
    Obstacle[] obstacle;
    public Course(Obstacle...obstacle){
        int l = obstacle.length;
        this.obstacle = new Obstacle[l];
        for (int i = 0; i < l; i++) {
            this.obstacle[i] = obstacle[i];
        }
    }

    public void doIt(Team team){
        Participant[] participants = team.getParticipants();
        for (Participant p: participants) {
            for (Obstacle o: obstacle){
                if (p.onDistance) o.doIt(p);
            }
        }
    }
}
