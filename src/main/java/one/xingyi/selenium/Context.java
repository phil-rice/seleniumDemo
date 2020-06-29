package one.xingyi.selenium;

import lombok.RequiredArgsConstructor;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

@RequiredArgsConstructor
public class Context {
    final public WebDriver webDriver;
    final public JavascriptExecutor js;
    final public String username;
    final public String password;

    public static Context create() {
        WebDriver webDriver = new ChromeDriver();
        JavascriptExecutor js = (JavascriptExecutor) webDriver;
        return new Context(webDriver, js, "phil.rice@iee.org", "");
    }
}
