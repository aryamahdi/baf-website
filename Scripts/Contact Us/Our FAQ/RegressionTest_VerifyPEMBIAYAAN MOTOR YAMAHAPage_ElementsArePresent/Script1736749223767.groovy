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

'Show First Dropdown'
WebUI.click(findTestObject('var_Content', [('xpath') : '//body[1]/div[1]/main[1]/main[1]/div[2]/div[1]/div[1]/div[2]/div[1]/div[1]/div[2]/div[1]/div[1]/div[1]/div[1]/div[1]/div[1]/div[1]/div[1]']))

'Verify First Text Dropdown is Present'
WebUI.verifyElementPresent(findTestObject('lbl_Content', [('text') : 'Bisa download sesuai link yang di email/whatsapp atau bisa request kembali ke cabang BAF.']), 
    10)

'Hide First Dropdown'
WebUI.click(findTestObject('var_Content', [('xpath') : '//body[1]/div[1]/main[1]/main[1]/div[2]/div[1]/div[1]/div[2]/div[1]/div[1]/div[2]/div[1]/div[1]/div[1]/div[1]/div[1]/div[1]/div[1]/div[1]']))

'Show Second Dropdown'
WebUI.click(findTestObject('var_Content', [('xpath') : '//body[1]/div[1]/main[1]/main[1]/div[2]/div[1]/div[1]/div[2]/div[1]/div[1]/div[2]/div[1]/div[1]/div[1]/div[1]/div[1]/div[2]/div[1]/div[1]']))

'Verify Second Text Dropdown is Present'
WebUI.verifyElementPresent(findTestObject('lbl_Content', [('text') : 'Bisa download kembali sesuai link yang dikirim melalui email/whatsapp atau bisa request kembali ke cabang.']), 
    10)

'Hide Second Dropdown'
WebUI.click(findTestObject('var_Content', [('xpath') : '//body[1]/div[1]/main[1]/main[1]/div[2]/div[1]/div[1]/div[2]/div[1]/div[1]/div[2]/div[1]/div[1]/div[1]/div[1]/div[1]/div[2]/div[1]/div[1]']))

'Show Third Dropdown'
WebUI.click(findTestObject('var_Content', [('xpath') : '//body[1]/div[1]/main[1]/main[1]/div[2]/div[1]/div[1]/div[2]/div[1]/div[1]/div[2]/div[1]/div[1]/div[1]/div[1]/div[1]/div[3]/div[1]/div[1]']))

'Verify Third Text Dropdown is Present'
WebUI.verifyElementPresent(findTestObject('lbl_Content', [('text') : 'Pengajuan motor baru dapat dilakukan melalui website BAF, kantor cabang BAF dan Dealer.']), 
    10)

'Hide Third Dropdown'
WebUI.click(findTestObject('var_Content', [('xpath') : '//body[1]/div[1]/main[1]/main[1]/div[2]/div[1]/div[1]/div[2]/div[1]/div[1]/div[2]/div[1]/div[1]/div[1]/div[1]/div[1]/div[3]/div[1]/div[1]']))

'Scroll to Fourth Dropdown'
WebUI.scrollToElement(findTestObject('var_Content', [('xpath') : '//body[1]/div[1]/main[1]/main[1]/div[2]/div[1]/div[1]/div[2]/div[1]/div[1]/div[2]/div[1]/div[1]/div[1]/div[1]/div[1]/div[3]']), 
    10)

'Show Fourth Dropdown'
WebUI.click(findTestObject('var_Content', [('xpath') : '//body[1]/div[1]/main[1]/main[1]/div[2]/div[1]/div[1]/div[2]/div[1]/div[1]/div[2]/div[1]/div[1]/div[1]/div[1]/div[1]/div[4]/div[1]/div[1]']))

'Verify Fourh Text Dropdown is Present'
WebUI.verifyElementPresent(findTestObject('lbl_Content', [('text') : 'DP untuk berbagai Type Motor bervariasi sesuai dengan type motor yang dipilih oleh konsumen. DP dimulai dari 10% dari harga OTR (On The Road).']), 
    10)

'Hide Fourth Dropdown'
WebUI.click(findTestObject('var_Content', [('xpath') : '//body[1]/div[1]/main[1]/main[1]/div[2]/div[1]/div[1]/div[2]/div[1]/div[1]/div[2]/div[1]/div[1]/div[1]/div[1]/div[1]/div[4]/div[1]/div[1]']))

'Show Fifth Dropdown'
WebUI.click(findTestObject('var_Content', [('xpath') : '//body[1]/div[1]/main[1]/main[1]/div[2]/div[1]/div[1]/div[2]/div[1]/div[1]/div[2]/div[1]/div[1]/div[1]/div[1]/div[1]/div[5]/div[1]/div[1]']))

'Verify Fifth Text Dropdown is Present'
WebUI.verifyElementPresent(findTestObject('lbl_Content', [('text') : 'BAF dapat memberikan pembiayaan untuk seluruh tipe motor Yamaha']), 
    10)

