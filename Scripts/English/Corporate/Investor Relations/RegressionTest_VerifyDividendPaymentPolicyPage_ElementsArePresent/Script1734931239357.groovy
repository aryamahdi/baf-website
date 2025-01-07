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

WebUI.click(findTestObject('Header/link_Investor Relations'))

WebUI.click(findTestObject('Header/link_Dividend Payment Policy'))

WebUI.focus(findTestObject('Investor Relation/Financial Statments/nav_Mid'))

WebUI.verifyTextPresent('DIVIDEND PAYMENT POLICY', true)

WebUI.verifyTextPresent('Dalam rangka memastikan pelaksanaan prinsip Tata Kelola Perusahaan yang baik dalam hal pendistribusian dividen, Perseroan memiliki kebijakan pembayaran dividen yang tertuang dalam Anggaran Dasar Perseroan.', 
    true)

WebUI.verifyTextPresent('In order to ensure implementation of Good Corporate Governance principles in terms of dividend distribution, the Company has a dividend policy as stipulated in the Company’s Articles of Association.', 
    true)

WebUI.focus(findTestObject('Investor Relation/Dividend Payment Policy/img_Divident Policy'))

WebUI.click(findTestObject('Investor Relation/Dividend Payment Policy/button_KEBIJAKAN PEMBAYARAN DIVIDEN'))

WebUI.verifyLinksAccessible(['https://baf-mobile-dev.oss-ap-southeast-5.aliyuncs.com/investor-relation-file/1718178324514.pdf'])

WebUI.closeWindowIndex(1)

WebUI.switchToWindowIndex(0)

WebUI.verifyElementPresent(findTestObject('Investor Relation/Dividend Payment Policy/img_Divident Policy'), 10)

