package Lesson1.Task2;

public class Team {
    private Participant[] participants;


    public Team(Participant...participants){
        int l = participants.length;
        this.participants = new Participant[l];
        for (int i = 0; i < l; i++) {
            this.participants[i] = participants[i];
        }
    }

    public Participant[] getParticipants() {
        return participants;
    }

    public void showResults(){
        System.out.println("\nРезультаты команды");
        for (Participant p:participants) {
            p.info();
        }
    }
}
