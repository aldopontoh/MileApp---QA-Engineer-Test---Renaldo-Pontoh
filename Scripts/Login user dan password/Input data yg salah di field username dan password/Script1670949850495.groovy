import static com.kms.katalon.core.checkpoint.CheckpointFactory.findCheckpoint
import static com.kms.katalon.core.testcase.TestCaseFactory.findTestCase
import static com.kms.katalon.core.testdata.TestDataFactory.findTestData
import static com.kms.katalon.core.testobject.ObjectRepository.findTestObject
import static com.kms.katalon.core.testobject.ObjectRepository.findWindowsObject
import com.kms.katalon.core.checkpoint.Checkpoint as Checkpoint
import com.kms.katalon.core.cucumber.keyword.CucumberBuiltinKeywords as CucumberKW
import com.kms.katalon.core.mobile.keyword.MobileBuiltInKeywords as Mobile
import com.kms.katalon.core.model.FailureHandling as FailureHandling
import com.kms.katalon.core.testcase.TestCase as TestCase
import com.kms.katalon.core.testdata.TestData as TestData
import com.kms.katalon.core.testng.keyword.TestNGBuiltinKeywords as TestNGKW
import com.kms.katalon.core.testobject.TestObject as TestObject
import com.kms.katalon.core.webservice.keyword.WSBuiltInKeywords as WS
import com.kms.katalon.core.webui.keyword.WebUiBuiltInKeywords as WebUI
import com.kms.katalon.core.windows.keyword.WindowsBuiltinKeywords as Windows
import internal.GlobalVariable as GlobalVariable
import org.openqa.selenium.Keys as Keys

WebUI.openBrowser(GlobalVariable.url)

WebUI.navigateToUrl('https://taskdev.mile.app/login')

WebUI.maximizeWindow()

WebUI.waitForElementPresent(findTestObject('Page_MileApp_Login/txtField_Organization_Name'), 10)

WebUI.setText(findTestObject('Page_MileApp_Login/txtField_Organization_Name'), GlobalVariable.valid_org_name)

WebUI.sendKeys(findTestObject('Page_MileApp_Login/txtField_Organization_Name'), Keys.chord(Keys.ENTER))

WebUI.waitForElementPresent(findTestObject('Page_MileApp_Login/txtField_username'), 5)

WebUI.setText(findTestObject('Page_MileApp_Login/txtField_username'), 'usernametest')

WebUI.setText(findTestObject('Page_MileApp_Login/txtField_Password'), '123456')

WebUI.click(findTestObject('Page_MileApp_Login/btn_Login'))

WebUI.verifyElementPresent(findTestObject('Page_MileApp_Login/txt_Login_failed'), 0)

WebUI.closeBrowser()

