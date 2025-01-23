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

'Click Menu "BAF ADIDANA"'
WebUI.click(findTestObject('var_Content', [('xpath') : '//body[1]/div[1]/main[1]/main[1]/div[2]/div[1]/div[1]/div[2]/div[1]/div[1]/div[1]/div[1]/div[1]/div[8]/a[1]']))

'Show First Dropdown'
WebUI.click(findTestObject('var_Content', [('xpath') : '//body[1]/div[1]/main[1]/main[1]/div[2]/div[1]/div[1]/div[2]/div[1]/div[1]/div[2]/div[1]/div[1]/div[8]/div[1]/div[1]/div[1]/div[1]/div[1]']))

'Verify First Text Dropdown is Present'
WebUI.verifyElementPresent(findTestObject('lbl_Content', [('text') : 'Terkait proses lelang jaminan yang disita melalui KPKNL (Kantor Pelayanan Kekayaan Negara Lelang) jika nilai penjualan atas jaminan lebih besar dari total sisa kewajiban pembiayaan Debitur, maka debitur akan mendapatkan selisih dari harga jual tersebut.']), 
    10)

'Hide First Dropdown'
WebUI.click(findTestObject('var_Content', [('xpath') : '//body[1]/div[1]/main[1]/main[1]/div[2]/div[1]/div[1]/div[2]/div[1]/div[1]/div[2]/div[1]/div[1]/div[8]/div[1]/div[1]/div[1]/div[1]/div[1]']))

'Show Second Dropdown'
WebUI.click(findTestObject('var_Content', [('xpath') : '//body[1]/div[1]/main[1]/main[1]/div[2]/div[1]/div[1]/div[2]/div[1]/div[1]/div[2]/div[1]/div[1]/div[8]/div[1]/div[1]/div[2]/div[1]/div[1]']))

'Verify Second Text Dropdown is Present'
WebUI.verifyElementPresent(findTestObject('lbl_Content', [('text') : 'BAF AdiDana saat ini belum menyediakan proses balik nama sertifikat.']), 
    10)

'Hide Second Dropdown'
WebUI.click(findTestObject('var_Content', [('xpath') : '//body[1]/div[1]/main[1]/main[1]/div[2]/div[1]/div[1]/div[2]/div[1]/div[1]/div[2]/div[1]/div[1]/div[8]/div[1]/div[1]/div[2]/div[1]/div[1]']))

'Show Third Dropdown'
WebUI.click(findTestObject('var_Content', [('xpath') : '//body[1]/div[1]/main[1]/main[1]/div[2]/div[1]/div[1]/div[2]/div[1]/div[1]/div[2]/div[1]/div[1]/div[8]/div[1]/div[1]/div[3]/div[1]/div[1]']))

'Verify Third Text Dropdown is Present'
WebUI.verifyElementPresent(findTestObject('lbl_Content', [('text') : 'BAF AdiDana adalah Pembiayaan Modal kerja fasilitas modal usaha yang diperuntukkan untuk pelaku usaha mikro dan usaha kecil dengan menggunakan jaminan sertipikat rumah tinggal/ruko.']), 
    10)

'Hide Third Dropdown'
WebUI.click(findTestObject('var_Content', [('xpath') : '//body[1]/div[1]/main[1]/main[1]/div[2]/div[1]/div[1]/div[2]/div[1]/div[1]/div[2]/div[1]/div[1]/div[8]/div[1]/div[1]/div[3]/div[1]/div[1]']))

'Scroll to Fourth Dropdown'
WebUI.scrollToElement(findTestObject('var_Content', [('xpath') : '//body[1]/div[1]/main[1]/main[1]/div[2]/div[1]/div[1]/div[2]/div[1]/div[1]/div[2]/div[1]/div[1]/div[8]/div[1]/div[1]/div[3]']), 
    10)

'Show Fourth Dropdown'
WebUI.click(findTestObject('var_Content', [('xpath') : '//body[1]/div[1]/main[1]/main[1]/div[2]/div[1]/div[1]/div[2]/div[1]/div[1]/div[2]/div[1]/div[1]/div[8]/div[1]/div[1]/div[4]/div[1]/div[1]']))

'Verify Fourh Text Dropdown is Present'
WebUI.verifyElementPresent(findTestObject('lbl_Content', [('text') : 'Anda dapat menghubungi tim sales kami di kantor Jaringan BAF Jakarta, Bogor, Depok, Tangerang, Bekasi, termasuk Cilengsi dan Cikarang. atau nomor telfon BAF Care : 1500750']), 
    10)

