package Lesson4.Task1;

import javax.swing.*;
import java.awt.*;
import java.awt.event.*;

public class MyWindow extends JFrame {
    JTextArea text1,text2,text3;
    JButton button;
    boolean flag;
    Data data;

    public MyWindow(){
        data = new Data();
        this.setTitle("Java Chat");
        this.setBounds(800,300,400,400);
        this.setDefaultCloseOperation(WindowConstants.EXIT_ON_CLOSE);

        ImageIcon icon = new ImageIcon("src/Lesson4/Task1/Image/icon.png");
        this.setIconImage(icon.getImage());

        text1 = new JTextArea("Фамилия:");
        text1.setEditable(false);
        text2 = new JTextArea("Имя:");
        text2.setEditable(false);
        text3 = new JTextArea("Отчество:");
        text3.setEditable(false);
        button = new JButton("Указать ФИО");
        flag = false;
        button.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                if (!flag){
                    flag = true;
                    new AddWindow(data);
                }
            }
        });

        addWindowListener(new WindowAdapter() {
            @Override
            public void windowActivated(WindowEvent e) {
                if (data.isVisible()) {
                    text1.setText("Фамилия: " + data.getSurname());
                    text2.setText("Имя: " + data.getName());
                    text3.setText("Отчество: " + data.getSecondname());
                }
            }
        });



        this.setLayout(new GridLayout(4,1));
        add(text1, BorderLayout.CENTER);
        add(text2, BorderLayout.CENTER);
        add(text3, BorderLayout.CENTER);
        add(button);

        this.setVisible(true);
    }


}
