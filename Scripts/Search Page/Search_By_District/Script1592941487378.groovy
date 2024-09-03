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
import com.kms.katalon.core.testobject.TestObject as TestObject
import com.kms.katalon.core.webservice.keyword.WSBuiltInKeywords as WS
import com.kms.katalon.core.webui.keyword.WebUiBuiltInKeywords as WebUI
import com.kms.katalon.core.windows.keyword.WindowsBuiltinKeywords as Windows
import internal.GlobalVariable as GlobalVariable
import org.openqa.selenium.Keys as Keys

WebUI.openBrowser('')

WebUI.navigateToUrl('https://safeqa.ode.state.oh.us/portal/')

WebUI.setText(findTestObject('Object Repository/DistrictSearch/Page_Compliance Monitoring/Page_SAFE Log On/input_User Name_UserName'), 
    'aparna.nannandada')

WebUI.setEncryptedText(findTestObject('Object Repository/DistrictSearch/Page_Compliance Monitoring/Page_SAFE Log On/input_Password_Password'), 
    'PsbzPfH4d4s=')

WebUI.click(findTestObject('Object Repository/DistrictSearch/Page_Compliance Monitoring/Page_SAFE Log On/button_Sign in'))

WebUI.click(findTestObject('Object Repository/DistrictSearch/Page_Compliance Monitoring/Page_SAFE Log On/html_SAFE Log On          Font Awesome Pro _491cb5'))

WebUI.setText(findTestObject('Object Repository/DistrictSearch/Page_Compliance Monitoring/Page_SAFE Log On/input_User Name_UserName'), 
    'aparna.nanda')

WebUI.setEncryptedText(findTestObject('Object Repository/DistrictSearch/Page_Compliance Monitoring/Page_SAFE Log On/input_Password_Password'), 
    'PsbzPfH4d4s=')

WebUI.click(findTestObject('Object Repository/DistrictSearch/Page_Compliance Monitoring/Page_SAFE Log On/button_Sign in'))

WebUI.click(findTestObject('Object Repository/DistrictSearch/Page_Compliance Monitoring/Page_SAFE Home/a_Monitoring'))

WebUI.click(findTestObject('Object Repository/DistrictSearch/Page_Compliance Monitoring/Page_Compliance Monitoring/a_Charter School Program Grant'))

WebUI.setText(findTestObject('Object Repository/DistrictSearch/Page_Compliance Monitoring/Page_Compliance Monitoring/input_District IRNName_district'), 
    '043802')

WebUI.click(findTestObject('Object Repository/DistrictSearch/Page_Compliance Monitoring/Page_Compliance Monitoring/span_043802 - Columbus City Schools Distric_0921eb'))

WebUI.doubleClick(findTestObject('Object Repository/DistrictSearch/Page_Compliance Monitoring/Page_Compliance Monitoring/input_District IRNName_district'))

WebUI.setText(findTestObject('Object Repository/DistrictSearch/Page_Compliance Monitoring/Page_Compliance Monitoring/input_District IRNName_district'), 
    '043802')

WebUI.click(findTestObject('Object Repository/DistrictSearch/Page_Compliance Monitoring/Page_Compliance Monitoring/button_043802 - Columbus City Schools Distr_48b7a7'))

WebUI.closeBrowser()

