package Lesson1.Task1;

public class Task {

    public static void main(String[] args) {
        String in = "qweqwyyqeuue weqwe weq eqw e\n" +
                    "\n"+
                    " qweq weuyeqw eqwiie wqeq\n" +
                    " qeqwyqweqw eqwe qweqwe\n" +
                    " qe qwoe qw eq we\n" +
                    " qeqaaq weqw e qweqw";

        int[] quantity_vowels = new int[quantity((in))];

        for (int i = 0; i < quantity_vowels.length; i++) {
            quantity_vowels[i] = quantityVowels(subString(in,i));
            System.out.println(quantity_vowels[i]+" : "+subString(in,i));
        }



    }

    /**
     *  метот определяет количество строк
     * @param in - строку которую расматриваем
     * @return - количество строк
     */
    private static int quantity(String in){
        int sum = 1;
        for (int i = 0; i < in.length(); i++) {
            if (in.charAt(i) == '\n') sum++;
        }
        return sum;
    }


    /**
     * метод выевляет являетьс входной символ гласным
     * @param in - входной символ
     * @return - true (гласный), false (остальные символы)
     */
    private static boolean isVowels(char in){
        switch (in){
            case 'a':
            case 'o':
            case 'e':
            case 'i':
            case 'u':
            case 'y':return true;
            default:return false;
        }
    }

    /**
     *  метод для подсчета гласных в одной входяшей строке
     * @param in - входящая строка
     * @return - количество гласных
     */
    private static int quantityVowels(String in){
        int sum = 0;
        for (int i = 0; i < in.length(); i++) {
            if (isVowels(in.charAt(i))) sum++;
        }
        return sum;
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
}
