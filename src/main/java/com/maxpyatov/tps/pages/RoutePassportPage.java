package com.maxpyatov.tps.pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import ru.yandex.qatools.htmlelements.annotations.Name;
import ru.yandex.qatools.htmlelements.element.Button;
import ru.yandex.qatools.htmlelements.loader.decorator.HtmlElementDecorator;
import ru.yandex.qatools.htmlelements.loader.decorator.HtmlElementLocatorFactory;

public class RoutePassportPage {

    private PrivateMenu privateMenu;

    @Name("Add passport button")
    @FindBy(css = "button.ui")
    private Button addPassportButton;

    public RoutePassportPage(WebDriver driver) {
        PageFactory.initElements(new HtmlElementDecorator(new HtmlElementLocatorFactory(driver)), this);
    }

    public void addPassport() {
        addPassportButton.click();
    }
}
