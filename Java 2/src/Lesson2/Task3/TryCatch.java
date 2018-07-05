package Lesson2.Task3;

public class TryCatch {
    public static void main(String[] args) {
        String[][] strings0 = { {"1","1","1","1"},
                                {"1","1","1","1"},
                                {"1","1","1","1"},};

        String[][] strings1 = { {"1","1","1"},
                                {"1","1"},
                                {"1"},
                                {"1","1"}};

        String[][] strings2 = { {"1","1","1","1"},
                                {"1","1","1","q"},
                                {"1","1","q","1"},
                                {"1","1","1","1"}};
        String[][] strings3 = { {"1","1","1","1"},
                                {"1","2","1","2"},
                                {"1","1","2","1"},
                                {"3","1","1","1"}};

        checkArrayString(strings0);
        checkArrayString(strings1);
        checkArrayString(strings2);
        checkArrayString(strings3);


    }

    /**
     *
     * @param in
     */
    private static void checkArrayString(String[][] in){
        try {
            checkSize(in);
            System.out.println(checkSum(in));
        } catch (MyException e) {
            e.printStackTrace();
        }
    }

    private static int checkSum (String[][] in)throws MyArrayDataException{
        boolean e = true;// отсутсвие ошибок
        String s = ""; // выведет текст ошибки

        int sum = 0;
        for (int i = 0; i < 4; i++) {
            for (int j = 0; j < 4; j++) {
                try {
                    sum += Integer.parseInt(in[i][j]);
                } catch (Exception e1){
                    e = false;
                    s += "("+i+","+j+") ";
                }

            }
        }
        if (!e) throw new MyArrayDataException(s);
        return sum;
    }

    private static void checkSize(String[][] in) throws MyArraySizeException{
        boolean e = true;// отсутсвие ошибок
        String s = ""; // выведет текст ошибки
        if (in.length == 4){
            for (int i = 0; i < 4; i++) {
                e = e && (in[i].length == 4);
            }
            if (!e) s = "не соответсвует длине массива";
        } else {
            e = false;
            s = "не соответсвует ширине масива";
        }
        if (!e) throw new MyArraySizeException(s);
    }
}