'Hide Fourth Dropdown'
WebUI.click(findTestObject('var_Content', [('xpath') : '//body[1]/div[1]/main[1]/main[1]/div[2]/div[1]/div[1]/div[2]/div[1]/div[1]/div[2]/div[1]/div[1]/div[8]/div[1]/div[1]/div[4]/div[1]/div[1]']))

'Show Fifth Dropdown'
WebUI.click(findTestObject('var_Content', [('xpath') : '//body[1]/div[1]/main[1]/main[1]/div[2]/div[1]/div[1]/div[2]/div[1]/div[1]/div[2]/div[1]/div[1]/div[8]/div[1]/div[1]/div[5]/div[1]/div[1]']))

'Verify Fifth Text Dropdown is Present'
WebUI.verifyElementPresent(findTestObject('lbl_Content', [('text') : 'Jumlah pembiayaan BAF AdiDana adalah minimal Rp100.000.000 dan Jumlah Maksimal di Rp.1.000.000.000.']), 
    10)

'Hide Fifth Dropdown'
WebUI.click(findTestObject('var_Content', [('xpath') : '//body[1]/div[1]/main[1]/main[1]/div[2]/div[1]/div[1]/div[2]/div[1]/div[1]/div[2]/div[1]/div[1]/div[8]/div[1]/div[1]/div[5]/div[1]/div[1]']))

'Show Sixth Dropdown'
WebUI.click(findTestObject('var_Content', [('xpath') : '//body[1]/div[1]/main[1]/main[1]/div[2]/div[1]/div[1]/div[2]/div[1]/div[1]/div[2]/div[1]/div[1]/div[8]/div[1]/div[1]/div[6]/div[1]/div[1]']))

'Verify Sixth Text Dropdown is Present'
WebUI.verifyElementPresent(findTestObject('lbl_Content', [('text') : '1-5 Tahun masa tenor yang diberikan']), 10)

'Hide Sixth Dropdown'
WebUI.click(findTestObject('var_Content', [('xpath') : '//body[1]/div[1]/main[1]/main[1]/div[2]/div[1]/div[1]/div[2]/div[1]/div[1]/div[2]/div[1]/div[1]/div[8]/div[1]/div[1]/div[6]/div[1]/div[1]']))

'Show Seventh Dropdown'
WebUI.click(findTestObject('var_Content', [('xpath') : '//body[1]/div[1]/main[1]/main[1]/div[2]/div[1]/div[1]/div[2]/div[1]/div[1]/div[2]/div[1]/div[1]/div[8]/div[1]/div[1]/div[7]/div[1]/div[1]']))

'Verify Seventh Text Dropdown is Present'
WebUI.verifyElementPresent(findTestObject('lbl_Content', [('text') : 'Mohon maaf saat ini Pembiayaan BAF AdiDana hanya untuk pengembangan modal usaha seperti pembelian barang usaha, renovasi tempat usaha dan kebutuhan usaha lainnya.']), 
    10)

'Hide Seventh Dropdown'
WebUI.click(findTestObject('var_Content', [('xpath') : '//body[1]/div[1]/main[1]/main[1]/div[2]/div[1]/div[1]/div[2]/div[1]/div[1]/div[2]/div[1]/div[1]/div[8]/div[1]/div[1]/div[7]/div[1]/div[1]']))

'Show Eighth Dropdown'
WebUI.click(findTestObject('var_Content', [('xpath') : '//body[1]/div[1]/main[1]/main[1]/div[2]/div[1]/div[1]/div[2]/div[1]/div[1]/div[2]/div[1]/div[1]/div[8]/div[1]/div[1]/div[8]/div[1]/div[1]']))

'Verify Eighth Text Dropdown is Present'
WebUI.verifyElementPresent(findTestObject('lbl_Content', [('text') : 'Proses pembiayaan BAF AdiDana 7 hari kerja sampai dengan persetujuan pembiayaan*']), 
    10)

'Hide Eighth Dropdown'
WebUI.click(findTestObject('var_Content', [('xpath') : '//body[1]/div[1]/main[1]/main[1]/div[2]/div[1]/div[1]/div[2]/div[1]/div[1]/div[2]/div[1]/div[1]/div[8]/div[1]/div[1]/div[8]/div[1]/div[1]']))

'Scroll to Ninth Dropdown'
WebUI.scrollToElement(findTestObject('var_Content', [('xpath') : '//body[1]/div[1]/main[1]/main[1]/div[2]/div[1]/div[1]/div[2]/div[1]/div[1]/div[2]/div[1]/div[1]/div[8]/div[1]/div[1]/div[8]']), 
    10)

