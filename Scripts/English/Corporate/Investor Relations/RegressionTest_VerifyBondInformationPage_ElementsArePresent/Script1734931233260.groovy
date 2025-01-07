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

WebUI.click(findTestObject('Header/link_Investor Relations'))

WebUI.click(findTestObject('Header/link_Bond Information'))

WebUI.focus(findTestObject('Investor Relation/Financial Statments/nav_Mid'))

WebUI.verifyTextPresent('BOND INFORMATION', true)

WebUI.verifyTextPresent('Kami telah menerbitkan surat utang sejak tahun 2017 hingga saat ini sebagai bentuk strategi diversifikasi pendanaan dalam menunjang kegiatan usaha.', 
    true)

WebUI.verifyTextPresent('Since 2017 to present, we have issued debt instruments as one of of funding diversification strategy to support our company operations.', 
    true)

WebUI.focus(findTestObject('Investor Relation/Bond Information/nav_Tahun'))

WebUI.click(findTestObject('General/tab_Tahun', [('tahun_id') : 2017]))

WebUI.click(findTestObject('Investor Relation/Bond Information/button_Download', [('tahun_id') : 2017, ('content_id') : 'PROSPEKTUS OBLIGASI I 2017 / PROSPECTUS BOND I 2017']))

WebUI.verifyLinksAccessible(['https://baf-mobile-prod.oss-ap-southeast-5.aliyuncs.com/investor-relation-file/1718680843621.pdf'])

WebUI.closeWindowIndex(1)

WebUI.switchToWindowIndex(0)

WebUI.click(findTestObject('General/tab_Tahun', [('tahun_id') : 2018]))

WebUI.click(findTestObject('Investor Relation/Bond Information/button_Download', [('tahun_id') : 2018, ('content_id') : 'PROSPEKTUS OBLIGASI II 2018 / PROSPECTUS BOND II 2018']))

WebUI.verifyLinksAccessible(['https://baf-mobile-prod.oss-ap-southeast-5.aliyuncs.com/investor-relation-file/1718680894239.pdf'])

WebUI.closeWindowIndex(1)

WebUI.switchToWindowIndex(0)

WebUI.click(findTestObject('General/tab_Tahun', [('tahun_id') : 2019]))

WebUI.click(findTestObject('Investor Relation/Bond Information/button_Download', [('tahun_id') : 2019, ('content_id') : 'PROSPEKTUS OBLIGASI III 2019 / PROSPECTUS BOND III 2019']))

WebUI.verifyLinksAccessible(['https://baf-mobile-prod.oss-ap-southeast-5.aliyuncs.com/investor-relation-file/1718680936762.pdf'])

WebUI.closeWindowIndex(1)

WebUI.switchToWindowIndex(0)

WebUI.click(findTestObject('General/tab_Tahun', [('tahun_id') : 2020]))

WebUI.click(findTestObject('Investor Relation/Bond Information/button_Download', [('tahun_id') : 2020, ('content_id') : 'PROSPEKTUS / PROSPECTUS - PUB I-I 2020']))

WebUI.verifyLinksAccessible(['https://baf-mobile-prod.oss-ap-southeast-5.aliyuncs.com/investor-relation-file/1718681216678.pdf'])

WebUI.closeWindowIndex(1)

WebUI.switchToWindowIndex(0)

WebUI.click(findTestObject('Investor Relation/Bond Information/button_Download', [('tahun_id') : 2020, ('content_id') : 'PROSPEKTUS / PROSPECTUS - SUKUK MUDHARABAH I-I 2020']))

WebUI.verifyLinksAccessible(['https://baf-mobile-prod.oss-ap-southeast-5.aliyuncs.com/investor-relation-file/1718681246254.pdf'])

WebUI.closeWindowIndex(1)

WebUI.switchToWindowIndex(0)

WebUI.click(findTestObject('Investor Relation/Bond Information/button_Download', [('tahun_id') : 2020, ('content_id') : 'INFORMASI TAMBAHAN / ADDITIONAL INFORMATION - SUKUK MUDHARABAH I-I 2020']))

