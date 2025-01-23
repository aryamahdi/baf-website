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

'Click Button "Login"'
WebUI.click(findTestObject('var_Content', [('xpath') : '//body[1]/div[1]/main[1]/main[1]/nav[1]/div[1]/div[1]/div[1]/form[1]/button[1]']))

'Verify Text "Please Enter Your Username and Password" is Present'
WebUI.verifyElementPresent(findTestObject('lbl_Content', [('text') : 'Please Enter Your Username and Password']), 10)

'Input Text in "Phone Number" Field'
WebUI.setText(findTestObject('var_Content', [('xpath') : '//body[1]/div[1]/main[1]/main[1]/div[1]/div[1]/div[2]/div[1]/form[1]/div[1]/input[1]']), 
    PhoneNumber)

'Input Text in "Password" Field'
WebUI.setText(findTestObject('var_Content', [('xpath') : '//body[1]/div[1]/main[1]/main[1]/div[1]/div[1]/div[2]/div[1]/form[1]/div[2]/input[1]']), 
    Password)

'Delay 25 Seconds'
WebUI.delay(25)

'Click Button "Login"'
WebUI.click(findTestObject('var_Content', [('xpath') : '//body[1]/div[1]/main[1]/main[1]/div[1]/div[1]/div[2]/div[1]/form[1]/button[1]']))

'Verify Login Success'
WebUI.verifyElementPresent(findTestObject('lbl_Content', [('text') : 'Success']), 10)

'Click Button "OK"'
WebUI.click(findTestObject('lbl_Content', [('text') : 'OK']))

