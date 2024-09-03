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

WebUI.setText(findTestObject('Object Repository/Search/Page_SAFE Log On/input_User Name_UserName'), 'aparna.nanda')

WebUI.setEncryptedText(findTestObject('Object Repository/Search/Page_SAFE Log On/input_Password_Password'), 'PsbzPfH4d4s=')

WebUI.click(findTestObject('Search/Page_SAFE Log On/button_Sign in'))

WebUI.click(findTestObject('Search/Page_SAFE Home/a_Monitoring'))

WebUI.delay(10)

WebUI.click(findTestObject('DistrictSearch/Page_Compliance Monitoring/Page_Compliance Monitoring/a_Charter School Program Grant'))

WebUI.delay(10)

WebUI.setText(findTestObject('Search/Page_Compliance Monitoring/input_District IRNName_district'), IRN)

WebUI.delay(5)

WebUI.sendKeys(findTestObject('Search/Page_Compliance Monitoring/input_District IRNName_district'), Keys.chord(Keys.ENTER))

WebUI.click(findTestObject('Search/Page_Compliance Monitoring/button_Search'))

WebUI.delay(10)

WebUI.getText(findTestObject('Search/Page_Compliance Monitoring/input_District IRNName_district'), FailureHandling.CONTINUE_ON_FAILURE)

if (search.contains("$IRN")) {
    println('Result Found')
} else {
    keywordUtil.markFailed('Incorrect Result')
}

WebUI.delay(5)

WebUI.closeBrowser()

