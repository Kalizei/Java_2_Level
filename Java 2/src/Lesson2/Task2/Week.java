package Lesson2.Task2;

public enum Week {
    MONDAY("Понедельник","TUESDAY"),
    TUESDAY("Вторник","WEDNESDAY"),
    WEDNESDAY("Среда","THURSDAY"),
    THURSDAY("Четверг","FRIDAY"),
    FRIDAY("Пятница","SATURDAY"),
    SATURDAY("Суббота","SUNDAY",true),
    SUNDAY("Воскресение","MONDAY",true);

    String rusName;
    String nextDay;
    Boolean dayOff = false;
    int workTime = 8;


    Week(String rusName, String nextDay) {
        this.rusName = rusName;
        this.nextDay = nextDay;
    }

    Week(String rusName, String nextDay, boolean dayOff) {
        this.rusName = rusName;
        this.nextDay = nextDay;
        this.dayOff = dayOff;
    }
}
