package demo;

import demo.pages.ArticlePage;
import demo.pages.HomePage;
import demo.webdriver.WebDriverInstance;
import org.junit.After;
import org.junit.Assert;
import org.junit.Before;
import org.openqa.selenium.By;
import org.junit.Test;
import org.openqa.selenium.WebElement;


public class SeleniumTest {
    private ArticlePage articlePage = new ArticlePage();
    private HomePage homePage = new HomePage();

    @Before
    public void before(){
        WebDriverInstance.initialize();
    }

    @After
    public void after(){
        WebDriverInstance.quit();
    }

    @Test
    public void searching(){
        homePage.openHomePage();
        homePage.inputSearch("Apple");
        homePage.clickSearch();
        String text = articlePage.getTitle();
        Assert.assertEquals("Apple",text);
    }
    //    WebDriver driver;
//    @Before //hook sebelum test
//    public void initializeWebDriver(){
//        ChromeOptions options = new ChromeOptions();
//        options.addArguments("start-maximized", "incognito", "disable-extension");
//        options.setCapability(CapabilityType.PLATFORM_NAME, Platform.WINDOWS);
//        options.setCapability(CapabilityType.BROWSER_NAME, BrowserType.CHROME);
//        driver = new ChromeDriver(options);
////        Untuk memaximize window browser pada Mac
////        driver.manage().window().maximize();
//        //menunggu selama 5 detik
//        driver.manage().timeouts().implicitlyWait(5, TimeUnit.SECONDS);
//        driver.get("https://www.wikipedia.org/");
//    }

//    @After //hook apabila test telah selesai
//    public void driverQuit(){
//        driver.quit();
//    }

//
//    @Test
//    public void searchWikitionary2() throws InterruptedException {
//        WebElement inputsearch = driver.findElement(By.id("searchInput"));
//        WebElement submitbutton = driver.findElement(By.xpath("//button[@type = 'submit']"));
//        inputsearch.sendKeys("Pear");
//        submitbutton.click();
//        WebElement articleTitle = driver.findElement(By.id("firstHeading"));
//        String text = articleTitle.getText();
//        Assert.assertEquals("Pear", text);
//        Thread.sleep(3000);
//    }

}
