package Operations;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class Calculations 
{
        WebDriver driver;
        
        @FindBy (xpath=("//*[@id=\"sciInPut\"]"))
        private WebElement input;
        
        @FindBy (xpath=("//*[@id=\"sciOutPut\"]"))
        private WebElement output;
        
        @FindBy (xpath=("//*[@id=\"sciout\"]/tbody/tr[2]/td[2]/div/div[1]/span[5]"))
        private WebElement back;
        
        @FindBy(xpath=("//span[text()='1']"))
	    private WebElement one;
	    
	    @FindBy(xpath=("//span[text()='2']"))
	    private WebElement two;
	    
	    @FindBy(xpath=("//span[text()='3']"))
	    private WebElement three;
	    
	    @FindBy(xpath=("//span[text()='4']"))
	    private WebElement four;
	    
	    @FindBy(xpath=("//span[text()='5']"))
	    private WebElement five;
	    
	    @FindBy(xpath=("//span[text()='6']"))
	    private WebElement six;
	    
	    @FindBy(xpath=("//span[text()='7']"))
	    private WebElement seven;
	    
	    @FindBy(xpath=("//span[text()='8']"))
	    private WebElement eight;
	    
	    @FindBy(xpath=("//span[text()='9']"))
	    private WebElement nine;
	    
	    @FindBy(xpath=("//span[text()='0']"))
	    private WebElement zero;
	   
	    @FindBy(xpath=("//span[text()='+']"))
	    private WebElement plus;
	    
	    @FindBy(xpath=("//span[text()='–']"))
	    private WebElement minus;
	    
	    @FindBy(xpath=("//span[text()='×']"))
	    private WebElement multiply;
	    
	    @FindBy(xpath=("//span[text()='/']"))
	    private WebElement division;
	          
	    @FindBy(xpath=("//span[text()='=']"))
	    private WebElement equals;

	    @FindBy(xpath=("//span[text()='AC']"))
	    private WebElement AC;
	    

		public void Calculations(WebDriver driver)
	    {
	    	PageFactory.initElements(driver, this);
	    	this.driver = driver;
	    }

	    public void Addition(WebDriver driver) throws InterruptedException
	    {   
	    	input.click();
	    	
	        AC.click();
	        
	        Thread.sleep(1000);
	        
	    	minus.click();
	    	two.click();
	    	three.click();
	    	four.click();
	    	two.click();
	    	three.click();
	    	four.click();
	    	
	    	Thread.sleep(1000);
	    	
	    	plus.click();
	    	
	    	three.click();
	    	four.click();
	    	five.click();
	    	three.click();
	    	four.click();
	    	five.click();
	    	
	    	Thread.sleep(1000);
	    	
	    	equals.click();
	    	
	    	Thread.sleep(1000);
	    	
	    }
	  
	   public void VerifyAdditionIsCorrect()
	   {
		   String output_a = output.getText(); 
		   
		   if(output_a.equals("111111"))
		   {
			  System.out.println("Test Pass"); 
		   }
		   else
		   {
			   System.out.println("Test Failed");
		   }
	   
	   
	   }  
	   public void Subtraction(WebDriver driver) throws InterruptedException
	   {
		   AC.click();
		   
		   Thread.sleep(1000);
		   
		   two.click();
		   three.click();
		   four.click();
		   eight.click();
		   two.click();
		   three.click();
		   
		   Thread.sleep(1000);
		   
		   minus.click();
		   
		   Thread.sleep(1000);
		   
		   minus.click();
		   two.click();
		   three.click();
		   zero.click();
		   nine.click();
		   four.click();
		   eight.click();
		   two.click();
		   three.click();
		   
		   Thread.sleep(1000);
		   
		   equals.click();
	   }
         
	   public void VerifySubtractionIsCorrect()
	   {
		   String output_a = output.getText(); 
		   
		   if(output_a.equals("23329646"))
		   {
			  System.out.println("Subtraction Test Pass"); 
		   }
		   else
		   {
			   System.out.println("Subtraction Test Failed");
		   }
      }
        
	   public void Multiplication(WebDriver driver) throws InterruptedException
	   {
		   AC.click();
		   
		   Thread.sleep(1000);
		   
		   four.click();
		   two.click();
		   three.click();
		   
		   Thread.sleep(1000);
		   
		   multiply.click();
		   
		   Thread.sleep(1000);
		   
		   five.click();
		   two.click();
		   five.click();
		   
		   Thread.sleep(1000);
		   
		   equals.click();
	   }
         
	   public void VerifyMultiplicationIsCorrect()
	   {
		   String output_a = output.getText(); 
		   
		   if(output_a.equals("222075"))
		   {
			  System.out.println("Multiplication Test Pass"); 
		   }
		   else
		   {
			   System.out.println("Multiplication Test Failed");
		   }
      }
           
	     
	   public void Division(WebDriver driver) throws InterruptedException
	   {
		   AC.click();
		   
		   Thread.sleep(1000);
		   
		   four.click();
		   zero.click();
		   zero.click();
		   zero.click();
		   
		   Thread.sleep(1000);
		   
		   division.click();
		   
		   Thread.sleep(1000);
		   
		   two.click();
		   zero.click();
		   zero.click();
		   
		   Thread.sleep(1000);
		   
		   equals.click();
		   
		   Thread.sleep(1000);
		   
		   AC.click();
	   }
         
	   public void VerifyDivideIsCorrect()
	   {
		   String output_a = output.getText(); 
		   
		   if(output_a.equals("20"))
		   {
			  System.out.println("Division Test Pass"); 
		   }
		   else
		   {
			   System.out.println("Division Test Failed");
		   }
       }
        
	  
}