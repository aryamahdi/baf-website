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

WebUI.click(findTestObject('Header/link_GCG Policy'))

WebUI.focus(findTestObject('General/button_Download (based on Name)', [('content_id') : 'KEBIJAKAN GCG / GCG POLICY']))

WebUI.verifyTextPresent('GCG Policy', true)

WebUI.verifyTextPresent('Perseroan meyakini bahwa penerapan prinsip-prinsip GCG bukan sekedar sebagai pemenuhan terhadap peraturan, melainkan ikut menentukan keberlangsungan Perseroan dalam jangka panjang. Oleh karena itu, Perseroan bertekad untuk terus menerapkan GCG sebagai sebuah standar yang bertujuan untuk meningkatkan citra, efisiensi, & efektivitas pengelolaan Perseroan secara berkesinambungan.', 
    true)

WebUI.verifyTextPresent('The Company believes that the implementation of GCG principles is beyond compliance with the regulations, but also determines the Company’s long-term sustainability. Therefore, the Company is committed to maintain the GCG implementation as a standard that aims to improve the reputation, efficiency, & effectiveness of the Company’s management on an ongoing basis.', 
    true)

WebUI.click(findTestObject('General/button_Download (based on Name)', [('content_id') : 'KEBIJAKAN GCG / GCG POLICY']))

WebUI.verifyLinksAccessible(['https://baf-mobile-prod.oss-ap-southeast-5.aliyuncs.com/About/CorporateGovernance/1718685687816.pdf'])

WebUI.closeWindowIndex(1)

WebUI.switchToWindowIndex(0)

