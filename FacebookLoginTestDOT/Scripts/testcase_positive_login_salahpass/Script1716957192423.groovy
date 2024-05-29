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

WebUI.navigateToUrl('https://id-id.facebook.com/')

WebUI.setText(findTestObject('Object Repository/Test_Positive2/Page_Facebook - Masuk atau Daftar/input_Facebook membantu Anda terhubung dan _d8519f'), 
    'Nathanwijayanto@yahoo.co.id')

WebUI.setEncryptedText(findTestObject('Object Repository/Test_Positive2/Page_Facebook - Masuk atau Daftar/input_Facebook membantu Anda terhubung dan _cfe51c'), 
    'EOahroWyHJF54TqwgOTGprykZ8fXtG/k')

WebUI.click(findTestObject('Object Repository/Test_Positive2/Page_Facebook - Masuk atau Daftar/button_Masuk'))

WebUI.click(findTestObject('Object Repository/Test_Positive2/Page_Facebook/a_Login dengan kata sandi'))

WebUI.setEncryptedText(findTestObject('Object Repository/Test_Positive2/Page_Masuk Facebook/input_Bukan Anda_pass'), 'EOahroWyHJHiBqCMSMPGdg==')

WebUI.click(findTestObject('Object Repository/Test_Positive2/Page_Masuk Facebook/button_Masuk'))

WebUI.verifyElementPresent(findTestObject('Positive_Login/Page_(20) Facebook/Page_(20) Facebook/span_Nathan Wijayanto'),
	10)

WebUI.closeBrowser()

