package Lesson2;

public class BMI {


    public static void main(String[] args) {
        String in = "123 27.4\n" +
                    "167 65.2\n" +
                    "174 45.8\n" +
                    "178 68.1\n" +
                    "182 82.2\n" +
                    "169 89.5\n" +
                    "165 70.2";

//        <16 	        Выраженный дефицит массы тела
//        16—18,5	    Недостаточная (дефицит) масса тела
//        18,5—24,99	Норма
//        25—30     	Избыточная масса тела (предожирение)
//        30—35     	Ожирение
//        35—40	        Ожирение резкое
//        >40 	        Очень резкое ожирение

        double[] bmi = Bmi(in);


        display(in);
    }

    /**
     * ввывод в консоль результатов
     */
    private static void display(String in){
        int size = quantityString(in);
        System.out.println("рост вес  ИМТ   категория ИМТ");
        for (int i = 0; i < size; i++) {
            double bmi = Bmi(in,i);
            System.out.println(" "+subString(in,i)+" "+String.format("%(.2f", bmi)+" "+category(bmi));
        }
    }

    /**
     * в зависимости от вводимого индекса массы тела выводит текс котегории к какой он относиться
     * @param bmi - индекс массы тела
     * @return категория индекса массы тела
     */
    private static String category(double bmi){
        if (bmi<16) return "Выраженный дефицит массы тела";
        else if (bmi <18.5) return "Недостаточная (дефицит) масса тела";
        else if (bmi <25) return "Норма";
        else if (bmi <30) return "Избыточная масса тела (предожирение)";
        else if (bmi <35) return "Ожирение";
        else if (bmi <40) return "Ожирение резкое";
        else return "Очень резкое ожирение";
    }

    /**
     * извлекаем для всех строк рост и вес и считаем индекс массы тела
     * @param in вводимая строка(несколько строк)
     * @return массив индексов массы тела
     */
    private static double[] Bmi (String in){
        int size = quantityString(in);
        double[] bmi = new double[size];
        for (int i = 0; i < size; i++) {
            bmi[i] = Bmi(in,i);
        }
        return bmi;
    }


    /**
     * извлекаем из строки рост (height) и вес (weight) и считаем индекс массы тела
     * @param in вводимая строка (несколько строк)
     * @param index номер строки
     * @return индекс массы тела
     */
    private static double Bmi(String in,int index){
        String sub = subString(in,index);
        int height = Integer.parseInt(eject(sub));
        sub = remainder(sub);
        double weight = Double.parseDouble(sub);
        return weight/(height*height/10000);
    }

    /**
     * метод выводит подстроку
     * @param in вводимая строка которая состоит из подстрок
     * @param index номер строки который нам интересует
     * @return - получаная подстрока
     */
    private static String subString(String in,int index){
        int front=0;
        int back=0;
        int sum = index;
        int i;
        in = in + "\n";
        for (i = 0; i < in.length(); i++) {
            if (sum == 0) {
                front = i;
                break;
            }
            if (in.charAt(i)=='\n') sum--;
        }
        for (int j=i;j<in.length();j++){
            if (in.charAt(j)=='\n') {
                back = j;
                break;
            }
        }
        if (back!=0) return in.substring(front,back);
        else return "не найден";
    }

    /**
     * извлекает первое слово из строки in
     * @param in вводимая строка для извлечения слова
     * @return слова которое вывели
     */
    private static String eject(String in){
        String s = in.trim();
        return s.substring(0,s.indexOf(" "));
    }

    /**
     * в строк in убирает первое слово(набор символов подрят не разделеных промебом)
     * и выводит и з метода уже без слова
     * @param in - строка в которой нужно убрать слово
     * @return - строка без первого слова
     */
    private static String remainder(String in){
        String s = in.trim();
        return s.substring(s.indexOf(" ")).trim();
    }

    /**
     *  узнаем количество строк в тексте (in)
     * @param in - строка обрабатываемая на количество сткрок
     * @return - количество строк
     */
    private static int quantityString(String in){
        int sum = 0;
        while (subString(in,sum) != "не найден") sum++;
        return sum;
    }
}