'Hide Fifth Dropdown'
WebUI.click(findTestObject('var_Content', [('xpath') : '//body[1]/div[1]/main[1]/main[1]/div[2]/div[1]/div[1]/div[2]/div[1]/div[1]/div[2]/div[1]/div[1]/div[1]/div[1]/div[1]/div[5]/div[1]/div[1]']))

'Show Sixth Dropdown'
WebUI.click(findTestObject('var_Content', [('xpath') : '//body[1]/div[1]/main[1]/main[1]/div[2]/div[1]/div[1]/div[2]/div[1]/div[1]/div[2]/div[1]/div[1]/div[1]/div[1]/div[1]/div[6]/div[1]/div[1]']))

'Verify Sixth Text Dropdown is Present'
WebUI.verifyElementPresent(findTestObject('lbl_Content', [('text') : 'Cara Perpanjang STNK, Konsumen tinggal datang ke kantor Cabang BAF, Persyaratan dengan membawa atau menginformasikan no kontrak, kemudian membayar biaya STNK fee sebesar Rp 10.000, konsumen akan diberikan surat pengantar dari BAF dan copy legalisir.']), 
    10)

'Hide Sixth Dropdown'
WebUI.click(findTestObject('var_Content', [('xpath') : '//body[1]/div[1]/main[1]/main[1]/div[2]/div[1]/div[1]/div[2]/div[1]/div[1]/div[2]/div[1]/div[1]/div[1]/div[1]/div[1]/div[6]/div[1]/div[1]']))

'Show Seventh Dropdown'
WebUI.click(findTestObject('var_Content', [('xpath') : '//body[1]/div[1]/main[1]/main[1]/div[2]/div[1]/div[1]/div[2]/div[1]/div[1]/div[2]/div[1]/div[1]/div[1]/div[1]/div[1]/div[7]/div[1]/div[1]']))

'Verify Seventh Text Dropdown is Present'
WebUI.verifyElementPresent(findTestObject('lbl_Content', [('text') : 'Estimasi waktu dari pengajuan hingga disetujui untuk pengajuan motor baru adalah 1 day service dengan proses approval kurang dari 1 jam.']), 
    10)

'Hide Seventh Dropdown'
WebUI.click(findTestObject('var_Content', [('xpath') : '//body[1]/div[1]/main[1]/main[1]/div[2]/div[1]/div[1]/div[2]/div[1]/div[1]/div[2]/div[1]/div[1]/div[1]/div[1]/div[1]/div[7]/div[1]/div[1]']))

'Scroll to Eighth Dropdown'
WebUI.scrollToElement(findTestObject('var_Content', [('xpath') : '//body[1]/div[1]/main[1]/main[1]/div[2]/div[1]/div[1]/div[2]/div[1]/div[1]/div[2]/div[1]/div[1]/div[1]/div[1]/div[1]/div[7]']), 
    10)

'Show Eighth Dropdown'
WebUI.click(findTestObject('var_Content', [('xpath') : '//body[1]/div[1]/main[1]/main[1]/div[2]/div[1]/div[1]/div[2]/div[1]/div[1]/div[2]/div[1]/div[1]/div[1]/div[1]/div[1]/div[8]/div[1]/div[1]']))

'Verify Eighth Text Dropdown is Present'
WebUI.verifyElementPresent(findTestObject('lbl_Content', [('text') : 'Biaya Pelunasan dipercepat Sebesar 7% dari sisa pokok hutang.']), 
    10)

'Hide Eighth Dropdown'
WebUI.click(findTestObject('var_Content', [('xpath') : '//body[1]/div[1]/main[1]/main[1]/div[2]/div[1]/div[1]/div[2]/div[1]/div[1]/div[2]/div[1]/div[1]/div[1]/div[1]/div[1]/div[8]/div[1]/div[1]']))

'Show Ninth Dropdown'
WebUI.click(findTestObject('var_Content', [('xpath') : '//body[1]/div[1]/main[1]/main[1]/div[2]/div[1]/div[1]/div[2]/div[1]/div[1]/div[2]/div[1]/div[1]/div[1]/div[1]/div[1]/div[9]/div[1]/div[1]']))

'Verify Ninth Text Dropdown is Present'
WebUI.verifyElementPresent(findTestObject('lbl_Content', [('text') : 'Biaya Pelunasan dipercepat Sebesar 7% dari sisa pokok hutang.']), 
    10)

'Hide Ninth Dropdown'
WebUI.click(findTestObject('var_Content', [('xpath') : '//body[1]/div[1]/main[1]/main[1]/div[2]/div[1]/div[1]/div[2]/div[1]/div[1]/div[2]/div[1]/div[1]/div[1]/div[1]/div[1]/div[9]/div[1]/div[1]']))

'Show Tenth Dropdown'
WebUI.click(findTestObject('var_Content', [('xpath') : '//body[1]/div[1]/main[1]/main[1]/div[2]/div[1]/div[1]/div[2]/div[1]/div[1]/div[2]/div[1]/div[1]/div[1]/div[1]/div[1]/div[10]/div[1]/div[1]']))

