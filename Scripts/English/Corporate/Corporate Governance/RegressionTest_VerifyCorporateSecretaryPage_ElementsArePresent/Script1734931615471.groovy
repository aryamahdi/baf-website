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

WebUI.click(findTestObject('General/link_Content', [('href') : '/en/corporate/CorporateGovernance/CorporateSecretary', ('text') : 'Corporate Secretary']))

WebUI.focus(findTestObject('General/img_Content', [('src') : '/_next/image?url=%2Fstatic%2Fimages%2Fimage%2Fsecretary%2Fsecretary.png&w=3840&q=75']))

WebUI.verifyElementPresent(findTestObject('General/lbl_Content', [('text') : 'CORPORATE SECRETARY']), 10)

WebUI.verifyElementPresent(findTestObject('General/img_Content', [('src') : '/_next/image?url=%2Fstatic%2Fimages%2Fimage%2Fsecretary%2Fsecretary.png&w=3840&q=75']), 
    10)

WebUI.focus(findTestObject('General/lbl_Content', [('text') : 'Legal Basis of Corporate Secretary Establishment']))

WebUI.verifyElementPresent(findTestObject('General/lbl_Content', [('text') : 'Puji AriantiCorporate SecretaryIndonesian citizen, born in 1986. She holds a bachelor’s degree from Institut Teknologi Sepuluh Nopember (ITS) majoring Chemical Engineering, in 2010. She joined the Company in 2015 as Department Head in the Operation Planning & Development Division. Then she was appointed as Operation Strategic & Development Deputy Division Head (July 3rd , 2017 – December 31st , 2020). As of January 1st, 2021, she is appointed as the Company\'s Head of Corporate Planning Division and concurrently as Corporate Secretary.Prior to joining the Company, she had worked as Credit Risk Support Department Head of PT Adira Quantum Multi Finance (2014-2015) and Operation Excellence Deputy Department Head of PT Adira Quantum Multi Finance (2010-2013).']), 
    10)

WebUI.focus(findTestObject('General/lbl_Content', [('text') : 'DUTY IMPLEMENTATION REPORT']))

WebUI.verifyElementPresent(findTestObject('General/lbl_Content', [('text') : 'About Corporate SecretaryCorporate Secretary is individual or person in charge from working unit who performs corporate secretary function, as stipulated in Financial Service Regulation (OJK) No. 35/ POJK.04/2014 regarding Corporate Secretary in Issuers or Public Company.Corporate Secretary holds responsibility to provide information about the Company to regulator, authorities, investors/shareholders, as well as information regarding related regulations to the Board of Directors. Corporate Secretary also provides regulations and recommendations to the Board of Directors in the efforts to comply with the capital market regulations.Legal Basis of Corporate Secretary EstablishmentIn the Company, Corporate Secretary Function is established to comply with Financial Services Authority Regulation No. 35/POJK.04/2015 regarding Corporate Secretary in Issuer or Public Company. The Corporate Secretary shall comply requirements at least being capable in commencing legal action, having knowledge and understanding in legal, finance and corporate governance, understanding the Company’s business activity and having good communication skill and lives in Indonesia.Corporate Secretary is recently served by Puji Arianti according to Board of Directors No. SK-006/BOC/BAF.XII/2020 concerning Changes of Corporate Secretary effectively applied since January 1, 2021. She serves as Corporate Planning Division Head who also serves as Corporate Secretary.Duty and Responsibility of Corporate SecretaryTo perform activities related with corporate document administration and archiving, including but not limited to Special List, Shareholders List as well as Minutes of BOD Meeting and GMS;To perform activities related to public relation and investor relation functions;To cooperate with function which handles corporate legal service;To develop and control corporate governance;To prepare annual report, management report and statistic report; andIn terms of GMS and Board of Commissioners relation, the Corporate Secretary acts as liaison officer between the Board of Directors with the structure.DUTY IMPLEMENTATION REPORT']), 
    10)

WebUI.click(findTestObject('General/lbl_Content', [('text') : 'DUTY IMPLEMENTATION REPORT']))

WebUI.verifyLinksAccessible(['https://www.baf.id/static/files/pdf/Corporate%20Secretary%20Duty%20Implementation%20Report%20-%202021.pdf'])

WebUI.closeWindowIndex(1)

WebUI.switchToWindowIndex(0)

