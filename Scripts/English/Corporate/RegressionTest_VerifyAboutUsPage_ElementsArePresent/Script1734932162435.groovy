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

WebUI.click(findTestObject('Header/link_About Us'))

WebUI.verifyElementPresent(findTestObject('About Us/img_Building'), 10)

WebUI.verifyElementPresent(findTestObject('About Us/img_Milestone BAF'), 10)

WebUI.focus(findTestObject('About Us/button_Read BAF at a Glance'))

WebUI.verifyElementPresent(findTestObject('About Us/lbl_Before Read More BAF at a Glance'), 10)

WebUI.click(findTestObject('About Us/button_Read BAF at a Glance'))

WebUI.verifyElementPresent(findTestObject('About Us/lbl_After Read More BAF at a Glance'), 10)

WebUI.focus(findTestObject('About Us/button_Read BAF at a Glance'))

WebUI.click(findTestObject('About Us/button_Read BAF at a Glance'))

WebUI.focus(findTestObject('About Us/img_Building'))

WebUI.click(findTestObject('About Us/link_Vision, Mission, and Value'))

WebUI.verifyElementPresent(findTestObject('About Us/nav_Vision'), 10)

WebUI.verifyElementPresent(findTestObject('About Us/nav_Mission'), 10)

WebUI.focus(findTestObject('About Us/nav_Visionary Reliable Accessible'))

WebUI.verifyElementPresent(findTestObject('About Us/nav_Visionary Reliable Accessible'), 10)

WebUI.focus(findTestObject('About Us/img_Building'))

WebUI.click(findTestObject('About Us/link_Organnization Structure'))

WebUI.focus(findTestObject('About Us/img_Building'))

WebUI.verifyTextPresent('ORGANIZATION STRUCTURE', true)

WebUI.verifyTextPresent('Organization Structure', true)

WebUI.verifyTextPresent('PT Bussan Auto Finance', true)

WebUI.verifyElementPresent(findTestObject('About Us/img_Organization Structure PT Bussan Auto Finance'), 10)

WebUI.focus(findTestObject('About Us/img_Building'))

WebUI.click(findTestObject('About Us/link_Shareholder Structure'))

WebUI.focus(findTestObject('About Us/img_Building'))

WebUI.verifyTextPresent('SHAREHOLDERS', true)

WebUI.verifyElementPresent(findTestObject('About Us/img_Mitsui  Co., Ltd'), 10)

WebUI.verifyElementPresent(findTestObject('About Us/img_JA Mitsui Leasing, Ltd'), 10)

WebUI.verifyElementPresent(findTestObject('About Us/img_Yamaha MotorCo., Ltd'), 10)

WebUI.verifyElementPresent(findTestObject('About Us/img_PT Yamaha IndonesiaMotor Manufacturing'), 10)

WebUI.verifyElementPresent(findTestObject('About Us/img_PT SinergiAutoindo Abadi'), 10)

WebUI.verifyElementPresent(findTestObject('About Us/nav_Shareholders'), 10)

WebUI.focus(findTestObject('About Us/img_Building'))

WebUI.click(findTestObject('About Us/link_Board of Commissioners'))

WebUI.focus(findTestObject('About Us/nav_Header'))

WebUI.click(findTestObject('About Us/link_Board of Directors'))

WebUI.focus(findTestObject('About Us/nav_Header'))

WebUI.click(findTestObject('About Us/link_Achievements'))