'Show Ninth Dropdown'
WebUI.click(findTestObject('var_Content', [('xpath') : '//body[1]/div[1]/main[1]/main[1]/div[2]/div[1]/div[1]/div[2]/div[1]/div[1]/div[2]/div[1]/div[1]/div[8]/div[1]/div[1]/div[9]/div[1]/div[1]']))

'Verify Ninth Text Dropdown is Present'
WebUI.verifyElementPresent(findTestObject('var_Content', [('xpath') : '//body[1]/div[1]/main[1]/main[1]/div[2]/div[1]/div[1]/div[2]/div[1]/div[1]/div[2]/div[1]/div[1]/div[8]/div[1]/div[1]/div[9]/div[2]/div[1]']), 
    10)

'Hide Ninth Dropdown'
WebUI.click(findTestObject('var_Content', [('xpath') : '//body[1]/div[1]/main[1]/main[1]/div[2]/div[1]/div[1]/div[2]/div[1]/div[1]/div[2]/div[1]/div[1]/div[8]/div[1]/div[1]/div[9]/div[1]/div[1]']))

'Show TenthDropdown'
WebUI.click(findTestObject('var_Content', [('xpath') : '//body[1]/div[1]/main[1]/main[1]/div[2]/div[1]/div[1]/div[2]/div[1]/div[1]/div[2]/div[1]/div[1]/div[8]/div[1]/div[1]/div[10]/div[1]/div[1]']))

'Verify Tenth Text Dropdown is Present'
WebUI.verifyElementPresent(findTestObject('lbl_Content', [('text') : 'Seluruh biaya akan di potong langsung pada saat proses pencairan (Dipotong dari Plafon yang disetujui)']), 
    10)

'Hide Tenth Dropdown'
WebUI.click(findTestObject('var_Content', [('xpath') : '//body[1]/div[1]/main[1]/main[1]/div[2]/div[1]/div[1]/div[2]/div[1]/div[1]/div[2]/div[1]/div[1]/div[8]/div[1]/div[1]/div[10]/div[1]/div[1]']))

'Show Eleventh Dropdown'
WebUI.click(findTestObject('var_Content', [('xpath') : '//body[1]/div[1]/main[1]/main[1]/div[2]/div[1]/div[1]/div[2]/div[1]/div[1]/div[2]/div[1]/div[1]/div[8]/div[1]/div[1]/div[11]/div[1]/div[1]']))

'Verify Eleventh Text Dropdown is Present'
WebUI.verifyElementPresent(findTestObject('lbl_Content', [('text') : 'Proses pencairan modal usaha dilakukan melalui transfer ke rekening atas nama debitur.']), 
    10)

'Hide Eleventh Dropdown'
WebUI.click(findTestObject('var_Content', [('xpath') : '//body[1]/div[1]/main[1]/main[1]/div[2]/div[1]/div[1]/div[2]/div[1]/div[1]/div[2]/div[1]/div[1]/div[8]/div[1]/div[1]/div[11]/div[1]/div[1]']))

'Show Twelfth Dropdown'
WebUI.click(findTestObject('var_Content', [('xpath') : '//body[1]/div[1]/main[1]/main[1]/div[2]/div[1]/div[1]/div[2]/div[1]/div[1]/div[2]/div[1]/div[1]/div[8]/div[1]/div[1]/div[12]/div[1]/div[1]']))

'Verify Twelfth Text Dropdown is Present'
WebUI.verifyElementPresent(findTestObject('var_Content', [('xpath') : '//body[1]/div[1]/main[1]/main[1]/div[2]/div[1]/div[1]/div[2]/div[1]/div[1]/div[2]/div[1]/div[1]/div[8]/div[1]/div[1]/div[12]/div[2]/div[1]']), 
    10)

'Hide Twelfth Dropdown'
WebUI.click(findTestObject('var_Content', [('xpath') : '//body[1]/div[1]/main[1]/main[1]/div[2]/div[1]/div[1]/div[2]/div[1]/div[1]/div[2]/div[1]/div[1]/div[8]/div[1]/div[1]/div[12]/div[1]/div[1]']))

'Show Thirteenth Dropdown'
WebUI.click(findTestObject('var_Content', [('xpath') : '//body[1]/div[1]/main[1]/main[1]/div[2]/div[1]/div[1]/div[2]/div[1]/div[1]/div[2]/div[1]/div[1]/div[8]/div[1]/div[1]/div[13]/div[1]/div[1]']))

