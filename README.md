# Sauce Login Demo

First project with Selenium-Java. Testing the login feature on https://www.saucedemo.com/

## Features

- Selenium WebDriver Automation 
  - Leverages Selenium WebDriver (latest version) to control Chrome for end-to-end web testing.

- Java Implementation 
  - Uses standard Java for the automation logic, making it easy for anyone with basic Java skills to read, modify, and run the tests.

- Simple “main” Method Test 
  - Provides a single entry point (main method) without requiring a formal test framework. Great for beginners who want to see immediate results.

- Login Flow Coverage
    - Valid Credentials: Ensures the correct username/password logs the user into the products page.
    - Invalid Credentials: Detects and reports error messages when incorrect login details are used.

- Element Locators 
  - Demonstrates how to locate elements (username field, password field, login button, cart icon, and error messages) using By.id and By.className.

- Error-Handling 
  - Shows how to handle NoSuchElementException if an expected element doesn’t appear, and how to continue with alternative checks.

- Expandable Structure 
  - Easy to add new test steps or more advanced features like wait conditions, Page Object Model (POM), or multi-browser testing. 
  - Pre-configured .gitignore and Maven structure make it simple to add dependencies or integrate with build tools.

- Maven-Based 
  - All dependencies (including Selenium) are managed through Maven, so anyone can clone the repo and immediately run the project without manually installing jars.

- Lightweight & Beginner-Friendly 
  - Minimal overhead—no advanced frameworks or complex configurations needed. 
  - Perfect for newcomers to learn Java and Selenium basics.

## Quick Start

1. Clone the repo:
   ```bash
   git clone https://github.com/joshrod94/sauce-login-demo.git

2. Open in IntelliJ (or your IDE of choice).

3. Run the `SauceLoginDemo` class to see a Chrome browser window open [Sauce Demo](https://www.saucedemo.com/).

4. The browser will quickly close and in your terminal, you will see the result of the test which should say "Login Successful: Cart Icon Found".
   - The reason I chose to look for the cart icon is because in store websites, there is usually a cart icon on the nav bar that is always there regardless of page updates. If I were to use a specific element on the loaded page, I run the risk of failure due to future website updates.

5. If you would like to see how it works when it fails due to bad a username/password, run the `SauceLoginDemoFailed` file.
    
6. Customize the code as needed for your automation tasks.

## Requirements

    Java 23 (or higher)
    Maven 3.9.9+ (you can check the latest version at https://mvnrepository.com/artifact/org.seleniumhq.selenium/selenium-java)
    (Optional) IntelliJ IDEA (this was created with Ultimate version 2024.2.3)
    Google Chrome (latest version would be best)

## License

This project is licensed under the
[Creative Commons Attribution-NonCommercial 4.0 License](LICENSE). **This software is free for everyone**, except it cannot be used for commercial purposes. See `LICENSE` for details.
