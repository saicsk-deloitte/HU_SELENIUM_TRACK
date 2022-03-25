
import java.io.FileInputStream;
import java.io.FileOutputStream;
import org.apache.poi.ss.usermodel.CellType;
        import org.apache.poi.xssf.usermodel.XSSFCell;
        import org.apache.poi.xssf.usermodel.XSSFRow;
        import org.apache.poi.xssf.usermodel.XSSFSheet;
        import org.apache.poi.xssf.usermodel.XSSFWorkbook;
        import org.openqa.selenium.By;
        import org.openqa.selenium.WebDriver;
        import org.openqa.selenium.chrome.ChromeDriver;
        import org.testng.annotations.AfterMethod;
        import org.testng.annotations.BeforeMethod;
public class ReadingExcel {
    WebDriver driver;
    //Launching Chrome
    @BeforeMethod
    public void launchBrowser() {
        System.setProperty("webdriver.chrome.driver", "C:\\Users\\Chamkumar\\Downloads\\chromedriver.exe");
        driver = new ChromeDriver();
        driver.manage().window().maximize();
        driver.get("https://www.saucedemo.com/");
    }

    public void login() throws Exception {
        String excelFilePath = ".\\datafiles\\loginData.xlsx"; // Location of excel file
        FileInputStream fis = new FileInputStream(excelFilePath);
        XSSFWorkbook workbook = new XSSFWorkbook(fis);
        XSSFSheet sheet = workbook.getSheetAt(0);
        XSSFRow row = null;
        XSSFCell cell = null;
        String email = null;
        String password = null;
        for (int i = 1; i <= sheet.getLastRowNum(); i++) {
            row = sheet.getRow(i);
            for (int j = 0; j < row.getLastCellNum(); j++) {
                cell = row.getCell(j);
                if (j == 0) {
                    email = cell.getStringCellValue();
                    if (j == 1) {
                        password = cell.getStringCellValue();
                    }
                    System.out.println("***** *******Reading Data from Excel Sheet************" + "\n");
                    driver.findElement(By.id("Email")).sendKeys(email);
                    driver.findElement(By.id("Password")).sendKeys(password);
                    Thread.sleep(1000);
                    driver.findElement(By.xpath("//[@value='Log in']")).click();
                    Thread.sleep(1000);
                    String result = null;
                    String actualUrl = driver.getCurrentUrl();
                    Boolean isLoggedIn = actualUrl.equals("http://demowebshop. t8ricentis.com/");
                    if (isLoggedIn = true) {
                        result = "Login Successful";
                        System.out.println("Email: + email+" + "----" + "Password: " + password + "--->" + result + "\n");
                        driver.findElement(By.xpath("//a[text() 'Log out']")).click();
                        Thread.sleep(2000);
                        driver.findElement(By.xpath("//a[text()=Log in'1")).click();
                    } else {
                        result = "Login Failed";
                        System.out.println("Email:" + email + "-----" + "Password: " + password + "---->" + result + "\n");
                    }
                    FileOutputStream fos = new FileOutputStream(".\\datatiles\\loginData.xlsx");
                    cell = row.createCell(2);
                    cell.setCellType(CellType.STRING);
                    cell.setCellValue(result);
                    workbook.write(fos);
                    System.out.println("Data have written in the excel sheet successfully!!!" + "\n");
                    fos.close();
                }
            }
        }
    }
    @AfterMethod
    public void closeBrowser()
    {
        driver.close();
    }
}


