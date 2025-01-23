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
WebUI.click(findTestObject('link_Content', [('href') : '#', ('text') : 'Investor Relations']))

'Click Menu "Annual Report"'
WebUI.click(findTestObject('link_Content', [('href') : '/en/corporate/InvestorRelations/AnnualReport', ('text') : 'Annual Report']))

'Scroll to "ANNUAL REPORT" Text'
WebUI.scrollToElement(findTestObject('var_Content', [('xpath') : '//body[1]/div[1]/main[1]/main[1]/div[1]/div[1]/ol[1]']), 
    10)

'Verify Text "ANNUAL REPORT" is Present'
WebUI.verifyElementPresent(findTestObject('lbl_Content', [('text') : 'ANNUAL REPORT']), 10)

'Click First Card'
WebUI.click(findTestObject('var_Content', [('xpath') : '//body[1]/div[1]/main[1]/main[1]/div[2]/div[3]/div[1]/div[1]/div[2]/a[1]']))

'Verify First Card Link Accessibility'
WebUI.verifyLinksAccessible(['https://baf-mobile-dev.oss-ap-southeast-5.aliyuncs.com/investor-relation-file%2F1726125798818.pdf?Expires=1736884730&OSSAccessKeyId=LTAI5t78APQ3CX3zFy4qKiTQ&Signature=OExrcWeITbjdPQf4uPRXQeCE5AE%3D'], 
    FailureHandling.OPTIONAL)

'Close Browser Windows'
WebUI.closeWindowIndex(1)

'Switch Browser Windows'
WebUI.switchToWindowIndex(0)

'Scroll to Second Card Text'
WebUI.scrollToElement(findTestObject('var_Content', [('xpath') : '//body[1]/div[1]/main[1]/main[1]/div[2]/div[3]/div[1]/div[1]/div[2]/a[1]']), 
    10)

'Click Second Card'
WebUI.click(findTestObject('var_Content', [('xpath') : '//body[1]/div[1]/main[1]/main[1]/div[2]/div[3]/div[1]/div[2]/div[2]/a[1]']))

'Verify Second Card Link Accessibility'
WebUI.verifyLinksAccessible(['https://baf-mobile-dev.oss-ap-southeast-5.aliyuncs.com/investor-relation-file/1718445909688.pdf'])

'Close Browser Windows'
WebUI.closeWindowIndex(1)

'Switch Browser Windows'
WebUI.switchToWindowIndex(0)

'Scroll to Third Card Text'
WebUI.scrollToElement(findTestObject('var_Content', [('xpath') : '//body[1]/div[1]/main[1]/main[1]/div[2]/div[3]/div[1]/div[2]/div[2]/a[1]']), 
    10)

'Click Third Card'
WebUI.click(findTestObject('var_Content', [('xpath') : '//body[1]/div[1]/main[1]/main[1]/div[2]/div[3]/div[1]/div[3]/div[2]/a[1]']))

'Verify Third Card Link Accessibility'
WebUI.verifyLinksAccessible(['https://baf-mobile-dev.oss-ap-southeast-5.aliyuncs.com/investor-relation-file/1718452463352.pdf'])

'Close Browser Windows'
WebUI.closeWindowIndex(1)

'Switch Browser Windows'
WebUI.switchToWindowIndex(0)

'Scroll to Fourth Card Text'
WebUI.scrollToElement(findTestObject('var_Content', [('xpath') : '//body[1]/div[1]/main[1]/main[1]/div[2]/div[3]/div[1]/div[3]/div[2]/a[1]']), 
    10)

'Click Fourth Card'
WebUI.click(findTestObject('var_Content', [('xpath') : '//body[1]/div[1]/main[1]/main[1]/div[2]/div[3]/div[1]/div[4]/div[2]/a[1]']))

'Verify Fourth Card Link Accessibility'
WebUI.verifyLinksAccessible(['https://baf-mobile-dev.oss-ap-southeast-5.aliyuncs.com/investor-relation-file/1718439730189.pdf'])

'Close Browser Windows'
WebUI.closeWindowIndex(1)

'Switch Browser Windows'
WebUI.switchToWindowIndex(0)

'Scroll to Fifth Card Text'
WebUI.scrollToElement(findTestObject('var_Content', [('xpath') : '//body[1]/div[1]/main[1]/main[1]/div[2]/div[3]/div[1]/div[4]/div[2]/a[1]']), 
    10)

'Click Fifth Card'
WebUI.click(findTestObject('var_Content', [('xpath') : '//body[1]/div[1]/main[1]/main[1]/div[2]/div[3]/div[1]/div[5]/div[2]/a[1]']))

'Verify Fifth Card Link Accessibility'
WebUI.verifyLinksAccessible(['https://baf-mobile-dev.oss-ap-southeast-5.aliyuncs.com/investor-relation-file/1718442732937.pdf'])

'Close Browser Windows'
WebUI.closeWindowIndex(1)

'Switch Browser Windows'
WebUI.switchToWindowIndex(0)

'Scroll to Pagination Bar'
WebUI.focus(findTestObject('var_Content', [('xpath') : '//body[1]/div[1]/main[1]/main[1]/div[2]/div[3]/div[2]']), FailureHandling.STOP_ON_FAILURE)

'Click Limit Page'
WebUI.click(findTestObject('var_Content', [('xpath') : '//body[1]/div[1]/main[1]/main[1]/div[2]/div[3]/div[2]/div[1]/button[1]']))

