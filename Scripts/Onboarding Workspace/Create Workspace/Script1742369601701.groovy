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

//open browser and navigate to URL
WebUI.openBrowser(GlobalVariable.URL)

WebUI.setText(findTestObject('Object Repository/LoginPage/input_Email_email'), GlobalVariable.Username)

WebUI.setText(findTestObject('Object Repository/LoginPage/input_Password_password'), GlobalVariable.Password)

WebUI.click(findTestObject('Object Repository/LoginPage/span_Sign in to Dashboard'))

WebUI.click(findTestObject('Object Repository/PersonalLandingPage/div_Personal Space'))

WebUI.click(findTestObject('Object Repository/PersonalLandingPage/a_Create Workspace'))

WebUI.setText(findTestObject('Object Repository/onboardWorkspace/input_Workspace Name_first_name'), GlobalVariable.WorkspaceName)

WebUI.setText(findTestObject('Object Repository/onboardWorkspace/textarea_Description_description'), GlobalVariable.WorkspaceDesc)

WebUI.click(findTestObject('Object Repository/onboardWorkspace/button_Create Workspace'))

//Validate the workspace creation notes!

//Button to Go to The Workspace
WebUI.click(findTestObject('Object Repository/onboardWorkspace/a_Go To Your Workspace'))

WebUI.closeBrowser()