'Verify Thirteenth Text Dropdown is Present'
WebUI.verifyElementPresent(findTestObject('lbl_Content', [('text') : 'Akan terdapat denda yang diberikan kepada Debitur']), 
    10)

'Hide Thirteenth Dropdown'
WebUI.click(findTestObject('var_Content', [('xpath') : '//body[1]/div[1]/main[1]/main[1]/div[2]/div[1]/div[1]/div[2]/div[1]/div[1]/div[2]/div[1]/div[1]/div[8]/div[1]/div[1]/div[13]/div[1]/div[1]']))

'Scroll to Fourteenth Dropdown'
WebUI.scrollToElement(findTestObject('var_Content', [('xpath') : '//body[1]/div[1]/main[1]/main[1]/div[2]/div[1]/div[1]/div[2]/div[1]/div[1]/div[2]/div[1]/div[1]/div[8]/div[1]/div[1]/div[13]']), 
    10)

'Show Fourteenth Dropdown'
WebUI.click(findTestObject('var_Content', [('xpath') : '//body[1]/div[1]/main[1]/main[1]/div[2]/div[1]/div[1]/div[2]/div[1]/div[1]/div[2]/div[1]/div[1]/div[8]/div[1]/div[1]/div[14]/div[1]/div[1]']))

'Verify Fourteenth Text Dropdown is Present'
WebUI.verifyElementPresent(findTestObject('lbl_Content', [('text') : 'Biaya denda keterlambatan sebesar 0,5% setiap hari keterlambatan dihitung dari jumlah kewajiban tertunggak.']), 
    10)

'Hide Fourteenth Dropdown'
WebUI.click(findTestObject('var_Content', [('xpath') : '//body[1]/div[1]/main[1]/main[1]/div[2]/div[1]/div[1]/div[2]/div[1]/div[1]/div[2]/div[1]/div[1]/div[8]/div[1]/div[1]/div[14]/div[1]/div[1]']))

'Show Fifteenth Dropdown'
WebUI.click(findTestObject('var_Content', [('xpath') : '//body[1]/div[1]/main[1]/main[1]/div[2]/div[1]/div[1]/div[2]/div[1]/div[1]/div[2]/div[1]/div[1]/div[8]/div[1]/div[1]/div[15]/div[1]/div[1]']))

'Verify Fifteenth Text Dropdown is Present'
WebUI.verifyElementPresent(findTestObject('lbl_Content', [('text') : 'Untuk saat ini yang bisa mengajukan pembiayaan BAF AdiDana di Jabodetabek termasuk juga cilengsi parung dan cikarang, Domisili dan lokasi Jaminan asset berada di Daerah tersebut.']), 
    10)

'Hide Fifteenth Dropdown'
WebUI.click(findTestObject('var_Content', [('xpath') : '//body[1]/div[1]/main[1]/main[1]/div[2]/div[1]/div[1]/div[2]/div[1]/div[1]/div[2]/div[1]/div[1]/div[8]/div[1]/div[1]/div[15]/div[1]/div[1]']))

'Show Sixteenth Dropdown'
WebUI.click(findTestObject('var_Content', [('xpath') : '//body[1]/div[1]/main[1]/main[1]/div[2]/div[1]/div[1]/div[2]/div[1]/div[1]/div[2]/div[1]/div[1]/div[8]/div[1]/div[1]/div[16]/div[1]/div[1]']))

'Verify Sixteenth Text Dropdown is Present'
WebUI.verifyElementPresent(findTestObject('lbl_Content', [('text') : 'Penalty 8% dari hutang pokok + Denda yang harus dibayarkan (bila ada) Sehingga tidak ada potongan, dan untuk informasi lebih lanjut Anda dapat menghubungi jaringan BAF tempat Anda terdaftar sebagai debitur kami.']), 
    10)

'Hide Sixteenth Dropdown'
WebUI.click(findTestObject('var_Content', [('xpath') : '//body[1]/div[1]/main[1]/main[1]/div[2]/div[1]/div[1]/div[2]/div[1]/div[1]/div[2]/div[1]/div[1]/div[8]/div[1]/div[1]/div[16]/div[1]/div[1]']))

'Show Seventeenth Dropdown'
WebUI.click(findTestObject('var_Content', [('xpath') : '//body[1]/div[1]/main[1]/main[1]/div[2]/div[1]/div[1]/div[2]/div[1]/div[1]/div[2]/div[1]/div[1]/div[8]/div[1]/div[1]/div[17]/div[1]/div[1]']))

