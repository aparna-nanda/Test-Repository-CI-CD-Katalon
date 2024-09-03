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

WebUI.setText(findTestObject('Object Repository/ESSER State Activities/Workflow/Page_SAFE Log On/input_User Name_UserName'), 
    'aparna.nanda')

WebUI.setEncryptedText(findTestObject('Object Repository/ESSER State Activities/Workflow/Page_SAFE Log On/input_Password_Password'), 
    'PsbzPfH4d4s=')

WebUI.click(findTestObject('Object Repository/ESSER State Activities/Workflow/Page_SAFE Log On/button_Sign in'))

WebUI.click(findTestObject('Object Repository/ESSER State Activities/Workflow/Page_SAFE Home/a_Monitoring'))

WebUI.click(findTestObject('Object Repository/ESSER State Activities/Workflow/Page_Compliance Monitoring/a_ESSER State Activities Projects'))

WebUI.click(findTestObject('Object Repository/ESSER State Activities/Workflow/Page_Compliance Monitoring/button_Search'))

WebUI.selectOptionByValue(findTestObject('Object Repository/ESSER State Activities/Workflow/Page_Compliance Monitoring/select_AnyFY 2024 ESSER State Activities Pr_4df43a'), 
    '18502001', true)

WebUI.click(findTestObject('Object Repository/ESSER State Activities/Workflow/Page_Compliance Monitoring/i_Search_fa fa-search'))

WebUI.click(findTestObject('ESSER State Activities/Workflow/Page_Compliance Monitoring/Page_Compliance Monitoring/a_043802 - Columbus City Schools District'))

WebUI.click(findTestObject('Object Repository/ESSER State Activities/Workflow/Page_Compliance Monitoring/a_Questions'))

WebUI.selectOptionByValue(findTestObject('Object Repository/ESSER State Activities/Workflow/Page_Compliance Monitoring/select_1 2 3 4 5 6 7 8 9 10 11 12 13 14 15 16'), 
    '18510101', true)

WebUI.click(findTestObject('Object Repository/ESSER State Activities/Workflow/Page_Compliance Monitoring/a_Start Survey'))

WebUI.click(findTestObject('Page_Compliance Monitoring/span_ESSER State Activities Project 1 Reporting'))

WebUI.click(findTestObject('Object Repository/ESSER State Activities/Workflow/Page_Compliance Monitoring/a_Questions'))

WebUI.selectOptionByValue(findTestObject('Object Repository/ESSER State Activities/Workflow/Page_Compliance Monitoring/select_Amplifying Ohios Pathways to Graduat_99459b'), 
    '18510202', true)

WebUI.setText(findTestObject('Object Repository/ESSER State Activities/Workflow/Page_Compliance Monitoring/textarea_key activities_text'), 
    'test')

WebUI.setText(findTestObject('Object Repository/ESSER State Activities/Workflow/Page_Compliance Monitoring/input_a. Number of students served_n001'), 
    '5')

WebUI.setText(findTestObject('Object Repository/ESSER State Activities/Workflow/Page_Compliance Monitoring/textarea_key activities_text'), 
    'test')

WebUI.setText(findTestObject('Object Repository/ESSER State Activities/Workflow/Page_Compliance Monitoring/input_a. Number of students served_n001'), 
    '10')

WebUI.setText(findTestObject('Object Repository/ESSER State Activities/Workflow/Page_Compliance Monitoring/textarea_key activities_text'), 
    'test')

WebUI.setText(findTestObject('Object Repository/ESSER State Activities/Workflow/Page_Compliance Monitoring/input_a. Number of students served_n001'), 
    '8')

WebUI.setText(findTestObject('Object Repository/ESSER State Activities/Workflow/Page_Compliance Monitoring/textarea_key activities_text'), 
    'test')

WebUI.setText(findTestObject('Object Repository/ESSER State Activities/Workflow/Page_Compliance Monitoring/input_a. Number of students served_n001'), 
    '9')

WebUI.setText(findTestObject('Object Repository/ESSER State Activities/Workflow/Page_Compliance Monitoring/textarea_key activities_text'), 
    'test')

WebUI.setText(findTestObject('Object Repository/ESSER State Activities/Workflow/Page_Compliance Monitoring/input_a. Number of students served_n001'), 
    '10')

WebUI.setText(findTestObject('Object Repository/ESSER State Activities/Workflow/Page_Compliance Monitoring/textarea_key activities_text'), 
    'test')

WebUI.setText(findTestObject('Object Repository/ESSER State Activities/Workflow/Page_Compliance Monitoring/input_a. Number of students served_n001'), 
    '5')

