import org.openqa.selenium.By;
import org.openqa.selenium.NoSuchElementException;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class SauceLoginDemo {
    public static void main(String[] args) {
        // Initialize ChromeDriver (Selenium Manager should handle driver downloads in Selenium 4.6+)
        WebDriver driver = new ChromeDriver();

        // Navigate to Sauce Demo
        driver.get("https://www.saucedemo.com");

        // Find Username Field and enter the username
        driver.findElement(By.id("user-name")).sendKeys("standard_user");
        // Find Password Field and enter the password
        driver.findElement(By.id("password")).sendKeys("secret_sauce");
        // Find Login Button and click it
        driver.findElement(By.id("login-button")).click();

        //Check for login Error
        if (checkLoginError(driver)) {
            System.out.println("Login Error: Username and Password do not match. Check submitted credentials");
        } else {
            // Look for the shopping cart icon to confirm we logged in
            WebElement cartIcon = driver.findElement(By.className("shopping_cart_link"));
            // Check if it is displayed or not
            if (cartIcon.isDisplayed()) {
                System.out.println("Login Successful: Cart Icon Found");
            } else {
                System.out.println("Cart Icon Not Found. Possible Login Failure or Page was updated");
              }
          }

        // Close the browser
        driver.quit();
    }

    //Method to Check if the login error message appeared.
    private static boolean checkLoginError(WebDriver driver) {
        //Have the driver check for the error message
        try {
        WebElement errorMessage = driver.findElement(By.className("error-message-container"));
        //if the error message is present, it will return that it is being displayed.
        return errorMessage.isDisplayed();
        //NoSuchElementException is thrown by Selenium if the message is not present.
        } catch (NoSuchElementException e) {
        //return false if the message is not on the page.
            return false;
        }
    }
}
