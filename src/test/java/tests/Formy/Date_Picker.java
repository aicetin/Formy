package tests.Formy;

import org.testng.Assert;
import org.testng.annotations.Test;
import pages.FormyHomePage;
import utils.Driver;

import static utils.ReusableMethods.clickOnTheDesiredLink1;

public class Date_Picker {

    @Test
    public void verify_button_link_page() throws Exception {

        FormyHomePage formyHomePage = new FormyHomePage();
        Driver.get().get(formyHomePage.url);

        clickOnTheDesiredLink1("Datepicker");
        // changing
        Assert.assertEquals(Driver.get().getCurrentUrl().contains("datepicker"),true);
        Driver.get().close();

        System.out.println("formyHomePage = " + formyHomePage);
    }
    
    



}
