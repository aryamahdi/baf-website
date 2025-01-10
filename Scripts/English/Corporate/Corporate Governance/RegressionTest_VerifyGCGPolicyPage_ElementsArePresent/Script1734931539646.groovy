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

'Click Menu "Corporate"'
WebUI.click(findTestObject('link_Content', [('href') : '/corporate', ('text') : 'Corporate']))

'Click Menu "Investor Relations"'
WebUI.click(findTestObject('link_Content', [('href') : '#', ('text') : 'Corporate Governance']))

'Click Menu "GCG Policy"'
WebUI.click(findTestObject('link_Content', [('href') : '/en/corporate/CorporateGovernance/GCGPolicy', ('text') : 'GCG Policy']))

'Scroll to "GCG Policy" Text'
WebUI.scrollToElement(findTestObject('var_Content', [('xpath') : '//body[1]/div[1]/main[1]/main[1]/div[1]/div[1]/ol[1]']), 
    10)

'Verify Text "GCG Policy" is Present'
WebUI.verifyElementPresent(findTestObject('lbl_Content', [('text') : 'GCG Policy']), 10)

'Click First Button in GCG Policy'
WebUI.click(findTestObject('var_Content', [('xpath') : '//body[1]/div[1]/main[1]/main[1]/div[2]/div[3]']))

'Verify Link Accessibility'
WebUI.verifyLinksAccessible(['https://baf-mobile-dev.oss-ap-southeast-5.aliyuncs.com/About%2FCorporateGovernance%2F1621586949600.pdf?Expires=1736535171&OSSAccessKeyId=LTAI5t78APQ3CX3zFy4qKiTQ&Signature=fVvRbKeo7nBVWX15I2U4DzsZcTI%3D'])

'Close Browser Windows'
WebUI.closeWindowIndex(1)

'Switch Browser Windows'
WebUI.switchToWindowIndex(0)

