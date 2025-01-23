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

'Click Menu "Contact Us"'
WebUI.click(findTestObject('link_Content', [('href') : '/contactus', ('text') : 'Contact Us']))

'Verify Text "Please ask..." is Present'
WebUI.verifyElementPresent(findTestObject('lbl_Content', [('text') : 'Please ask questions about Bussan Auto Finance. We are ready to help and answer questions from Customers, Partners, Media and other parties.']), 
    10)

'Verify Image Contact Us is Present'
WebUI.verifyElementPresent(findTestObject('img_Content', [('src') : '/static/images/image/contactUsImage.svg']), 10)

'Scroll to "Complaint Flow" Text'
WebUI.scrollToElement(findTestObject('var_Content', [('xpath') : '//body[1]/div[1]/main[1]/main[1]/div[2]/div[1]/div[1]/div[1]/div[1]/div[1]/div[2]/div[1]/form[1]/button[1]']), 
    10)

'Verify Text "Complaint Flow" is Present'
WebUI.verifyElementPresent(findTestObject('lbl_Content', [('text') : 'Complaint Flow']), 10)

'Verify Shape "Penerimaan Pengaduan" is Present'
WebUI.mouseOver(findTestObject('var_Content', [('xpath') : '//body[1]/div[1]/main[1]/main[1]/div[2]/div[1]/div[1]/div[1]/div[1]/div[2]/div[1]/div[1]']))

'Verify Shape "Eskalasi & Penyelesaian" is Present'
WebUI.mouseOver(findTestObject('var_Content', [('xpath') : '//body[1]/div[1]/main[1]/main[1]/div[2]/div[1]/div[1]/div[1]/div[1]/div[2]/div[1]/div[2]']))

'Verify Shape "Penyelesaian Pengaduan" is Present'
WebUI.mouseOver(findTestObject('var_Content', [('xpath') : '//body[1]/div[1]/main[1]/main[1]/div[2]/div[1]/div[1]/div[1]/div[1]/div[2]/div[1]/div[3]']))

'Verify Shape "Pemantauan" is Present'
WebUI.mouseOver(findTestObject('var_Content', [('xpath') : '//body[1]/div[1]/main[1]/main[1]/div[2]/div[1]/div[1]/div[1]/div[1]/div[2]/div[1]/div[4]']))

'Click Button "Click For More Detailed Information"'
WebUI.click(findTestObject('var_Content', [('xpath') : '//body[1]/div[1]/main[1]/main[1]/div[2]/div[1]/div[1]/div[1]/div[1]/div[2]/div[2]/a[1]']))

'Verify Link Accessibility'
WebUI.verifyLinksAccessible(['https://baf-mobile-prod.oss-ap-southeast-5.aliyuncs.com/Document/1727403920532.pdf'])

'Close Browser Windows'
WebUI.closeWindowIndex(1)

'Switch Browser Windows'
WebUI.switchToWindowIndex(0)

'Verify Text "Contact BAF at:" is Present'
WebUI.verifyElementPresent(findTestObject('lbl_Content', [('text') : 'Contact BAF at:']), 10)

'Verify Kirim Email BAF is Present'
WebUI.verifyElementPresent(findTestObject('var_Content', [('xpath') : '//body[1]/div[1]/main[1]/main[1]/div[2]/div[1]/div[1]/div[1]/div[1]/div[3]/div[1]/div[1]']), 
    10)

'Verify Telepon BAF Care is Present'
WebUI.verifyElementPresent(findTestObject('var_Content', [('xpath') : '//body[1]/div[1]/main[1]/main[1]/div[2]/div[1]/div[1]/div[1]/div[1]/div[3]/div[1]/div[2]']), 
    10)

'Verify Chat WhatsApp resmi BAF is Present'
WebUI.verifyElementPresent(findTestObject('var_Content', [('xpath') : '//body[1]/div[1]/main[1]/main[1]/div[2]/div[1]/div[1]/div[1]/div[1]/div[3]/div[1]/div[3]']), 
    10)

'Scroll to Up'
WebUI.scrollToElement(findTestObject('var_Content', [('xpath') : '//body[1]/div[1]/main[1]/main[1]/div[1]']), 10)

'Input Field Full Name'
WebUI.setText(findTestObject('var_Content', [('xpath') : '//body[1]/div[1]/main[1]/main[1]/div[2]/div[1]/div[1]/div[1]/div[1]/div[1]/div[2]/div[1]/form[1]/div[1]/input[1]']), 
    'Test')

'Input Field Phone Number'
WebUI.setText(findTestObject('var_Content', [('xpath') : '//body[1]/div[1]/main[1]/main[1]/div[2]/div[1]/div[1]/div[1]/div[1]/div[1]/div[2]/div[1]/form[1]/div[2]/input[1]']), 
    '085771720025')

'Input Field Email'
WebUI.setText(findTestObject('var_Content', [('xpath') : '//body[1]/div[1]/main[1]/main[1]/div[2]/div[1]/div[1]/div[1]/div[1]/div[1]/div[2]/div[1]/form[1]/div[3]/input[1]']), 
    'aria.mahdy@baf.id')

'Input Field Message'
WebUI.setText(findTestObject('var_Content', [('xpath') : '//body[1]/div[1]/main[1]/main[1]/div[2]/div[1]/div[1]/div[1]/div[1]/div[1]/div[2]/div[1]/form[1]/div[4]/textarea[1]']), 
    'Testing')

'Click Submit Button'
WebUI.click(findTestObject('var_Content', [('xpath') : '//body[1]/div[1]/main[1]/main[1]/div[2]/div[1]/div[1]/div[1]/div[1]/div[1]/div[2]/div[1]/form[1]/button[1]']))

'Verify Submit Success'
WebUI.verifyElementPresent(findTestObject('var_Content', [('xpath') : '//body[1]/div[2]/div[1]']), 10)

