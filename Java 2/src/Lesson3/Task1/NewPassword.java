package Lesson3.Task1;

import java.io.InputStreamReader;
import java.util.Scanner;

public class NewPassword {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(new InputStreamReader(System.in));
        String in_text = "";

        boolean repeat=true;
        while (repeat) {
            in_text = scanner.next();
            boolean out1 = Patterns.Rule1.isRule(in_text);
            System.out.println("есть 8 символов      : "+out1);
            boolean out2 = Patterns.Rule2.isRule(in_text);
            System.out.println("есть маленькая буква : "+out2);
            boolean out3 = Patterns.Rule3.isRule(in_text);
            System.out.println("есть большая буква   : "+out3);
            boolean out4 = Patterns.Rule4.isRule(in_text);
            System.out.println("есть одна цифра      : "+out4);
            repeat = !out1 || !out2 || !out3 || !out4;

            if (repeat) System.out.println("Пароль не соответсвует требованием!\n");
        }
            System.out.println("Пароль: " + in_text + " подходит");
    }



}
