package ApiSteps;

import io.qameta.allure.Step;
import io.restassured.response.*;
import org.json.JSONObject;
import org.junit.jupiter.api.Assertions;

import static io.restassured.RestAssured.*;

public class RickAndMortyAPI {
    public static String charterId;
    public static int lastEpisode;
    public static int lastCharter;
    public static String location;
    public static String location2;
    public static String species;
    public static String species2;
    public static String url = "https://rickandmortyapi.com/api";
    
    public static Response getResponse(String targetURL){
        return given()
                .baseUri(url)
                .when()
                .get(targetURL)
                .then()
                .extract()
                .response();
    }
    public static String getJsonObj(Response response,String value){
        return new JSONObject(response.getBody().asString()).get(value).toString();
    }
    public static int getJsonObjLength(Response response, String value){
        return (new JSONObject(response.getBody().asString()).getJSONArray(value).length()-1);
    }
    public static Integer getParseString(Response response,String value,int value2){
        return Integer.parseInt(new JSONObject(response.getBody().asString())
                .getJSONArray(value).get(value2).toString().replaceAll("[^0-9]",""));
    }

    @Step("Получение id({id}) персонажа, его локацию и рассу")
    public static void getCharter(String id){
        Response gettingChar = getResponse("/character/"+id);

        charterId = getJsonObj(gettingChar,"id");
        location = gettingChar.jsonPath().get("location.name").toString();
        species = getJsonObj(gettingChar,"species");

        System.out.println(charterId);
        System.out.println(location);
        System.out.println(species);
    }
    @Step("Получение последнего эпизода песонажа")
    public static void getEpisode(){
        Response gettingLastEpisode = getResponse("/character/"+charterId);

        int episode = getJsonObjLength(gettingLastEpisode,"episode");
        lastEpisode = getParseString(gettingLastEpisode,"episode",episode);

        System.out.println(lastEpisode);
    }
    @Step("Получение последнего персонажа в последнем эризоде")
    public static void lastCharterInLastEpisode(){
        Response gettingLastCharterInLastEpisode = getResponse("/episode/"+lastEpisode);

        int charter = getJsonObjLength(gettingLastCharterInLastEpisode,"characters");
        lastCharter = getParseString(gettingLastCharterInLastEpisode,"characters",charter);

        System.out.println(lastCharter);
    }
    @Step("Получение локации и рассы последнего персонажа")
    public static void locAndRaceLastChar(){
        Response gettingLastCharterInLastEpisode = getResponse("/character/"+lastCharter);

        location2 = gettingLastCharterInLastEpisode.jsonPath().get("location.name").toString();
        species2 = getJsonObj(gettingLastCharterInLastEpisode,"species");

        System.out.println(location2);
        System.out.println(species2);
    }
    @Step("Проверка локаций и рассы двух персонажей")
    public static void checkCharactersAndLocation(){
        Assertions.assertNotEquals(location,location2);
        Assertions.assertEquals(species,species2);
    }
}
