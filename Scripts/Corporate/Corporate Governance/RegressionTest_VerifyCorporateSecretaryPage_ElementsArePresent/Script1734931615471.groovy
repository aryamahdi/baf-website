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

'Click Menu "Corporate Secretary"'
WebUI.click(findTestObject('link_Content', [('href') : '/en/corporate/CorporateGovernance/CorporateSecretary', ('text') : 'Corporate Secretary']))

'Scroll to "CORPORATE SECRETARY" Text'
WebUI.scrollToElement(findTestObject('var_Content', [('xpath') : '//body[1]/div[1]/main[1]/main[1]/div[1]/div[1]/ol[1]']), 
    10)

'Verify Text "CORPORATE SECRETARY" is Present'
WebUI.verifyElementPresent(findTestObject('lbl_Content', [('text') : 'CORPORATE SECRETARY']), 10)

'Verify Image "CORPORATE SECRETARY" is Present'
WebUI.verifyElementPresent(findTestObject('img_Content', [('src') : '/_next/image?url=%2Fstatic%2Fimages%2Fimage%2Fsecretary%2Fsecretary.png&w=3840&q=75']), 
    10)

'Verify Text About "Puji Arianti" is Present'
WebUI.verifyElementPresent(findTestObject('var_Content', [('xpath') : '//body[1]/div[1]/main[1]/main[1]/div[2]/div[3]']), 
    10)

'Verify Text About "About Corporate Secretary" is Present'
WebUI.verifyElementPresent(findTestObject('var_Content', [('xpath') : '//body[1]/div[1]/main[1]/main[1]/div[2]/div[4]']), 
    10)

'Scroll to "DUTY IMPLEMENTATION REPORT" File'
WebUI.focus(findTestObject('var_Content', [('xpath') : '//body[1]/div[1]/main[1]/main[1]/div[2]/div[4]/div[1]/a[1]']), FailureHandling.STOP_ON_FAILURE)

'Click "DUTY IMPLEMENTATION REPORT" File'
WebUI.click(findTestObject('lbl_Content', [('text') : 'DUTY IMPLEMENTATION REPORT']))

'Verify Link Accessibility'
WebUI.verifyLinksAccessible(['https://www.baf.id/static/files/pdf/Corporate%20Secretary%20Duty%20Implementation%20Report%20-%202021.pdf'])

'Close Browser Windows'
WebUI.closeWindowIndex(1)

'Switch Browser Windows'
WebUI.switchToWindowIndex(0)

