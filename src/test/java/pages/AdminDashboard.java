package pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class AdminDashboard {

    //Admin Dashboard >> Menü >> Para Birimleri
    @FindBy (xpath = "(//span[@class='aside-menu-title'])[12]")
    public WebElement paraBirimleriElementi;


    //Admin Dashboard >> Menü >> Users
    @FindBy (xpath = "//span[text()='Users']")
    public WebElement usersElementi;







}
