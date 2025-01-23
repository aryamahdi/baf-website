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
not_run: WebUI.click(findTestObject('link_Content', [('href') : '/corporate', ('text') : 'Corporate']))

'Click Menu "Investor Relations"'
WebUI.click(findTestObject('link_Content', [('href') : '#', ('text') : 'Corporate Governance']))

'Click Menu "Internal Audit Unit"'
WebUI.click(findTestObject('link_Content', [('href') : '/en/corporate/CorporateGovernance/InternalAudit', ('text') : 'Internal Audit Unit']))

'Scroll to "INTERNAL AUDIT UNIT" Text'
WebUI.scrollToElement(findTestObject('var_Content', [('xpath') : '//body[1]/div[1]/main[1]/main[1]/div[1]/div[1]/ol[1]']), 
    10)

'Verify Text "INTERNAL AUDIT UNIT" is Present'
WebUI.verifyElementPresent(findTestObject('lbl_Content', [('text') : 'INTERNAL AUDIT UNIT']), 10)

'Verify Description Text "INTERNAL AUDIT UNIT" is Present'
WebUI.verifyElementPresent(findTestObject('var_Content', [('xpath') : '//body[1]/div[1]/main[1]/main[1]/div[2]/div[2]']), 
    10)

'Click First Button in INTERNAL AUDIT UNIT'
WebUI.click(findTestObject('var_Content', [('xpath') : '//body[1]/div[1]/main[1]/main[1]/div[2]/div[3]']))

'Verify Link Accessibility'
WebUI.verifyLinksAccessible(['https://baf-mobile-dev.oss-ap-southeast-5.aliyuncs.com/About%2FCorporateGovernance%2F1734574771283.pdf?Expires=1736537685&OSSAccessKeyId=LTAI5t78APQ3CX3zFy4qKiTQ&Signature=903uuEsaR2hnQdQqYCUoB3RIIIg%3D'], 
    FailureHandling.OPTIONAL)

'Close Browser Windows'
WebUI.closeWindowIndex(1)

'Switch Browser Windows'
WebUI.switchToWindowIndex(0)

'Click Second Button in INTERNAL AUDIT UNIT'
WebUI.click(findTestObject('var_Content', [('xpath') : '//body[1]/div[1]/main[1]/main[1]/div[2]/div[4]']))

'Verify Link Accessibility'
WebUI.verifyLinksAccessible(['https://baf-mobile-dev.oss-ap-southeast-5.aliyuncs.com/About%2FCorporateGovernance%2F1733278812550.pdf?Expires=1736537686&OSSAccessKeyId=LTAI5t78APQ3CX3zFy4qKiTQ&Signature=oQszbMmXM8HfaZk6VfH5ogC85EA%3D'], 
    FailureHandling.OPTIONAL)

'Close Browser Windows'
WebUI.closeWindowIndex(1)

'Switch Browser Windows'
WebUI.switchToWindowIndex(0)

'Click Third Button in INTERNAL AUDIT UNIT'
WebUI.click(findTestObject('var_Content', [('xpath') : '//body[1]/div[1]/main[1]/main[1]/div[2]/div[5]']))

'Verify Link Accessibility'
WebUI.verifyLinksAccessible(['https://baf-mobile-dev.oss-ap-southeast-5.aliyuncs.com/corporate-content-file%2F1731574737773.pdf?Expires=1736537687&OSSAccessKeyId=LTAI5t78APQ3CX3zFy4qKiTQ&Signature=J%2BWteFmmggYqW7WIS7zbqrPsUiY%3D'], 
    FailureHandling.OPTIONAL)

'Close Browser Windows'
WebUI.closeWindowIndex(1)

'Switch Browser Windows'
WebUI.switchToWindowIndex(0)

'Scroll to Last Button'
WebUI.scrollToElement(findTestObject('var_Content', [('xpath') : '//body[1]/div[1]/main[1]/main[1]/div[2]/div[1]/h3[1]']), 
    10)

'Click Fourth Button in INTERNAL AUDIT UNIT'
WebUI.click(findTestObject('var_Content', [('xpath') : '//body[1]/div[1]/main[1]/main[1]/div[2]/div[6]']))

'Verify Link Accessibility'
WebUI.verifyLinksAccessible(['https://baf-mobile-dev.oss-ap-southeast-5.aliyuncs.com/About%2FCorporateGovernance%2F1724659501026.pdf?Expires=1736537687&OSSAccessKeyId=LTAI5t78APQ3CX3zFy4qKiTQ&Signature=Vog5bSRd1kQ%2BAOQN6QCI9pMoRUg%3D'], 
    FailureHandling.OPTIONAL)

'Close Browser Windows'
WebUI.closeWindowIndex(1)

'Switch Browser Windows'
WebUI.switchToWindowIndex(0)

