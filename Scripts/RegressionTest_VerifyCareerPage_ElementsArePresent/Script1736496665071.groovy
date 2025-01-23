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

'Click Menu "Carrer"'
WebUI.click(findTestObject('link_Content', [('href') : '/career', ('text') : 'Career']))

'Verify Text "GAPAILAH MIMPIMU" is Present'
WebUI.verifyElementPresent(findTestObject('lbl_Content', [('text') : 'GAPAILAH MIMPIMU']), 10)

'Verify Text "Bersama BAF" is Present'
WebUI.verifyElementPresent(findTestObject('lbl_Content', [('text') : 'Bersama BAF']), 10)

'Scroll to "Kata #BAFers" Text'
WebUI.scrollToElement(findTestObject('var_Content', [('xpath') : '//body[1]/div[1]/main[1]/main[1]/section[2]/div[1]/p[1]']), 
    10)

'Verify Text "Kata #BAFers" is Present'
WebUI.verifyElementPresent(findTestObject('lbl_Content', [('text') : 'Kata #BAFers']), 10)

'Verify Card "Rajiv Permadi" is Present'
WebUI.verifyElementPresent(findTestObject('var_Content', [('xpath') : '//body[1]/div[1]/main[1]/main[1]/section[2]/div[2]/ul[1]/li[1]']), 
    10)

'Verify Card "Calvin Jefen" is Present'
WebUI.verifyElementPresent(findTestObject('var_Content', [('xpath') : '//body[1]/div[1]/main[1]/main[1]/section[2]/div[2]/ul[1]/li[2]']), 
    10)

'Verify Card "Meiske Erdinarini" is Present'
WebUI.verifyElementPresent(findTestObject('var_Content', [('xpath') : '//body[1]/div[1]/main[1]/main[1]/section[2]/div[2]/ul[1]/li[3]']), 
    10)

'Scroll to "Keseharian dan Keseruan #BAFers" Text'
WebUI.scrollToElement(findTestObject('var_Content', [('xpath') : '//body[1]/div[1]/main[1]/main[1]/section[3]/div[1]/div[1]']), 
    10)

'Verify Banner "Hari Kartini di BAF" is Present'
WebUI.verifyElementPresent(findTestObject('var_Content', [('xpath') : '//body[1]/div[1]/main[1]/main[1]/section[3]/div[1]/div[2]/div[1]/div[1]/ul[1]/li[3]/div[1]/div[1]/img[1]']), 
    10)

'Verify Text "Hari Kartini di BAF" is Present'
WebUI.verifyElementPresent(findTestObject('lbl_Content', [('text') : 'Hari Kartini di BAF']), 10)

'Click Button Next Banner'
WebUI.click(findTestObject('var_Content', [('xpath') : '//body[1]/div[1]/main[1]/main[1]/section[3]/div[1]/div[2]/div[1]/div[1]/div[1]/button[2]']))

'Verify Banner "Ruang kerja berkonsep terbuka meningkatkan kolaborasi dan interaksi" is Present'
WebUI.verifyElementPresent(findTestObject('var_Content', [('xpath') : '//body[1]/div[1]/main[1]/main[1]/section[3]/div[1]/div[2]/div[1]/div[1]/ul[1]/li[4]/div[1]/div[1]/img[1]']), 
    10)

'Verify Text "Ruang kerja berkonsep terbuka meningkatkan kolaborasi dan interaksi" is Present'
WebUI.verifyElementPresent(findTestObject('lbl_Content', [('text') : 'Ruang kerja berkonsep terbuka meningkatkan kolaborasi dan interaksi']), 
    10)

'Click Button Next Banner'
WebUI.click(findTestObject('var_Content', [('xpath') : '//body[1]/div[1]/main[1]/main[1]/section[3]/div[1]/div[2]/div[1]/div[1]/div[1]/button[2]']))

'Verify Banner "Kegiatan HUT BAF ke 25 Tahun" is Present'
WebUI.verifyElementPresent(findTestObject('var_Content', [('xpath') : '//body[1]/div[1]/main[1]/main[1]/section[3]/div[1]/div[2]/div[1]/div[1]/ul[1]/li[5]/div[1]/div[1]/img[1]']), 
    10)

