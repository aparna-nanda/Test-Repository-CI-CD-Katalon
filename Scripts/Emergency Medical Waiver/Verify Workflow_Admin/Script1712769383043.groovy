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

WebUI.navigateToUrl('https://safeqa.ode.state.oh.us/portal/')

WebUI.setText(findTestObject('Object Repository/Page_SAFE Log On/input_User Name_UserName'), 'aparna.nanda')

WebUI.setEncryptedText(findTestObject('Object Repository/Page_SAFE Log On/input_Password_Password'), 'PsbzPfH4d4s=')

WebUI.click(findTestObject('Object Repository/Page_SAFE Log On/button_Sign in'))

WebUI.click(findTestObject('Object Repository/Page_SAFE Home/a_Forms Cloud'))

WebUI.selectOptionByValue(findTestObject('Object Repository/Page_Data Collection, Waivers and Appeals Forms/select_ODE View OnlyAdmin'), 
    '1', true)

WebUI.click(findTestObject('Object Repository/Page_Data Collection, Waivers and Appeals Forms/a_Emergency Medical Waiver'))

WebUI.setText(findTestObject('Object Repository/Page_Data Collection, Waivers and Appeals Forms/input_District IRNName_district'), 
    '043752')

WebUI.click(findTestObject('Object Repository/Page_Data Collection, Waivers and Appeals Forms/span_043752 - Cincinnati Public Schools (Hamilton)'))

WebUI.click(findTestObject('Object Repository/Page_Data Collection, Waivers and Appeals Forms/button_Search'))

WebUI.click(findTestObject('Page_Data Collection, Waivers and Appeals Forms/a_043752 - Cincinnati Public Schools'))

WebUI.click(findTestObject('Object Repository/Page_Data Collection, Waivers and Appeals Forms/a_Questions'))

WebUI.click(findTestObject('Page_Data Collection, Waivers and Appeals Forms/button_Add Student'))

WebUI.click(findTestObject('Page_Data Collection, Waivers and Appeals Forms/button_Add Student'))

WebUI.setText(findTestObject('Page_Data Collection, Waivers and Appeals Forms/input_Enter a valid statewide student identifier_ohio-field-input ng-untouched ng-pristine ng-valid'), 
    'AN5600245')

WebUI.click(findTestObject('Page_Data Collection, Waivers and Appeals Forms/button_Add Student_1'))

WebUI.delay(10)

WebUI.click(findTestObject('Page_Data Collection, Waivers and Appeals Forms/button_Add Student_1'))

WebUI.click(findTestObject('Page_Data Collection, Waivers and Appeals Forms/a_Start Survey'))

WebUI.closeBrowser()

