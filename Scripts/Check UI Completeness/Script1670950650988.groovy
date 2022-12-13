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

WebUI.openBrowser('')

WebUI.navigateToUrl('https://taskdev.mile.app/login')

WebUI.maximizeWindow()

WebUI.waitForElementPresent(findTestObject('Page_MileApp_Login/txtField_Organization_Name'), 10)

WebUI.verifyElementPresent(findTestObject('Page_Mile.app_UI Compliteness/logo_MileApp'), 0)

WebUI.verifyElementPresent(findTestObject('Page_Mile.app_UI Compliteness/txt_Login'), 0)

WebUI.verifyElementPresent(findTestObject('Page_Mile.app_UI Compliteness/txt_Organization_name'), 0)

WebUI.verifyElementPresent(findTestObject('Page_Mile.app_UI Compliteness/txt_email or username'), 0)

WebUI.verifyElementPresent(findTestObject('Page_Mile.app_UI Compliteness/txt_password'), 0)

WebUI.verifyElementPresent(findTestObject('Page_Mile.app_UI Compliteness/txtField_Organization Name'), 0)

WebUI.verifyElementPresent(findTestObject('Page_Mile.app_UI Compliteness/txtField_Email or Username'), 0)

WebUI.verifyElementPresent(findTestObject('Page_Mile.app_UI Compliteness/txtField_Password'), 0)

WebUI.verifyElementPresent(findTestObject('Page_Mile.app_UI Compliteness/btn_Login'), 0)

WebUI.verifyElementPresent(findTestObject('Page_Mile.app_UI Compliteness/txt_Not registered yet Contact us for more info'), 
    0)

WebUI.closeBrowser()

