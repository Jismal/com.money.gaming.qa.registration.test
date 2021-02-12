package registration.test;

import org.junit.Assert;
import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;

import java.util.List;

public class RegistrationPage extends DriverFactory {

    @Test
    public void selectTitle() {
        List<WebElement> selectTitle = driver.findElements(By.xpath("//select[@id='title']//option"));

        int total_node = selectTitle.size();

        for (int i = 0; i < total_node; i++) {
            String list = selectTitle.get(i).getText();
            if (list.contains("Mr")) {
                selectTitle.get(i).click();
                break;
            }
        }
    }

    @Test
    public void fillName() {
        driver.findElement(By.id("forename")).sendKeys("FirstName");
        driver.findElement(By.xpath("//input[@name='map(lastName)']")).sendKeys("LastName");
    }

    @Test
    public void selectTickBox() {
        driver.findElement(By.xpath("//input[@class='required checkbox terms']")).click();
    }

    public void join() {
        driver.findElement(By.xpath("//input[@class='promoReg green' and @alt='Join Now']")).click();
    }
@Test
    public void verifyDOB_error() {
        String expectedText = "This field is required";
        String actualText = driver.findElement(By.xpath("//label[contains(text(),'Date of Birth:')]/following-sibling::label[1]")).getText();
        Assert.assertEquals("expected error found",expectedText,actualText);
    try {
        Thread.sleep(5000);
    } catch (InterruptedException e) {
        e.printStackTrace();
    }
}
}