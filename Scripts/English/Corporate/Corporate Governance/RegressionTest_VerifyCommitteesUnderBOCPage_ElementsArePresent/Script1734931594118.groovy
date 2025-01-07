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

WebUI.click(findTestObject('Header/link_Committees under BOC'))

WebUI.focus(findTestObject('General/button_Download (based on Name)', [('content_id') : 'KOMITE AUDIT / AUDIT COMMITTEE']))

WebUI.verifyElementPresent(findTestObject('General/lbl_Content', [('text_id') : 'Committees under BOC']), 10)

WebUI.verifyElementPresent(findTestObject('General/lbl_Content', [('text_id') : 'Dalam melaksanakan fungsi pengawasan, Dewan Komisaris dibantu oleh 3 (tiga) komite yang berada di bawah supervisi Dewan Komisaris dalam membantu pelaksanaan pengawasan atas pengelolaan Perseroan.']), 
    10)

WebUI.verifyElementPresent(findTestObject('General/lbl_Content', [('text_id') : 'In carrying out its supervisory function, the Board of Commissioners is supported by 3 (three) committees which are under the supervision of the Board of Commissioners in assisting the implementation of supervision over the management of the Company.']), 
    10)

WebUI.click(findTestObject('General/button_Download (based on Name)', [('content_id') : 'KOMITE NOMINASI REMUNERASI / NOMREM COMMITTEE']))

WebUI.verifyLinksAccessible(['https://baf-mobile-prod.oss-ap-southeast-5.aliyuncs.com/About/CorporateGovernance/1718686500595.pdf'])

WebUI.closeWindowIndex(1)

WebUI.switchToWindowIndex(0)

WebUI.click(findTestObject('General/button_Download (based on Name)', [('content_id') : 'KOMITE PEMANTAU RISIKO / RISK MONITORING COMMITTEE']))

WebUI.verifyLinksAccessible(['https://baf-mobile-prod.oss-ap-southeast-5.aliyuncs.com/About/CorporateGovernance/1718686069830.pdf'])

WebUI.closeWindowIndex(1)

WebUI.switchToWindowIndex(0)

WebUI.click(findTestObject('General/button_Download (based on Name)', [('content_id') : 'KOMITE AUDIT / AUDIT COMMITTEE']))

WebUI.verifyLinksAccessible(['https://baf-mobile-prod.oss-ap-southeast-5.aliyuncs.com/About/CorporateGovernance/1718685960154.pdf'])

WebUI.closeWindowIndex(1)

WebUI.switchToWindowIndex(0)

