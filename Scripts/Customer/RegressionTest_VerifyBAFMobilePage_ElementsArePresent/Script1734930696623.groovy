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

'Click Menu "BAF Mobile"'
WebUI.click(findTestObject('link_Content', [('href') : '/baf-mobile', ('text') : 'BAF Mobile']))

'Verify Text "PROSES CEPAT ANGSURAN TEPAT" Present'
WebUI.verifyElementPresent(findTestObject('lbl_Content', [('text') : 'PROSES CEPAT ANGSURAN TEPAT']), 10)

'Focus on "KEUNGGULAN" Screen'
WebUI.focus(findTestObject('var_Content', [('xpath') : '//body[1]/div[1]/main[1]/main[1]/div[2]/div[1]/div[1]/h1[1]']))

'Verify Text "KEUNGGULAN" Present'
WebUI.verifyElementPresent(findTestObject('lbl_Content', [('text') : 'KEUNGGULAN']), 10)

'Verify Image "FITUR LENGKAP" Present'
WebUI.verifyElementPresent(findTestObject('img_Content', [('src') : '/_next/image?url=%2Fstatic%2Fimages%2Fimage%2Fbaf-mobile%2Fkeunggulan-1-fitur-lengkap.webp&w=3840&q=75']), 
    10)

'Verify Text "FITUR LENGKAP" Present'
WebUI.verifyElementPresent(findTestObject('lbl_Content', [('text') : 'FITUR LENGKAP']), 10)

'Verify Image "MUDAH" Present'
WebUI.verifyElementPresent(findTestObject('img_Content', [('src') : '/_next/image?url=%2Fstatic%2Fimages%2Fimage%2Fbaf-mobile%2Fkeunggulan-2-mudah.webp&w=3840&q=75']), 
    10)

'Verify Text "MUDAH" Present'
WebUI.verifyElementPresent(findTestObject('lbl_Content', [('text') : 'MUDAH']), 10)

'Verify Image "SISTEM AMAN" Present'
WebUI.verifyElementPresent(findTestObject('img_Content', [('src') : '/_next/image?url=%2Fstatic%2Fimages%2Fimage%2Fbaf-mobile%2Fkeunggulan-3-sistem-aman-fix.webp&w=3840&q=75']), 
    10)

'Verify Text "SISTEM AMAN" Present'
WebUI.verifyElementPresent(findTestObject('lbl_Content', [('text') : 'SISTEM AMAN']), 10)

'Focus on "SEMAKIN LENGKAP DENGAN BANYAK FITUR" Screen'
WebUI.focus(findTestObject('var_Content', [('xpath') : '//body[1]/div[1]/main[1]/main[1]/div[3]/div[1]/ul[1]/li[13]/div[1]/p[1]']))

'Verify Text "SEMAKIN LENGKAP DENGAN BANYAK FITUR" Present'
WebUI.verifyElementPresent(findTestObject('lbl_Content', [('text') : 'SEMAKIN LENGKAP DENGAN BANYAK FITUR']), 10)

'Verify Image "STATUS ORDER" Present'
WebUI.verifyElementPresent(findTestObject('img_Content', [('src') : '/_next/image?url=%2Fstatic%2Fimages%2Fimage%2Fbaf-mobile%2Ffitur-1-status-order.webp&w=256&q=75']), 
    10)

'Verify Text "STATUS ORDER" Present'
WebUI.verifyElementPresent(findTestObject('lbl_Content', [('text') : 'STATUS ORDER']), 10)

'Verify Text "Cek status pengajuan pembiayaan" Present'
WebUI.verifyElementPresent(findTestObject('lbl_Content', [('text') : 'Cek status pengajuan pembiayaan']), 10)

'Verify Image "PENGAMBILAN BPKB" Present'
WebUI.verifyElementPresent(findTestObject('img_Content', [('src') : '/_next/image?url=%2Fstatic%2Fimages%2Fimage%2Fbaf-mobile%2Ffitur-2-pengambilan-bpkb.webp&w=256&q=75']), 
    10)

'Verify Text "PENGAMBILAN BPKB" Present'
WebUI.verifyElementPresent(findTestObject('lbl_Content', [('text') : 'PENGAMBILAN BPKB']), 10)

'Verify Text "Pengambilan BPKB lebih mudah dengan fitur reservasi atau pengiriman di BAF Mobile" Present'
WebUI.verifyElementPresent(findTestObject('lbl_Content', [('text') : 'Pengambilan BPKB lebih mudah dengan fitur reservasi atau pengiriman di BAF Mobile']), 
    10)

