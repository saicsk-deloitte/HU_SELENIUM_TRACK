import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
public class Frames {
    public static void main(String[] args) throws InterruptedException {
        System.setProperty("webdriver.chrome.driver", "C:\\Users\\Chamkumar\\Downloads\\chromedriver.exe");
        WebDriver driver = new ChromeDriver();
        driver.manage().window().maximize();
        driver.get("https://the-internet.herokuapp.com/");
        Thread.sleep(3000);
        By frames = By.xpath("//a[@href='/frames']");
        driver.findElement(frames).click();
        Thread.sleep(3000);
        By Nestedframes = By.xpath("//a[text()= 'Nested Frames']");
        driver.findElement(Nestedframes).click();
        Thread.sleep(3000);
        //By left=By.xpath("//frame[@name='frame-left]");
        //By Title=(By)driver.findElement(By.tagName("LEFT"));

    }
}
