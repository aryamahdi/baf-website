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

'Click Menu "Corporate"'
WebUI.click(findTestObject('link_Content', [('href') : '/corporate', ('text') : 'Corporate']))

'Click Menu "Investor Relations"'
WebUI.click(findTestObject('link_Content', [('href') : '#', ('text') : 'Corporate Governance']))

'Click Menu "Board of Directors Guidelines"'
WebUI.click(findTestObject('link_Content', [('href') : '/en/corporate/CorporateGovernance/BODGuidelines', ('text') : 'Board of Directors Guidelines']))

'Scroll to "BOARD OF DIRECTORS GUIDELINES" Text'
WebUI.scrollToElement(findTestObject('var_Content', [('xpath') : '//body[1]/div[1]/main[1]/main[1]/div[1]/div[1]/ol[1]']), 
    10)

'Verify Text "BOARD OF DIRECTORS GUIDELINES" is Present'
WebUI.verifyElementPresent(findTestObject('lbl_Content', [('text') : 'BOARD OF DIRECTORS GUIDELINES']), 10)

'Verify Description Text "BOARD OF DIRECTORS GUIDELINES" is Present'
WebUI.verifyElementPresent(findTestObject('lbl_Content', [('text') : 'Direksi Bussan Auto Finance bertanggung jawab atas pengelolaan operasional sehari-hari perusahaan dengan integritas, kehati-hatian, dan kepatuhan terhadap prinsip-prinsip Good Corporate Governance (GCG). Direksi terdiri dari individu yang memiliki pengalaman dan keahlian di bidang keuangan, manajemen risiko, dan industri keuangan secara umum. Tugas utama Direksi meliputi perumusan strategi perusahaan, implementasi kebijakan, dan pengambilan keputusan strategis yang mendukung pencapaian tujuan jangka panjang perusahaan. Direksi juga bertanggung jawab untuk mengelola risiko perusahaan dengan baik, memastikan kepatuhan terhadap regulasi yang berlaku, serta mempromosikan budaya perusahaan yang sehat dan berintegritas. Direksi harus menjaga komunikasi terbuka dan efektif dengan Dewan Komisaris, serta melaporkan secara berkala kinerja perusahaan kepada pemegang saham dan publik secara transparan.']), 
    10)

'Click First Button in Board of Directors Guidelines'
WebUI.click(findTestObject('var_Content', [('xpath') : '//body[1]/div[1]/main[1]/main[1]/div[2]/div[3]']))

'Verify Link Accessibility'
WebUI.verifyLinksAccessible(['https://baf-mobile-dev.oss-ap-southeast-5.aliyuncs.com/About/CorporateGovernance/1718878606110.pdf'])

'Close Browser Windows'
WebUI.closeWindowIndex(1)

'Switch Browser Windows'
WebUI.switchToWindowIndex(0)

'Click Second Button in Board of Directors Guidelines'
WebUI.click(findTestObject('var_Content', [('xpath') : '//body[1]/div[1]/main[1]/main[1]/div[2]/div[4]']))

'Verify Link Accessibility'
WebUI.verifyLinksAccessible(['https://baf-mobile-dev.oss-ap-southeast-5.aliyuncs.com/About/CorporateGovernance/1718346043593.pdf'])

'Close Browser Windows'
WebUI.closeWindowIndex(1)

'Switch Browser Windows'
WebUI.switchToWindowIndex(0)