'Verify Image "CEK CICILAN" Present'
WebUI.verifyElementPresent(findTestObject('img_Content', [('src') : '/_next/image?url=%2Fstatic%2Fimages%2Fimage%2Fbaf-mobile%2Ffitur-3-cek-cicilan.webp&w=256&q=75']), 
    10)

'Verify Text "CEK CICILAN" Present'
WebUI.verifyElementPresent(findTestObject('lbl_Content', [('text') : 'CEK CICILAN']), 10)

'Verify Text "Cek cicilan di mana dan kapan saja" Present'
WebUI.verifyElementPresent(findTestObject('lbl_Content', [('text') : 'Cek cicilan di mana dan kapan saja']), 10)

'Verify Image "TABUNGAN" Present'
WebUI.verifyElementPresent(findTestObject('img_Content', [('src') : '/_next/image?url=%2Fstatic%2Fimages%2Fimage%2Fbaf-mobile%2Ffitur-4-tabungan.webp&w=256&q=75']), 
    10)

'Verify Text "TABUNGAN" Present'
WebUI.verifyElementPresent(findTestObject('lbl_Content', [('text') : 'TABUNGAN']), 10)

'Verify Text "Makin mudah menabung di blu pakai BAF Mobile" Present'
WebUI.verifyElementPresent(findTestObject('lbl_Content', [('text') : 'Makin mudah menabung di blu pakai BAF Mobile']), 
    10)

'Verify Image "PEMBAYARAN CICILAN" Present'
WebUI.verifyElementPresent(findTestObject('img_Content', [('src') : '/_next/image?url=%2Fstatic%2Fimages%2Fimage%2Fbaf-mobile%2Ffitur-5-pembayaran-cicilan.webp&w=256&q=75']), 
    10)

'Verify Text "PEMBAYARAN CICILAN" Present'
WebUI.verifyElementPresent(findTestObject('lbl_Content', [('text') : 'PEMBAYARAN CICILAN']), 10)

'Verify Text "Bayar cicilan gak ribet di BAF Mobile aja" Present'
WebUI.verifyElementPresent(findTestObject('lbl_Content', [('text') : 'Bayar cicilan gak ribet di BAF Mobile aja']), 
    10)

'Verify Image "BAF POINT" Present'
WebUI.verifyElementPresent(findTestObject('img_Content', [('src') : '/_next/image?url=%2Fstatic%2Fimages%2Fimage%2Fbaf-mobile%2Ffitur-6-baf-point.webp&w=256&q=75']), 
    10)

'Verify Text "BAF POINT" Present'
WebUI.verifyElementPresent(findTestObject('lbl_Content', [('text') : 'BAF POINTS']), 10)

'Verify Text "Kumpulkan BAF Points nya dan tukarkan dalam bentuk potongan angsuran ataupun dengan beragam voucher" Present'
WebUI.verifyElementPresent(findTestObject('lbl_Content', [('text') : 'Kumpulkan BAF Points nya dan tukarkan dalam bentuk potongan angsuran ataupun dengan beragam voucher']), 
    10)

'Focus on "Unduh Aplikasi BAF Mobile" Screen'
WebUI.focus(findTestObject('var_Content', [('xpath') : '//body[1]/div[1]/main[1]/main[1]/div[4]/div[2]/div[1]/div[3]/a[1]/span[1]/img[1]']))

'Click "Download on the App Store" Button '
WebUI.click(findTestObject('img_Content', [('src') : '/_next/image?url=%2Fstatic%2Fimages%2Fimage%2Fbaf-mobile%2Fcta-appstore.webp&w=256&q=75']))

'Verify App Store Link Accessibility'
WebUI.verifyLinksAccessible(['https://apps.apple.com/id/app/baf-mobile/id1499452126'])

'Close Browser Windows'
WebUI.closeWindowIndex(1)

'Switch Browser Windows'
WebUI.switchToWindowIndex(0)

'Click "GET IT ON Google Play" Button '
WebUI.click(findTestObject('img_Content', [('src') : '/_next/image?url=%2Fstatic%2Fimages%2Fimage%2Fbaf-mobile%2Fcta-googleplay.webp&w=256&q=75']))

'Verify Play Store Link Accessibility'
WebUI.verifyLinksAccessible(['https://play.google.com/store/apps/details?id=com.id.bussanautofinance'])

'Close Browser Windows'
WebUI.closeWindowIndex(1)

'Switch Browser Windows'
WebUI.switchToWindowIndex(0)

