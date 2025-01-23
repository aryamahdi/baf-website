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

'Click Menu "PEMBIAYAAN FLEET"'
WebUI.click(findTestObject('var_Content', [('xpath') : '//body[1]/div[1]/main[1]/main[1]/div[2]/div[1]/div[1]/div[2]/div[1]/div[1]/div[1]/div[1]/div[1]/div[7]/a[1]']))

'Show First Dropdown'
WebUI.click(findTestObject('var_Content', [('xpath') : '//body[1]/div[1]/main[1]/main[1]/div[2]/div[1]/div[1]/div[2]/div[1]/div[1]/div[2]/div[1]/div[1]/div[7]/div[1]/div[1]/div[1]/div[1]/div[1]']))

'Verify First Text Dropdown is Present'
WebUI.verifyElementPresent(findTestObject('lbl_Content', [('text') : 'Merupakan Pembiayaan secara kolektif. Pembiayaan fleet Menghadirkan pelayanan jasa pembiayaan sepeda motor Yamaha bagi perusahaan baik untuk kebutuhan kendaraan operasional maupun kendaraan karyawan secara kolektif.']), 
    10)

'Hide First Dropdown'
WebUI.click(findTestObject('var_Content', [('xpath') : '//body[1]/div[1]/main[1]/main[1]/div[2]/div[1]/div[1]/div[2]/div[1]/div[1]/div[2]/div[1]/div[1]/div[7]/div[1]/div[1]/div[1]/div[1]/div[1]']))

'Show Second Dropdown'
WebUI.click(findTestObject('var_Content', [('xpath') : '//body[1]/div[1]/main[1]/main[1]/div[2]/div[1]/div[1]/div[2]/div[1]/div[1]/div[2]/div[1]/div[1]/div[7]/div[1]/div[1]/div[2]/div[1]/div[1]']))

'Verify Second Text Dropdown is Present'
WebUI.verifyElementPresent(findTestObject('lbl_Content', [('text') : 'Produk Pembiayaan untuk seluruh tipe motor Yamaha']), 
    10)

'Hide Second Dropdown'
WebUI.click(findTestObject('var_Content', [('xpath') : '//body[1]/div[1]/main[1]/main[1]/div[2]/div[1]/div[1]/div[2]/div[1]/div[1]/div[2]/div[1]/div[1]/div[7]/div[1]/div[1]/div[2]/div[1]/div[1]']))

'Show Third Dropdown'
WebUI.click(findTestObject('var_Content', [('xpath') : '//body[1]/div[1]/main[1]/main[1]/div[2]/div[1]/div[1]/div[2]/div[1]/div[1]/div[2]/div[1]/div[1]/div[7]/div[1]/div[1]/div[3]/div[1]/div[1]']))

'Verify Third Text Dropdown is Present'
WebUI.verifyElementPresent(findTestObject('lbl_Content', [('text') : 'Tentu bisa, Terdapat 2 (dua) pembiayaan fleet: Fleet Operational: Merupakan pembiayaan untuk kebutuhan kendaraan operasional atau bisnis dengan Pemohon atas nama Perusahaan. Fleet Collective: Karyawan yang memiliki fix income dan direkomendasikan oleh HR/ Purchasing / PIC Perusahaan (Pemohon atas nama Karyawan).']), 
    10)

'Hide Third Dropdown'
WebUI.click(findTestObject('var_Content', [('xpath') : '//body[1]/div[1]/main[1]/main[1]/div[2]/div[1]/div[1]/div[2]/div[1]/div[1]/div[2]/div[1]/div[1]/div[7]/div[1]/div[1]/div[3]/div[1]/div[1]']))

'Scroll to Fourth Dropdown'
WebUI.scrollToElement(findTestObject('var_Content', [('xpath') : '//body[1]/div[1]/main[1]/main[1]/div[2]/div[1]/div[1]/div[2]/div[1]/div[1]/div[2]/div[1]/div[1]/div[7]/div[1]/div[1]/div[3]']), 
    10)

'Show Fourth Dropdown'
WebUI.click(findTestObject('var_Content', [('xpath') : '//body[1]/div[1]/main[1]/main[1]/div[2]/div[1]/div[1]/div[2]/div[1]/div[1]/div[2]/div[1]/div[1]/div[7]/div[1]/div[1]/div[4]/div[1]/div[1]']))

'Verify Fourh Text Dropdown is Present'
WebUI.verifyElementPresent(findTestObject('var_Content', [('xpath') : '//body[1]/div[1]/main[1]/main[1]/div[2]/div[1]/div[1]/div[2]/div[1]/div[1]/div[2]/div[1]/div[1]/div[7]/div[1]/div[1]/div[4]/div[2]/div[1]']), 
    10)

