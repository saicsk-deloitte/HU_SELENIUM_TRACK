import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
public class loginPage {
    WebDriver driver;
    By user_name = By.id("user-name");
    By password = By.id("password");
    By button = By.xpath("//*[@id='login-button']");
    By carticon = By.xpath("//*[@class='shopping_cart_link']");
    By continue_shopping =By.xpath("//*[@id='continue-shopping']");
    By checkout = By.xpath("//*[@id='checkout']");
    By addTocart = By.xpath("//*[@id='add-to-cart-sauce-Labs-backpack']");
    By remove = By.xpath("//*[@id='remove-sauce-labs-backpack']");
    By firstName = By.xpath("//*[@id='first-name']");
    By LastName = By.xpath("//*[@id='last-name']");
    By postal = By.xpath("//*[@id='postal-code']");
    loginPage(WebDriver driver)
    {
        this.driver = driver;
    }
    public void setUser_name(String name)
    {
        driver.findElement(user_name).sendKeys(name);
    }
    public void setPassword(String password1) {
        driver.findElement(password).sendKeys(password1);
    }
    public void clicklogin(){
    WebElement login =driver.findElement(button);
    login.click();
    }
}