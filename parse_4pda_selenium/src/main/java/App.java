import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;



public class App {
    public static void main(String[] args) throws InterruptedException {
        System.setProperty("webdriver.chrome.driver", "selenium_driver\\chromedriver.exe");
        WebDriver webDriver = new ChromeDriver();
        webDriver.get("https://4pda.to/");
        //    Document document = Jsoup.parse(webDriver.getPageSource());
        for (int i = 2; i <= 7; i++) {
            WebElement paginationBtn = webDriver.findElement(By.xpath("//*[@id=\"UE3pBFWtNg\"]/ul/li[" + i + "]/a"));
            paginationBtn.click();
            Thread.sleep(10000);
        }
        webDriver.quit();
    }
}
