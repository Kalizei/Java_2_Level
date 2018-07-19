package Lesson6.Client;


import javafx.fxml.FXML;
import javafx.fxml.FXMLLoader;
import javafx.fxml.Initializable;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.scene.control.TextArea;
import javafx.scene.control.TextField;
import javafx.stage.Stage;

import java.io.DataInputStream;
import java.io.DataOutputStream;
import java.io.IOException;
import java.io.PrintWriter;
import java.net.Socket;
import java.net.URL;
import java.util.ResourceBundle;
import java.util.Scanner;

public class Controller {

    @FXML
    TextArea textArea;

    @FXML
    TextField textField;

    @FXML
    Label textLabel;


    @FXML
    TextField textField2;

    @FXML
    Button btn1;

    public void sendMsg(){
            out.println(Main.name + ": " + textField.getText());
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

    Socket socket;
    //DataInputStream in;
    //DataOutputStream out;
    Scanner in;
    PrintWriter out;

    final String IP_ADRESS = "localhost";
    final int PORT = 12236;


    public void connection() {
        textArea.setVisible(true);
        textField.setVisible(true);
        btn1.setVisible(true);
        try {
            socket = new Socket(IP_ADRESS,PORT);
            in = new Scanner(socket.getInputStream());
            out = new PrintWriter(socket.getOutputStream(),true);

            Thread t1 = new Thread(new Runnable() {
                @Override
                public void run() {
                    while (true) {
                        String str = in.nextLine();
                        if (str.equals("/serverClosed")) break;
                        textArea.appendText(str + "\n");
                    }
                    try {
                        socket.close();
                    } catch (IOException e) {
                        e.printStackTrace();
                    }
                }
            });
            t1.setDaemon(true);
            t1.start();
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}
