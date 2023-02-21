package StepDefenition;

import io.cucumber.java.ru.Когда;
import io.cucumber.java.ru.Тогда;
import org.junit.jupiter.api.Assertions;

public class Steps {
    int x;
    int y;
    static int result;
    @Когда("Клиент снял х = {int} тысяч рублей")
    public void getX(int x){
        this.x = x;
    }
    @Когда("Клиент снял y = {int} тысяч рублей")
    public void getY(int y){
        this.y = y;
    }
    @Тогда("^Получение наличных средств$")
    public void getSum(){
        result = x+y;
    }
    @Когда("^Общая сумма наличных средств: (.*)$")
    public static void getResult(int res) {
        Assertions.assertEquals(res,result);
        System.out.println("Всего было снято: "+result+" тысяч рублей");
    }
}
