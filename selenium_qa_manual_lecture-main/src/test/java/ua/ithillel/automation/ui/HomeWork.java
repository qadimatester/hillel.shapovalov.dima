package ua.ithillel.automation.ui;

import org.junit.*;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;

import java.util.concurrent.TimeUnit;

public class HomeWork {
    private WebDriver driver;
    @BeforeClass
    public static void setUpDriver() {
        final String path = String.format("%s/bin/chromedriver", System.getProperty("user.dir"));
        System.setProperty("webdriver.chrome.driver", path);
    }

    @Before
    public void precondition() {
        ChromeOptions options = new ChromeOptions();
        options.addArguments("--remote-allow-origins=*");
        driver = new ChromeDriver(options);
        driver.manage().window().maximize();
        driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
    }


     @Test
     public void qAutoEndt2End( ) throws InterruptedException {
         driver.get("https://guest:welcome2qauto@qauto.forstudy.space/");
         Thread.sleep(1000);

         // 1. Створити користувача

         driver.findElement(By.cssSelector(".hero-descriptor_btn")).click();
         Thread.sleep(1000);
         driver.findElement(By.id("signupName")).sendKeys("Dmytro");
         Thread.sleep(500);
         driver.findElement(By.id("signupLastName")).sendKeys("Shap");
         Thread.sleep(500);
         driver.findElement(By.id("signupEmail")).sendKeys("qatest1234@gmail.com");
         Thread.sleep(500);
         driver.findElement(By.id("signupPassword")).sendKeys("Qwerty1234");
         Thread.sleep(500);
         driver.findElement(By.id("signupRepeatPassword")).sendKeys("Qwerty1234");
         Thread.sleep(500);
         driver.findElement(By.xpath("/html/body/ngb-modal-window/div/div/app-signup-modal/div[3]/button")).click();
         Thread.sleep(1000);

         //2 Піти в профайл і перевірити, що там такі ж name і lastName як при реєстрації

         driver.findElement(By.xpath("/html/body/app-root/app-global-layout/div/div/div/app-panel-layout/div/div/div/div[1]/nav/div/a[1]")).click();
         Thread.sleep(1000);
         WebElement name = driver.findElement(By.xpath("/html/body/app-root/app-global-layout/div/div/div/app-panel-layout/div/div/div/div[2]/div/app-profile/div/div[2]/div/p"));
         Assert.assertEquals("Incorrect Name or Lastname ", "Dmytro Shap", name.getText());

         //3 Додати авто

         driver.findElement(By.xpath("/html/body/app-root/app-global-layout/div/div/div/app-panel-layout/div/div/div/div[1]/nav/a[1]")).click();
         Thread.sleep(1000);
         driver.findElement(By.xpath("/html/body/app-root/app-global-layout/div/div/div/app-panel-layout/div/div/div/div[2]/div/app-garage/div/div[1]/button")).click();
         Thread.sleep(1000);
         driver.findElement(By.cssSelector("option:nth-child(2)")).click();
         Thread.sleep(500);
         driver.findElement(By.xpath("//*[@id=\"addCarModel\"]/option[3]")).click();
         Thread.sleep(500);
         driver.findElement(By.id("addCarMileage")).sendKeys("100");
         Thread.sleep(500);
         driver.findElement(By.xpath("/html/body/ngb-modal-window/div/div/app-add-car-modal/div[3]/button[2]")).click();
         Thread.sleep(1000);

         //4 Додати expenses цьому авто

         driver.findElement(By.xpath("/html/body/app-root/app-global-layout/div/div/div/app-panel-layout/div/div/div/div[2]/div/app-garage/div/div[2]/div/ul/li/app-car/div/div[1]/div[2]/button[2]")).click();
         Thread.sleep(1000);
         driver.findElement(By.id("addExpenseMileage")).click();
         Thread.sleep(500);
         driver.findElement(By.id("addExpenseMileage")).clear();
         Thread.sleep(500);
         driver.findElement(By.id("addExpenseMileage")).sendKeys("123");
         Thread.sleep(500);
         driver.findElement(By.id("addExpenseLiters")).sendKeys("10");
         Thread.sleep(500);
         driver.findElement(By.id("addExpenseTotalCost")).sendKeys("2");
         Thread.sleep(500);
         driver.findElement(By.xpath("/html/body/ngb-modal-window/div/div/app-add-expense-modal/div[3]/button[2]")).click();
         Thread.sleep(1000);

         //5 Видалити користувача

         driver.findElement(By.xpath("/html/body/app-root/app-global-layout/div/div/div/app-panel-layout/div/div/div/div[1]/nav/div/a[2]")).click();
         Thread.sleep(1000);
         driver.findElement(By.xpath("/html/body/app-root/app-global-layout/div/div/div/app-panel-layout/div/div/div/div[2]/div/app-settings/div/div[2]/div/div[5]/div/button")).click();
         Thread.sleep(1000);
         driver.findElement(By.xpath("/html/body/ngb-modal-window/div/div/app-remove-account-modal/div[3]/button[2]")).click();
         Thread.sleep(1000);
     }
    @After
    public void postCondition() {
        driver.quit();
    }


}
