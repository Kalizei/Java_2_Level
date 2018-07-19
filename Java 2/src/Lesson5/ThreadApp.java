package Lesson5;

public class ThreadApp {

    static final int SIZE = 10000000;


    public static void main(String[] args) {
        //go(1);
        System.out.println("Время работы в 128 потоках        : "+ new MyThreads(SIZE,128).goWork() +" мс");
        System.out.println("Время работы в 64 потоках         : "+ new MyThreads(SIZE,64).goWork() +" мс");
        System.out.println("Время работы в 32 потоках         : "+ new MyThreads(SIZE,32).goWork() +" мс");
        System.out.println("Время работы в 16 потоках         : "+ new MyThreads(SIZE,16).goWork() +" мс");
        System.out.println("Время работы в восемь потоках     : "+ new MyThreads(SIZE,8).goWork() +" мс");
        System.out.println("Время работы в семь потоках       : "+ new MyThreads(SIZE,7).goWork() +" мс");
        System.out.println("Время работы в шесть потоках      : "+ new MyThreads(SIZE,6).goWork() +" мс");
        System.out.println("Время работы в пять потоках       : "+ new MyThreads(SIZE,5).goWork() +" мс");
        System.out.println("Время работы в четыре потока      : "+ new MyThreads(SIZE,4).goWork() +" мс");
        System.out.println("Время работы в три потока         : "+ new MyThreads(SIZE,3).goWork() +" мс");
        System.out.println("Время работы в два потока         : "+ new MyThreads(SIZE,2).goWork() +" мс");
        System.out.println("Время работы в один поток         : "+ new MyThreads(SIZE,1).goWork() +" мс");

    }

    public static void go(int number){
        //1) Создают одномерный длинный массив
        float[] arr = new float[SIZE];

        if (number == 1) {
            //2) Заполняют этот массив единицами
            for (int i = 0; i < SIZE; i++) {
                arr[i] = 1;
            }

            //3) Засекают время выполнения: long a = System.currentTimeMillis();
            long a = System.currentTimeMillis();

            //4) Проходят по всему массиву и для каждой ячейки считают новое значение по формуле:
            for (int i = 0; i < SIZE; i++) {
                arr[i] = (float)(arr[i] * Math.sin(0.2f + i / 5) * Math.cos(0.2f + i / 5) * Math.cos(0.4f + i / 2));
            }

            //5) Проверяется время окончания метода System.currentTimeMillis();
            long b = System.currentTimeMillis();

            //6) В консоль выводится время работы:
            System.out.println(b - a + " мс");
        }



    }

}
