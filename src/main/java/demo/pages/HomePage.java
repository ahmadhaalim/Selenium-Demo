package demo.pages;
import demo.webdriver.WebDriverInstance;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;

public class HomePage {

    public void  openHomePage(){

        WebDriverInstance.driver.get("https://www.wikipedia.org/");

    }

    public void inputSearch(String keyword){
        WebElement inputsearch = WebDriverInstance.driver.findElement(By.id("searchInput"));
        inputsearch.sendKeys(keyword);
    }

    public void clickSearch(){
        WebElement submitbutton = WebDriverInstance.driver.findElement(By.xpath("//button[@type = 'submit']"));
        submitbutton.click();
    }
}
