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

WebUI.setText(findTestObject('Object Repository/Page_SAFE Log On/input_User Name_UserName'), 'super.043752')

WebUI.setEncryptedText(findTestObject('Object Repository/Page_SAFE Log On/input_Password_Password'), 'PsbzPfH4d4s=')

WebUI.click(findTestObject('Object Repository/Page_SAFE Log On/button_Sign in'))

WebUI.click(findTestObject('Object Repository/Page_SAFE Home/a_Forms Cloud'))

WebUI.click(findTestObject('Object Repository/Page_Data Collection, Waivers and Appeals Forms/a_Emergency Medical Waiver'))

WebUI.click(findTestObject('Object Repository/Page_Data Collection, Waivers and Appeals Forms/a_043752 - Cincinnati Public Schools'))

WebUI.click(findTestObject('Object Repository/Page_Data Collection, Waivers and Appeals Forms/td_043752 - Cincinnati Public Schools'))

WebUI.click(findTestObject('Object Repository/Page_Data Collection, Waivers and Appeals Forms/a_Questions'))

WebUI.click(findTestObject('Object Repository/Page_Data Collection, Waivers and Appeals Forms/button_Add Student'))

WebUI.setText(findTestObject('Object Repository/Page_Data Collection, Waivers and Appeals Forms/input_Enter a valid statewide student identifier_ohio-field-input ng-untouched ng-pristine ng-valid'), 
    'AN8765799')

WebUI.click(findTestObject('Object Repository/Page_Data Collection, Waivers and Appeals Forms/button_Search'))

WebUI.click(findTestObject('Object Repository/Page_Data Collection, Waivers and Appeals Forms/i_Add Student_fa fa-times'))

WebUI.click(findTestObject('Object Repository/Page_Data Collection, Waivers and Appeals Forms/button_Add Student_1'))

WebUI.click(findTestObject('Object Repository/Page_Data Collection, Waivers and Appeals Forms/button_Add Student_1'))

WebUI.click(findTestObject('Object Repository/Page_Data Collection, Waivers and Appeals Forms/a_Start Survey'))

WebUI.click(findTestObject('Object Repository/Page_Data Collection, Waivers and Appeals Forms/input_ID Question_100'))

WebUI.click(findTestObject('Object Repository/Page_Data Collection, Waivers and Appeals Forms/span_DistrictBuilding Information'))

WebUI.setText(findTestObject('Object Repository/Page_Data Collection, Waivers and Appeals Forms/input_Enter a valid statewide student identifier_ohio-field-input ng-untouched ng-pristine ng-valid'), 
    'AN5678954')

WebUI.click(findTestObject('Object Repository/Page_Data Collection, Waivers and Appeals Forms/ul_1'))

WebUI.click(findTestObject('Object Repository/Page_Data Collection, Waivers and Appeals Forms/span_Identify Tests Missed'))

WebUI.click(findTestObject('Object Repository/Page_Data Collection, Waivers and Appeals Forms/input_Yes_102'))

WebUI.click(findTestObject('Object Repository/Page_Data Collection, Waivers and Appeals Forms/input_Are you requesting an MATHEMATICS  wa_b8bab1'))

WebUI.click(findTestObject('Object Repository/Page_Data Collection, Waivers and Appeals Forms/input_Enter a valid statewide student identifier_ohio-field-input ng-untouched ng-pristine ng-valid'))

WebUI.click(findTestObject('Object Repository/Page_Data Collection, Waivers and Appeals Forms/span_4'))

WebUI.click(findTestObject('Object Repository/Page_Data Collection, Waivers and Appeals Forms/input_Enter a valid statewide student identifier_ohio-field-input ng-untouched ng-pristine ng-valid'))

WebUI.click(findTestObject('Object Repository/Page_Data Collection, Waivers and Appeals Forms/span_4'))

WebUI.click(findTestObject('Object Repository/Page_Data Collection, Waivers and Appeals Forms/input_TEST TYPE  MATHEMATICS_14910101'))

WebUI.click(findTestObject('Object Repository/Page_Data Collection, Waivers and Appeals Forms/input_Grade 4 Math_14911303'))

WebUI.click(findTestObject('Object Repository/Page_Data Collection, Waivers and Appeals Forms/input_Yes_102'))

WebUI.click(findTestObject('Object Repository/Page_Data Collection, Waivers and Appeals Forms/input_Are you requesting an MATHEMATICS  wa_b8bab1'))

WebUI.click(findTestObject('Object Repository/Page_Data Collection, Waivers and Appeals Forms/input_Enter a valid statewide student identifier_ohio-field-input ng-untouched ng-pristine ng-valid'))

WebUI.click(findTestObject('Object Repository/Page_Data Collection, Waivers and Appeals Forms/span_4'))

WebUI.click(findTestObject('Object Repository/Page_Data Collection, Waivers and Appeals Forms/input_Enter a valid statewide student identifier_ohio-field-input ng-untouched ng-pristine ng-valid'))

WebUI.click(findTestObject('Object Repository/Page_Data Collection, Waivers and Appeals Forms/span_4'))

WebUI.click(findTestObject('Object Repository/Page_Data Collection, Waivers and Appeals Forms/input_TEST TYPE  MATHEMATICS_14910101'))

