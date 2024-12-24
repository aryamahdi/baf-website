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

WebUI.click(findTestObject('Header/link_Corporate'))

WebUI.waitForElementPresent(findTestObject('Corporate/img_Banner 1'), 10)

WebUI.click(findTestObject('Corporate/a_Next Banner'))

WebUI.waitForElementPresent(findTestObject('Corporate/img_Banner 2'), 10)

WebUI.click(findTestObject('Corporate/a_Next Banner'))

WebUI.waitForElementPresent(findTestObject('Corporate/img_Banner 3'), 10)

WebUI.click(findTestObject('Corporate/a_Next Banner'))

WebUI.waitForElementPresent(findTestObject('Corporate/img_Banner 4'), 10)

WebUI.click(findTestObject('Corporate/a_Next Banner'))

WebUI.verifyTextPresent('Company Profile Video', true)

WebUI.verifyTextPresent('Established since 1997, BAF continues to innovate with a wide selection of financing products.', 
    true)

WebUI.click(findTestObject('Corporate/button_Lets watch'))

WebUI.verifyLinksAccessible(['https://www.youtube.com/watch?v=_0-hV5gwpwU'])

WebUI.closeWindowIndex(1)

WebUI.switchToWindowIndex(0)

WebUI.verifyTextPresent('PROMOS AND LATEST NEWS', true)

WebUI.focus(findTestObject('Customer/nav_Promo and News'))

WebUI.click(findTestObject('Corporate/button_Next Promo and News Corporate'))

WebUI.click(findTestObject('Corporate/button_Next Promo and News Corporate'))

WebUI.click(findTestObject('Corporate/button_Next Promo and News Corporate'))

WebUI.click(findTestObject('Corporate/button_Next Promo and News Corporate'))

