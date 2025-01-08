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

WebUI.click(findTestObject('General/link_Content', [('href') : '/corporate', ('text') : 'Corporate']))

WebUI.click(findTestObject('General/link_Content', [('href') : '#', ('text') : 'Corporate Governance']))

WebUI.click(findTestObject('General/link_Content', [('href') : '/en/corporate/CorporateGovernance/Whistleblowing', ('text') : 'Whistleblowing System']))

WebUI.verifyElementPresent(findTestObject('General/lbl_Content', [('text') : 'WHISTLEBLOWING SYSTEM']), 10)

WebUI.switchToFrame(findTestObject('General/iframe_Content'), 10)

WebUI.verifyElementPresent(findTestObject('General/img_Content', [('src') : '/images/hero.png']), 10)

WebUI.verifyElementPresent(findTestObject('General/lbl_Content', [('text') : 'Tujuan Whistleblowing System BAF']), 10)

WebUI.click(findTestObject('General/lbl_Content', [('text') : 'Pedoman Pelaporan Melalui Whistleblowing System.pdf']))

WebUI.verifyLinksAccessible(['https://whistleblowing.baf.id/Pedoman_Pelaporan_Melalui_Whistleblowing_System.pdf'])

WebUI.closeWindowIndex(1)

WebUI.switchToWindowIndex(0)

WebUI.focus(findTestObject('General/lbl_Content', [('text') : 'Lapor Sekarang']))

WebUI.click(findTestObject('General/lbl_Content', [('text') : 'Layanan Pengaduan UmumKhusus Karyawan']))

WebUI.click(findTestObject('General/lbl_Content', [('text') : 'Layanan Investigator WanitaKhusus Karyawan']))

WebUI.click(findTestObject('General/lbl_Content', [('text') : 'PRFCKhusus ICA']))

