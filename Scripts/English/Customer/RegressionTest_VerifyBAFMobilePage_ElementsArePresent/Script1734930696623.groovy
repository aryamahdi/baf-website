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

WebUI.click(findTestObject('Header/link_BAF Mobile'))

WebUI.verifyTextPresent('PROSES CEPAT ANGSURAN TEPAT', true)

WebUI.focus(findTestObject('BAF Mobile/nav_Keunggulan'))

WebUI.verifyTextPresent('KEUNGGULAN', true)

WebUI.verifyElementPresent(findTestObject('BAF Mobile/nav_Fitur Lengkap'), 10)

WebUI.verifyElementPresent(findTestObject('BAF Mobile/nav_Mudah'), 10)

WebUI.verifyElementPresent(findTestObject('BAF Mobile/nav_Sistem Aman'), 10)

WebUI.focus(findTestObject('BAF Mobile/nav_Bawah'))

WebUI.click(findTestObject('BAF Mobile/link_AppStore BAF Mobile'))

WebUI.verifyLinksAccessible(['https://apps.apple.com/id/app/baf-mobile/id1499452126'])

WebUI.closeWindowIndex(1)

WebUI.switchToWindowIndex(0)

WebUI.click(findTestObject('BAF Mobile/link_PlayStore BAF Mobile'))

WebUI.verifyLinksAccessible(['https://play.google.com/store/apps/details?id=com.id.bussanautofinance'])

WebUI.closeWindowIndex(1)

WebUI.switchToWindowIndex(0)

