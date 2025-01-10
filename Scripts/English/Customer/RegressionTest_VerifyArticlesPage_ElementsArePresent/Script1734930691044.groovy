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

'Click Menu "Articles"'
WebUI.click(findTestObject('link_Content', [('href') : '/article', ('text') : 'Articles']))

'Click Tab "General"'
WebUI.click(findTestObject('var_Content', [('xpath') : '//body[1]/div[1]/main[1]/main[1]/div[1]/div[1]/div[1]/div[1]/div[1]/a[1]']))

'Verify Content in "General" Tab Present'
WebUI.verifyElementPresent(findTestObject('var_Content', [('xpath') : '//body[1]/div[1]/main[1]/main[1]/div[1]/div[2]/div[1]/div[1]/div[1]/div[1]/div[1]/div[1]']), 
    10)

'Click Tab "New Product"'
WebUI.click(findTestObject('var_Content', [('xpath') : '//body[1]/div[1]/main[1]/main[1]/div[1]/div[1]/div[1]/div[1]/div[2]/a[1]']))

'Verify Content in "New Product" tab shows "No Results Found"'
WebUI.verifyElementPresent(findTestObject('lbl_Content', [('text') : 'No Results Found']), 10)

'Click Tab "Financial Literacy"'
WebUI.click(findTestObject('var_Content', [('xpath') : '//body[1]/div[1]/main[1]/main[1]/div[1]/div[1]/div[1]/div[1]/div[3]/a[1]']))

'Verify Content in "Financial Literacy" tab shows "No Results Found"'
WebUI.verifyElementPresent(findTestObject('lbl_Content', [('text') : 'No Results Found']), 10)

'Click Tab "Financial Insight"'
WebUI.click(findTestObject('var_Content', [('xpath') : '//body[1]/div[1]/main[1]/main[1]/div[1]/div[1]/div[1]/div[1]/div[4]/a[1]']))

'Verify Content in "Financial Insight" tab shows "No Results Found"'
WebUI.verifyElementPresent(findTestObject('lbl_Content', [('text') : 'No Results Found']), 10)

'Click Tab "Customer Insight"'
WebUI.click(findTestObject('var_Content', [('xpath') : '//body[1]/div[1]/main[1]/main[1]/div[1]/div[1]/div[1]/div[1]/div[5]/a[1]']))

'Verify Content in "Customer Insight" tab shows "No Results Found"'
WebUI.verifyElementPresent(findTestObject('lbl_Content', [('text') : 'No Results Found']), 10)

