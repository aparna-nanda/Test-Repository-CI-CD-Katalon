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

WebUI.openBrowser('')

WebUI.navigateToUrl('https://safeqa.ode.state.oh.us/portal/')

WebUI.setText(findTestObject('Object Repository/Search/Page_SAFE Log On/input_User Name_UserName'), 'aparna.nanda')

WebUI.setEncryptedText(findTestObject('Object Repository/Search/Page_SAFE Log On/input_Password_Password'), 'PsbzPfH4d4s=')

WebUI.click(findTestObject('Search/Page_SAFE Log On/button_Sign in'))

WebUI.click(findTestObject('Search/Page_SAFE Home/a_Monitoring'))

WebUI.delay(10)

WebUI.click(findTestObject('Object Repository/Search/Page_Compliance Monitoring/a_Consolidated ESEA Grants'))

WebUI.click(findTestObject('Search_Consultants/Page_Compliance Monitoring/input'))

WebUI.delay(10)

WebUI.setText(findTestObject('Search_Consultants/Page_Compliance Monitoring/input'), Consultant, FailureHandling.CONTINUE_ON_FAILURE)

WebUI.sendKeys(findTestObject('Search_Consultants/Page_Compliance Monitoring/input'), Keys.chord(Keys.ENTER))

WebUI.click(findTestObject('Search_Consultants/Page_Compliance Monitoring/button_Search'))

search = WebUI.getText(findTestObject('Search_Consultants/Page_Compliance Monitoring/td_ADA ACKISON Jeffrey Chrobak'))

if (search.contains("$Consultant")) {
    println('Result Found')
} else {
    KeywordUtil.markFailed('Incorrect Result')
}

WebUI.closeBrowser()

