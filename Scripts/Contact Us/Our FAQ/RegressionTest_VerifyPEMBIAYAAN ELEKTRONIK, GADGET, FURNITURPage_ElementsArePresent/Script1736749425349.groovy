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

'Click Menu "PEMBIAYAAN ELEKTRONIK, GADGET, FURNITUR"'
WebUI.click(findTestObject('var_Content', [('xpath') : '//body[1]/div[1]/main[1]/main[1]/div[2]/div[1]/div[1]/div[2]/div[1]/div[1]/div[1]/div[1]/div[1]/div[6]/a[1]']))

'Show First Dropdown'
WebUI.click(findTestObject('var_Content', [('xpath') : '//body[1]/div[1]/main[1]/main[1]/div[2]/div[1]/div[1]/div[2]/div[1]/div[1]/div[2]/div[1]/div[1]/div[6]/div[1]/div[1]/div[1]/div[1]/div[1]']))

'Verify First Text Dropdown is Present'
WebUI.verifyElementPresent(findTestObject('lbl_Content', [('text') : 'Bagi Konsumen yang berminat untuk mengajukan Multiproduct, dapat datang langsung ke Toko/Mitra yang bekerja sama dengan BAF atau bisa mengisi data diri melalui Website BAF, Aplikasi BAF Mobile & Sosial Media BAF untuk kemudian ditindak lanjuti tim Telesales.']), 
    10)

'Hide First Dropdown'
WebUI.click(findTestObject('var_Content', [('xpath') : '//body[1]/div[1]/main[1]/main[1]/div[2]/div[1]/div[1]/div[2]/div[1]/div[1]/div[2]/div[1]/div[1]/div[6]/div[1]/div[1]/div[1]/div[1]/div[1]']))

'Show Second Dropdown'
WebUI.click(findTestObject('var_Content', [('xpath') : '//body[1]/div[1]/main[1]/main[1]/div[2]/div[1]/div[1]/div[2]/div[1]/div[1]/div[2]/div[1]/div[1]/div[6]/div[1]/div[1]/div[2]/div[1]/div[1]']))

'Verify Second Text Dropdown is Present'
WebUI.verifyElementPresent(findTestObject('lbl_Content', [('text') : 'Proses pengajuan kurang lebih 30 menit setelah data lengkap konsumen diinput di sistem. Dokumen wajib sudah lengkap sebelum proses dapat dijalankan.']), 
    10)

'Hide Second Dropdown'
WebUI.click(findTestObject('var_Content', [('xpath') : '//body[1]/div[1]/main[1]/main[1]/div[2]/div[1]/div[1]/div[2]/div[1]/div[1]/div[2]/div[1]/div[1]/div[6]/div[1]/div[1]/div[2]/div[1]/div[1]']))

'Show Third Dropdown'
WebUI.click(findTestObject('var_Content', [('xpath') : '//body[1]/div[1]/main[1]/main[1]/div[2]/div[1]/div[1]/div[2]/div[1]/div[1]/div[2]/div[1]/div[1]/div[6]/div[1]/div[1]/div[3]/div[1]/div[1]']))

'Verify Third Text Dropdown is Present'
WebUI.verifyElementPresent(findTestObject('lbl_Content', [('text') : 'DP untuk berbagai jenis barang Multiproduk bervariasi sesuai dengan jenis barang yang dipilih. Konsumen dapat menghubungi tim Sales BAF di toko-toko rekanan untuk dapat mengetahui besaran DP yang berlaku.']), 
    10)

'Hide Third Dropdown'
WebUI.click(findTestObject('var_Content', [('xpath') : '//body[1]/div[1]/main[1]/main[1]/div[2]/div[1]/div[1]/div[2]/div[1]/div[1]/div[2]/div[1]/div[1]/div[6]/div[1]/div[1]/div[3]/div[1]/div[1]']))

'Scroll to Fourth Dropdown'
WebUI.scrollToElement(findTestObject('var_Content', [('xpath') : '//body[1]/div[1]/main[1]/main[1]/div[2]/div[1]/div[1]/div[2]/div[1]/div[1]/div[2]/div[1]/div[1]/div[6]/div[1]/div[1]/div[3]']), 
    10)

'Show Fourth Dropdown'
WebUI.click(findTestObject('var_Content', [('xpath') : '//body[1]/div[1]/main[1]/main[1]/div[2]/div[1]/div[1]/div[2]/div[1]/div[1]/div[2]/div[1]/div[1]/div[6]/div[1]/div[1]/div[4]/div[1]/div[1]']))

'Verify Fourh Text Dropdown is Present'
WebUI.verifyElementPresent(findTestObject('lbl_Content', [('text') : 'Laptop, Desktop, Smartphone, Televisi, Kamera Digital, Game Console, Printer & Scanner, AC, Kulkas dan Elektronik lainnya, Kursi, Lemari, Meja, Sofa, dan furnitur lainnya, Bass, Drum, Gitar, Keyboard, Perkusi, Piano, dan alat musik lainnya, Pompa Air, Sepeda & Treadmill, Genset (ukuran kecil)']), 
    10)

'Hide Fourth Dropdown'
WebUI.click(findTestObject('var_Content', [('xpath') : '//body[1]/div[1]/main[1]/main[1]/div[2]/div[1]/div[1]/div[2]/div[1]/div[1]/div[2]/div[1]/div[1]/div[6]/div[1]/div[1]/div[4]/div[1]/div[1]']))

'Show Fifth Dropdown'
WebUI.click(findTestObject('var_Content', [('xpath') : '//body[1]/div[1]/main[1]/main[1]/div[2]/div[1]/div[1]/div[2]/div[1]/div[1]/div[2]/div[1]/div[1]/div[6]/div[1]/div[1]/div[5]/div[1]/div[1]']))

'Verify Fifth Text Dropdown is Present'
WebUI.verifyElementPresent(findTestObject('var_Content', [('xpath') : '//body[1]/div[1]/main[1]/main[1]/div[2]/div[1]/div[1]/div[2]/div[1]/div[1]/div[2]/div[1]/div[1]/div[6]/div[1]/div[1]/div[5]/div[2]/div[1]']), 
    10)

'Hide Fifth Dropdown'
WebUI.click(findTestObject('var_Content', [('xpath') : '//body[1]/div[1]/main[1]/main[1]/div[2]/div[1]/div[1]/div[2]/div[1]/div[1]/div[2]/div[1]/div[1]/div[6]/div[1]/div[1]/div[5]/div[1]/div[1]']))

