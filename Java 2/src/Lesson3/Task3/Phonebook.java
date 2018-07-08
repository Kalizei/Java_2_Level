package Lesson3.Task3;

//2. Написать простой класс ТелефонныйСправочник, который хранит в себе список фамилий и телефонных номеров.
// В этот телефонный справочник с помощью метода add() можно добавлять записи.
// С помощью метода get() искать номер телефона по фамилии.
// Следует учесть, что под одной фамилией может быть несколько телефонов (в случае однофамильцев),
// тогда при запросе такой фамилии должны выводиться все телефоны.

import java.util.ArrayList;

public class Phonebook {
    ArrayList<Note> notes;
    String namebook;

    public Phonebook(String namebook) {
        this.namebook = namebook;
        notes = new ArrayList<>();
    }

    public void add(String surname,String phone_number){
        Note newNote = new Note(surname,phone_number);
        notes.add(newNote);
    }

    public String get(String surname){
        String out = "В книге '"+namebook+"'\n"+surname+"\n";
        int sum = 0;
        for (int i = 0; i < notes.size(); i++) {
            if (notes.get(i).isSurname(surname)) {
                out += notes.get(i).getPhoneNumber()+"\n";
                sum++;
            }
        }
        if (sum == 0) out += "фамилия не найдена\n";
        return out;

    }
}
