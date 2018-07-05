package Lesson2.Task2;

public class Test {
    public static void main(String[] args) {
        System.out.println(amountOfTime(Week.THURSDAY));
    }

    private static int amountOfTime(Week current){
        int sum = 0;
        Week week = current;
        while (!week.dayOff){
            sum += week.workTime;
            week = Week.valueOf(week.nextDay) ;
        }
        return sum;
    }
}
