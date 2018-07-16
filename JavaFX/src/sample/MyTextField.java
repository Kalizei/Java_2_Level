package sample;

import javafx.scene.control.TextField;

public class MyTextField extends TextField {

    public MyTextField(){
        this.setPromptText(Main.name + ": введите текст");
    }
}
