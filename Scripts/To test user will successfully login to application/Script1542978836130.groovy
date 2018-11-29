import static com.kms.katalon.core.checkpoint.CheckpointFactory.findCheckpoint
import static com.kms.katalon.core.testcase.TestCaseFactory.findTestCase
import static com.kms.katalon.core.testdata.TestDataFactory.findTestData
import static com.kms.katalon.core.testobject.ObjectRepository.findTestObject
import com.kms.katalon.core.checkpoint.Checkpoint as Checkpoint
import com.kms.katalon.core.cucumber.keyword.CucumberBuiltinKeywords as CucumberKW
import com.kms.katalon.core.mobile.keyword.MobileBuiltInKeywords as Mobile
import com.kms.katalon.core.model.FailureHandling as FailureHandling
import com.kms.katalon.core.testcase.TestCase as TestCase
import com.kms.katalon.core.testdata.TestData as TestData
import com.kms.katalon.core.testobject.TestObject as TestObject
import com.kms.katalon.core.webservice.keyword.WSBuiltInKeywords as WS
import com.kms.katalon.core.webui.keyword.WebUiBuiltInKeywords as WebUI
import internal.GlobalVariable as GlobalVariable

WebUI.openBrowser('')

WebUI.navigateToUrl('https://github.com/')

WebUI.click(findTestObject('Object Repository/Test1_OR/Page_The worlds leading software de/a_Signin'))

WebUI.setText(findTestObject('Object Repository/Test1_OR/Page_Sign in to GitHub  GitHub/input_Username or email addres'), 
    'Crustacean')

WebUI.setEncryptedText(findTestObject('Object Repository/Test1_OR/Page_Sign in to GitHub  GitHub/input_Forgot password_password'), 
    'cobYTafYSD6xhY82QQS2bA==')

WebUI.click(findTestObject('Object Repository/Test1_OR/Page_Sign in to GitHub  GitHub/input_Forgot password_commit'))

WebUI.click(findTestObject('Object Repository/Test1_OR/Page_GitHub/span_New organization_dropdown'))

WebUI.click(findTestObject('Object Repository/Test1_OR/Page_GitHub/button_Sign out'))

WebUI.closeBrowser()

