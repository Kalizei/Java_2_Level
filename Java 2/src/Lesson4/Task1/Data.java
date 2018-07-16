package Lesson4.Task1;

public class Data {


    private String data1, data2, data3;
    private boolean visible;
    private String error;


    public Data() {
        visible = false;
    }

    public String getError(){
        return error;
    }

    public void setSurname(String surname){
        data1 = surname;
    }

    public void setName(String name){
        data2 = name;
    }

    public void setSecondName(String second_name){
        data3 = second_name;
    }

    public String getSurname(){
        return data1;
    }

    public String getName(){
        return data2;
    }

    public String getSecondname(){
        return data3;
    }

    public void setVisible(boolean visible){
        this.visible = visible;
    }

    public boolean isVisible(){
        return visible;
    }

    public boolean isReady(){
        boolean check1 = !data1.equals("");
        if (!check1) error = "не заполнена Фамилия";
        boolean check2 = !data2.equals("");
        if (!check2) error = "не заполнена Имя";
        boolean check3 = !data3.equals("");
        if (!check3) error = "не заполнена Отчество";
        boolean check = check1 && check2 && check3;
        return check;
    }
}
