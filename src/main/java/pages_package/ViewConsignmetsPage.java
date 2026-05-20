package pages_package;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class ViewConsignmetsPage {
    private final WebDriver driver;
    public ViewConsignmetsPage(WebDriver driver){
        this.driver = driver;
    }
    private final By createNew = By.xpath("//span[text()=\"Create new\"]");

    public void clickCreateNew(){
        driver.findElement(createNew).click();
    }
}
