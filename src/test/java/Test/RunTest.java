package Test;

import Hooks.ApiHooks;
import io.qameta.allure.Description;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;
import static ApiSteps.ReqresAPI.*;
import static ApiSteps.RickAndMortyAPI.*;
import static ApiSteps.jiraAPI.*;

public class RunTest extends ApiHooks {
    @Test
    @DisplayName("API запросы \"Рик и Морти\"")
    @Description("Получение и проверка данных о персонажах,их эпизодов,местоположении и рассе")
    public void rickAndMortyTest() {
        getCharter("2");
        getEpisode();
        lastCharterInLastEpisode();
        locAndRaceLastChar();
        checkCharactersAndLocation();
    }

    @Test
    @DisplayName("API запросы \"ReqRes\"")
    @Description("Изменение имени пользователя.Добавление работы.Проверка волидности данных по значениям key и value.")
    public void reqResTest(){
        createUser();
    }
    @Test
    @DisplayName("API запросы \"Jira\"")
    @Description("Авторизация на сайте https://edujira.ifellow.ru/. Проверка пользователя")
    public void jiraTest(){
        authUser();
    }
}
