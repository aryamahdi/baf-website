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

WebUI.click(findTestObject('Header/link_General Shareholder Meetings'))

WebUI.focus(findTestObject('Investor Relation/Financial Statments/nav_Mid'))

WebUI.verifyTextPresent('GENERAL SHAREHOLDER MEETINGS', true)

WebUI.verifyElementPresent(findTestObject('Investor Relation/General Shareholder Meetings/lbl_Indonesia'), 10)

WebUI.verifyElementPresent(findTestObject('Investor Relation/General Shareholder Meetings/lbl_Inggris'), 10)

WebUI.focus(findTestObject('Investor Relation/General Shareholder Meetings/nav_Low'))

WebUI.click(findTestObject('General/tab_Tahun', [('tahun_id') : 2017]))

WebUI.click(findTestObject('Investor Relation/General Shareholder Meetings/button_Download'))

WebUI.verifyLinksAccessible(['about:blank'], FailureHandling.OPTIONAL)

WebUI.closeWindowIndex(1)

WebUI.switchToWindowIndex(0)

WebUI.click(findTestObject('General/tab_Tahun', [('tahun_id') : 2018]))

WebUI.click(findTestObject('Investor Relation/General Shareholder Meetings/button_Download', [('tahun_id') : 2018]))

WebUI.verifyLinksAccessible(['https://baf-mobile-prod.oss-ap-southeast-5.aliyuncs.com/investor-relation-file/1718680698305.pdf'])

WebUI.closeWindowIndex(1)

WebUI.switchToWindowIndex(0)

WebUI.click(findTestObject('General/tab_Tahun', [('tahun_id') : 2019]))

WebUI.click(findTestObject('Investor Relation/General Shareholder Meetings/button_Download', [('tahun_id') : 2019]))

WebUI.verifyLinksAccessible(['https://baf-mobile-prod.oss-ap-southeast-5.aliyuncs.com/investor-relation-file/1718680677871.pdf'])

WebUI.closeWindowIndex(1)

WebUI.switchToWindowIndex(0)

WebUI.click(findTestObject('General/tab_Tahun', [('tahun_id') : 2020]))

WebUI.verifyLinksAccessible(['about:blank'], FailureHandling.OPTIONAL)

WebUI.click(findTestObject('Investor Relation/General Shareholder Meetings/button_Download', [('tahun_id') : 2020]))

WebUI.closeWindowIndex(1)

WebUI.switchToWindowIndex(0)

WebUI.click(findTestObject('General/tab_Tahun', [('tahun_id') : 2021]))

WebUI.click(findTestObject('Investor Relation/General Shareholder Meetings/button_Download', [('tahun_id') : 2021]))

WebUI.verifyLinksAccessible(['https://baf-mobile-prod.oss-ap-southeast-5.aliyuncs.com/investor-relation-file/1718680614082.pdf'])

WebUI.closeWindowIndex(1)

WebUI.switchToWindowIndex(0)

WebUI.click(findTestObject('General/tab_Tahun', [('tahun_id') : 2022]))

WebUI.click(findTestObject('Investor Relation/General Shareholder Meetings/button_Download', [('tahun_id') : 2022]))

WebUI.verifyLinksAccessible(['https://baf-mobile-prod.oss-ap-southeast-5.aliyuncs.com/investor-relation-file/1718680572801.pdf'])

WebUI.closeWindowIndex(1)

WebUI.switchToWindowIndex(0)

WebUI.click(findTestObject('General/tab_Tahun', [('tahun_id') : 2023]))

WebUI.click(findTestObject('Investor Relation/General Shareholder Meetings/button_Download', [('tahun_id') : 2023]))

WebUI.verifyLinksAccessible(['https://baf-mobile-prod.oss-ap-southeast-5.aliyuncs.com/investor-relation-file/1718680534176.pdf'])

WebUI.closeWindowIndex(1)

WebUI.switchToWindowIndex(0)

WebUI.click(findTestObject('General/tab_Tahun', [('tahun_id') : 2024]))

WebUI.click(findTestObject('Investor Relation/General Shareholder Meetings/button_Download', [('tahun_id') : 2024]))

WebUI.verifyLinksAccessible(['https://baf-mobile-prod.oss-ap-southeast-5.aliyuncs.com/investor-relation-file/1718780845988.pdf'])

WebUI.closeWindowIndex(1)

WebUI.switchToWindowIndex(0)

