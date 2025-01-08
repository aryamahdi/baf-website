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

WebUI.click(findTestObject('null'))

WebUI.click(findTestObject('null'))

WebUI.click(findTestObject('null'))

WebUI.verifyTextPresent('FINANCIAL HIGHLIGHTS', true)

WebUI.verifyTextPresent('Kami terus memberikan upaya terbaik kami dalam menjaga kinerja keuangan secara berkelanjutan sehingga dapat terus memberikan nilai yang optimal bagi seluruh pemegang saham.', 
    true)

WebUI.verifyTextPresent('We continue to ensure our best efforts in maintaining our sustain financial performance so that we can continue to deliver optimal value for all shareholders.', 
    true)

WebUI.waitForElementPresent(findTestObject('Investor Relation/Financial Highlight/img_Financial Highlight'), 10)