'Verify Tenth Text Dropdown is Present'
WebUI.verifyElementPresent(findTestObject('lbl_Content', [('text') : 'Plat nomor dan STNK akan diterima dalam waktu 2 hingga 3 minggu. Dealer juga akan menginfomasikan kepada konsumen apabila STNK sudah jadi dan siap diberikan kepada customer.']), 
    10)

'Hide Tenth Dropdown'
WebUI.click(findTestObject('var_Content', [('xpath') : '//body[1]/div[1]/main[1]/main[1]/div[2]/div[1]/div[1]/div[2]/div[1]/div[1]/div[2]/div[1]/div[1]/div[1]/div[1]/div[1]/div[10]/div[1]/div[1]']))

'Show Eleventh Dropdown'
WebUI.click(findTestObject('var_Content', [('xpath') : '//body[1]/div[1]/main[1]/main[1]/div[2]/div[1]/div[1]/div[2]/div[1]/div[1]/div[2]/div[1]/div[1]/div[1]/div[1]/div[1]/div[11]/div[1]/div[1]']))

'Verify Eleventh Text Dropdown is Present'
WebUI.verifyElementPresent(findTestObject('lbl_Content', [('text') : 'Welcoming Letter dikirim H+1 setelah go live (terbentuk no kontrak) dikirim via email/whatsapp.']), 
    10)

'Hide Eleventh Dropdown'
WebUI.click(findTestObject('var_Content', [('xpath') : '//body[1]/div[1]/main[1]/main[1]/div[2]/div[1]/div[1]/div[2]/div[1]/div[1]/div[2]/div[1]/div[1]/div[1]/div[1]/div[1]/div[11]/div[1]/div[1]']))

'Scroll to Twelfth Dropdown'
WebUI.scrollToElement(findTestObject('var_Content', [('xpath') : '//body[1]/div[1]/main[1]/main[1]/div[2]/div[1]/div[1]/div[2]/div[1]/div[1]/div[2]/div[1]/div[1]/div[1]/div[1]/div[1]/div[11]']), 
    10)

'Show Twelfth Dropdown'
WebUI.click(findTestObject('var_Content', [('xpath') : '//body[1]/div[1]/main[1]/main[1]/div[2]/div[1]/div[1]/div[2]/div[1]/div[1]/div[2]/div[1]/div[1]/div[1]/div[1]/div[1]/div[12]/div[1]/div[1]']))

'Verify Twelfth Text Dropdown is Present'
WebUI.verifyElementPresent(findTestObject('var_Content', [('xpath') : '//body[1]/div[1]/main[1]/main[1]/div[2]/div[1]/div[1]/div[2]/div[1]/div[1]/div[2]/div[1]/div[1]/div[1]/div[1]/div[1]/div[12]/div[2]/div[1]']), 
    10)

'Hide Twelfth Dropdown'
WebUI.click(findTestObject('var_Content', [('xpath') : '//body[1]/div[1]/main[1]/main[1]/div[2]/div[1]/div[1]/div[2]/div[1]/div[1]/div[2]/div[1]/div[1]/div[1]/div[1]/div[1]/div[12]/div[1]/div[1]']))

'Show Thirteenth Dropdown'
WebUI.click(findTestObject('var_Content', [('xpath') : '//body[1]/div[1]/main[1]/main[1]/div[2]/div[1]/div[1]/div[2]/div[1]/div[1]/div[2]/div[1]/div[1]/div[1]/div[1]/div[1]/div[13]/div[1]/div[1]']))

'Verify Thirteenth Text Dropdown is Present'
WebUI.verifyElementPresent(findTestObject('lbl_Content', [('text') : 'Pembayaran cicilan yang melewati tanggal jatuh tempo akan diberlakukan denda perhari, besar nya 0.5% di kali dengan jumlah cicilan perbulan.']), 
    10)

'Hide Thirteenth Dropdown'
WebUI.click(findTestObject('var_Content', [('xpath') : '//body[1]/div[1]/main[1]/main[1]/div[2]/div[1]/div[1]/div[2]/div[1]/div[1]/div[2]/div[1]/div[1]/div[1]/div[1]/div[1]/div[13]/div[1]/div[1]']))

'Show Fourteenth Dropdown'
WebUI.click(findTestObject('var_Content', [('xpath') : '//body[1]/div[1]/main[1]/main[1]/div[2]/div[1]/div[1]/div[2]/div[1]/div[1]/div[2]/div[1]/div[1]/div[1]/div[1]/div[1]/div[14]/div[1]/div[1]']))

'Verify Fouteenth Text Dropdown is Present'
WebUI.verifyElementPresent(findTestObject('var_Content', [('xpath') : '//body[1]/div[1]/main[1]/main[1]/div[2]/div[1]/div[1]/div[2]/div[1]/div[1]/div[2]/div[1]/div[1]/div[1]/div[1]/div[1]/div[14]/div[2]/div[1]']), 
    10)

'Hide Fourteenth Dropdown'
WebUI.click(findTestObject('var_Content', [('xpath') : '//body[1]/div[1]/main[1]/main[1]/div[2]/div[1]/div[1]/div[2]/div[1]/div[1]/div[2]/div[1]/div[1]/div[1]/div[1]/div[1]/div[14]/div[1]/div[1]']))

