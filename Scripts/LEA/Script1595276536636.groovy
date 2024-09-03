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

WebUI.setText(findTestObject('Page_SAFE Home/LEA/Page_SAFE Log On/input_User Name_UserName'), 'aparna.nanda')

WebUI.setEncryptedText(findTestObject('Page_SAFE Home/LEA/Page_SAFE Log On/input_Password_Password'), 'PsbzPfH4d4s=')

WebUI.sendKeys(findTestObject('Page_SAFE Home/LEA/Page_SAFE Log On/input_Password_Password'), Keys.chord(Keys.ENTER))

WebUI.click(findTestObject('Page_SAFE Home/LEA/Page_SAFE Home/a_Monitoring'))

WebUI.click(findTestObject('Page_SAFE Home/LEA/Page_Compliance Monitoring/a_Consolidated ESEA Grants'))

WebUI.setText(findTestObject('Page_SAFE Home/LEA/Page_Compliance Monitoring/input_Building IRNName_building'), '000497')

WebUI.click(findTestObject('Page_SAFE Home/LEA/Page_Compliance Monitoring/span_000497 - Alpine Elementary School'))

WebUI.click(findTestObject('Page_SAFE Home/LEA/Page_Compliance Monitoring/button_Search'))

WebUI.click(findTestObject('Page_SAFE Home/LEA/Page_Compliance Monitoring/td_000497 - Alpine Elementary School'))

WebUI.click(findTestObject('Page_SAFE Home/LEA/Page_Compliance Monitoring/a_000497 - Alpine Elementary School'))

WebUI.closeBrowser()

