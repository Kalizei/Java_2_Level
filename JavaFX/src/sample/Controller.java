package sample;

import javafx.fxml.FXML;
import javafx.fxml.FXMLLoader;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.scene.control.Label;
import javafx.scene.control.TextArea;
import javafx.scene.control.TextField;
import javafx.stage.Stage;
import java.io.IOException;

public class Controller {

    @FXML
    TextArea textArea;

    @FXML
    MyTextField textField;

    @FXML
    MyLabel textLabel;


    @FXML
    TextField textField2;

    @FXML void textLabel(){

    }


    public void sendMsg(){
        textArea.appendText(Main.name+": "+textField.getText() + "\n");
        textField.clear();
        textField.requestFocus();
        textField.setPromptText(Main.name + ": введите текст");
    }

    Stage newWindow;


    public void openSettings(){

        try {

            Parent openSettings = FXMLLoader.load(getClass().getResource("openSettings.fxml"));

            Scene secondScene = new Scene(openSettings);

            newWindow = new Stage();
            newWindow.setTitle("Settings");
            newWindow.setScene(secondScene);
            newWindow.setX(Main.primaryStage.getX() + 200);
            newWindow.setY(Main.primaryStage.getY() + 100);

            newWindow.show();


            //
        } catch (IOException e) {
            e.printStackTrace();
        }
    }



    public void reName(){
        Main.name = textField2.getText();
        textLabel.setText("Ваш никнейм установлен на : " + Main.name);

    }

    public void exit(){
        Main.primaryStage.close();
    }

}
