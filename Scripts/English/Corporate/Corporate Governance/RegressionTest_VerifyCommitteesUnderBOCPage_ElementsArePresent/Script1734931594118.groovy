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

'Click Menu "Committees under BOC"'
WebUI.click(findTestObject('link_Content', [('href') : '/en/corporate/CorporateGovernance/BOCCommittees', ('text') : 'Committees under BOC']))

'Scroll to "Committees under BOC" Text'
WebUI.scrollToElement(findTestObject('var_Content', [('xpath') : '//body[1]/div[1]/main[1]/main[1]/div[1]/div[1]/ol[1]']), 
    10)

'Verify Text "Committees under BOC" is Present'
WebUI.verifyElementPresent(findTestObject('lbl_Content', [('text') : 'Committees under BOC']), 10)

'Verify Description Text "Committees under BOC" is Present'
WebUI.verifyElementPresent(findTestObject('var_Content', [('xpath') : '//body[1]/div[1]/main[1]/main[1]/div[2]/div[2]']), 
    10)

'Click First Button in Committees under BOC'
WebUI.click(findTestObject('var_Content', [('xpath') : '//body[1]/div[1]/main[1]/main[1]/div[2]/div[3]']))

'Verify Link Accessibility'
WebUI.verifyLinksAccessible(['https://baf-mobile-dev.oss-ap-southeast-5.aliyuncs.com/About%2FCorporateGovernance%2F1724659722421.pdf?Expires=1736536046&OSSAccessKeyId=LTAI5t78APQ3CX3zFy4qKiTQ&Signature=JjqkNGvH%2FukkemumlRy%2FqXlVL4g%3D'])

'Close Browser Windows'
WebUI.closeWindowIndex(1)

'Switch Browser Windows'
WebUI.switchToWindowIndex(0)

'Click Second Button in Committees under BOC'
WebUI.click(findTestObject('var_Content', [('xpath') : '//body[1]/div[1]/main[1]/main[1]/div[2]/div[4]']))

'Verify Link Accessibility'
WebUI.verifyLinksAccessible(['https://baf-mobile-dev.oss-ap-southeast-5.aliyuncs.com/About/CorporateGovernance/1718346221437.pdf'])

'Close Browser Windows'
WebUI.closeWindowIndex(1)

'Switch Browser Windows'
WebUI.switchToWindowIndex(0)

'Click Third Button in Committees under BOC'
WebUI.click(findTestObject('var_Content', [('xpath') : '//body[1]/div[1]/main[1]/main[1]/div[2]/div[5]']))

'Verify Link Accessibility'
WebUI.verifyLinksAccessible(['https://baf-mobile-dev.oss-ap-southeast-5.aliyuncs.com/About/CorporateGovernance/1718346194231.pdf'])

'Close Browser Windows'
WebUI.closeWindowIndex(1)

'Switch Browser Windows'
WebUI.switchToWindowIndex(0)

'Scroll to Last Button'
WebUI.scrollToElement(findTestObject('var_Content', [('xpath') : '//body[1]/div[1]/main[1]/main[1]/div[2]/div[1]/h3[1]']), 
    10)

'Click Fourth Button in Committees under BOC'
WebUI.click(findTestObject('var_Content', [('xpath') : '//body[1]/div[1]/main[1]/main[1]/div[2]/div[6]']))

'Verify Link Accessibility'
WebUI.verifyLinksAccessible(['https://baf-mobile-dev.oss-ap-southeast-5.aliyuncs.com/About/CorporateGovernance/1718346147325.pdf'])

'Close Browser Windows'
WebUI.closeWindowIndex(1)

'Switch Browser Windows'
WebUI.switchToWindowIndex(0)

