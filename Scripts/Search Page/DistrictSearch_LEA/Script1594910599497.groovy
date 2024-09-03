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

WebUI.navigateToUrl('https://safeqa.ode.state.oh.us/portal/')

WebUI.setText(findTestObject('Object Repository/Search/Page_SAFE Log On/input_User Name_UserName'), 'aparna.nanda')

WebUI.setText(findTestObject('Object Repository/Search/Page_SAFE Log On/input_Password_Password'), Password)

WebUI.click(findTestObject('Search/Page_SAFE Log On/button_Sign in'))

WebUI.click(findTestObject('Search/Page_SAFE Home/a_Monitoring'))

WebUI.delay(20)

WebUI.click(findTestObject('Search/Page_Compliance Monitoring/a_Consolidated ESEA Grants'))

WebUI.delay(10)

WebUI.click(findTestObject('DistrictSearch/Page_Compliance Monitoring/button_Search'))

WebUI.delay(8)

WebUI.verifyElementClickable(findTestObject('Search_As_District/Page_Compliance Monitoring/span_043802 - Columbus City School District'))

search = WebUI.getText(findTestObject('Search_As_District/Page_Compliance Monitoring/span_043802 - Columbus City School District'))

if (search.contains("$IRN")) {
    println('Result Found')
} else {
    KeywordUtil.markFailed('Incorrect Result')
}