'Verify Seventeenth Text Dropdown is Present'
WebUI.verifyElementPresent(findTestObject('lbl_Content', [('text') : 'Untuk dokumen yang dijaminkan akan kami simpan di satu tempat khusus yang tahan terhadap kerusakan fisik dan hanya dapat dibuka pada saat debitur telah selesai melakukan pelunasan.']), 
    10)

'Hide Seventeenth Dropdown'
WebUI.click(findTestObject('var_Content', [('xpath') : '//body[1]/div[1]/main[1]/main[1]/div[2]/div[1]/div[1]/div[2]/div[1]/div[1]/div[2]/div[1]/div[1]/div[8]/div[1]/div[1]/div[17]/div[1]/div[1]']))

'Show Eighteenth Dropdown'
WebUI.click(findTestObject('var_Content', [('xpath') : '//body[1]/div[1]/main[1]/main[1]/div[2]/div[1]/div[1]/div[2]/div[1]/div[1]/div[2]/div[1]/div[1]/div[8]/div[1]/div[1]/div[18]/div[1]/div[1]']))

'Verify Eighteenth Text Dropdown is Present'
WebUI.verifyElementPresent(findTestObject('lbl_Content', [('text') : 'Untuk saat ini calon debitur belum dapat melakukan proses pengajuan melaui BAF Mobile.']), 
    10)

'Hide Eighteenth Dropdown'
WebUI.click(findTestObject('var_Content', [('xpath') : '//body[1]/div[1]/main[1]/main[1]/div[2]/div[1]/div[1]/div[2]/div[1]/div[1]/div[2]/div[1]/div[1]/div[8]/div[1]/div[1]/div[18]/div[1]/div[1]']))

'Scroll to Nineteenth Dropdown'
WebUI.scrollToElement(findTestObject('var_Content', [('xpath') : '//body[1]/div[1]/main[1]/main[1]/div[2]/div[1]/div[1]/div[2]/div[1]/div[1]/div[2]/div[1]/div[1]/div[8]/div[1]/div[1]/div[18]']), 
    10)

'Show Nineteenth Dropdown'
WebUI.click(findTestObject('var_Content', [('xpath') : '//body[1]/div[1]/main[1]/main[1]/div[2]/div[1]/div[1]/div[2]/div[1]/div[1]/div[2]/div[1]/div[1]/div[8]/div[1]/div[1]/div[19]/div[1]/div[1]']))

'Verify Nineteenth Text Dropdown is Present'
WebUI.verifyElementPresent(findTestObject('lbl_Content', [('text') : 'Tidak, karena hanya diperlukan SHM atas nama calon debitur atau pasangan.']), 
    10)

'Hide Nineteenth Dropdown'
WebUI.click(findTestObject('var_Content', [('xpath') : '//body[1]/div[1]/main[1]/main[1]/div[2]/div[1]/div[1]/div[2]/div[1]/div[1]/div[2]/div[1]/div[1]/div[8]/div[1]/div[1]/div[19]/div[1]/div[1]']))

'Show Twentieth Dropdown'
WebUI.click(findTestObject('var_Content', [('xpath') : '//body[1]/div[1]/main[1]/main[1]/div[2]/div[1]/div[1]/div[2]/div[1]/div[1]/div[2]/div[1]/div[1]/div[8]/div[1]/div[1]/div[20]/div[1]/div[1]']))

'Verify Twentieth Text Dropdown is Present'
WebUI.verifyElementPresent(findTestObject('lbl_Content', [('text') : 'Tidak, Karena Calon debitur BAF AdiDana harus menjaminkan sertifikat atas nama calon Debitur atau pasangan, jadi untuk saat ini belum dapat mengajukan pinjaman Sertifikat atas nama orang lain dalam satu KK.']), 
    10)

'Hide Twentieth Dropdown'
WebUI.click(findTestObject('var_Content', [('xpath') : '//body[1]/div[1]/main[1]/main[1]/div[2]/div[1]/div[1]/div[2]/div[1]/div[1]/div[2]/div[1]/div[1]/div[8]/div[1]/div[1]/div[20]/div[1]/div[1]']))

'Show Twenty-First Dropdown'
WebUI.click(findTestObject('var_Content', [('xpath') : '//body[1]/div[1]/main[1]/main[1]/div[2]/div[1]/div[1]/div[2]/div[1]/div[1]/div[2]/div[1]/div[1]/div[8]/div[1]/div[1]/div[21]/div[1]/div[1]']))

