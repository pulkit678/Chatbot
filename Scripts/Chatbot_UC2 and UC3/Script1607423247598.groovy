import static com.kms.katalon.core.testobject.ObjectRepository.findTestObject
import java.awt.Robot as Robot
import java.awt.event.KeyEvent as KeyEvent
import org.openqa.selenium.Keys as Keys
import com.kms.katalon.core.webui.keyword.WebUiBuiltInKeywords as WebUI
import com.kms.katalon.core.mobile.keyword.MobileBuiltInKeywords as Mobile
import com.kms.katalon.core.cucumber.keyword.CucumberBuiltinKeywords as CucumberKW
import com.kms.katalon.core.webservice.keyword.WSBuiltInKeywords as WS
import com.kms.katalon.core.windows.keyword.WindowsBuiltinKeywords as Windows
import static com.kms.katalon.core.testobject.ObjectRepository.findWindowsObject
import static com.kms.katalon.core.testdata.TestDataFactory.findTestData
import static com.kms.katalon.core.testcase.TestCaseFactory.findTestCase
import static com.kms.katalon.core.checkpoint.CheckpointFactory.findCheckpoint
import com.kms.katalon.core.model.FailureHandling as FailureHandling
import com.kms.katalon.core.testcase.TestCase as TestCase
import com.kms.katalon.core.testdata.TestData as TestData
import com.kms.katalon.core.testobject.TestObject as TestObject
import com.kms.katalon.core.checkpoint.Checkpoint as Checkpoint
import internal.GlobalVariable as GlobalVariable

WebUI.openBrowser('')

WebUI.maximizeWindow()

WebUI.navigateToUrl('https://claimswidget.experiencebuilder.accenture.com/')

try {
    WebUI.click(findTestObject('Page_Insurance online Application_UC2 and UC3/img_ng-tns-c2-0'))

    WebUI.click(findTestObject('Page_Insurance online Application_UC2 and UC3/button_Book Rental Car'))

   WebUI.setText(findTestObject('Page_Insurance online Application_UC2 and UC3/input_Happy to helpPlease enter your regist_77e9ab'), 
       MobileNumber)

	
	//WebUI.setText(findTestObject('Page_Insurance online Application_UC2 and UC3/input_Happy to helpPlease enter your regist_77e9ab'),'9742735089')
    WebUI.sendKeys(findTestObject('Page_Insurance online Application_UC2 and UC3/input_Happy to helpPlease enter your regist_77e9ab'), 
        Keys.chord(Keys.ENTER))

    WebUI.click(findTestObject('Page_Insurance online Application_UC2 and UC3/button_Yes'))

    WebUI.click(findTestObject('Page_Insurance online Application_UC2 and UC3/input_Date Time_ng-tns-c2-0'))

    WebUI.doubleClick(findTestObject('Page_Insurance online Application_UC2 and UC3/svg'))

    WebUI.click(findTestObject('Page_Insurance online Application_UC2 and UC3/span_Set'))

    WebUI.click(findTestObject('Page_Insurance online Application_UC2 and UC3/span'))

    WebUI.click(findTestObject('Page_Insurance online Application_UC2 and UC3/button__owl-dot'))

    WebUI.click(findTestObject('Page_Insurance online Application_UC2 and UC3/img_concat(Ok here  s a list of our rental _613f26'))

    //WebUI.click(findTestObject('Page_Insurance online Application_UC2 and UC3/button_Yes'))
    WebUI.click(findTestObject('Page_Insurance online Application_UC2 and UC3/button_Yes (1)'))

    WebUI.click(findTestObject('Page_Insurance online Application_UC2 and UC3/button_Medical Records'))

    WebUI.click(findTestObject('Page_Insurance online Application_UC2 and UC3/button_Yes (2)'))

    WebUI.click(findTestObject('Page_Insurance online Application_UC2 and UC3/div_ISwathi authorize InsureMe to collect m_0a84c3'))

    WebUI.click(findTestObject('Page_Insurance online Application_UC2 and UC3/canvas'))

    WebUI.click(findTestObject('Page_Insurance online Application_UC2 and UC3/button_Submit'))

    WebUI.click(findTestObject('Page_Insurance online Application_UC2 and UC3/button_Yes (3)'))

    WebUI.click(findTestObject('Page_Insurance online Application_UC2 and UC3/button_Other Driver Information'))

    WebUI.click(findTestObject('Page_Insurance online Application_UC2 and UC3/button_Yes (4)'))

    WebUI.click(findTestObject('Page_Insurance online Application_UC2 and UC3/button_Skip_1'))

    WebUI.click(findTestObject('Page_Insurance online Application_UC2 and UC3/button_Skip_2'))

    WebUI.click(findTestObject('Page_Insurance online Application_UC2 and UC3/button_Skip_3'))

    /*
WebUI.click(findTestObject('Page_Insurance online Application_UC2 and UC3/button_Take a photo'))

Robot robot = new Robot()

robot.delay(2000)

robot.keyPress(KeyEvent.VK_TAB)

robot.delay(1000)

robot.keyPress(KeyEvent.VK_TAB)

robot.delay(1000)

robot.keyPress(KeyEvent.VK_ENTER)

robot.keyPress(KeyEvent.VK_ENTER)

WebUI.delay(5)

/*
WebUI.waitForAlert(15)

WebUI.verifyAlertPresent(5)

WebUI.acceptAlert()

WebUI.enhancedClick(findTestObject('Page_Insurance online Application_UC2 and UC3/button_Take a photo'))


WebUI.enhancedClick(findTestObject('Page_Insurance online Application_UC2 and UC3/button_Take a photo'))

WebUI.delay(10)

WebUI.enhancedClick(findTestObject('Page_Insurance online Application_UC2 and UC3/button_Take a photo_1'))

WebUI.enableSmartWait()

WebUI.delay(10)

WebUI.enhancedClick(findTestObject('Page_Insurance online Application_UC2 and UC3/button_Take a photo_1'))

WebUI.enableSmartWait()

WebUI.enhancedClick(findTestObject('Page_Insurance online Application_UC2 and UC3/button_Take a photo_2'))

WebUI.enableSmartWait()

WebUI.enhancedClick(findTestObject('Page_Insurance online Application_UC2 and UC3/button_Take a photo_2'))
*/
    WebUI.click(findTestObject('Page_Insurance online Application_UC2 and UC3/button_No'))

    WebUI.takeScreenshot()
}
catch (Exception e) {
    println('flow stops abruptly ')

    WebUI.takeScreenshot()
} 

