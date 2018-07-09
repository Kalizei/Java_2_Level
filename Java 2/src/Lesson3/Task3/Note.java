package Lesson3.Task3;

public class Note {
    String surname;
    String phone_number;

    public Note(String surname, String phone_number) {
        this.surname = surname;
        this.phone_number = phone_number;
    }

    public String getPhoneNumber() {
        return phone_number;
    }

    public boolean isSurname(String surname) {
        return this.surname.equals(surname);
    }
}
