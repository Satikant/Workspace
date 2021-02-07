package quiz.ObjectRepo;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.testng.Reporter;
import org.testng.asserts.SoftAssert;


public class Quizindex {
	@FindBy(xpath="//h4[contains(text(),'\"GENERAL KNOWLEDGE QUIZ 1\"')]")
	private WebElement index;
	
	@FindBy(xpath="//span[contains(text(),'Active Participants')]")
	private WebElement participants;
	@FindBy(xpath="//span[contains(text(),'Active Participants')]/span")
	private WebElement NumOfParticipants;
	
	//First Questions
	@FindBy(xpath="//h5[@class='card-title quizquestion']")
	private WebElement FirstQuestion;
	
	@FindBy(xpath="//div[contains(text(),' Potassium dichromatic - sulphuric acid')]")
	private WebElement FirstAnswer;
	
	//Second Questions
	@FindBy(xpath="//h5[@class='card-title quizquestion']")
	private WebElement SecondQuestion;
	@FindBy(xpath="//div[contains(text(),\" COPAL- 19\")]")
	private WebElement secondAnswer;
	
	
public void Playquizindex() throws Throwable
{
SoftAssert verify= new SoftAssert();
String actheadertext=index.getText();
String expheadertext="\"GENERAL KNOWLEDGE QUIZ 1\"";
verify.assertEquals(actheadertext, expheadertext);
System.out.println("Header Verify " + verify);
Reporter.log("Verify Header", true);
Thread.sleep(30000);

//String actquiztext=participants.getText();
//String expquiztext="Active Participants";
//verify.assertEquals(actquiztext, expquiztext);
//System.out.println("Partcipants Verify " + verify);
//Reporter.log("Verify Partcipants", true);

//Action on question
String print=FirstQuestion.getText();
System.out.println(print);
FirstAnswer.click();
Thread.sleep(30000);
String printsecond=SecondQuestion.getText();
System.out.println(printsecond);
secondAnswer.click();

verify.assertAll();
	
}
}