'Hide Fourth Dropdown'
WebUI.click(findTestObject('var_Content', [('xpath') : '//body[1]/div[1]/main[1]/main[1]/div[2]/div[1]/div[1]/div[2]/div[1]/div[1]/div[2]/div[1]/div[1]/div[7]/div[1]/div[1]/div[4]/div[1]/div[1]']))

'Show Fifth Dropdown'
WebUI.click(findTestObject('var_Content', [('xpath') : '//body[1]/div[1]/main[1]/main[1]/div[2]/div[1]/div[1]/div[2]/div[1]/div[1]/div[2]/div[1]/div[1]/div[7]/div[1]/div[1]/div[5]/div[1]/div[1]']))

'Verify Fifth Text Dropdown is Present'
WebUI.verifyElementPresent(findTestObject('lbl_Content', [('text') : 'Setoran Tunai dikasir, Melalui Online Payment, Autodebet, dan Potong Gaji Perusahaan.']), 
    10)

'Hide Fifth Dropdown'
WebUI.click(findTestObject('var_Content', [('xpath') : '//body[1]/div[1]/main[1]/main[1]/div[2]/div[1]/div[1]/div[2]/div[1]/div[1]/div[2]/div[1]/div[1]/div[7]/div[1]/div[1]/div[5]/div[1]/div[1]']))

'Show Sixth Dropdown'
WebUI.click(findTestObject('var_Content', [('xpath') : '//body[1]/div[1]/main[1]/main[1]/div[2]/div[1]/div[1]/div[2]/div[1]/div[1]/div[2]/div[1]/div[1]/div[7]/div[1]/div[1]/div[6]/div[1]/div[1]']))

'Verify Sixth Text Dropdown is Present'
WebUI.verifyElementPresent(findTestObject('lbl_Content', [('text') : 'Calon debitur dapat melakukan pengajuan dengan datang ke kantor cabang BAF atau melalui website BAF.']), 
    10)

'Hide Sixth Dropdown'
WebUI.click(findTestObject('var_Content', [('xpath') : '//body[1]/div[1]/main[1]/main[1]/div[2]/div[1]/div[1]/div[2]/div[1]/div[1]/div[2]/div[1]/div[1]/div[7]/div[1]/div[1]/div[6]/div[1]/div[1]']))

'Show Seventh Dropdown'
WebUI.click(findTestObject('var_Content', [('xpath') : '//body[1]/div[1]/main[1]/main[1]/div[2]/div[1]/div[1]/div[2]/div[1]/div[1]/div[2]/div[1]/div[1]/div[7]/div[1]/div[1]/div[7]/div[1]/div[1]']))

'Verify Seventh Text Dropdown is Present'
WebUI.verifyElementPresent(findTestObject('lbl_Content', [('text') : 'DP untuk berbagai Type Motor bervariasi sesuai dengan Type motor yang dipilih oleh konsumen. Dp dimulai dari 10% dari harga OTR ( On the Road ).']), 
    10)

'Hide Seventh Dropdown'
WebUI.click(findTestObject('var_Content', [('xpath') : '//body[1]/div[1]/main[1]/main[1]/div[2]/div[1]/div[1]/div[2]/div[1]/div[1]/div[2]/div[1]/div[1]/div[7]/div[1]/div[1]/div[7]/div[1]/div[1]']))

'Scroll to Eighth Dropdown'
WebUI.scrollToElement(findTestObject('var_Content', [('xpath') : '//body[1]/div[1]/main[1]/main[1]/div[2]/div[1]/div[1]/div[2]/div[1]/div[1]/div[2]/div[1]/div[1]/div[7]/div[1]/div[1]/div[6]']), 
    10)

'Show Eighth Dropdown'
WebUI.click(findTestObject('var_Content', [('xpath') : '//body[1]/div[1]/main[1]/main[1]/div[2]/div[1]/div[1]/div[2]/div[1]/div[1]/div[2]/div[1]/div[1]/div[7]/div[1]/div[1]/div[8]/div[1]/div[1]']))

'Verify Eighth Text Dropdown is Present'
WebUI.verifyElementPresent(findTestObject('var_Content', [('xpath') : '//body[1]/div[1]/main[1]/main[1]/div[2]/div[1]/div[1]/div[2]/div[1]/div[1]/div[2]/div[1]/div[1]/div[7]/div[1]/div[1]/div[8]/div[2]/div[1]']), 
    10)

'Hide Eighth Dropdown'
WebUI.click(findTestObject('var_Content', [('xpath') : '//body[1]/div[1]/main[1]/main[1]/div[2]/div[1]/div[1]/div[2]/div[1]/div[1]/div[2]/div[1]/div[1]/div[7]/div[1]/div[1]/div[8]/div[1]/div[1]']))