'Verify Text "Kegiatan HUT BAF ke 25 Tahun" is Present'
WebUI.verifyElementPresent(findTestObject('lbl_Content', [('text') : 'Kegiatan HUT BAF ke 25 Tahun']), 10)

'Click Button Next Banner'
WebUI.click(findTestObject('var_Content', [('xpath') : '//body[1]/div[1]/main[1]/main[1]/section[3]/div[1]/div[2]/div[1]/div[1]/div[1]/button[2]']))

'Verify Banner "Kompetisi UMKM" is Present'
WebUI.verifyElementPresent(findTestObject('var_Content', [('xpath') : '//body[1]/div[1]/main[1]/main[1]/section[3]/div[1]/div[2]/div[1]/div[1]/ul[1]/li[6]/div[1]/div[1]/img[1]']), 
    10)

'Verify Text "Kompetisi UMKM" is Present'
WebUI.verifyElementPresent(findTestObject('lbl_Content', [('text') : 'Kompetisi UMKM']), 10)

'Click Button Next Banner'
WebUI.click(findTestObject('var_Content', [('xpath') : '//body[1]/div[1]/main[1]/main[1]/section[3]/div[1]/div[2]/div[1]/div[1]/div[1]/button[2]']))

'Verify Banner "Pojok Kayuh" is Present'
WebUI.verifyElementPresent(findTestObject('var_Content', [('xpath') : '//body[1]/div[1]/main[1]/main[1]/section[3]/div[1]/div[2]/div[1]/div[1]/ul[1]/li[7]/div[1]/div[1]/img[1]']), 
    10)

'Verify Text "Pojok Kayuh" is Present'
WebUI.verifyElementPresent(findTestObject('lbl_Content', [('text') : 'Pojok Kayuh']), 10)

'Click Button Next Banner'
WebUI.click(findTestObject('var_Content', [('xpath') : '//body[1]/div[1]/main[1]/main[1]/section[3]/div[1]/div[2]/div[1]/div[1]/div[1]/button[2]']))

'Verify Banner "Senam BAF agar BAFers selalu fit" is Present'
WebUI.verifyElementPresent(findTestObject('var_Content', [('xpath') : '//body[1]/div[1]/main[1]/main[1]/section[3]/div[1]/div[2]/div[1]/div[1]/ul[1]/li[8]/div[1]/div[1]/img[1]']), 
    10)

'Verify Text "Senam BAF agar BAFers selalu fit" is Present'
WebUI.verifyElementPresent(findTestObject('lbl_Content', [('text') : 'Senam BAF agar BAFers selalu fit']), 10)

'Scroll to "Keseharian dan Keseruan #BAFers" Text'
WebUI.scrollToElement(findTestObject('var_Content', [('xpath') : '//body[1]/div[1]/main[1]/main[1]/section[4]/div[1]/div[1]']), 
    10)

'Verify Card "Kantor Jaringan Kami Menyebar ke Seluruh Indonesia" is Present'
WebUI.mouseOver(findTestObject('var_Content', [('xpath') : '//body[1]/div[1]/main[1]/main[1]/section[4]/div[1]/div[2]/div[1]']), 
    FailureHandling.STOP_ON_FAILURE)

'Verify Card "Pengembangan Diri" is Present'
WebUI.mouseOver(findTestObject('var_Content', [('xpath') : '//body[1]/div[1]/main[1]/main[1]/section[4]/div[1]/div[2]/div[2]']), 
    FailureHandling.STOP_ON_FAILURE)

'Verify Card "Kesempatan Jenjang Karir" is Present'
WebUI.mouseOver(findTestObject('var_Content', [('xpath') : '//body[1]/div[1]/main[1]/main[1]/section[4]/div[1]/div[2]/div[3]']), 
    FailureHandling.STOP_ON_FAILURE)

'Verify Card "Cuti Ulang Tahun" is Present'
WebUI.mouseOver(findTestObject('var_Content', [('xpath') : '//body[1]/div[1]/main[1]/main[1]/section[4]/div[1]/div[2]/div[4]']), 
    FailureHandling.STOP_ON_FAILURE)

