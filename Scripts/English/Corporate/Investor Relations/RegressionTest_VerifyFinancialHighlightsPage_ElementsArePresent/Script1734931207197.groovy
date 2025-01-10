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
WebUI.click(findTestObject('link_Content', [('href') : '#', ('text') : 'Investor Relations']))

'Click Menu "Financial Highlights"'
WebUI.click(findTestObject('link_Content', [('href') : '/en/corporate/InvestorRelations/FinancialHighlights', ('text') : 'Financial Highlights']))

'Scroll to "FINANCIAL HIGHLIGHTS" Text'
WebUI.scrollToElement(findTestObject('var_Content', [('xpath') : '//body[1]/div[1]/main[1]/main[1]/div[1]/div[1]/ol[1]']), 
    10)

'Verify Text "FINANCIAL HIGHLIGHTS" is Present'
WebUI.verifyElementPresent(findTestObject('lbl_Content', [('text') : 'FINANCIAL HIGHLIGHTS']), 10)

'Verify Text Description in Indonesia is Present'
WebUI.verifyElementPresent(findTestObject('lbl_Content', [('text') : 'Kami terus memberikan upaya terbaik kami dalam menjaga kinerja keuangan secara berkelanjutan sehingga dapat terus memberikan nilai yang optimal bagi seluruh pemegang saham.']), 
    10)

'Verify Text Description in English is Present'
WebUI.verifyElementPresent(findTestObject('lbl_Content', [('text') : 'We continue to ensure our best efforts in maintaining our sustain financial performance so that we can continue to deliver optimal value for all shareholders.']), 
    10)

'Verify Image "FINANCIAL HIGHLIGHTS" is Present'
WebUI.verifyElementPresent(findTestObject('img_Content', [('src') : 'https://baf-web.oss-ap-southeast-5.aliyuncs.com/files/FINANCIAL%20HIGHLIGHTS.jpg']), 
    10)

