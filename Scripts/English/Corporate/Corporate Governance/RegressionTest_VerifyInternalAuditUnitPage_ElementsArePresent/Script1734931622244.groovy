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

WebUI.click(findTestObject('General/link_Content', [('href') : '/en/corporate/CorporateGovernance/InternalAudit', ('text') : 'Internal Audit Unit']))

WebUI.focus(findTestObject('General/var_Content', [('xpath') : '//body[1]/div[1]/main[1]/main[1]/div[2]/div[3]']))

WebUI.verifyElementPresent(findTestObject('General/lbl_Content', [('text') : 'INTERNAL AUDIT UNIT']), 10)

WebUI.verifyElementPresent(findTestObject('General/lbl_Content', [('text') : 'Fungsi Audit Internal di Perseroan dijalankan oleh Satuan Kerja Audit Internal (SKAI) sebagai 3rd line of defense dalam memastikan proses pengelolaan dan operasional Perseroan. Kami terus berupaya memastikan proses tersebut berjalan sesuai dengan ketentuan dan peraturan yang berlaku.']), 
    10)

WebUI.verifyElementPresent(findTestObject('General/lbl_Content', [('text') : 'The Internal Audit function in the Company is carried out by the Internal Audit Work Unit (SKAI) as the 3rd line of defense in ensuring the Company\'s management and operational processes. We continue to strive to ensure that the process runs in accordance with applicable rules and regulations.']), 
    10)

WebUI.click(findTestObject('General/var_Content', [('xpath') : '//body[1]/div[1]/main[1]/main[1]/div[2]/div[3]']))

WebUI.verifyLinksAccessible(['https://baf-mobile-prod.oss-ap-southeast-5.aliyuncs.com/About/CorporateGovernance/1718686593519.pdf'])

WebUI.closeWindowIndex(1)

WebUI.switchToWindowIndex(0)

