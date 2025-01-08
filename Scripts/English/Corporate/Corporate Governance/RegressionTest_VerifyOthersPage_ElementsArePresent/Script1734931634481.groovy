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

WebUI.click(findTestObject('General/link_Content', [('href') : '/en/corporate/CorporateGovernance/Others', ('text') : 'Others']))

WebUI.focus(findTestObject('General/lbl_Content', [('text') : 'WHISTLEBLOWING SYSTEM & ANTI-CORRUPTION']))

WebUI.verifyElementPresent(findTestObject('General/lbl_Content', [('text') : 'OTHERS']), 10)

WebUI.verifyElementPresent(findTestObject('General/lbl_Content', [('text') : 'Kami meyakin bahwa proses manajemen risiko dan kontrol internal yang baik dan kuat merupakan bagian penting dari kegiatan operasional dan aktivitas di perusahaan. ']), 
    10)

WebUI.verifyElementPresent(findTestObject('General/lbl_Content', [('text') : 'We believe a vital aspect of the company\'s operations and activities is having robust internal control and risk management processes. ']), 
    10)

WebUI.click(findTestObject('General/lbl_Content', [('text') : 'KODE ETIK / CODE OF CONDUCT']))

WebUI.verifyLinksAccessible(['https://baf-mobile-prod.oss-ap-southeast-5.aliyuncs.com/About/CorporateGovernance/1718686645695.pdf'])

WebUI.closeWindowIndex(1)

WebUI.switchToWindowIndex(0)

WebUI.click(findTestObject('General/lbl_Content', [('text') : 'MANAJEMEN RISIKO / RISK MANAGEMENT']))

WebUI.verifyLinksAccessible(['https://baf-mobile-prod.oss-ap-southeast-5.aliyuncs.com/About/CorporateGovernance/1718686628251.pdf'])

WebUI.closeWindowIndex(1)

WebUI.switchToWindowIndex(0)

WebUI.click(findTestObject('General/lbl_Content', [('text') : 'WHISTLEBLOWING SYSTEM & ANTI-CORRUPTION']))

WebUI.verifyLinksAccessible(['https://baf-mobile-prod.oss-ap-southeast-5.aliyuncs.com/About/CorporateGovernance/1718437501546.pdf'])

WebUI.closeWindowIndex(1)

WebUI.switchToWindowIndex(0)

