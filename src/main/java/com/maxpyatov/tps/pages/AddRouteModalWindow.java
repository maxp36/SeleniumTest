package com.maxpyatov.tps.pages;

import org.openqa.selenium.support.FindBy;
import ru.yandex.qatools.htmlelements.annotations.Name;
import ru.yandex.qatools.htmlelements.element.Button;
import ru.yandex.qatools.htmlelements.element.CheckBox;
import ru.yandex.qatools.htmlelements.element.Select;
import ru.yandex.qatools.htmlelements.element.TextInput;

@Name("Add route modal window")
@FindBy(css = ".modal")
public class AddRouteModalWindow {

    @Name("Select transport type")
    @FindBy(css = ".selection")
    private Select transportTypeSelect;

    @Name("Zonable checkbox")
    @FindBy(css = "input.hidden")
    private CheckBox zonableCheckBox;

    @Name("Route number")
    @FindBy(css = "#routeNumber")
    private TextInput routeNumberTextInput;

    @Name("Save button")
    @FindBy(css = "button.ui:nth-child(2)")
    private Button saveButton;

    @Name("Close button")
    @FindBy(css = "button.red")
    private Button closeButton;

    public void addRoute(Boolean isZonable, String routeNumber) {

    }
}
