package pages_package;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import java.time.Duration;

public class DashboardPage {
    private final WebDriver driver;
    private final WebDriverWait wait;
    public DashboardPage(WebDriver driver){
        this.driver =driver;
        this.wait = new WebDriverWait(driver, Duration.ofSeconds(10));
    }
   private final By receiverTab = By.xpath("//span[text()='Receiver']");
   private final By profilee = By.xpath("//h4[@class='text-sm font-medium text-gray-800 truncate']");
   private final By settingsTab = By.xpath("//span[text()='Settings']");
   private final By consignmentsDropdown = By.xpath("//span[text()=\"Consignments\"]");
   private final By viewConsignmentsTab = By.xpath("//a[text()=\"View Consignments\"]");
   private final By logoutTab = By.xpath("//div[@class=\"flex items-center px-[10px] text-gray-500 hover:bg-gray-100 rounded-[6px] cursor-pointer w-full py-[6px] text-sm \"]");


    public void clickReceiver(){
        driver.findElement(receiverTab).click();
    }
    public void clickOnProfile(){
        driver.findElement(profilee).click();
    }
    public void clickOnSettingsTab(){
        driver.findElement(settingsTab).click();
    }
    public void clickConsignmentsDropdown(){
        driver.findElement(consignmentsDropdown).click();
    }
    public void  clickViewConsignments(){
        driver.findElement(viewConsignmentsTab).click();
    }

    public void clickOnLogoutTab(){
        driver.findElement(logoutTab).click();
    }


}
