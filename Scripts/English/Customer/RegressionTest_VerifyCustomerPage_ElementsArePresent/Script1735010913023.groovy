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

WebUI.verifyElementPresent(findTestObject('Header/img_BAF'), 10)

WebUI.click(findTestObject('Customer/button_Side'))

WebUI.verifyElementVisible(findTestObject('Customer/img_Banner 1'))

WebUI.click(findTestObject('Customer/button_Next Banner'))

WebUI.verifyElementVisible(findTestObject('Customer/img_Banner 2'))

WebUI.click(findTestObject('Customer/button_Next Banner'))

WebUI.verifyElementVisible(findTestObject('Customer/img_Banner 3'))

WebUI.click(findTestObject('Customer/button_Next Banner'))

WebUI.click(findTestObject('Customer/button_Chat Santi'))

WebUI.verifyLinksAccessible(['https://api.whatsapp.com/send/?phone=628118018873&text&type=phone_number&app_absent=0'])

WebUI.closeWindowIndex(1)

WebUI.switchToWindowIndex(0)

WebUI.verifyTextPresent('FAST PROCESS, RIGHT INSTALLMENT!', true)

WebUI.verifyElementPresent(findTestObject('Customer/img_Best Brand'), 10)

WebUI.verifyElementPresent(findTestObject('Customer/img_Top Brand'), 10)

WebUI.verifyTextPresent('PROMOS AND LATEST NEWS', true)

WebUI.focus(findTestObject('Customer/nav_Promo and News'))

WebUI.click(findTestObject('Customer/button_Next Promo and News'))

WebUI.click(findTestObject('Customer/button_Next Promo and News'))

WebUI.click(findTestObject('Customer/button_Next Promo and News'))

WebUI.click(findTestObject('Customer/button_Next Promo and News'))

WebUI.focus(findTestObject('Customer/nav_Tab Product'))

WebUI.click(findTestObject('Customer/button_Motor Baru Yamaha'))

WebUI.click(findTestObject('Customer/button_Motor Bekas Berkualitas'))

WebUI.click(findTestObject('Customer/button_Mobil Baru'))

WebUI.click(findTestObject('Customer/button_Elektronik Gadget Furnitur'))

WebUI.click(findTestObject('Customer/button_Dana Syariah'))

WebUI.click(findTestObject('Customer/button_Mesin Pertanian'))

WebUI.focus(findTestObject('Customer/nav_Simulasi'))

WebUI.verifyTextPresent('Your Monthly Installment Estimation', true)

WebUI.verifyTextPresent('The calculation is only a simulation, it is subject to change according to BAF regulations. Submit a financing application and we will contact you.', 
    true)