WebUI.verifyLinksAccessible(['https://baf-mobile-prod.oss-ap-southeast-5.aliyuncs.com/investor-relation-file/1718681740240.pdf'])

WebUI.closeWindowIndex(1)

WebUI.switchToWindowIndex(0)

WebUI.click(findTestObject('Investor Relation/Bond Information/button_Download', [('tahun_id') : 2020, ('content_id') : 'INFORMASI TAMBAHAN RINGKAS / SUMMARY OF ADDITIONAL INFORMATION - SUKUK MUDHARABAH I-II 2020']))

WebUI.verifyLinksAccessible(['about:blank'], FailureHandling.OPTIONAL)

WebUI.closeWindowIndex(1)

WebUI.switchToWindowIndex(0)

WebUI.click(findTestObject('General/tab_Tahun', [('tahun_id') : 2021]))

WebUI.click(findTestObject('Investor Relation/Bond Information/button_Download', [('tahun_id') : 2021, ('content_id') : 'INFORMASI TAMBAHAN RINGKAS / SUMMARY OF ADDITIONAL INFORMATION - PUB I-IV 2021']))

WebUI.verifyLinksAccessible(['https://baf-mobile-prod.oss-ap-southeast-5.aliyuncs.com/investor-relation-file/1718685088460.pdf'])

WebUI.closeWindowIndex(1)

WebUI.switchToWindowIndex(0)

WebUI.click(findTestObject('Investor Relation/Bond Information/button_Download', [('tahun_id') : 2021, ('content_id') : 'INFORMASI TAMBAHAN RINGKAS / SUMMARY OF ADDITIONAL INFORMATION - PUB I-II 2021']))

WebUI.verifyLinksAccessible(['https://baf-mobile-prod.oss-ap-southeast-5.aliyuncs.com/investor-relation-file/1718681500532.pdf'])

WebUI.closeWindowIndex(1)

WebUI.switchToWindowIndex(0)

WebUI.click(findTestObject('Investor Relation/Bond Information/button_Download', [('tahun_id') : 2021, ('content_id') : 'INFORMASI TAMBAHAN / ADDITIONAL INFORMATION - PUB I-III 2021']))

WebUI.verifyLinksAccessible(['https://baf-mobile-prod.oss-ap-southeast-5.aliyuncs.com/investor-relation-file/1718685042086.pdf'])

WebUI.closeWindowIndex(1)

WebUI.switchToWindowIndex(0)

WebUI.click(findTestObject('Investor Relation/Bond Information/button_Download', [('tahun_id') : 2021, ('content_id') : 'INFORMASI TAMBAHAN RINGKAS / SUMMARY OF ADDITIONAL INFORMATION - PUB I-III 2021']))

WebUI.verifyLinksAccessible(['https://baf-mobile-prod.oss-ap-southeast-5.aliyuncs.com/investor-relation-file/1718685004757.pdf'])

WebUI.closeWindowIndex(1)

WebUI.switchToWindowIndex(0)

WebUI.click(findTestObject('General/tab_Tahun', [('tahun_id') : 2022]))

WebUI.click(findTestObject('Investor Relation/Bond Information/button_Download', [('tahun_id') : 2022, ('content_id') : 'TAMBAHAN INFORMASI RINGKAS / SUMMARY OF ADDITIONAL INFORMATION - PUB I-V 2022']))

WebUI.verifyLinksAccessible(['https://baf-mobile-prod.oss-ap-southeast-5.aliyuncs.com/investor-relation-file/1718685299125.pdf'])

WebUI.closeWindowIndex(1)

WebUI.switchToWindowIndex(0)

WebUI.click(findTestObject('Investor Relation/Bond Information/button_Download', [('tahun_id') : 2022, ('content_id') : 'INFORMASI TAMBAHAN RINGKAS / SUMMARY OF ADDITIONAL INFORMATION - PUB II-II 2022']))

WebUI.verifyLinksAccessible(['https://baf-mobile-prod.oss-ap-southeast-5.aliyuncs.com/investor-relation-file/1718685398625.pdf'])