WebUI.setText(findTestObject('Object Repository/ESSER State Activities/Workflow/Page_Compliance Monitoring/textarea_key activities_text'), 
    'test')

WebUI.setText(findTestObject('Object Repository/ESSER State Activities/Workflow/Page_Compliance Monitoring/input_a. Number of students served_n001'), 
    '5')

WebUI.setText(findTestObject('Object Repository/ESSER State Activities/Workflow/Page_Compliance Monitoring/textarea_key activities_text'), 
    'test')

WebUI.setText(findTestObject('Object Repository/ESSER State Activities/Workflow/Page_Compliance Monitoring/input_a. Number of students served_n001'), 
    '8')

WebUI.setText(findTestObject('Object Repository/ESSER State Activities/Workflow/Page_Compliance Monitoring/textarea_key activities_text'), 
    'test')

WebUI.setText(findTestObject('Object Repository/ESSER State Activities/Workflow/Page_Compliance Monitoring/input_a. Number of students served_n001'), 
    '5')

WebUI.setText(findTestObject('Object Repository/ESSER State Activities/Workflow/Page_Compliance Monitoring/textarea_key activities_text'), 
    'test')

WebUI.setText(findTestObject('Object Repository/ESSER State Activities/Workflow/Page_Compliance Monitoring/input_a. Number of students served_n001'), 
    '7')

WebUI.setText(findTestObject('Object Repository/ESSER State Activities/Workflow/Page_Compliance Monitoring/textarea_key activities_text'), 
    'test')

WebUI.setText(findTestObject('Object Repository/ESSER State Activities/Workflow/Page_Compliance Monitoring/input_a. Number of students served_n001'), 
    '7')

WebUI.setText(findTestObject('Object Repository/ESSER State Activities/Workflow/Page_Compliance Monitoring/textarea_key activities_text'), 
    'test')

WebUI.setText(findTestObject('Object Repository/ESSER State Activities/Workflow/Page_Compliance Monitoring/input_a. Number of students served_n001'), 
    '5')

WebUI.setText(findTestObject('Object Repository/ESSER State Activities/Workflow/Page_Compliance Monitoring/textarea_key activities_text'), 
    'test')

WebUI.setText(findTestObject('Object Repository/ESSER State Activities/Workflow/Page_Compliance Monitoring/input_a. Number of students served_n001'), 
    '5')

WebUI.setText(findTestObject('Object Repository/ESSER State Activities/Workflow/Page_Compliance Monitoring/textarea_key activities_text'), 
    'test')

WebUI.click(findTestObject('Object Repository/ESSER State Activities/Workflow/Page_Compliance Monitoring/input_Yes_102'))

WebUI.click(findTestObject('Object Repository/ESSER State Activities/Workflow/Page_Compliance Monitoring/input_Yes_102'))

WebUI.setText(findTestObject('Object Repository/ESSER State Activities/Workflow/Page_Compliance Monitoring/input_Approximately how much has been oblig_5756ec'), 
    '1000')

WebUI.setText(findTestObject('Object Repository/ESSER State Activities/Workflow/Page_Compliance Monitoring/textarea_key activities_text'), 
    'test')

WebUI.click(findTestObject('Object Repository/ESSER State Activities/Workflow/Page_Compliance Monitoring/input_Yes_102'))

WebUI.setText(findTestObject('Object Repository/ESSER State Activities/Workflow/Page_Compliance Monitoring/input_a. Number of students served_n001'), 
    '5')

WebUI.setText(findTestObject('Object Repository/ESSER State Activities/Workflow/Page_Compliance Monitoring/textarea_key activities_text'), 
    'test')

WebUI.click(findTestObject('Object Repository/ESSER State Activities/Workflow/Page_Compliance Monitoring/div_ESSER State Activities Project 1 Reporting'))

WebUI.setText(findTestObject('Object Repository/ESSER State Activities/Workflow/Page_Compliance Monitoring/textarea_key activities_text'), 
    'test')

WebUI.click(findTestObject('Object Repository/ESSER State Activities/Workflow/Page_Compliance Monitoring/div_Group Name Quarterly Monitoring Survey _4f4938'))

WebUI.selectOptionByValue(findTestObject('Object Repository/ESSER State Activities/Workflow/Page_Compliance Monitoring/select_In Progress Completed'), 
    '132040', true)

WebUI.click(findTestObject('Object Repository/ESSER State Activities/Workflow/Page_Compliance Monitoring/i_FY 2024 ESSER State Activities Projects -_e29b8b'))