'Scroll to "Jadilah Bagian dari #BAFers" Text'
WebUI.scrollToElement(findTestObject('var_Content', [('xpath') : '//body[1]/div[1]/main[1]/main[1]/section[5]/div[1]/div[1]']), 
    10)

'Verify Image "Development Program" is Present'
WebUI.verifyElementPresent(findTestObject('img_Content', [('src') : '/_next/image?url=%2Fstatic%2Fimages%2Fimage%2Fcareer%2Fdev-program-pict-new.webp&w=3840&q=75']), 
    10)

'Verify Image "Entry Level" is Present'
WebUI.verifyElementPresent(findTestObject('img_Content', [('src') : '/_next/image?url=%2Fstatic%2Fimages%2Fimage%2Fcareer%2Fentry-level-pict-new.webp&w=3840&q=75']), 
    10)

'Verify Image "Experienced" is Present'
WebUI.verifyElementPresent(findTestObject('img_Content', [('src') : '/_next/image?url=%2Fstatic%2Fimages%2Fimage%2Fcareer%2Fexperienced-pict-new.webp&w=3840&q=75']), 
    10)

'Click "Development Program" Button'
WebUI.click(findTestObject('var_Content', [('xpath') : '//body[1]/div[1]/main[1]/main[1]/section[5]/div[1]/div[2]/div[1]/div[1]/button[1]']))

'Click "Technology Associate Program" Button'
WebUI.click(findTestObject('var_Content', [('xpath') : '//body[1]/div[1]/main[1]/main[1]/div[1]/section[1]/div[1]/div[2]/div[1]/div[1]/div[1]/div[1]']))

'Verify Text "Technology Associate Program" is Present'
WebUI.verifyElementPresent(findTestObject('lbl_Content', [('text') : 'Technology Associate Program']), 10)

'Verify Description Text "Technology Associate Program" is Present'
WebUI.verifyElementPresent(findTestObject('lbl_Content', [('text') : 'Technology Associate Program (TAP) merupakan program pengembangan yang dilakukan untuk mempersiapkan para lulusan muda yang memiliki latar belakang IT dan Digital. Para peserta diberikan kesempatan untuk mempelajari hal baru dalam lingkup sektor pembiayaan. Melalui pelatihan intensif, On Job Training dan mentoring selama 12 bulan. Diharapkan dapat menghasilkan pemimpin muda yang berkualitas dan berkontribusi untuk memajukan perusahaan, khususnya dalam bidang IT dan Digital.']), 
    10)

'Verify Text "Periode : 12 Bulan" is Present'
WebUI.verifyElementPresent(findTestObject('lbl_Content', [('text') : 'Periode : 12 Bulan']), 10)

'Verify Text "Penempatan : Kantor Pusat" is Present'
WebUI.verifyElementPresent(findTestObject('lbl_Content', [('text') : 'Penempatan : Kantor Pusat']), 10)

'Click "Management Development Program" Button'
WebUI.click(findTestObject('var_Content', [('xpath') : '//body[1]/div[1]/main[1]/main[1]/div[1]/section[1]/div[1]/div[2]/div[1]/div[1]/div[1]/div[2]']))

'Verify Text "Management Development Program" is Present'
WebUI.verifyElementPresent(findTestObject('lbl_Content', [('text') : 'Management Development Program']), 10)

'Verify Description Text "Management Development Program" is Present'
WebUI.verifyElementPresent(findTestObject('lbl_Content', [('text') : 'Management Development Program (MDP) merupakan program pengembangan yang dilakukan untuk mempersiapkan para lulusan muda menjadi calon pemimpin di BAF. Program ini ditujukan untuk calon pemimpin di Kantor Jaringan. Para peserta diberikan kesempatan untuk mempelajari hal baru dalam lingkup sektor pembiayaan. Melalui pelatihan intensif, On Job Training dan mentoring selama 18 bulan. Diharapkan dapat menghasilkan pemimpin muda yang berkualitas dan berkontribusi untuk memajukan perusahaan.']), 
    10)

'Verify Text "Periode : 18 Bulan" is Present'
WebUI.verifyElementPresent(findTestObject('lbl_Content', [('text') : 'Periode : 18 Bulan']), 10)

'Verify Text "Penempatan : Kantor Pusat dan Kantor Jaringan" is Present'
WebUI.verifyElementPresent(findTestObject('lbl_Content', [('text') : 'Penempatan : Kantor Pusat dan Kantor Jaringan']), 
    10)

