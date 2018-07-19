package Lesson5;

public class MyThread extends Thread {
    int number_thread;//порядковый номер

    WorkArray array;

    public MyThread(int number_thread, WorkArray array) {
        this.number_thread = number_thread;
        this.array = array;


    }

    @Override
    public void run(){

        // синхронизация не требуеться, как каждый поток будет выполнять свою область массива и не пересекаться с другими потоками
        for (int i = number_thread; i < array.getSizeArray(); i = i + array.getCountThread()) {
            float formula = (float)(array.getElement(i) * Math.sin(0.2f + i / 5) * Math.cos(0.2f + i / 5) * Math.cos(0.4f + i / 2));
            array.setElement(i,formula);

        }


    }
}