'Verify Twenty-First Text Dropdown is Present'
WebUI.verifyElementPresent(findTestObject('lbl_Content', [('text') : 'Untuk saat ini program BAF AdiDana belum dapat menerima jaminan sertifikat pertanian dan tanah perkebunan, BAF AdiDana saat ini hanya menerima jaminan SHM rumah tinggal (Tanah dan Bangunan) Beserta Ruko.']), 
    10)

'Hide Twenty-First Dropdown'
WebUI.click(findTestObject('var_Content', [('xpath') : '//body[1]/div[1]/main[1]/main[1]/div[2]/div[1]/div[1]/div[2]/div[1]/div[1]/div[2]/div[1]/div[1]/div[8]/div[1]/div[1]/div[21]/div[1]/div[1]']))

'Show Twenty-Second Dropdown'
WebUI.click(findTestObject('var_Content', [('xpath') : '//body[1]/div[1]/main[1]/main[1]/div[2]/div[1]/div[1]/div[2]/div[1]/div[1]/div[2]/div[1]/div[1]/div[8]/div[1]/div[1]/div[22]/div[1]/div[1]']))

'Verify Twenty-Second Text Dropdown is Present'
WebUI.verifyElementPresent(findTestObject('lbl_Content', [('text') : 'Pada tahap awal screening calon debitur Silahkan ajukan untuk pembiayaan BAF AdiDana, karena kami akan melakukan proses verifikasi dan Analisa pembiayaan internal BAF, apakah calon Debitur layak atau tidak mendapatkan pembiayaan BAF AdiDana.']), 
    10)

'Hide Twenty-Second Dropdown'
WebUI.click(findTestObject('var_Content', [('xpath') : '//body[1]/div[1]/main[1]/main[1]/div[2]/div[1]/div[1]/div[2]/div[1]/div[1]/div[2]/div[1]/div[1]/div[8]/div[1]/div[1]/div[22]/div[1]/div[1]']))

'Scroll to Twenty-Third Dropdown'
WebUI.scrollToElement(findTestObject('var_Content', [('xpath') : '//body[1]/div[1]/main[1]/main[1]/div[2]/div[1]/div[1]/div[2]/div[1]/div[1]/div[2]/div[1]/div[1]/div[8]/div[1]/div[1]/div[22]']), 
    10)

'Show Twenty-Third Dropdown'
WebUI.click(findTestObject('var_Content', [('xpath') : '//body[1]/div[1]/main[1]/main[1]/div[2]/div[1]/div[1]/div[2]/div[1]/div[1]/div[2]/div[1]/div[1]/div[8]/div[1]/div[1]/div[23]/div[1]/div[1]']))

'Verify Twenty-Third Text Dropdown is Present'
WebUI.verifyElementPresent(findTestObject('lbl_Content', [('text') : 'Untuk saat ini terkait asuransi jiwa belum tercover dalam pembiayaan BAF AdiDana, hanya mengcover property yang dijaminkan, untuk kelanjutan kewajiban debitur diteruskan ke pihak ahli waris.']), 
    10)

'Hide Twenty-Third Dropdown'
WebUI.click(findTestObject('var_Content', [('xpath') : '//body[1]/div[1]/main[1]/main[1]/div[2]/div[1]/div[1]/div[2]/div[1]/div[1]/div[2]/div[1]/div[1]/div[8]/div[1]/div[1]/div[23]/div[1]/div[1]']))

'Show Twenty-Fourth Dropdown'
WebUI.click(findTestObject('var_Content', [('xpath') : '//body[1]/div[1]/main[1]/main[1]/div[2]/div[1]/div[1]/div[2]/div[1]/div[1]/div[2]/div[1]/div[1]/div[8]/div[1]/div[1]/div[24]/div[1]/div[1]']))

'Verify Twenty-Fourth Text Dropdown is Present'
WebUI.verifyElementPresent(findTestObject('lbl_Content', [('text') : 'Dalam proses collection mengacu pada kebijakan internal collection BAF yang dimana ada beberapa tahapan yaitu memberikan surat peringatan 1 sampai dengan 3 kepada debitur yang mengalami keterlambatan, sebelum tahapan proses penyitaan jaminan.']), 
    10)

'Hide Twenty-Fourth Dropdown'
WebUI.click(findTestObject('var_Content', [('xpath') : '//body[1]/div[1]/main[1]/main[1]/div[2]/div[1]/div[1]/div[2]/div[1]/div[1]/div[2]/div[1]/div[1]/div[8]/div[1]/div[1]/div[24]/div[1]/div[1]']))

