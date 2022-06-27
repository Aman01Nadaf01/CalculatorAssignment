package Calculation;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

import Operations.BaseClass;
import Operations.Calculations;

public class Calculator 
{
  WebDriver driver;
  
  @Test
  
  public void VerifyOperation() throws InterruptedException
  
  {
    driver = BaseClass.getWebDriver();
    
    Calculations c = new Calculations();
    
    c.Calculations(driver);
    
    c.Addition(driver);
    
    c.Subtraction(driver);
    
    c.Multiplication(driver);
    
    c.Division(driver);
    
    c.VerifyAdditionIsCorrect();
    
    c.VerifySubtractionIsCorrect();
    
    c.VerifyMultiplicationIsCorrect();
    
    c.VerifyDivideIsCorrect();
    
  }
}
