package pages_package;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class CustomerProfilePage {
    private final WebDriver driver;
    public CustomerProfilePage(WebDriver driver){
        this.driver = driver;
    }
    private final By editProfileBtn = By.xpath("//button[text()='Edit Profile']");
    public void clickEditProfile(){
        driver.findElement(editProfileBtn).click();
    }
}
