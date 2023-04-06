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
         String singupName = "Dmytro";
         String singupLastName ="Shap";
         String singupEmail = "qatest1234@gmail.com";
         String singupPassword = "Qwerty1234";
         driver.findElement(By.cssSelector(".hero-descriptor_btn")).click();
         Thread.sleep(1000);
         driver.findElement(By.id("signupName")).sendKeys(singupName);
         Thread.sleep(500);
         driver.findElement(By.id("signupLastName")).sendKeys(singupLastName);
         Thread.sleep(500);
         driver.findElement(By.id("signupEmail")).sendKeys(singupEmail);
         Thread.sleep(500);
         driver.findElement(By.id("signupPassword")).sendKeys(singupPassword);
         Thread.sleep(500);
         driver.findElement(By.id("signupRepeatPassword")).sendKeys(singupPassword);
         Thread.sleep(500);
         driver.findElement(By.cssSelector("div.modal-footer > .btn-primary")).click();
         Thread.sleep(1000);
         //2 Піти в профайл і перевірити, що там такі ж name і lastName як при реєстрації
         driver.findElement(By.cssSelector(".btn-sidebar.sidebar_btn.-profile")).click();
         Thread.sleep(1000);
         WebElement name = driver.findElement(By.cssSelector(".display-4"));
         Assert.assertEquals("Incorrect Name or Lastname ", (singupName + " " + singupLastName) , name.getText());

         //3 Додати авто

         driver.findElement(By.cssSelector(".sidebar-wrapper > nav > a:nth-child(1)")).click();
         Thread.sleep(1000);
         driver.findElement(By.cssSelector(".justify-content-between > button")).click();
         Thread.sleep(1000);
         driver.findElement(By.cssSelector("#addCarBrand > option:nth-child(2)")).click();
         Thread.sleep(500);
         driver.findElement(By.cssSelector("#addCarModel > option:nth-child(3)")).click();
         Thread.sleep(500);
         driver.findElement(By.id("addCarMileage")).sendKeys("100");
         Thread.sleep(500);
         driver.findElement(By.cssSelector(".justify-content-end > button.btn.btn-primary")).click();
         Thread.sleep(1000);

         //4 Додати expenses цьому авто

         driver.findElement(By.cssSelector(".car_add-expense.btn-success")).click();
         Thread.sleep(1000);
         driver.findElement(By.id("addExpenseMileage")).clear();
         Thread.sleep(500);
         driver.findElement(By.id("addExpenseMileage")).sendKeys("123");
         Thread.sleep(500);
         driver.findElement(By.id("addExpenseLiters")).sendKeys("10");
         Thread.sleep(500);
         driver.findElement(By.id("addExpenseTotalCost")).sendKeys("2");
         Thread.sleep(500);
         driver.findElement(By.cssSelector(".justify-content-end > button.btn.btn-primary")).click();
         Thread.sleep(1000);

         //5 Видалити користувача
        // div.col-3.d-none.d-lg-block.sidebar-wrapper > nav > div > a:nth-child(2)
         driver.findElement(By.cssSelector(".sidebar-wrapper > nav > div > a:nth-child(2)")).click();
         Thread.sleep(1000);
         driver.findElement(By.cssSelector(".btn-danger-bg")).click();
         Thread.sleep(1000);
         driver.findElement(By.cssSelector(".btn-danger")).click();
         Thread.sleep(1000);
     }
    @After
    public void postCondition() {
        driver.quit();
    }


}