WebUI.closeWindowIndex(1)

WebUI.switchToWindowIndex(0)

WebUI.click(findTestObject('Investor Relation/Bond Information/button_Download', [('tahun_id') : 2022, ('content_id') : 'PROSPEKTUS / PROSPECTUS - PUB II-I 2022']))

WebUI.verifyLinksAccessible(['https://baf-mobile-prod.oss-ap-southeast-5.aliyuncs.com/investor-relation-file/1718685345677.pdf'])

WebUI.closeWindowIndex(1)

WebUI.switchToWindowIndex(0)

WebUI.click(findTestObject('General/tab_Tahun', [('tahun_id') : 2023]))

WebUI.click(findTestObject('Investor Relation/Bond Information/button_Download', [('tahun_id') : 2023, ('content_id') : 'INFORMASI TAMBAHAN / ADDITIONAL INFORMATION - PUB II-IV 2023']))

WebUI.verifyLinksAccessible(['https://baf-mobile-prod.oss-ap-southeast-5.aliyuncs.com/investor-relation-file/1718685509590.pdf'])

WebUI.closeWindowIndex(1)

WebUI.switchToWindowIndex(0)

WebUI.click(findTestObject('Investor Relation/Bond Information/button_Download', [('tahun_id') : 2023, ('content_id') : 'INFORMASI TAMBAHAN RINGKAS / SUMMARY OF ADDITIONAL INFORMATION - PUB II-IV 2023']))

WebUI.verifyLinksAccessible(['https://baf-mobile-prod.oss-ap-southeast-5.aliyuncs.com/investor-relation-file/1718685555808.pdf'])

WebUI.closeWindowIndex(1)

WebUI.switchToWindowIndex(0)

WebUI.click(findTestObject('Investor Relation/Bond Information/button_Download', [('tahun_id') : 2023, ('content_id') : 'INFORMASI TAMBAHAN RINGKAS / SUMMARY OF ADDITIONAL INFORMATION - PUB II-III 2023']))

WebUI.verifyLinksAccessible(['https://baf-mobile-prod.oss-ap-southeast-5.aliyuncs.com/investor-relation-file/1718685452090.pdf'])

WebUI.closeWindowIndex(1)

WebUI.switchToWindowIndex(0)

WebUI.click(findTestObject('General/tab_Tahun', [('tahun_id') : 2024]))

WebUI.click(findTestObject('Investor Relation/Bond Information/button_Download', [('tahun_id') : 2024, ('content_id') : 'INFORMASI TAMBAHAN RINGKAS / SUMMARY OF ADDITIONAL INFORMATION - PUB III-II 2024']))

WebUI.verifyLinksAccessible(['https://baf-mobile-prod.oss-ap-southeast-5.aliyuncs.com/investor-relation-file%2F1731056208170.pdf?Expires=1736264654&OSSAccessKeyId=LTAI5tFAFQkoFApg3bDqxLsA&Signature=JCZUnET%2FUwHiC%2F8jTuQQKqLSCo8%3D'])

WebUI.closeWindowIndex(1)

WebUI.switchToWindowIndex(0)

WebUI.click(findTestObject('Investor Relation/Bond Information/button_Download', [('tahun_id') : 2024, ('content_id') : 'INFORMASI TAMBAHAN RINGKAS / SUMMARY OF ADDITIONAL INFORMATION - PUB III-I 2024']))

WebUI.verifyLinksAccessible(['https://baf-mobile-prod.oss-ap-southeast-5.aliyuncs.com/investor-relation-file/1720142716106.pdf'])

WebUI.closeWindowIndex(1)

WebUI.switchToWindowIndex(0)

WebUI.click(findTestObject('Investor Relation/Bond Information/button_Download', [('tahun_id') : 2024, ('content_id') : 'PROSPEKTUS / PROSPECTUS - PUB III-I 2024']))

WebUI.verifyLinksAccessible(['https://baf-mobile-prod.oss-ap-southeast-5.aliyuncs.com/investor-relation-file/1719899148855.pdf'])

