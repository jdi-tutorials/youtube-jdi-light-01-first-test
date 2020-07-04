package com.google;

import com.epam.jdi.light.elements.composite.WebPage;
import org.testng.annotations.Test;

import static com.epam.jdi.light.elements.init.UIFactory.$;
import static org.openqa.selenium.Keys.ENTER;

public class GoogleTests {

    @Test
    public void searchTest() {
        WebPage.openUrl("https://www.google.com/");
        $("[name=q]").input("JDI top testing framework" + ENTER);
        $("['JDI Testing tools · GitHub']").is().displayed();
    }
}
