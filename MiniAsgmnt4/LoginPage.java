package MiniAsgmnt4;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class LoginPage {
WebDriver driver;
        By userName=By.xpath("//*[@id=\'user-name\']");
        By password=By.xpath("//*[@id='password']");
        By login_Button=By.xpath("//*[@id='login-button']");
        By firstName=By.xpath("//*[@id='first-name']");
        By lastName=By.xpath("//*[@id='last-name']");
        By pincode=By.xpath("//*[@id='postal-code']");
        String Username="standard_user";
        public LoginPage(WebDriver driver){
            this.driver=driver;
        }

        public void enterUsername(){
            WebElement element1=driver.findElement(userName);
            element1.sendKeys(Username);
        }

        public void enterPassword(){
            WebElement element2=driver.findElement(password);
            element2.sendKeys("secret_sauce");
        }

        public void clickLogin(){
            WebElement login=driver.findElement(login_Button);
            login.click();

        }

        public void verifyUsername(){
            driver.findElement(userName);
        }

        public void verifyPassword(){
            driver.findElement(password);
        }

        public void enterFirstName(){
            WebElement element4=driver.findElement(firstName);
            element4.sendKeys("Sai");
        }

        public void enterLastName(){
            WebElement element5=driver.findElement(lastName);
            element5.sendKeys("Kumar");
        }

        public void enterPinCode(){
            WebElement element6=driver.findElement(pincode);
            element6.sendKeys("508001");
        }


    }

