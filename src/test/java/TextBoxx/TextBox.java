package TextBoxx;

import com.codeborne.selenide.SelenideElement;
import org.junit.jupiter.api.Assertions;


import static com.codeborne.selenide.Selenide.$x;

public class TextBox {

    public static void clickElements() {
        $x("//h5[text()='Elements']").click();
    }

    public static void clickTextBox() {
        $x("//span[text()='Text Box']").click();
    }

    public static void fullNameDate() {
        SelenideElement log = $x("//input[@id='userName']");
        log.click();
        log.sendKeys("Williams Iron");
    }

    public static void email( ) {
        SelenideElement log = $x("//input[@id='userEmail']");
        log.click();
        log.sendKeys("titan99@sonton.com");
    }

    public static void currentAddressDate() {
        SelenideElement log = $x("//textarea[@id='currentAddress']");
        log.click();
        log.sendKeys("Avenue Tissot 0b 6017 Croglio");
    }

    public static void permanentAddress() {
        SelenideElement log = $x("//textarea[@id='permanentAddress']");
        log.click();
        log.sendKeys("74571 Kivumbi Street");
    }

    public static void submit() {
        $x("//button[@id='submit']").click();
    }

    public static String verificationName(){
        return $x("//p[@id='name']").getText();
    }

    public static String verificationOfEmail(){
        return $x("//p[@id='email']").getText();
    }

    public static String verificationOfCurrentAddress(){
        return $x("//p[@id='currentAddress']").getText();
    }

    public static String verificationOfPermanentAddress(){
        return $x("//p[@id='permanentAddress']").getText();
    }
    public static void userInformation(){
        clickElements();
        clickTextBox();
        fullNameDate();
        email();
        currentAddressDate();
        permanentAddress();
        submit();
    }
    public static void comparison(){
        Assertions.assertEquals(verificationName(), "Name:Williams Iron");
        Assertions.assertEquals(verificationOfEmail(), "Email:titan99@sonton.com");
        Assertions.assertEquals(verificationOfCurrentAddress(), "Current Address :Avenue Tissot 0b 6017 Croglio");
        Assertions.assertEquals(verificationOfPermanentAddress(), "Permananet Address :74571 Kivumbi Street");
    }
    public static void notCorrectComparison(){
        Assertions.assertEquals(verificationName(), "Name:Williams Jon");
    }
}
