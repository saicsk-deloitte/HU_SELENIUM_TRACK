package CustomerLogin;
import CustomerDB.DataBase;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
public class WithDrawl {
    WebDriver driver;
    String withdraw="//button[@ng-click='withdrawl()']";
    String amountWithdraw="//input[@type='number']";
    String submit="//button[@type='submit']";
    String customerName="//span[@class='fontBig ng-binding']";
    String errorMsg="//span[@class='error ng-binding']";

    DataBase db=new DataBase();
    String actualUsername=db.FullName();
    int withdrawAmount=db.Amount();
    String  withdrawAmountStr=String.valueOf(withdrawAmount);
    public WithDrawl(WebDriver driver) {
        this.driver = driver;
    }
    public void withdrawAmount() throws Exception {
    driver.findElement(By.xpath(withdraw)).click();
    Thread.sleep(2000);
    driver.findElement(By.xpath(amountWithdraw)).sendKeys("200");
    Thread.sleep(2000);
    driver.findElement(By.xpath(submit)).click();
    Thread.sleep(1000);
    System.out.println("Deposited Amount is Correct");
    }
}
