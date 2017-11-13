package com.maxpyatov.tps.pages;

import org.openqa.selenium.support.FindBy;
import ru.yandex.qatools.htmlelements.annotations.Name;
import ru.yandex.qatools.htmlelements.element.Button;
import ru.yandex.qatools.htmlelements.element.HtmlElement;
import ru.yandex.qatools.htmlelements.element.TextInput;

@Name("Login form")
@FindBy(name = "form")
public class LoginForm extends HtmlElement {

    @Name("Email input")
    @FindBy(name = "j_username")
    private TextInput emailInput;

    @Name("Password input")
    @FindBy(name = "j_password")
    private TextInput passwordInput;

    @Name("Login button")
    @FindBy(tagName = "button")
    private Button loginButton;

    public void login(String email, String password) {
        emailInput.clear();
        emailInput.sendKeys(email);
        passwordInput.clear();
        passwordInput.sendKeys(password);
        loginButton.click();
    }
}
