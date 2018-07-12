package sample;

import javafx.scene.control.Label;

public class MyLabel extends Label {

    public MyLabel(){
        this.setText("Ваш никнейм установлен на : " + Main.name);
    }
}
