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

'Click Menu "Contact Us"'
WebUI.click(findTestObject('link_Content', [('href') : '/contactus', ('text') : 'Contact Us']))

'Click Menu "Our FAQ"'
WebUI.click(findTestObject('var_Content', [('xpath') : '//body[1]/div[1]/main[1]/main[1]/div[1]/div[1]/div[1]/div[2]']))

WebUI.callTestCase(findTestCase('Contact Us/Our FAQ/RegressionTest_VerifyPEMBIAYAAN MOTOR YAMAHAPage_ElementsArePresent'), 
    [:], FailureHandling.STOP_ON_FAILURE)

WebUI.focus(findTestObject('var_Content', [('xpath') : '//body[1]/div[1]/main[1]/main[1]/div[1]']))

WebUI.callTestCase(findTestCase('Contact Us/Our FAQ/RegressionTest_VerifyPEMBIAYAAN MOTOR BEKASPage_ElementsArePresent'), 
    [:], FailureHandling.STOP_ON_FAILURE)

WebUI.focus(findTestObject('var_Content', [('xpath') : '//body[1]/div[1]/main[1]/main[1]/div[1]']))

WebUI.callTestCase(findTestCase('Contact Us/Our FAQ/RegressionTest_VerifyPEMBIAYAAN MOBILPage_ElementsArePresent'), 
    [:], FailureHandling.STOP_ON_FAILURE)

WebUI.focus(findTestObject('var_Content', [('xpath') : '//body[1]/div[1]/main[1]/main[1]/div[1]']))

WebUI.callTestCase(findTestCase('Contact Us/Our FAQ/RegressionTest_VerifyXTRA BAFPage_ElementsArePresent'), [:], 
    FailureHandling.STOP_ON_FAILURE)

WebUI.focus(findTestObject('var_Content', [('xpath') : '//body[1]/div[1]/main[1]/main[1]/div[1]']))

WebUI.callTestCase(findTestCase('Contact Us/Our FAQ/RegressionTest_VerifyPEMBIAYAAN MESIN PERTANIANPage_ElementsArePresent'), 
    [:], FailureHandling.STOP_ON_FAILURE)

WebUI.focus(findTestObject('var_Content', [('xpath') : '//body[1]/div[1]/main[1]/main[1]/div[1]']))

WebUI.callTestCase(findTestCase('Contact Us/Our FAQ/RegressionTest_VerifyPEMBIAYAAN ELEKTRONIK, GADGET, FURNITURPage_ElementsArePresent'), 
    [:], FailureHandling.STOP_ON_FAILURE)

WebUI.focus(findTestObject('var_Content', [('xpath') : '//body[1]/div[1]/main[1]/main[1]/div[1]']))

WebUI.callTestCase(findTestCase('Contact Us/Our FAQ/RegressionTest_VerifyPEMBIAYAAN FLEETPage_ElementsArePresent'), 
    [:], FailureHandling.STOP_ON_FAILURE)

WebUI.focus(findTestObject('var_Content', [('xpath') : '//body[1]/div[1]/main[1]/main[1]/div[1]']))

WebUI.callTestCase(findTestCase('Contact Us/Our FAQ/RegressionTest_VerifyBAF ADIDANAPage_ElementsArePresent'), [:], 
    FailureHandling.STOP_ON_FAILURE)

WebUI.focus(findTestObject('var_Content', [('xpath') : '//body[1]/div[1]/main[1]/main[1]/div[1]']))

WebUI.callTestCase(findTestCase('Contact Us/Our FAQ/RegressionTest_VerifyBAF PRADANAPage_ElementsArePresent'), [:], 
    FailureHandling.STOP_ON_FAILURE)

WebUI.focus(findTestObject('var_Content', [('xpath') : '//body[1]/div[1]/main[1]/main[1]/div[1]']))

WebUI.callTestCase(findTestCase('Contact Us/Our FAQ/RegressionTest_Verifylagi tesPage_ElementsArePresent'), [:], 
    FailureHandling.STOP_ON_FAILURE)

WebUI.focus(findTestObject('var_Content', [('xpath') : '//body[1]/div[1]/main[1]/main[1]/div[1]']))

WebUI.callTestCase(findTestCase('Contact Us/Our FAQ/RegressionTest_Verifyoke kita cobaPage_ElementsArePresent'), 
    [:], FailureHandling.STOP_ON_FAILURE)

WebUI.focus(findTestObject('var_Content', [('xpath') : '//body[1]/div[1]/main[1]/main[1]/div[1]']))

WebUI.callTestCase(findTestCase('Contact Us/Our FAQ/RegressionTest_VerifyCARA PEMBAYARAN CICILANPage_ElementsArePresent'), 
    [:], FailureHandling.STOP_ON_FAILURE)

WebUI.focus(findTestObject('var_Content', [('xpath') : '//body[1]/div[1]/main[1]/main[1]/div[1]']))

WebUI.callTestCase(findTestCase('Contact Us/Our FAQ/RegressionTest_VerifyPEMROSESAN DATA PRIBADI KONSUMENPage_ElementsArePresent'), 
    [:], FailureHandling.STOP_ON_FAILURE)

WebUI.focus(findTestObject('var_Content', [('xpath') : '//body[1]/div[1]/main[1]/main[1]/div[1]']))

WebUI.callTestCase(findTestCase('Contact Us/Our FAQ/RegressionTest_VerifyBAF DANA SYARIAHPage_ElementsArePresent'), 
    [:], FailureHandling.STOP_ON_FAILURE)

WebUI.focus(findTestObject('var_Content', [('xpath') : '//body[1]/div[1]/main[1]/main[1]/div[1]']))

WebUI.callTestCase(findTestCase('Contact Us/Our FAQ/RegressionTest_VerifyProgram LoyalitasPage_ElementsArePresent'), 
    [:], FailureHandling.STOP_ON_FAILURE)

