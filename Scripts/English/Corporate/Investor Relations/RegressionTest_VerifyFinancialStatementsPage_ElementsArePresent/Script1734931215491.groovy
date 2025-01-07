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

WebUI.click(findTestObject('Header/link_Financial Statements'))

WebUI.focus(findTestObject('Investor Relation/Financial Statments/nav_Mid'))

WebUI.verifyTextPresent('FINANCIAL STATEMENTS', true)

WebUI.verifyTextPresent('Laporan keuangan mencerminkan transparansi dan akuntabilitas perusahaan terhadap para pemangku kepentingan. Oleh karena itu, Perseroan senantiasa menyajikan laporan keuangan sesuai dengan kaidah dan standar yang berlaku.', 
    true)

WebUI.verifyTextPresent('Financial reports reflect the company\'s transparency and accountability towards its stakeholders. Therefore, the Company consistently provides financial reports in accordance with applicable regulations and standards.', 
    true)

WebUI.focus(findTestObject('Investor Relation/Financial Statments/nav_Low'))

WebUI.click(findTestObject('General/tab_Tahun', [('tahun_id') : 2017]))

WebUI.click(findTestObject('Investor Relation/Financial Statments/button_Download 1'))

WebUI.verifyLinksAccessible(['https://baf-mobile-prod.oss-ap-southeast-5.aliyuncs.com/investor-relation-file/1718679641595.pdf'])

WebUI.closeWindowIndex(1)

WebUI.switchToWindowIndex(0)

WebUI.click(findTestObject('General/tab_Tahun', [('tahun_id') : 2018]))

WebUI.click(findTestObject('Investor Relation/Financial Statments/button_Download 1'))

WebUI.verifyLinksAccessible(['https://baf-mobile-prod.oss-ap-southeast-5.aliyuncs.com/investor-relation-file/1718679610803.pdf'])

WebUI.closeWindowIndex(1)

WebUI.switchToWindowIndex(0)

WebUI.click(findTestObject('Investor Relation/Financial Statments/button_Download 2'))

WebUI.verifyLinksAccessible(['https://baf-mobile-prod.oss-ap-southeast-5.aliyuncs.com/investor-relation-file/1718679585194.pdf'])

WebUI.closeWindowIndex(1)

WebUI.switchToWindowIndex(0)

WebUI.click(findTestObject('General/tab_Tahun', [('tahun_id') : 2019]))

WebUI.click(findTestObject('Investor Relation/Financial Statments/button_Download 1'))

WebUI.verifyLinksAccessible(['https://baf-mobile-prod.oss-ap-southeast-5.aliyuncs.com/investor-relation-file/1718679554052.pdf'])

WebUI.closeWindowIndex(1)

WebUI.switchToWindowIndex(0)

WebUI.click(findTestObject('Investor Relation/Financial Statments/button_Download 2'))

WebUI.verifyLinksAccessible(['https://baf-mobile-prod.oss-ap-southeast-5.aliyuncs.com/investor-relation-file/1718679528054.pdf'])

WebUI.closeWindowIndex(1)

WebUI.switchToWindowIndex(0)

WebUI.click(findTestObject('General/tab_Tahun', [('tahun_id') : 2020]))

WebUI.verifyLinksAccessible(['https://baf-mobile-prod.oss-ap-southeast-5.aliyuncs.com/investor-relation-file/1718679753788.pdf'])

WebUI.click(findTestObject('Investor Relation/Financial Statments/button_Download 1'))

WebUI.closeWindowIndex(1)

WebUI.switchToWindowIndex(0)

WebUI.click(findTestObject('Investor Relation/Financial Statments/button_Download 2'))

WebUI.verifyLinksAccessible(['https://baf-mobile-prod.oss-ap-southeast-5.aliyuncs.com/investor-relation-file/1718679482077.pdf'])

WebUI.closeWindowIndex(1)

WebUI.switchToWindowIndex(0)

WebUI.click(findTestObject('General/tab_Tahun', [('tahun_id') : 2021]))

WebUI.click(findTestObject('Investor Relation/Financial Statments/button_Download 1'))

WebUI.verifyLinksAccessible(['https://baf-mobile-prod.oss-ap-southeast-5.aliyuncs.com/investor-relation-file/1718679443032.pdf'])

WebUI.closeWindowIndex(1)

WebUI.switchToWindowIndex(0)

WebUI.click(findTestObject('Investor Relation/Financial Statments/button_Download 2'))

WebUI.verifyLinksAccessible(['https://baf-mobile-prod.oss-ap-southeast-5.aliyuncs.com/investor-relation-file/1718679363552.pdf'])

WebUI.closeWindowIndex(1)

WebUI.switchToWindowIndex(0)

WebUI.click(findTestObject('General/tab_Tahun', [('tahun_id') : 2022]))

WebUI.click(findTestObject('Investor Relation/Financial Statments/button_Download 1'))

WebUI.verifyLinksAccessible(['https://baf-mobile-prod.oss-ap-southeast-5.aliyuncs.com/investor-relation-file/1721871449277.pdf'])

WebUI.closeWindowIndex(1)

WebUI.switchToWindowIndex(0)

WebUI.click(findTestObject('Investor Relation/Financial Statments/button_Download 2'))

WebUI.verifyLinksAccessible(['https://baf-mobile-prod.oss-ap-southeast-5.aliyuncs.com/investor-relation-file/1718679249597.pdf'])

WebUI.closeWindowIndex(1)

WebUI.switchToWindowIndex(0)

WebUI.click(findTestObject('General/tab_Tahun', [('tahun_id') : 2023]))

WebUI.click(findTestObject('Investor Relation/Financial Statments/button_Download 1'))

WebUI.verifyLinksAccessible(['https://baf-mobile-prod.oss-ap-southeast-5.aliyuncs.com/investor-relation-file/1718679177912.pdf'])

WebUI.closeWindowIndex(1)

WebUI.switchToWindowIndex(0)

WebUI.click(findTestObject('Investor Relation/Financial Statments/button_Download 2'))

WebUI.verifyLinksAccessible(['https://baf-mobile-prod.oss-ap-southeast-5.aliyuncs.com/investor-relation-file/1718678721943.pdf'])

WebUI.closeWindowIndex(1)

WebUI.switchToWindowIndex(0)

WebUI.click(findTestObject('General/tab_Tahun', [('tahun_id') : 2024]))

WebUI.click(findTestObject('Investor Relation/Financial Statments/button_Download 1'))

WebUI.verifyLinksAccessible(['https://baf-mobile-prod.oss-ap-southeast-5.aliyuncs.com/investor-relation-file/1722301667808.pdf'])

WebUI.closeWindowIndex(1)

WebUI.switchToWindowIndex(0)

