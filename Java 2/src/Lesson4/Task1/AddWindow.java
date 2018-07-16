package Lesson4.Task1;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.WindowAdapter;
import java.awt.event.WindowEvent;

public class AddWindow extends JFrame{
    JTextArea text1,text2,text3,log_text;
    JTextField text_in1,text_in2,text_in3;
    JButton button;
    boolean flag;

    public AddWindow(Data data){
        this.setTitle("Ввод ФИО");
        this.setBounds(850,350,400,400);
        this.setDefaultCloseOperation(WindowConstants.DISPOSE_ON_CLOSE);

        ImageIcon icon = new ImageIcon("src/Lesson4/Task1/Image/icon.png");
        this.setIconImage(icon.getImage());

        text1 = new JTextArea("Введите фамилию");
        text1.setEditable(false);
        text2 = new JTextArea("Введите имя");
        text2.setEditable(false);
        text3 = new JTextArea("Ввелите отчество");
        text3.setEditable(false);
        log_text = new JTextArea("Введите все поля и потом нажмите отправить ФИО");
        log_text.setEditable(false);
        text_in1 = new JTextField();
        text_in2 = new JTextField();
        text_in3 = new JTextField();
        button = new JButton("Отправить ФИО");
        flag = false;
        button.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                setAll(data);
                flag = data.isReady();
                if (flag){
                    data.setVisible(true);
                    Exit();
                } else {
                    log_text.setText(data.getError());
                }
            }
        });



        this.setLayout(new GridLayout(8,1));
        add(text1);
        add(text_in1);
        add(text2);
        add(text_in2);
        add(text3);
        add(text_in3);
        add(log_text);
        add(button);

        this.setVisible(true);
    }

    public void setAll(Data data){
        data.setSurname(this.text_in1.getText());
        data.setName(this.text_in2.getText());
        data.setSecondName(this.text_in3.getText());
    }

    public void Exit(){

        this.dispose();
    }

}
