package Lesson3.Task2;

public class NewString {
    String stringData;
    int quantity;

    public NewString(String stringData) {
        this.stringData = stringData;
        this.quantity = 1;
    }

    /**
     * сверка входных слов, при совпадении добавляем в счетчик повторов
     * @param inString true - входное слово совпадает с уникальным словом, false - не подходит
     * @return
     */
    public boolean isStringData(String inString) {
        if (this.stringData.equals(inString)){
            quantity++;
            return true;
        }
        return false;
    }

    /**
     * переопределяем вывод(как целого обьекта) в строковам вызове
     * @return уникальное слово(количество повторений)
     */
    @Override
    public String toString(){
        return stringData + "(" + quantity + ")";
    }
}
