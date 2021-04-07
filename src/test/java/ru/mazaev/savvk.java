package ru.mazaev;

import io.github.bonigarcia.wdm.WebDriverManager;
import org.junit.After;
import org.junit.Before;
import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class savvk {
    private WebDriver webDriver;

    @Before
    public void setup() {
        WebDriverManager.chromedriver().setup();
        webDriver = new ChromeDriver();
        webDriver.manage().window().maximize();
    }

    @Test
    public void firsttask(){
        webDriver.get("https://savkk.github.io/selenium-practice/");

        WebElement FirstTask = webDriver.findElement(By.xpath("//*[@id=\"button\"]"));
        FirstTask.click();
        WebElement Text1 = webDriver.findElement(By.xpath("//*[contains(text(), 'Excellent!')]"));
        WebElement ClickMe = webDriver.findElement(By.xpath("//*[@id=\"first\"]")); //Нажимаем вторую кнопку
        ClickMe.click();
    }

   @Test
    public void secondtask(){
        webDriver.get("https://savkk.github.io/selenium-practice/");

        WebElement SecondTask = webDriver.findElement(By.xpath("//*[@id=\"checkbox\"]"));
        SecondTask.click();
        WebElement ChB1 = webDriver.findElement(By.xpath("//*[@id=\"one\"]"));
        ChB1.click();
        WebElement ChB2 = webDriver.findElement(By.xpath("//*[@id=\"two\"]"));
        ChB2.click();
        WebElement Go = webDriver.findElement(By.xpath("//*[@id=\"go\"]"));
        Go.click(); //Нажимаем 1 Get Result
        WebElement Text2 = webDriver.findElement(By.xpath("//*[contains(text(), 'one')]"));
        WebElement Text3 = webDriver.findElement(By.xpath("//*[contains(text(), 'two')]"));

        WebElement RB1 = webDriver.findElement(By.id("radio_three"));
        RB1.click();
        WebElement RG = webDriver.findElement(By.xpath("//*[@id=\"radio_go\"]"));
        RG.click();
        WebElement RadioResult = webDriver.findElement(By.xpath("//*[@id=\"radio_result\"]"));
        RadioResult.click();
        WebElement Text4 = webDriver.findElement(By.xpath("//*[contains(text(), 'Three')]"));

    }

    @Test
    public void thirdtask(){
        webDriver.get("https://savkk.github.io/selenium-practice/");

        WebElement ThirdTask = webDriver.findElement(By.xpath("//*[@id=\"select\"]"));
        ThirdTask.click();
        WebElement Select = webDriver.findElement(By.className("u-full-width"));
        Select.sendKeys("Niklaus Wirth");
        WebElement List = webDriver.findElement(By.xpath("//*[@id=\"content\"]/select[2]"));
        List.sendKeys("Java", "Python");
        WebElement Text = webDriver.findElement(By.xpath("//*[contains(text(), 'Niklaus Wirth')]"));
        WebElement Text1 = webDriver.findElement(By.xpath("//*[contains(text(), 'Java')]"));
        WebElement Text2 = webDriver.findElement(By.xpath("//*[contains(text(), 'Python')]"));
        WebElement Results = webDriver.findElement(By.xpath("//*[contains(text(), 'Get Results')]"));
        Results.click();
    }
    

    @After
    public void closeDriver(){
        if (webDriver != null) {
            webDriver.quit();
        }
    }
}
