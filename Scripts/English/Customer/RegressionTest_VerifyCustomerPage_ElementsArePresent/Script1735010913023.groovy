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

WebUI.verifyElementPresent(findTestObject('General/img_Content', [('src') : '/static/images/logos/baf.svg']), 10)

WebUI.click(findTestObject('General/var_Content', [('xpath') : '//body[1]/div[1]/main[1]/main[1]/div[1]/button[1]']))

WebUI.verifyElementVisible(findTestObject('General/var_Content', [('xpath') : '//body[1]/div[1]/main[1]/main[1]/div[2]/div[1]/div[1]/div[1]/img[1]']))

WebUI.click(findTestObject('General/var_Content', [('xpath') : '//body[1]/div[1]/main[1]/main[1]/div[2]/div[1]/a[2]']))

WebUI.verifyElementVisible(findTestObject('General/var_Content', [('xpath') : '//body[1]/div[1]/main[1]/main[1]/div[2]/div[1]/div[1]/div[2]/img[1]']))

WebUI.click(findTestObject('General/var_Content', [('xpath') : '//body[1]/div[1]/main[1]/main[1]/div[2]/div[1]/a[2]']))

WebUI.verifyElementVisible(findTestObject('General/var_Content', [('xpath') : '//body[1]/div[1]/main[1]/main[1]/div[2]/div[1]/div[1]/div[3]/img[1]']))

WebUI.click(findTestObject('General/var_Content', [('xpath') : '//body[1]/div[1]/a[1]/div[1]']))

WebUI.verifyLinksAccessible(['https://api.whatsapp.com/send/?phone=628118018873&text&type=phone_number&app_absent=0'])

WebUI.closeWindowIndex(1)

WebUI.switchToWindowIndex(0)

WebUI.verifyElementPresent(findTestObject('General/img_Content', [('src') : '/static/images/image/footer/best-brand.webp']), 
    10)

WebUI.verifyElementPresent(findTestObject('General/img_Content', [('src') : '/static/images/image/footer/top-brand.webp']), 
    10)

WebUI.focus(findTestObject('General/var_Content', [('xpath') : '//body[1]/div[1]/main[1]/main[1]/div[4]/div[2]']))

WebUI.verifyElementPresent(findTestObject('General/lbl_Content', [('text') : 'FAST PROCESS, RIGHT INSTALLMENT!']), 10)

WebUI.verifyElementPresent(findTestObject('General/lbl_Content', [('text') : 'PROMOS AND LATEST NEWS']), 10)

WebUI.focus(findTestObject('General/var_Content', [('xpath') : '//body[1]/div[1]/main[1]/main[1]/div[4]/div[5]']))

WebUI.click(findTestObject('General/var_Content', [('xpath') : '//body[1]/div[1]/main[1]/main[1]/div[4]/div[4]/button[2]']))

WebUI.click(findTestObject('General/var_Content', [('xpath') : '//body[1]/div[1]/main[1]/main[1]/div[4]/div[4]/button[2]']))

WebUI.click(findTestObject('General/var_Content', [('xpath') : '//body[1]/div[1]/main[1]/main[1]/div[4]/div[4]/button[2]']))

WebUI.click(findTestObject('General/var_Content', [('xpath') : '//body[1]/div[1]/main[1]/main[1]/div[4]/div[4]/button[2]']))

WebUI.focus(findTestObject('General/var_Content', [('xpath') : '//body[1]/div[1]/main[1]/main[1]/div[5]/div[1]/div[2]/div[1]/div[1]/div[1]/div[1]']))

WebUI.click(findTestObject('General/var_Content', [('xpath') : '//body[1]/div[1]/main[1]/main[1]/section[1]/div[1]/div[1]/div[1]/div[1]/div[1]/button[1]']))

WebUI.click(findTestObject('General/var_Content', [('xpath') : '//body[1]/div[1]/main[1]/main[1]/section[1]/div[1]/div[1]/div[1]/div[1]/div[2]/button[1]']))

WebUI.click(findTestObject('General/var_Content', [('xpath') : '//body[1]/div[1]/main[1]/main[1]/section[1]/div[1]/div[1]/div[1]/div[1]/div[3]/button[1]']))

WebUI.click(findTestObject('General/var_Content', [('xpath') : '//body[1]/div[1]/main[1]/main[1]/section[1]/div[1]/div[1]/div[1]/div[1]/div[4]/button[1]']))

WebUI.click(findTestObject('General/var_Content', [('xpath') : '//body[1]/div[1]/main[1]/main[1]/section[1]/div[1]/div[1]/div[1]/div[1]/div[5]/button[1]']))

WebUI.click(findTestObject('General/var_Content', [('xpath') : '//body[1]/div[1]/main[1]/main[1]/div[5]/div[1]/div[1]/div[2]/a[1]']))

WebUI.click(findTestObject('General/var_Content', [('xpath') : '//body[1]/div[1]/main[1]/main[1]/section[1]/div[1]/div[1]/div[1]/div[1]/div[6]/button[1]']))

WebUI.focus(findTestObject('General/var_Content', [('xpath') : '//body[1]/div[1]/main[1]/main[1]/div[5]/div[1]/div[1]/div[1]/div[1]/form[1]/div[6]/button[1]']))

WebUI.verifyElementPresent(findTestObject('General/lbl_Content', [('text') : 'Your Monthly Installment Estimation']), 10)