WebUI.closeWindowIndex(1)

WebUI.switchToWindowIndex(0)

WebUI.click(findTestObject('Investor Relation/Bond Information/button_Download', [('tahun_id') : 2024, ('content_id') : 'PROSPEKTUS RINGKAS / SUMMARY OF PROSPECTUS - PUB III-I 2024']))

WebUI.verifyLinksAccessible(['https://baf-mobile-prod.oss-ap-southeast-5.aliyuncs.com/investor-relation-file/1720142819562.pdf'])

WebUI.closeWindowIndex(1)

WebUI.switchToWindowIndex(0)

WebUI.focus(findTestObject('Investor Relation/Bond Information/nav_Bond 1'))

WebUI.verifyTextPresent('Bond/Sukuk Disclosure', true)

WebUI.click(findTestObject('Investor Relation/Bond Information/button_Download', [('tahun_id') : 2024, ('content_id') : 'PELUNASAN POKOK DAN BUNGA TERAKHIR PUB I TAHAP III 2021 SERI B / REPAYMENT OF PRINCIPAL AND FINAL INTEREST OF PUB I PHASE III 2021 SERIES B - 09 OCTOBER 2024']))

WebUI.verifyLinksAccessible(['https://baf-mobile-prod.oss-ap-southeast-5.aliyuncs.com/investor-relation-file%2F1728439575663.pdf?Expires=1736265995&OSSAccessKeyId=LTAI5tFAFQkoFApg3bDqxLsA&Signature=Jn8FtD%2Fcag%2BXuIA%2BQ93znZPOoWc%3D'])

WebUI.closeWindowIndex(1)

WebUI.switchToWindowIndex(0)

WebUI.click(findTestObject('Investor Relation/Bond Information/button_Download', [('tahun_id') : 2024, ('content_id') : 'PELUNASAN POKOK DAN BUNGA TERAKHIR PUB I TAHAP II 2021 SERI B DAN PUB II TAHAP III 2023 SERI A / REPAYMENT OF PRINCIPAL AND FINAL INTEREST OF PUB I PHASE II 2021 SERIES B AND PUB II PHASE III2023 SERIES A - 29 APRIL 2024']))

WebUI.verifyLinksAccessible(['https://baf-mobile-prod.oss-ap-southeast-5.aliyuncs.com/investor-relation-file/1718703360226.pdf'])

WebUI.closeWindowIndex(1)

WebUI.switchToWindowIndex(0)

WebUI.click(findTestObject('Investor Relation/Bond Information/button_Download', [('tahun_id') : 2024, ('content_id') : 'PELUNASAN POKOK DAN BUNGA TERAKHIR PUB II TAHAP II 2022 SERI A / REPAYMENT OF PRINCIPAL AND FINAL INTEREST OF PUB II PHASE II 2022 SERIES A - 12 DECEMBER 2023']))

WebUI.verifyLinksAccessible(['https://baf-mobile-prod.oss-ap-southeast-5.aliyuncs.com/investor-relation-file/1718705604479.pdf'])

WebUI.closeWindowIndex(1)

WebUI.switchToWindowIndex(0)

WebUI.click(findTestObject('Investor Relation/Bond Information/button_Download', [('tahun_id') : 2024, ('content_id') : 'PELUNASAN POKOK DAN BUNGA TERAKHIR SUKUK MUDHARABAH I TAHAP II 2020 SERI B / REPAYMENT OF PRINCIPAL AND FINAL INTEREST OF SUKUK MUDHARABAH I PHASE II 2020 SERIES B - 23 OCTOBER 2023']))

WebUI.verifyLinksAccessible(['https://baf-mobile-prod.oss-ap-southeast-5.aliyuncs.com/investor-relation-file/1718705718415.pdf'])

WebUI.closeWindowIndex(1)

WebUI.switchToWindowIndex(0)

WebUI.focus(findTestObject('Investor Relation/Bond Information/nav_Bond 2'))

