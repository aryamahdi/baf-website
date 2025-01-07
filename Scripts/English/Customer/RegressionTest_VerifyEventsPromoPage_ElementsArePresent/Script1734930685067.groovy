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
import org.apache.poi.poifs.filesystem.POIFSFileSystem as POIFSFileSystem
import org.openqa.selenium.Keys as Keys

WebUI.click(findTestObject('Header/link_Event  Promo'))

WebUI.verifyTextPresent('EVENT & PROMO', true)

WebUI.click(findTestObject('Event and Promo/link_All'))

WebUI.verifyElementPresent(findTestObject('General/nav_Content'), 10)

WebUI.click(findTestObject('Event and Promo/link_Event'))

WebUI.verifyElementPresent(findTestObject('General/nav_Content'), 10)

WebUI.click(findTestObject('Event and Promo/link_New Motorcycle'))

WebUI.verifyElementPresent(findTestObject('General/nav_Content'), 10)

WebUI.click(findTestObject('Event and Promo/link_Used Motorcycle'))

WebUI.verifyElementPresent(findTestObject('General/nav_Content'), 10)

WebUI.click(findTestObject('Event and Promo/link_Car'))

WebUI.verifyElementPresent(findTestObject('General/nav_Content'), 10)

WebUI.click(findTestObject('Event and Promo/link_Electronic, Gadget,  Furnitur'))

WebUI.verifyElementPresent(findTestObject('General/nav_No Results Found'), 10)

WebUI.click(findTestObject('Event and Promo/link_BAF Dana Syariah'))

WebUI.verifyElementPresent(findTestObject('General/nav_No Results Found'), 10)

WebUI.click(findTestObject('Event and Promo/link_Agricultural Machinery'))

WebUI.verifyElementPresent(findTestObject('General/nav_No Results Found'), 10)

WebUI.click(findTestObject('Event and Promo/link_Fleet Financing'))

WebUI.verifyElementPresent(findTestObject('General/nav_No Results Found'), 10)