'Click "Corporate Development Program" Button'
WebUI.click(findTestObject('var_Content', [('xpath') : '//body[1]/div[1]/main[1]/main[1]/div[1]/section[1]/div[1]/div[2]/div[1]/div[1]/div[1]/div[3]']))

'Verify Text "Corporate Development Program" is Present'
WebUI.verifyElementPresent(findTestObject('lbl_Content', [('text') : 'Corporate Development Program']), 10)

'Verify Description Text "Corporate Development Program" is Present'
WebUI.verifyElementPresent(findTestObject('lbl_Content', [('text') : 'Corporate Development Program (CDP) merupakan program pengembangan yang dilakukan untuk mempersiapkan para lulusan muda menjadi calon pemimpin di BAF. Program ini ditujukan untuk calon pemimpin di Kantor Jaringan. Para peserta diberikan kesempatan untuk mempelajari hal baru dalam lingkup sektor pembiayaan. Melalui pelatihan intensif, On Job Training dan mentoring selama 18 bulan. Diharapkan dapat menghasilkan pemimpin muda yang berkualitas dan berkontribusi untuk memajukan perusahaan.']), 
    10)

'Verify Text "Periode : 18 Bulan" is Present'
WebUI.verifyElementPresent(findTestObject('lbl_Content', [('text') : 'Periode : 18 Bulan']), 10)

'Verify Text "Penempatan : Kantor Pusat" is Present'
WebUI.verifyElementPresent(findTestObject('lbl_Content', [('text') : 'Penempatan : Kantor Pusat']), 10)

'Click "Back" Button'
WebUI.click(findTestObject('var_Content', [('xpath') : '//body[1]/div[1]/main[1]/main[1]/div[1]/section[1]/div[1]/button[1]']))

'Click "Entry Level" Button'
WebUI.click(findTestObject('var_Content', [('xpath') : '//body[1]/div[1]/main[1]/main[1]/section[5]/div[1]/div[2]/div[2]/div[1]/button[1]']))

'Verify Text "Entry Level" is Present'
WebUI.verifyElementPresent(findTestObject('lbl_Content', [('text') : 'Entry Level']), 10)

'Verify Description Text "Entry Level" is Present'
WebUI.verifyElementPresent(findTestObject('lbl_Content', [('text') : 'BAF memberikan kesempatan untuk talenta muda dapat mengembangkan awal karier mereka melalui posisi staf dan magang. Pada posisi ini BAFers diberikan kesempatan untuk menambah pengalaman dalam dunia kerja, mengasah kemampuan sehingga menjadi pekerja yang berkompeten.']), 
    10)

'Click "Back" Button'
WebUI.click(findTestObject('var_Content', [('xpath') : '//body[1]/div[1]/main[1]/main[1]/div[1]/section[1]/div[1]/button[1]']))

'Click "Experienced" Button'
WebUI.click(findTestObject('var_Content', [('xpath') : '//body[1]/div[1]/main[1]/main[1]/section[5]/div[1]/div[2]/div[3]/div[1]/button[1]']))

'Verify Text "Experienced" is Present'
WebUI.verifyElementPresent(findTestObject('lbl_Content', [('text') : 'Experienced']), 10)

'Verify Description Text "Experienced" is Present'
WebUI.verifyElementPresent(findTestObject('lbl_Content', [('text') : 'BAF mengajak para profesional yang berbakat dan berpengalaman agar bergabung menjadi BAFers dalam berkarier dan berkontribusi melalui pengalaman serta skill yang dimiliki.']), 
    10)

'Click "Back" Button'
WebUI.click(findTestObject('var_Content', [('xpath') : '//body[1]/div[1]/main[1]/main[1]/div[1]/section[1]/div[1]/button[1]']))

'Click "Apply Now" Button'
WebUI.click(findTestObject('var_Content', [('xpath') : '//body[1]/div[1]/main[1]/main[1]/section[5]/div[1]/section[1]/button[1]']))

'Verify Link Accessibility'
WebUI.verifyLinksAccessible(['https://id.jobstreet.com/jobs?cid=company-profile&companyid=443452'])

