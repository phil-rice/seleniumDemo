package one.xingyi.selenium;

import lombok.RequiredArgsConstructor;
import one.xingyi.selenium.Context;
import org.openqa.selenium.By;
import org.openqa.selenium.Dimension;
import org.openqa.selenium.WebDriver;

@RequiredArgsConstructor
public class Login {
    public void login(Context context) {
        WebDriver driver = context.webDriver;
        driver.get("http://testvalidoc.herokuapp.com/");
        driver.manage().window().setSize(new Dimension(1720, 974));
        driver.findElement(By.id("login")).click();
        driver.findElement(By.id("email")).click();
        driver.findElement(By.id("email")).sendKeys(context.username);
        driver.findElement(By.id("password")).sendKeys(context.password);
        driver.findElement(By.id("loginButton")).click();
    }
}
