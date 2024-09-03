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

WebUI.navigateToUrl('https://safeqa.ode.state.oh.us/portal')

WebUI.setText(findTestObject('Issues/Page_SAFE Log On/input_User Name_UserName'), Username)

WebUI.setText(findTestObject('Issues/Page_SAFE Log On/input_Password_Password'), Password)

WebUI.click(findTestObject('Issues/Page_SAFE Log On/button_Sign in'), FailureHandling.CONTINUE_ON_FAILURE)

WebUI.click(findTestObject('LEA_StartSurvey/Page_Compliance Monitoring/Page_SAFE Home/a_Monitoring'))

WebUI.click(findTestObject('Issues/Page_Compliance Monitoring/a_Charter School Program Grant'))

WebUI.click(findTestObject('LEA_StartSurvey/Page_Compliance Monitoring/Page_Compliance Monitoring/button_Search'))

WebUI.click(findTestObject('Issues/Page_Compliance Monitoring/a_000556 - A Arts Academy'))

WebUI.click(findTestObject('Issues/Page_Compliance Monitoring/a_Issues  APS'))

WebUI.click(findTestObject('Issues/Page_Compliance Monitoring/button_Add New Issue'))

WebUI.setText(findTestObject('Issues/Page_Compliance Monitoring/textarea_Issue Name_issueName'), 'test-an')

WebUI.setText(findTestObject('Issues/Page_Compliance Monitoring/div_Recommendation_ql-editor ql-blank'), '<p style="">test123</p>')

WebUI.click(findTestObject('Issues/Page_Compliance Monitoring/button_Add Issue'))

WebUI.delay(10)

WebUI.closeBrowser(FailureHandling.CONTINUE_ON_FAILURE)

