package firsttest;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.support.ui.ExpectedCondition;
import org.openqa.selenium.support.ui.WebDriverWait;

public class FirstTest {
    public static void main(String[] args) {

        //if you didn't update the Path system variable to add the full
        //directory path to the executable as above mentioned then doing this directly through code
        System.setProperty("webdriver.gecko.driver", "M:\\development\\selenium\\geckodriver-v0.19.1-win64\\geckodriver.exe");

        // Создаем экземпляр WebDriver
        // Следует отметить что скрипт работает с интерфейсом,
        // а не с реализацией.
        WebDriver driver = new FirefoxDriver();

        // Открываем гугл, используя драйвер
        driver.get("http://www.google.com");
        // По-другому это можно сделать так:
        // driver.navigate().to("http://www.google.com");

        // Находим элемент по атрибуту name
        WebElement element = driver.findElement(By.name("q"));

        // Вводим текст
        element.sendKeys("Selenium");

        // Отправляем форму, при этом дравер сам определит как отправить форму по элементу
        element.submit();

        // Проверяем тайтл страницы
        System.out.println("Page title is: " + driver.getTitle());

        // Страницы гугл динамически отрисовывается с помощью javascript
        // Ждем загрузки страницы с таймаутом в 10 секунд
        (new WebDriverWait(driver, 10)).until(new ExpectedCondition<Boolean>() {
            public Boolean apply(WebDriver d) {
                return d.getTitle().toLowerCase().startsWith("selenium");
            }
        });

        // Ожидаем увидеть: "Selenium - Google Search"
        System.out.println("Page title is: " + driver.getTitle());

        // Закрываем браузер
        driver.quit();
    }
}