WebUI.click(findTestObject('Investor Relation/Bond Information/button_Download', [('tahun_id') : 2024, ('content_id') : 'PELUNASAN POKOK DAN BUNGA TERAKHIR PUB I TAHAP I 2020 DAN SUKUK MUDHARABAH I TAHAP I 2020 / REPAYMENT OF PRINCIPAL AND FINAL INTEREST OF PUB I PHASE I 2020 AND SUKUK MUDHARABAH I PHASE I 2020 - 4 AUGUST 2023']))

WebUI.verifyLinksAccessible(['https://baf-mobile-prod.oss-ap-southeast-5.aliyuncs.com/investor-relation-file/1718704982744.pdf'])

WebUI.closeWindowIndex(1)

WebUI.switchToWindowIndex(0)

WebUI.click(findTestObject('Investor Relation/Bond Information/button_Download', [('tahun_id') : 2024, ('content_id') : 'PELUNASAN POKOK DAN BUNGA TERAKHIR PUB II TAHAP I 2022 SERI A / REPAYMENT OF PRINCIPAL AND FINAL INTEREST OF PUB II PHASE I 2022 SERIES A - 17 JULY 2023']))

WebUI.verifyLinksAccessible(['https://baf-mobile-prod.oss-ap-southeast-5.aliyuncs.com/investor-relation-file/1718705869710.pdf'])

WebUI.closeWindowIndex(1)

WebUI.switchToWindowIndex(0)

WebUI.click(findTestObject('Investor Relation/Bond Information/button_Download', [('tahun_id') : 2024, ('content_id') : 'PELUNASAN POKOK DAN BUNGA TERAKHIR  OBLIGASI III 2019 SERI B  / REPAYMENT OF PRINCIPAL AND FINAL INTEREST OF BOND III 2019 SERIES B - 05 NOVEMBER 2022']))

WebUI.verifyLinksAccessible(['https://baf-mobile-prod.oss-ap-southeast-5.aliyuncs.com/investor-relation-file/1718706499464.pdf'])

WebUI.closeWindowIndex(1)

WebUI.switchToWindowIndex(0)

WebUI.click(findTestObject('Investor Relation/Bond Information/button_Download', [('tahun_id') : 2024, ('content_id') : 'PELUNASAN POKOK DAN BUNGA TERAKHIR PUB I TAHAP III 2021 SERI A / REPAYMENT OF PRINCIPAL AND FINAL INTEREST OF PUB I PHASE III 2021 SERIES A - 05 OCTOBER 2022']))

WebUI.verifyLinksAccessible(['https://baf-mobile-prod.oss-ap-southeast-5.aliyuncs.com/investor-relation-file/1718706436043.pdf'])

WebUI.closeWindowIndex(1)

WebUI.switchToWindowIndex(0)

WebUI.click(findTestObject('Investor Relation/Bond Information/button_Download', [('tahun_id') : 2024, ('content_id') : 'PENGUNDURAN DIRI KOMISARIS / RESIGNATION OF COMMISSIONER - 07 JULY 2022']))

WebUI.verifyLinksAccessible(['https://baf-mobile-prod.oss-ap-southeast-5.aliyuncs.com/investor-relation-file/1718706668492.pdf'])

WebUI.closeWindowIndex(1)

WebUI.switchToWindowIndex(0)

WebUI.click(findTestObject('Investor Relation/Bond Information/button_Download', [('tahun_id') : 2024, ('content_id') : 'PENGHENTIAN PUB I TAHAP I SAMPAI TAHAP V / TERMINATION OF PUB I PHASE I TO PHASE V - 21 MARCH 2022']))

WebUI.verifyLinksAccessible(['https://baf-mobile-prod.oss-ap-southeast-5.aliyuncs.com/investor-relation-file/1718706361700.pdf'])

WebUI.closeWindowIndex(1)

WebUI.switchToWindowIndex(0)

WebUI.focus(findTestObject('Investor Relation/Bond Information/nav_Bond 1'))

WebUI.click(findTestObject('Investor Relation/Bond Information/button_Lihat Semua'))

