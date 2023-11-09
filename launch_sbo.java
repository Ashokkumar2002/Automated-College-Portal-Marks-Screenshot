package hello;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.openqa.selenium.WebElement;

public class launch_sbo {
    public static void main(String[] args) {
        // Set the path to the ChromeDriver
        System.setProperty("webdriver.chrome.driver", "C:/Users/Ashok/Desktop/chromedriver.exe");
        ChromeDriver driver = new ChromeDriver();

        // Open the login page
        driver.get("your_college_website");
        driver.manage().window().maximize();
        try {
            Thread.sleep(2000); 
        } catch (InterruptedException e) {
            e.printStackTrace();
        }         
        WebElement usernameField = driver.findElement(By.id("txt_username")); 
        WebElement passwordField = driver.findElement(By.id("txt_password")); 
       
        try {
            Thread.sleep(2000); 
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
        usernameField.sendKeys("your_name");
        
        passwordField.sendKeys("your_password");
        driver.findElement(By.id("cmd_login")).click();  
        // ...
        try {
            Thread.sleep(2000); 
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
        driver.findElement(By.id("ctl00_DetailContent_tab_container_TabPanel_internal_mark_lbtn_internal_mark")).click();
        
        try {
            Thread.sleep(10000); 
        } catch (InterruptedException e) {
            e.printStackTrace();
        } 
        //driver.quit(); close the entire browser
    }
}
