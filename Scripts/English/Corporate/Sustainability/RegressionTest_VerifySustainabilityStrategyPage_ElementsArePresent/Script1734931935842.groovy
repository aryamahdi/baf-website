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

'Click Menu "Sustainability"'
WebUI.click(findTestObject('link_Content', [('href') : '#', ('text') : 'Sustainability']))

'Click Menu "Sustainability Strategy"'
WebUI.click(findTestObject('link_Content', [('href') : '/en/corporate/Sustainability/SustainabilityStrategy', ('text') : 'Sustainability Strategy']))

'Scroll to "SUSTAINABILITY STRATEGY" Text'
WebUI.scrollToElement(findTestObject('var_Content', [('xpath') : '//body[1]/div[1]/main[1]/main[1]/div[1]/div[1]/ol[1]']), 
    10)

'Verify Text "SUSTAINABILITY STRATEGY" is Present'
WebUI.verifyElementPresent(findTestObject('lbl_Content', [('text') : 'SUSTAINABILITY STRATEGY']), 10)

'Verify Image "SUSTAINABILITY STRATEGY" is Present'
WebUI.verifyElementPresent(findTestObject('var_Content', [('xpath') : '//body[1]/div[1]/main[1]/main[1]/div[2]/div[1]/div[1]/div[2]/div[1]/img[1]']), 
    10)

'Scroll to "Company Profile Video"'
WebUI.scrollToElement(findTestObject('var_Content', [('xpath') : '//body[1]/div[1]/main[1]/main[1]/div[2]/div[2]']), 10)

'Verify "Company Profile Video" Text is Present'
WebUI.verifyElementPresent(findTestObject('lbl_Content', [('text') : 'Company Profile Video']), 10)

'Verify Text Description is Present'
WebUI.verifyElementPresent(findTestObject('var_Content', [('xpath') : '//body[1]/div[1]/main[1]/main[1]/div[2]/div[2]/div[1]/div[1]/div[1]/p[1]']), 
    10)

'Click "Let\'s Watch" button'
WebUI.click(findTestObject('link_Content', [('href') : 'https://www.youtube.com/watch?v=_0-hV5gwpwU', ('text') : 'Let\'s watch']))

'Verify Youtube Link Accessibility'
WebUI.verifyLinksAccessible(['https://www.youtube.com/watch?v=_0-hV5gwpwU'])

'Close Browser Windows'
WebUI.closeWindowIndex(1)

'Switch Browser Windows'
WebUI.switchToWindowIndex(0)

