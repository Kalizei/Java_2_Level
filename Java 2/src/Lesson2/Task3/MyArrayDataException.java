package Lesson2.Task3;

public class MyArrayDataException extends MyException {
    public MyArrayDataException (String msg){
        super("Невозможно преобразовать в число, ячейку в следующих координатах: "+msg);
    }
}
