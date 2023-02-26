package Test;

import org.junit.jupiter.api.Test;
import static ApiSteps.ReqresAPI.*;
import static ApiSteps.RickAndMortyAPI.*;
import static ApiSteps.jiraAPI.*;

public class RunTest {
    @Test
    public void rickAndMortyTest() {
        getCharter("2");
        getEpisode();
        lastCharterInLastEpisode();
        locAndRaceLastChar();
        checkCharactersAndLocation();
    }

    @Test
    public void reqResTest(){
        createUser();
    }

    @Test
    public void jiraTest(){
        authUser();
    }
}

