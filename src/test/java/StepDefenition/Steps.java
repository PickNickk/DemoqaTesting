package StepDefenition;

import io.cucumber.java.ru.Когда;
import io.cucumber.java.ru.Тогда;
import io.qameta.allure.Step;
import org.junit.jupiter.api.Assertions;

public class Steps {
    int x;
    int y;
    static int result;
    @Step("Снятие наличных средств в первый раз {x} тысяч рублей")
    @Когда("Клиент снял х = {int} тысяч рублей")
    public void getX(int x){
        this.x = x;
    }
    @Step("Снятие наличных средств во второй раз {y} тысяч рублей")
    @Когда("Клиент снял y = {int} тысяч рублей")
    public void getY(int y){
        this.y = y;
    }
    @Step("Сумма наличных средств")
    @Тогда("^Получение наличных средств$")
    public void getSum(){
        result = x+y;
    }
    @Step("Полученние суммы наличных средств в размере {res} тысяч рублей")
    @Когда("^Общая сумма наличных средств: (.*)$")
    public static void getResult(int res) {
        Assertions.assertEquals(res,result);
        System.out.println("Всего было снято: "+result+" тысяч рублей");
    }
}
