package registration.test;

import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class HomePage extends DriverFactory {
    @Test
    public void getCurrentUrl() {
        driver.getCurrentUrl();
        WebElement logo = driver.findElement(By.xpath("//img[@src='/moneyGaming/default/images/logo.png']"));
        WebDriverWait wait = new WebDriverWait(driver, 30);
        wait.until(ExpectedConditions.visibilityOf(logo));
    }

    @Test
    public void startRegistrationJOIN_NOW() {

        driver.findElement(By.xpath("//a[@class='newUser green']")).click();

    }

}
