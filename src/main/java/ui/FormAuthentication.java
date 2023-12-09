package ui;

import org.openqa.selenium.By;

public class FormAuthentication {
    public static By username = By.id("username");
    public static By password = By.id("password");
    public static By loginButton = By.xpath("//*[@id=\"login\"]/button/i");
    public static By alertSuccess = By.xpath("//*[@id=\"flash\"]");
    public static By logoutButton = By.xpath("//*[@id=\"content\"]/div/a");
}

