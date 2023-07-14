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

WebUI.navigateToUrl('https://www.instagram.com/')

WebUI.setText(findTestObject('Object Repository/Page_Instagram/input_Phone number, username, or email_username'), 'mikeesGJ')

WebUI.setEncryptedText(findTestObject('Object Repository/Page_Instagram/input_Password_password'), 'EMhgNJr5phyByUShNi1ehg==')

WebUI.click(findTestObject('Object Repository/Page_Instagram/div_Log in'))

WebUI.click(findTestObject('Object Repository/Page_Instagram/div_Not Now'))

WebUI.click(findTestObject('Page_Instagram/button_Not Now'))

WebUI.click(findTestObject('Object Repository/Page_Instagram/div_Search'))

WebUI.setText(findTestObject('Object Repository/Page_Instagram/input_Password_password'), 'michaelsetiawan31')

WebUI.verifyElementVisible(findTestObject('Page_Instagram/div_michaelsetiawan31Michael Setiawan'))

WebUI.closeBrowser()

