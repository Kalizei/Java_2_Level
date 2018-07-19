package Lesson5;

public class MyThreads {
    int size;
    int count_thread;

    public MyThreads(int size, int count_thread) {
        this.size = size;
        this.count_thread = count_thread;
    }

    public long goWork(){
        long begin_work_time = System.currentTimeMillis();

        MyThread[] threads = new MyThread[count_thread];
        WorkArray array = new WorkArray(size,count_thread);
        for (int i = 0; i < count_thread; i++) {
            threads[i] = new MyThread(i,array);
        }
        for (int i = 0; i < count_thread; i++) {
            threads[i].start();
        }

        for (int i = 0; i < count_thread; i++) {
            try {
                threads[i].join();
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        }


        long end_work_time = System.currentTimeMillis();

        return end_work_time - begin_work_time;
    }


}