WebUI.click(findTestObject('Object Repository/Page_Data Collection, Waivers and Appeals Forms/input_Are you requesting an MATHEMATICS  wa_b8bab1'))

WebUI.click(findTestObject('Object Repository/Page_Data Collection, Waivers and Appeals Forms/input_Listening_14910802'))

WebUI.click(findTestObject('Object Repository/Page_Data Collection, Waivers and Appeals Forms/input_Enter a valid statewide student identifier_ohio-field-input ng-untouched ng-pristine ng-valid'))

WebUI.click(findTestObject('Object Repository/Page_Data Collection, Waivers and Appeals Forms/span_4'))

WebUI.click(findTestObject('Object Repository/Page_Data Collection, Waivers and Appeals Forms/input_Enter a valid statewide student identifier_ohio-field-input ng-untouched ng-pristine ng-valid'))

WebUI.click(findTestObject('Object Repository/Page_Data Collection, Waivers and Appeals Forms/span_4'))

WebUI.click(findTestObject('Object Repository/Page_Data Collection, Waivers and Appeals Forms/div_Are you requesting an OELPA Waiver'))

WebUI.click(findTestObject('Object Repository/Page_Data Collection, Waivers and Appeals Forms/input_American History_14911702'))

WebUI.click(findTestObject('Object Repository/Page_Data Collection, Waivers and Appeals Forms/span_Medical Waiver Information'))

WebUI.click(findTestObject('Object Repository/Page_Data Collection, Waivers and Appeals Forms/input_Please choose the reason why an Emerg_c56b4c'))

WebUI.setText(findTestObject('Object Repository/Page_Data Collection, Waivers and Appeals Forms/textarea_Student suffered a serious physica_605d71'), 
    'test')

WebUI.click(findTestObject('Object Repository/Page_Data Collection, Waivers and Appeals Forms/input_Student gave birth immediately before_22a4cc'))

WebUI.click(findTestObject('Object Repository/Page_Data Collection, Waivers and Appeals Forms/input_Enter a valid statewide student identifier_ohio-field-input ng-untouched ng-pristine ng-valid'))

WebUI.click(findTestObject('Object Repository/Page_Data Collection, Waivers and Appeals Forms/span_4'))

WebUI.click(findTestObject('Object Repository/Page_Data Collection, Waivers and Appeals Forms/span_Additional Information'))

WebUI.click(findTestObject('Object Repository/Page_Data Collection, Waivers and Appeals Forms/input_Yes_102'))

WebUI.click(findTestObject('Object Repository/Page_Data Collection, Waivers and Appeals Forms/input_Yes_102'))

WebUI.setText(findTestObject('Object Repository/Page_Data Collection, Waivers and Appeals Forms/textarea_Student suffered a serious physica_605d71'), 
    'test')

WebUI.click(findTestObject('Object Repository/Page_Data Collection, Waivers and Appeals Forms/input_Are you requesting an MATHEMATICS  wa_b8bab1'))

WebUI.click(findTestObject('Object Repository/Page_Data Collection, Waivers and Appeals Forms/input_Enter a valid statewide student identifier_ohio-field-input ng-untouched ng-pristine ng-valid'))

WebUI.setText(findTestObject('Object Repository/Page_Data Collection, Waivers and Appeals Forms/input_Enter a valid statewide student identifier_ohio-field-input ng-untouched ng-pristine ng-valid'), 
    'test')

WebUI.click(findTestObject('Object Repository/Page_Data Collection, Waivers and Appeals Forms/input_Are you requesting an MATHEMATICS  wa_b8bab1'))

WebUI.click(findTestObject('Object Repository/Page_Data Collection, Waivers and Appeals Forms/input_Are you requesting an MATHEMATICS  wa_b8bab1'))

WebUI.setText(findTestObject('Object Repository/Page_Data Collection, Waivers and Appeals Forms/input_Enter a valid statewide student identifier_ohio-field-input ng-untouched ng-pristine ng-valid'), 
    'test')

WebUI.click(findTestObject('Object Repository/Page_Data Collection, Waivers and Appeals Forms/input_Are you requesting an MATHEMATICS  wa_b8bab1'))

WebUI.click(findTestObject('Object Repository/Page_Data Collection, Waivers and Appeals Forms/input_Yes_102'))

WebUI.setText(findTestObject('Object Repository/Page_Data Collection, Waivers and Appeals Forms/textarea_Student suffered a serious physica_605d71'), 
    'test')

WebUI.click(findTestObject('Object Repository/Page_Data Collection, Waivers and Appeals Forms/div_Please provide additional information a_12ad7b'))

WebUI.selectOptionByValue(findTestObject('Object Repository/Page_Data Collection, Waivers and Appeals Forms/select_In Progress Submitted'), 
    '132050', true)

WebUI.click(findTestObject('Object Repository/Page_Data Collection, Waivers and Appeals Forms/i_AN8765436_fas fa-save'))

WebUI.selectOptionByValue(findTestObject('Object Repository/Page_Data Collection, Waivers and Appeals Forms/select_Submitted In Progress Superintendent_80472b'), 
    '132080', true)

WebUI.click(findTestObject('Object Repository/Page_Data Collection, Waivers and Appeals Forms/i_AN8765436_fas fa-save_1'))

