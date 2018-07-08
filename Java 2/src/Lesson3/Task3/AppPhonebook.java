package Lesson3.Task3;

import java.util.Random;

public class AppPhonebook {
    public static void main(String[] args) {
        Phonebook phonebook_big = fill("Большой телефонный справочник",50);
        Phonebook phonebook_small = fill("Малый телефонный справочник",10);

        Random random = new Random();
        String out_surname_phonebok = surnameByKey(random.nextInt(10));

        System.out.println(phonebook_big.get(out_surname_phonebok));


        System.out.println(phonebook_small.get(out_surname_phonebok));

    }




    /**
     * заполнение обект телефоная кника в количестве size элементов
     * @param size интересующий размер телефоной книги
     * @return Готова телефонная книга :)
     */
    public static Phonebook fill(String name,int size){
        Phonebook phonebook = new Phonebook(name);
        Random random = new Random();
        for (int i = 0; i < size ; i++) {
            phonebook.add(surnameByKey(random.nextInt(10)),randomPhone());
        }
        return phonebook;
    }

    /**
     * выводим фамилию в зависимости от введеного ключа(int)
     * @param key ключ к слову
     * @return выводим фамилию
     */
    public static String surnameByKey(int key){
        switch (key){
            case 0:return "Иванов";
            case 1:return "Смирнов";
            case 2:return "Кузнецов";
            case 3:return "Попов";
            case 4:return "Васильев";
            case 5:return "Петров";
            case 6:return "Соколов";
            case 7:return "Михайлов";
            case 8:return "Новиков";
            case 9:return "Федоров";
            default: return "";
        }
    }

    /**
     * случайно генерируем телефонный ноомер
     * @return телефонный номер +7 800 ХХХ ХХ ХХ
     */
    private static String randomPhone(){
        Random random = new Random();
        String out = "+7 800 ";
        out += (random.nextInt(900)+100) + " ";
        out += (random.nextInt(90)+10) + " ";
        out += (random.nextInt(90)+10) + " ";
        return out;
    }
}
