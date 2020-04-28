package demo.pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import demo.webdriver.WebDriverInstance;
public class ArticlePage {

    public String getTitle(){
        WebDriverWait wait = new WebDriverWait(WebDriverInstance.driver, 10);
        WebElement articleTitle = wait.until(ExpectedConditions.presenceOfElementLocated(By.id("firstHeading")));
        String text = articleTitle.getText();
        return text;
    }
}
