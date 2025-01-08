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

WebUI.click(findTestObject('General/link_Content', [('href') : '/en/corporate/CorporateGovernance/ShariaSupervisorBoard', ('text') : 'Sharia Supervisory Board']))

WebUI.focus(findTestObject('General/lbl_Content', [('text') : 'DEWAN PENGAWAS SYARIAH / SHARIA SUPERVISORY BOARD']))

WebUI.verifyElementPresent(findTestObject('General/lbl_Content', [('text') : 'SHARIA SUPERVISORY BOARD']), 10)

WebUI.verifyElementPresent(findTestObject('General/lbl_Content', [('text') : 'Dewan Pengawas Syariah (DPS) adalah bagian dari organ Perseroan yang mempunyai tugas dan fungsi pengawasan terhadap penyelenggaraan kegiatan perseroan agar sesuai dengan prinsip syariah.']), 
    10)

WebUI.verifyElementPresent(findTestObject('General/lbl_Content', [('text') : 'The Sharia Supervisory Board (DPS) is part of the Company’s organ with duty and function of supervising implementation of company activities based on sharia principles.']), 
    10)

WebUI.click(findTestObject('General/lbl_Content', [('text') : 'DEWAN PENGAWAS SYARIAH / SHARIA SUPERVISORY BOARD']))

WebUI.verifyLinksAccessible(['https://baf-mobile-prod.oss-ap-southeast-5.aliyuncs.com/About/CorporateGovernance/1718685827379.pdf'])

WebUI.closeWindowIndex(1)

WebUI.switchToWindowIndex(0)

