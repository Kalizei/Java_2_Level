package Lesson1.Task2;



abstract public class Participant implements Competitor {

    protected String type;
    protected String name;
    protected int maxRanDist;
    protected int maxJumpHeight;
    protected int maxSwimDist;
    protected boolean onDistance = true;



    @Override
    public void run(int dist) {
        if (dist<=maxRanDist) {
            System.out.println(type+" "+name+" справился с бегом");
        } else {
            System.out.println(type+" "+name+" не добежал");
            onDistance = false;
        }
    }

    @Override
    public void swim(int dist) {
        if (dist<=maxSwimDist) {
            System.out.println(type+" "+name+" справился с плаванием");
        } else {
            System.out.println(type+" "+name+" недоплыл :)");
            onDistance = false;
        }
    }

    @Override
    public void jump(int height) {
        if (height<=maxJumpHeight) {
            System.out.println(type+" "+name+" справился с высотой");
        } else {
            System.out.println(type+" "+name+" не может перепрыгнуть");
            onDistance = false;
        }
    }

    @Override
    public void info() {
        if (onDistance) System.out.println(type+" "+name+" на полосе препятсвий");
        else System.out.println(type+" "+name+" выбыл из полосы препятствий");
    }

    @Override
    public boolean isOnDistance() {
        return false;
    }
}
