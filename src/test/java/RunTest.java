import org.junit.Assert;
import org.junit.Test;
import static TextBoxx.TextBox.*;

public class RunTest extends Hook {
    @Test
    public void textBoxTest() {
        clickElements();
        clickTextBox();
        fullNameDate();
        email();
        currentAddressDate();
        permanentAddress();
        submit();
        System.out.println(verificationName());
        Assert.assertEquals(verificationName(), "Name:Williams Iron");
        Assert.assertEquals(verificationOfEmail(), "Email:titan99@sonton.com");
        Assert.assertEquals(verificationOfCurrentAddress(), "Current Address :Avenue Tissot 0b 6017 Croglio");
        Assert.assertEquals(verificationOfPermanentAddress(), "Permananet Address :74571 Kivumbi Street");
    }
    @Test
    public void notCorrectTextBoxTest() {
        clickElements();
        clickTextBox();
        fullNameDate();
        email();
        currentAddressDate();
        permanentAddress();
        submit();
        System.out.println(verificationName());
        Assert.assertEquals(verificationName(), "Name:Williams Smith");
        Assert.assertEquals(verificationOfEmail(), "Email:titan99@sonton.com");
        Assert.assertEquals(verificationOfCurrentAddress(), "Current Address :Avenue Tissot 0b 6017 Croglio");
        Assert.assertEquals(verificationOfPermanentAddress(), "Permananet Address :74571 Kivumbi Street");
    }
}