'Show Twenty-Fifth Dropdown'
WebUI.click(findTestObject('var_Content', [('xpath') : '//body[1]/div[1]/main[1]/main[1]/div[2]/div[1]/div[1]/div[2]/div[1]/div[1]/div[2]/div[1]/div[1]/div[8]/div[1]/div[1]/div[25]/div[1]/div[1]']))

'Verify Twenty-Fifth Text Dropdown is Present'
WebUI.verifyElementPresent(findTestObject('lbl_Content', [('text') : 'Akan dikenakan biaya administrasi sesuai kebijakan internal yang dimana jumlah biaya akan diketahui setelah debitur melakukan konfirmasi minimal 3 hari sebelum proses permintaan copy sertifikat.']), 
    10)

'Hide Twenty-Fifth Dropdown'
WebUI.click(findTestObject('var_Content', [('xpath') : '//body[1]/div[1]/main[1]/main[1]/div[2]/div[1]/div[1]/div[2]/div[1]/div[1]/div[2]/div[1]/div[1]/div[8]/div[1]/div[1]/div[25]/div[1]/div[1]']))

'Show Twenty-Sixth Dropdown'
WebUI.click(findTestObject('var_Content', [('xpath') : '//body[1]/div[1]/main[1]/main[1]/div[2]/div[1]/div[1]/div[2]/div[1]/div[1]/div[2]/div[1]/div[1]/div[8]/div[1]/div[1]/div[26]/div[1]/div[1]']))

'Verify Twenty-Sixth Text Dropdown is Present'
WebUI.verifyElementPresent(findTestObject('lbl_Content', [('text') : 'Saat ini belum bisa diajukan proses pembiyaan BAF AdiDana sebelum SHM atas nama selain calon debitur atau pasangan.']), 
    10)

'Hide Twenty-Sixth Dropdown'
WebUI.click(findTestObject('var_Content', [('xpath') : '//body[1]/div[1]/main[1]/main[1]/div[2]/div[1]/div[1]/div[2]/div[1]/div[1]/div[2]/div[1]/div[1]/div[8]/div[1]/div[1]/div[26]/div[1]/div[1]']))

'Show Twenty-Seventh Dropdown'
WebUI.click(findTestObject('var_Content', [('xpath') : '//body[1]/div[1]/main[1]/main[1]/div[2]/div[1]/div[1]/div[2]/div[1]/div[1]/div[2]/div[1]/div[1]/div[8]/div[1]/div[1]/div[27]/div[1]/div[1]']))

'Verify Twenty-Seventh Text Dropdown is Present'
WebUI.verifyElementPresent(findTestObject('lbl_Content', [('text') : 'Untuk saat ini semua bank dapat menerima pencairan BAF AdiDana.']), 
    10)

'Hide Twenty-Seventh Dropdown'
WebUI.click(findTestObject('var_Content', [('xpath') : '//body[1]/div[1]/main[1]/main[1]/div[2]/div[1]/div[1]/div[2]/div[1]/div[1]/div[2]/div[1]/div[1]/div[8]/div[1]/div[1]/div[27]/div[1]/div[1]']))

'Scroll to Twenty-Eighth Dropdown'
WebUI.scrollToElement(findTestObject('var_Content', [('xpath') : '//body[1]/div[1]/main[1]/main[1]/div[2]/div[1]/div[1]/div[2]/div[1]/div[1]/div[2]/div[1]/div[1]/div[8]/div[1]/div[1]/div[27]']), 
    10)

'Show Twenty-Eighth Dropdown'
WebUI.click(findTestObject('var_Content', [('xpath') : '//body[1]/div[1]/main[1]/main[1]/div[2]/div[1]/div[1]/div[2]/div[1]/div[1]/div[2]/div[1]/div[1]/div[8]/div[1]/div[1]/div[28]/div[1]/div[1]']))

'Verify Twenty-Eighth Text Dropdown is Present'
WebUI.verifyElementPresent(findTestObject('lbl_Content', [('text') : 'Bisa diajukan dengan catatan melampirkan dokumen subsitiusi seperti bukti kwitansi pembelian dan nota hasil penjualan Calon debitur.']), 
    10)

'Hide Twenty-Eighth Dropdown'
WebUI.click(findTestObject('var_Content', [('xpath') : '//body[1]/div[1]/main[1]/main[1]/div[2]/div[1]/div[1]/div[2]/div[1]/div[1]/div[2]/div[1]/div[1]/div[8]/div[1]/div[1]/div[28]/div[1]/div[1]']))

