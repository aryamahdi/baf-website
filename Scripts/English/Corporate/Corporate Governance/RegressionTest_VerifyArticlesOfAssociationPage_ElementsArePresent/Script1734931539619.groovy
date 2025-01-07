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

WebUI.click(findTestObject('Header/link_Corporate Governance'))

WebUI.click(findTestObject('Header/link_Articles of Association'))

WebUI.focus(findTestObject('General/button_Download (based on Name)', [('content_id') : 'ANGGARAN DASAR / ARTICLES OF ASSOCIATION']))

WebUI.verifyTextPresent('ARTICLES OF ASSOCIATION', true)

WebUI.verifyTextPresent('Anggaran Dasar menjadi landasan internal kami dalam setiap aktivitas usaha dan operasional.', true)

WebUI.verifyTextPresent('The Articles of Association are our internal foundation in every business and operational activity.', 
    true)

WebUI.click(findTestObject('General/button_Download (based on Name)', [('content_id') : 'ANGGARAN DASAR / ARTICLES OF ASSOCIATION']))

WebUI.verifyLinksAccessible(['https://baf-mobile-prod.oss-ap-southeast-5.aliyuncs.com/About/CorporateGovernance/1718685656027.pdf'])

WebUI.closeWindowIndex(1)

WebUI.switchToWindowIndex(0)