'Click Page Limit to 10'
WebUI.click(findTestObject('link_Content', [('href') : '#', ('text') : '10']))

'Scroll to Pagination Bar'
WebUI.focus(findTestObject('var_Content', [('xpath') : '//body[1]/div[1]/main[1]/main[1]/div[2]/div[3]/div[2]']), FailureHandling.STOP_ON_FAILURE)

'Click Limit Page'
WebUI.click(findTestObject('var_Content', [('xpath') : '//body[1]/div[1]/main[1]/main[1]/div[2]/div[3]/div[2]/div[1]/button[1]']))

'Click Page Limit to 25'
WebUI.click(findTestObject('link_Content', [('href') : '#', ('text') : '25']))

'Scroll to Pagination Bar'
WebUI.focus(findTestObject('var_Content', [('xpath') : '//body[1]/div[1]/main[1]/main[1]/div[2]/div[3]/div[2]']), FailureHandling.STOP_ON_FAILURE)

'Click Limit Page'
WebUI.click(findTestObject('var_Content', [('xpath') : '//body[1]/div[1]/main[1]/main[1]/div[2]/div[3]/div[2]/div[1]/button[1]']))

'Click Page Limit to 50'
WebUI.click(findTestObject('link_Content', [('href') : '#', ('text') : '50']))

'Scroll to Pagination Bar'
WebUI.focus(findTestObject('var_Content', [('xpath') : '//body[1]/div[1]/main[1]/main[1]/div[2]/div[3]/div[2]']), FailureHandling.STOP_ON_FAILURE)

'Click Limit Page'
WebUI.click(findTestObject('var_Content', [('xpath') : '//body[1]/div[1]/main[1]/main[1]/div[2]/div[3]/div[2]/div[1]/button[1]']))

'Click Page Limit to 5'
WebUI.click(findTestObject('link_Content', [('href') : '#', ('text') : '5']))

'Scroll to Pagination Bar'
WebUI.scrollToElement(findTestObject('var_Content', [('xpath') : '//body[1]/div[1]/main[1]/main[1]/div[2]/div[3]/div[1]/div[4]/div[2]/div[1]/div[1]']), 
    10)

'Click Next Page'
WebUI.click(findTestObject('var_Content', [('xpath') : '//body[1]/div[1]/main[1]/main[1]/div[2]/div[3]/div[2]/div[2]/button[5]']))

'Scroll to Card Annual Report'
WebUI.focus(findTestObject('var_Content', [('xpath') : '//body[1]/div[1]/main[1]/main[1]/div[2]/div[3]/div[1]']), FailureHandling.STOP_ON_FAILURE)

'Verify Card Annual Report is Present'
WebUI.verifyElementPresent(findTestObject('var_Content', [('xpath') : '//body[1]/div[1]/main[1]/main[1]/div[2]/div[3]/div[1]']), 
    10)

'Scroll to Pagination Bar'
WebUI.focus(findTestObject('var_Content', [('xpath') : '//body[1]/div[1]/main[1]/main[1]/div[2]/div[3]/div[2]']), FailureHandling.STOP_ON_FAILURE)

'Click Next Page'
WebUI.click(findTestObject('var_Content', [('xpath') : '//body[1]/div[1]/main[1]/main[1]/div[2]/div[3]/div[2]/div[2]/button[5]']))

'Scroll to Card Annual Report'
WebUI.focus(findTestObject('var_Content', [('xpath') : '//body[1]/div[1]/main[1]/main[1]/div[2]/div[3]/div[1]']), FailureHandling.STOP_ON_FAILURE)

'Verify Card Annual Report is Present'
WebUI.verifyElementPresent(findTestObject('var_Content', [('xpath') : '//body[1]/div[1]/main[1]/main[1]/div[2]/div[3]/div[1]']), 
    10)

'Scroll to Pagination Bar'
WebUI.focus(findTestObject('var_Content', [('xpath') : '//body[1]/div[1]/main[1]/main[1]/div[2]/div[3]/div[2]']), FailureHandling.STOP_ON_FAILURE)

'Click Next Page'
WebUI.click(findTestObject('var_Content', [('xpath') : '//body[1]/div[1]/main[1]/main[1]/div[2]/div[3]/div[2]/div[2]/button[5]']))

'Scroll to Card Annual Report'
WebUI.focus(findTestObject('var_Content', [('xpath') : '//body[1]/div[1]/main[1]/main[1]/div[2]/div[3]/div[1]']), FailureHandling.STOP_ON_FAILURE)

'Verify Card Annual Report is Present'
WebUI.verifyElementPresent(findTestObject('var_Content', [('xpath') : '//body[1]/div[1]/main[1]/main[1]/div[2]/div[3]/div[1]']), 
    10)

'Scroll to Pagination Bar'
WebUI.focus(findTestObject('var_Content', [('xpath') : '//body[1]/div[1]/main[1]/main[1]/div[2]/div[3]/div[2]']), FailureHandling.STOP_ON_FAILURE)

'Click Next Page'
WebUI.click(findTestObject('var_Content', [('xpath') : '//body[1]/div[1]/main[1]/main[1]/div[2]/div[3]/div[2]/div[2]/button[5]']))

'Verify Card Annual Report is Present'
WebUI.verifyElementPresent(findTestObject('var_Content', [('xpath') : '//body[1]/div[1]/main[1]/main[1]/div[2]/div[3]/div[1]']), 
    10)