'Show Twenty-Ninth Dropdown'
WebUI.click(findTestObject('var_Content', [('xpath') : '//body[1]/div[1]/main[1]/main[1]/div[2]/div[1]/div[1]/div[2]/div[1]/div[1]/div[2]/div[1]/div[1]/div[8]/div[1]/div[1]/div[29]/div[1]/div[1]']))

'Verify Twenty-Ninth Text Dropdown is Present'
WebUI.verifyElementPresent(findTestObject('lbl_Content', [('text') : 'Dapat dilakukan. Debitur harus melakukan konfirmasi kepada pihak BAF terlebih dahulu. Dengan catatan debitur harus memberitahukan 1 bulan sebelum jatuh tempo kewajiban pembayaran.']), 
    10)

'Hide Twenty-Ninth Dropdown'
WebUI.click(findTestObject('var_Content', [('xpath') : '//body[1]/div[1]/main[1]/main[1]/div[2]/div[1]/div[1]/div[2]/div[1]/div[1]/div[2]/div[1]/div[1]/div[8]/div[1]/div[1]/div[29]/div[1]/div[1]']))

'Show Thirtieth Dropdown'
WebUI.click(findTestObject('var_Content', [('xpath') : '//body[1]/div[1]/main[1]/main[1]/div[2]/div[1]/div[1]/div[2]/div[1]/div[1]/div[2]/div[1]/div[1]/div[8]/div[1]/div[1]/div[30]/div[1]/div[1]']))

'Verify Thirtieth Text Dropdown is Present'
WebUI.verifyElementPresent(findTestObject('lbl_Content', [('text') : 'Anda dapat menghubungi tim sales kami di kantor Jaringan BAF Jakarta, Bogor, Depok, Tangerang , Bekasi, termasuk Cilengsi dan cikarang.']), 
    10)

'Hide Thirtieth Dropdown'
WebUI.click(findTestObject('var_Content', [('xpath') : '//body[1]/div[1]/main[1]/main[1]/div[2]/div[1]/div[1]/div[2]/div[1]/div[1]/div[2]/div[1]/div[1]/div[8]/div[1]/div[1]/div[30]/div[1]/div[1]']))

'Show Thirty-First Dropdown'
WebUI.click(findTestObject('var_Content', [('xpath') : '//body[1]/div[1]/main[1]/main[1]/div[2]/div[1]/div[1]/div[2]/div[1]/div[1]/div[2]/div[1]/div[1]/div[8]/div[1]/div[1]/div[31]/div[1]/div[1]']))

'Verify Thirty-First Text Dropdown is Present'
WebUI.verifyElementPresent(findTestObject('lbl_Content', [('text') : 'Proses Klaim asuransi wajib dilaporkan ke jaringan BAF di Jakarta, Bogor, Depok, Tangerang, Bekasi termasuk CIlengsi dan cikarang selambat lambatnya 14 hari kerja setelah terjadinya klaim. kemudian proses klaim akan dilanjutkan di bagian insurance di kantor pusat. Untuk proses sampai dengan selesai klaim asuransi estimasi 30 hari kerja (tergantung dari jenis kerusakan).']), 
    10)

'Hide Thirty-First Dropdown'
WebUI.click(findTestObject('var_Content', [('xpath') : '//body[1]/div[1]/main[1]/main[1]/div[2]/div[1]/div[1]/div[2]/div[1]/div[1]/div[2]/div[1]/div[1]/div[8]/div[1]/div[1]/div[31]/div[1]/div[1]']))

'Show Thirty-Second Dropdown'
WebUI.click(findTestObject('var_Content', [('xpath') : '//body[1]/div[1]/main[1]/main[1]/div[2]/div[1]/div[1]/div[2]/div[1]/div[1]/div[2]/div[1]/div[1]/div[8]/div[1]/div[1]/div[32]/div[1]/div[1]']))

'Verify Thirty-Second Text Dropdown is Present'
WebUI.verifyElementPresent(findTestObject('var_Content', [('xpath') : '//body[1]/div[1]/main[1]/main[1]/div[2]/div[1]/div[1]/div[2]/div[1]/div[1]/div[2]/div[1]/div[1]/div[8]/div[1]/div[1]/div[32]/div[2]']), 
    10)

'Hide Thirty-Second Dropdown'
WebUI.click(findTestObject('var_Content', [('xpath') : '//body[1]/div[1]/main[1]/main[1]/div[2]/div[1]/div[1]/div[2]/div[1]/div[1]/div[2]/div[1]/div[1]/div[8]/div[1]/div[1]/div[32]/div[1]/div[1]']))

