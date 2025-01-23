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
import org.apache.poi.poifs.filesystem.POIFSFileSystem as POIFSFileSystem
import org.openqa.selenium.Keys as Keys

'Click "Event & Promo" menu'
WebUI.click(findTestObject('link_Content', [('href') : '/promo', ('text') : 'Event & Promo']))

'Verify the "EVENT & PROMO" header is displayed'
WebUI.verifyElementPresent(findTestObject('lbl_Content', [('text') : 'EVENT & PROMO']), 10)

'Click the "All" tab'
WebUI.click(findTestObject('var_Content', [('xpath') : '//body[1]/div[1]/main[1]/main[1]/div[2]/div[1]/div[1]/div[1]/a[1]']))

'Verify content in the "All" tab show'
WebUI.verifyElementPresent(findTestObject('var_Content', [('xpath') : '//body[1]/div[1]/main[1]/main[1]/div[4]/div[1]/div[1]']), 
    10)

'Click the "Event" tab'
WebUI.click(findTestObject('var_Content', [('xpath') : '//body[1]/div[1]/main[1]/main[1]/div[2]/div[1]/div[1]/div[2]/a[1]']))

'Verify content in the "Event" tab shows "No Results Found"'
WebUI.verifyElementPresent(findTestObject('lbl_Content', [('text') : 'No Results Found']), 10)

'Click the "New Motorcycle" tab'
WebUI.click(findTestObject('var_Content', [('xpath') : '//body[1]/div[1]/main[1]/main[1]/div[2]/div[1]/div[1]/div[3]/a[1]']))

'Verify content in the "New Motorcycle" tab show'
WebUI.verifyElementPresent(findTestObject('var_Content', [('xpath') : '//body[1]/div[1]/main[1]/main[1]/div[4]/div[1]/div[1]']), 
    10)

'Click the "Used Motorcycle" tab'
WebUI.click(findTestObject('var_Content', [('xpath') : '//body[1]/div[1]/main[1]/main[1]/div[2]/div[1]/div[1]/div[4]/a[1]']))

'Verify content in the "Used Motorcycle" tab shows "No Results Found"'
WebUI.verifyElementPresent(findTestObject('lbl_Content', [('text') : 'No Results Found']), 10)

'Click the "Car" tab'
WebUI.click(findTestObject('var_Content', [('xpath') : '//body[1]/div[1]/main[1]/main[1]/div[2]/div[1]/div[1]/div[5]/a[1]']))

'Verify content in the "Car" tab shows "No Results Found"'
WebUI.verifyElementPresent(findTestObject('lbl_Content', [('text') : 'No Results Found']), 10)

'Click the "Electronic, Gadget, & Furniture" tab'
WebUI.click(findTestObject('var_Content', [('xpath') : '//body[1]/div[1]/main[1]/main[1]/div[2]/div[1]/div[1]/div[6]/a[1]']))

'Verify content in the "Electronic, Gadget, & Furniture" tab shows "No Results Found"'
WebUI.verifyElementPresent(findTestObject('lbl_Content', [('text') : 'No Results Found']), 10)

'Click the "BAF Dana Syariah" tab'
WebUI.click(findTestObject('var_Content', [('xpath') : '//body[1]/div[1]/main[1]/main[1]/div[2]/div[1]/div[1]/div[7]/a[1]']))

'Verify content in the "BAF Dana Syariah" tab shows "No Results Found"'
WebUI.verifyElementPresent(findTestObject('lbl_Content', [('text') : 'No Results Found']), 10)

'Click the "Agricultural Machinery" tab'
WebUI.click(findTestObject('var_Content', [('xpath') : '//body[1]/div[1]/main[1]/main[1]/div[2]/div[1]/div[1]/div[8]/a[1]']))

'Verify the "Agricultural Machinery" tab shows "No Results Found"'
WebUI.verifyElementPresent(findTestObject('lbl_Content', [('text') : 'No Results Found']), 10)

'Click the "Fleet Financing" tab'
WebUI.click(findTestObject('var_Content', [('xpath') : '//body[1]/div[1]/main[1]/main[1]/div[2]/div[1]/div[1]/div[9]/a[1]']))

'Verify the "Fleet Financing" tab shows "No Results Found"'
WebUI.verifyElementPresent(findTestObject('lbl_Content', [('text') : 'No Results Found']), 10)

