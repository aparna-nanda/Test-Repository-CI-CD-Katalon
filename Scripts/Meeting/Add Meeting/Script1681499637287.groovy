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

WebUI.setText(findTestObject('Object Repository/Meeting/Page_SAFE Log On/input_User Name_UserName'), 'aparna.nanda')

WebUI.setEncryptedText(findTestObject('Object Repository/Meeting/Page_SAFE Log On/input_Password_Password'), 'FWcBee7EFZE=')

WebUI.click(findTestObject('Object Repository/Meeting/Page_SAFE Log On/button_Sign in'))

WebUI.click(findTestObject('Object Repository/Meeting/Page_SAFE Log On/input_User Name_UserName'))

WebUI.setEncryptedText(findTestObject('Object Repository/Meeting/Page_SAFE Log On/input_Password_Password'), 'PsbzPfH4d4s=')

WebUI.sendKeys(findTestObject('Object Repository/Meeting/Page_SAFE Log On/input_Password_Password'), Keys.chord(Keys.ENTER))

WebUI.click(findTestObject('Object Repository/Meeting/Page_SAFE Home/td_Monitoring'))

WebUI.click(findTestObject('Object Repository/Meeting/Page_SAFE Home/a_Monitoring'))

WebUI.click(findTestObject('Object Repository/Meeting/Page_Compliance Monitoring/div_Program Associated ToConsolidated ESEA _3cf6b4'))

WebUI.click(findTestObject('Object Repository/Meeting/Page_Compliance Monitoring/button_Search'))

WebUI.click(findTestObject('Object Repository/Meeting/Page_Compliance Monitoring/a_000556 - A Arts Academy'))

WebUI.click(findTestObject('Object Repository/Meeting/Page_Compliance Monitoring/a_Meeting'))

WebUI.click(findTestObject('Object Repository/Meeting/Page_Compliance Monitoring/button_New Meeting'))

WebUI.click(findTestObject('Object Repository/Meeting/Page_Compliance Monitoring/body_window.__Zone_enable_cross_context_che_563afa'))

WebUI.setText(findTestObject('Object Repository/Meeting/Page_Compliance Monitoring/input_text'), 'desk')

WebUI.sendKeys(findTestObject('Object Repository/Meeting/Page_Compliance Monitoring/input_text'), Keys.chord(Keys.ENTER))

WebUI.setText(findTestObject('Object Repository/Meeting/Page_Compliance Monitoring/input_text'), 'new cs')

WebUI.sendKeys(findTestObject('Object Repository/Meeting/Page_Compliance Monitoring/input_text'), Keys.chord(Keys.ENTER))

WebUI.setText(findTestObject('Object Repository/Meeting/Page_Compliance Monitoring/input_text'), 'consolidated')

WebUI.sendKeys(findTestObject('Object Repository/Meeting/Page_Compliance Monitoring/input_text'), Keys.chord(Keys.ENTER))

WebUI.click(findTestObject('Object Repository/Meeting/Page_Compliance Monitoring/input_Consolidated ESEA Grants_ohio-checkbo_ec5fa3'))

WebUI.click(findTestObject('Object Repository/Meeting/Page_Compliance Monitoring/div_Participant List'))

WebUI.click(findTestObject('Object Repository/Meeting/Page_Compliance Monitoring/i_Participant List_fas fa-plus-circle'))

WebUI.setText(findTestObject('Object Repository/Meeting/Page_Compliance Monitoring/input_text'), 'co')

WebUI.sendKeys(findTestObject('Object Repository/Meeting/Page_Compliance Monitoring/input_text'), Keys.chord(Keys.ENTER))

WebUI.setText(findTestObject('Object Repository/Meeting/Page_Compliance Monitoring/input_text'), 'lead')

WebUI.sendKeys(findTestObject('Object Repository/Meeting/Page_Compliance Monitoring/input_text'), Keys.chord(Keys.ENTER))

WebUI.setText(findTestObject('Object Repository/Meeting/Page_Compliance Monitoring/input_text'), 'ad')

WebUI.sendKeys(findTestObject('Object Repository/Meeting/Page_Compliance Monitoring/input_text'), Keys.chord(Keys.ENTER))

WebUI.click(findTestObject('Object Repository/Meeting/Page_Compliance Monitoring/button_Add Participant'))

WebUI.click(findTestObject('Object Repository/Meeting/Page_Compliance Monitoring/button_Add Meeting'))

