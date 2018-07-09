package Lesson3.Task2;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Random;

public class AppTask2 {



    public static void main(String[] args) {
        String[] in = fill(20);

        System.out.println(Arrays.toString(in));


        System.out.println(quantityRepeat(in));

    }

    /**
     * создаем список из обектов NewString в котором храняться уникальное слово и количество повторов
     * @param in массив из строк(слов)
     * @return список из обектов NewString
     */
    private static ArrayList<NewString> quantityRepeat(String[] in){
        ArrayList<NewString> repeatsString = new ArrayList<>();

        for (int i = 0; i < in.length; i++) {
            String stringWork = in[i];
            int j;
            for (j = 0; j < repeatsString.size(); j++) {
                if (repeatsString.get(j).isStringData(stringWork)) break;
            }
            if (j == repeatsString.size()) repeatsString.add(new NewString(stringWork));
        }
        return repeatsString;
    }

    /**
     * заполнение массива строк, заполняес словами из метода StringByKey
     * @param size интересующий размер массива строк
     * @return готовый массив строк состояший из слов
     */
    public static String[] fill(int size){
        String[] s = new String[size];
        Random random = new Random();
        for (int i = 0; i < s.length ; i++) {
            s[i] = StringByKey(random.nextInt(10));
        }
        return s;
    }

    /**
     * выводим слова в зависимости от введеного ключа(int)
     * @param key ключ к слову
     * @return выводим слово
     */
    public static String StringByKey(int key){
        switch (key){
            case 0:return "Андромеда";
            case 1:return "Дракон";
            case 2:return "Орион";
            case 3:return "Эридан";
            case 4:return "Пегас";
            case 5:return "Кассиопея";
            case 6:return "Дельфин";
            case 7:return "Цефей";
            case 8:return "Геркулес";
            case 9:return "Феникс";
            default: return "";
        }
    }

}
