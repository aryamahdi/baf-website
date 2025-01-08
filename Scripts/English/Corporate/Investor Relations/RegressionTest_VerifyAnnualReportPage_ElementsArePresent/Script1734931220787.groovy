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

WebUI.click(findTestObject('null'))

WebUI.click(findTestObject('null'))

WebUI.click(findTestObject('null'))

WebUI.focus(findTestObject('Investor Relation/Annual Report/nav_Annual Report'))

WebUI.verifyTextPresent('ANNUAL REPORT', true)

WebUI.verifyTextPresent('Laporan tahunan merupakan bentuk transparansi kami dalam menyajikan capaian kinerja secara keseluruhan kepada para pemangku kepentingan, baik dari sisi pencapain keuangan, bisnis, dan tata kelola.', 
    true)

WebUI.verifyTextPresent('The annual report is a form of transparency in presenting our overall performance achievements to stakeholders, both in terms of financial, business and governance.', 
    true)

WebUI.focus(findTestObject('Investor Relation/Annual Report/nav_Annual Report Sustainability Report 2023'))

WebUI.verifyElementPresent(findTestObject('Investor Relation/Annual Report/nav_Annual Report Sustainability Report 2023'), 
    10)

WebUI.focus(findTestObject('Investor Relation/Annual Report/nav_Annual Report Sustainability Report 2022'))

WebUI.verifyElementPresent(findTestObject('Investor Relation/Annual Report/nav_Annual Report Sustainability Report 2022'), 
    10)

WebUI.focus(findTestObject('Investor Relation/Annual Report/nav_Annual Report Sustainability Report 2021'))

WebUI.verifyElementPresent(findTestObject('Investor Relation/Annual Report/nav_Annual Report Sustainability Report 2021'), 
    10)

WebUI.focus(findTestObject('Investor Relation/Annual Report/nav_Annual Report Sustainability Report 2020'))

WebUI.verifyElementPresent(findTestObject('Investor Relation/Annual Report/nav_Annual Report Sustainability Report 2020'), 
    10)

WebUI.focus(findTestObject('Investor Relation/Annual Report/nav_Annual Report 2019'))

WebUI.verifyElementPresent(findTestObject('Investor Relation/Annual Report/nav_Annual Report 2019'), 10)

WebUI.click(findTestObject('Investor Relation/Annual Report/button__Next Page'))

WebUI.focus(findTestObject('Investor Relation/Annual Report/nav_Annual Report 2018'))

WebUI.verifyElementPresent(findTestObject('Investor Relation/Annual Report/nav_Annual Report 2018'), 10)

WebUI.focus(findTestObject('Investor Relation/Annual Report/nav_Annual Report 2017'))

WebUI.verifyElementPresent(findTestObject('Investor Relation/Annual Report/nav_Annual Report 2017'), 10)

