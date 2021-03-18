import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.Dimension;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

class showDate {

  @Test
  void TC1001() throws InterruptedException {
    WebDriver driver = null;
    String browser = "firefox";

    if (browser.equalsIgnoreCase("firefox")) {
      System.setProperty("webdriver.gecko.driver", "C:\\Users\\sometimes\\Desktop\\geckodriver.exe");
      driver = new FirefoxDriver();
    }
    driver.get("http://localhost:8080/Date/");
    driver.manage().window().setSize(new Dimension(958, 900));
    driver.findElement(By.id("month")).click();
    {
      WebElement dropdown = driver.findElement(By.id("month"));
      dropdown.findElement(By.xpath("//option[. = 'February']")).click();
    }
    driver.findElement(By.id("month")).click();
    driver.findElement(By.id("day")).click();
    driver.findElement(By.id("day")).sendKeys("02");
    driver.findElement(By.id("submit")).click();
    driver.findElement(By.id("month")).click();
    {
      WebElement dropdown = driver.findElement(By.id("month"));
      dropdown.findElement(By.xpath("//option[. = 'March']")).click();
    }
    driver.findElement(By.id("month")).click();
    driver.findElement(By.id("submit")).click();

    driver.close();
  }

  @Test
  void TC1002() throws InterruptedException {
    WebDriver driver = null;
    String browser = "firefox";

    if (browser.equalsIgnoreCase("firefox")) {
      System.setProperty("webdriver.gecko.driver", "C:\\Users\\sometimes\\Desktop\\geckodriver.exe");
      driver = new FirefoxDriver();
    }
    driver.get("http://localhost:8080/Date/");
    driver.manage().window().setSize(new Dimension(958, 900));
    driver.findElement(By.id("month")).click();
    {
      WebElement dropdown = driver.findElement(By.id("month"));
      dropdown.findElement(By.xpath("//option[. = 'January']")).click();
    }
    driver.findElement(By.id("month")).click();
    driver.findElement(By.id("day")).click();
    driver.findElement(By.id("day")).sendKeys("15");
    driver.findElement(By.id("submit")).click();
    driver.findElement(By.id("month")).click();
    {
      WebElement dropdown = driver.findElement(By.id("month"));
      dropdown.findElement(By.xpath("//option[. = 'March']")).click();
    }
    driver.findElement(By.id("month")).click();
    driver.findElement(By.id("submit")).click();

    driver.close();
  }

  @Test
  void TC1003() throws InterruptedException {
    WebDriver driver = null;
    String browser = "firefox";

    if (browser.equalsIgnoreCase("firefox")) {
      System.setProperty("webdriver.gecko.driver", "C:\\Users\\sometimes\\Desktop\\geckodriver.exe");
      driver = new FirefoxDriver();
    }
    driver.get("http://localhost:8080/Date/");
    driver.manage().window().setSize(new Dimension(958, 900));
    driver.findElement(By.id("month")).click();
    {
      WebElement dropdown = driver.findElement(By.id("month"));
      dropdown.findElement(By.xpath("//option[. = 'April']")).click();
    }
    driver.findElement(By.id("month")).click();
    driver.findElement(By.id("day")).click();
    driver.findElement(By.id("day")).sendKeys("20");
    driver.findElement(By.id("submit")).click();
    driver.findElement(By.id("month")).click();
    {
      WebElement dropdown = driver.findElement(By.id("month"));
      dropdown.findElement(By.xpath("//option[. = 'March']")).click();
    }
    driver.findElement(By.id("month")).click();
    driver.findElement(By.id("submit")).click();

    driver.close();
  };

};
