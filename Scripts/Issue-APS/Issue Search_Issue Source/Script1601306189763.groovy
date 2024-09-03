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

WebUI.openBrowser('https://safeqa.ode.state.oh.us/portal')

WebUI.navigateToUrl('https://safeqa.ode.state.oh.us/portal')

WebUI.setText(findTestObject('Issues/Page_SAFE Log On/input_User Name_UserName'), 'aparna.nanda')

WebUI.setEncryptedText(findTestObject('Issues/Page_SAFE Log On/input_Password_Password'), 'PsbzPfH4d4s=')

WebUI.click(findTestObject('Issues/Page_SAFE Log On/button_Sign in'), FailureHandling.CONTINUE_ON_FAILURE)

WebUI.click(findTestObject('LEA_StartSurvey/Page_Compliance Monitoring/Page_SAFE Home/a_Monitoring'))

WebUI.click(findTestObject('Issues/Page_Compliance Monitoring/a_Consolidated ESEA Grants'))

WebUI.click(findTestObject('LEA_StartSurvey/Page_Compliance Monitoring/Page_Compliance Monitoring/button_Search'))

WebUI.click(findTestObject('Issue Search/Page_Compliance Monitoring/a_Issues Search'))

WebUI.selectOptionByValue(findTestObject('Issue Search/Page_Compliance Monitoring/select_AnyProgramType'), '120', false)

WebUI.setText(findTestObject('Issue Search/Page_Compliance Monitoring/input_Issue Source_issueSource'), Source)

WebUI.sendKeys(findTestObject('Issue Search/Page_Compliance Monitoring/input_Issue Source_issueSource'), Keys.chord(Keys.ENTER))

WebUI.click(findTestObject('SearchByCaseStatus/Page_ECM/button_Search'))

WebUI.delay(10)

search = WebUI.getText(findTestObject('Issue Search/Page_Compliance Monitoring/a_043802 - Columbus City School District'))

if (search.contains("$Source")) {
    println('Result Found')
} else {
    KeywordUtil.markFailed('Incorrect Result')
}

WebUI.closeBrowser()

