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

WebUI.click(findTestObject('Header/link_Committees under BOD'))

WebUI.focus(findTestObject('General/button_Download (based on Name)', [('content_id') : 'KOMITE DI BAWAH DIREKSI / COMMITTEE UNDER BOD']))

WebUI.verifyElementPresent(findTestObject('General/lbl_Content', [('text_id') : 'Committees under BOD']), 10)

WebUI.verifyElementPresent(findTestObject('General/lbl_Content', [('text_id') : 'Dalam melaksanakan fungsi pengawasan, Direksi dibantu oleh 6 (enam) komite yang berada di bawah supervisi Direksi dalam membantu memberikan saran dan rekomendasi yang dapat dijadikan acuan dalam pengambilan keputusan. ']), 
    10)

WebUI.verifyElementPresent(findTestObject('General/lbl_Content', [('text_id') : 'In carrying out its supervisory function, the Board of Directors is assisted by 6 (six) committees which are under the supervision of the Board of Directors to help provide suggestions and recommendations that can be used as a reference in decision making.']), 
    10)

WebUI.click(findTestObject('General/button_Download (based on Name)', [('content_id') : 'KOMITE DI BAWAH DIREKSI / COMMITTEE UNDER BOD']))

WebUI.verifyLinksAccessible(['https://baf-mobile-prod.oss-ap-southeast-5.aliyuncs.com/About/CorporateGovernance/1718686552602.pdf'])

WebUI.closeWindowIndex(1)

WebUI.switchToWindowIndex(0)

