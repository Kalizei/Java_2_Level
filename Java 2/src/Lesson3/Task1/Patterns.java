package Lesson3.Task1;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

public enum Patterns {
    Rule1("^.{8,}"),
    Rule2("^.*[a-z].*"),
    Rule3("^.*[A-Z].*"),
    Rule4("^.*[0-9].*");


    Pattern p;
    Matcher m;


    Patterns (String rule){
        p = Pattern.compile(rule);
    }

    public boolean isRule(String in){
        m = p.matcher(in);
        return m.matches();
    }
}
