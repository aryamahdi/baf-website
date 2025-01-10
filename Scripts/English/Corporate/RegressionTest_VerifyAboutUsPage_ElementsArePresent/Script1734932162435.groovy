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

'Click Menu "Corporate"'
WebUI.click(findTestObject('link_Content', [('href') : '/corporate', ('text') : 'Corporate']))

'Click Menu "About Us"'
WebUI.click(findTestObject('link_Content', [('href') : '/en/corporate/aboutus', ('text') : 'About Us']))

'Verify Banner Image is Present'
WebUI.verifyElementPresent(findTestObject('var_Content', [('xpath') : '//body[1]/div[1]/main[1]/main[1]/div[1]/div[1]/div[1]/div[1]/img[1]']), 
    10)

'Verify Image BAF Plaza is Present'
WebUI.verifyElementPresent(findTestObject('img_Content', [('src') : '/_next/image?url=%2Fstatic%2Fimages%2Fimage%2Fbaf_plaza_fq.webp&w=828&q=75']), 
    10)

'Click Link "BAF AT GLANCE" '
WebUI.click(findTestObject('link_Content', [('href') : '#', ('text') : 'BAF AT A GLANCE']))

'Scroll Up to First Content'
WebUI.scrollToElement(findTestObject('var_Content', [('xpath') : '//body[1]/div[1]/main[1]/main[1]/div[1]/div[1]/ol[1]']), 
    10)

'Verify Image Milestone BAF is Present'
WebUI.verifyElementPresent(findTestObject('img_Content', [('src') : '/_next/image?url=%2Fstatic%2Fimages%2Fimage%2FMilestoneBAF2023_EN.jpg&w=3840&q=75']), 
    10)

'Scroll to "Read More" Button'
WebUI.focus(findTestObject('var_Content', [('xpath') : '//body[1]/div[1]/main[1]/main[1]/div[2]/div[2]/div[1]/div[2]/div[1]/div[1]/div[1]/div[2]/button[1]']), 
    FailureHandling.STOP_ON_FAILURE)

'Click Button "Read More"'
WebUI.click(findTestObject('var_Content', [('xpath') : '//body[1]/div[1]/main[1]/main[1]/div[2]/div[2]/div[1]/div[2]/div[1]/div[1]/div[1]/div[2]/button[1]']))

'Verify Read More Button Clicked'
WebUI.verifyElementPresent(findTestObject('var_Content', [('xpath') : '//body[1]/div[1]/main[1]/main[1]/div[2]/div[2]/div[1]/div[2]/div[1]/div[1]/div[1]/p[1]']), 
    10)

'Scroll to "Read Less" Button'
WebUI.focus(findTestObject('var_Content', [('xpath') : '//body[1]/div[1]/main[1]/main[1]/div[2]/div[2]/div[1]/div[2]/div[1]/div[1]/div[1]/div[2]/button[1]']), 
    FailureHandling.STOP_ON_FAILURE)

'Click Button "Read Less"'
WebUI.click(findTestObject('var_Content', [('xpath') : '//body[1]/div[1]/main[1]/main[1]/div[2]/div[2]/div[1]/div[2]/div[1]/div[1]/div[1]/div[2]/button[1]']))

'Scroll Up to First Content'
WebUI.focus(findTestObject('var_Content', [('xpath') : '//body[1]/div[1]/main[1]/main[1]/div[2]/div[1]/div[2]']), 
    FailureHandling.STOP_ON_FAILURE)

'Click Link "VISION, MISSION, & VALUES" '
WebUI.click(findTestObject('link_Content', [('href') : '#', ('text') : 'VISION, MISSION, & VALUES']))

'Scroll Up to First Content'
WebUI.scrollToElement(findTestObject('var_Content', [('xpath') : '//body[1]/div[1]/main[1]/main[1]/div[1]/div[1]/ol[1]']), 
    10)

'Verify Image "VISION" is Present'
WebUI.verifyElementPresent(findTestObject('img_Content', [('src') : '/static/images/image/company-values/vision.svg']), 
    10)

'Verify Text "VISION" is Present'
WebUI.verifyElementPresent(findTestObject('lbl_Content', [('text') : 'VISION']), 10)

'Scroll Down'
WebUI.scrollToElement(findTestObject('var_Content', [('xpath') : '//body[1]/div[1]/main[1]/main[1]/div[2]/div[2]/div[1]/div[2]/div[1]/div[2]/div[1]/div[1]/div[1]/div[1]/h5[1]']), 
    10)

'Verify Image "MISSION" is Present'
WebUI.verifyElementPresent(findTestObject('img_Content', [('src') : '/static/images/image/company-values/mision.svg']), 
    10)

'Verify Text "MISSION" is Present'
WebUI.verifyElementPresent(findTestObject('lbl_Content', [('text') : 'MISSION']), 10)

'Verify Image "VISIONARY" is Present'
WebUI.verifyElementPresent(findTestObject('img_Content', [('src') : '/static/images/image/company-values/visionary.svg']), 
    10)

'Verify Text "VISIONARY" is Present'
WebUI.verifyElementPresent(findTestObject('lbl_Content', [('text') : 'VISIONARY']), 10)

'Verify Image "RELIABLE" is Present'
WebUI.verifyElementPresent(findTestObject('img_Content', [('src') : '/static/images/image/company-values/reliable.svg']), 
    10)

'Verify Text "RELIABLE" is Present'
WebUI.verifyElementPresent(findTestObject('lbl_Content', [('text') : 'RELIABLE']), 10)

'Verify Image "ACCESSIBLE" is Present'
WebUI.verifyElementPresent(findTestObject('img_Content', [('src') : '/static/images/image/company-values/accessible.svg']), 
    10)

'Verify Text "ACCESSIBLE" is Present'
WebUI.verifyElementPresent(findTestObject('lbl_Content', [('text') : 'ACCESSIBLE']), 10)

'Scroll Up to First Content'
WebUI.scrollToElement(findTestObject('var_Content', [('xpath') : '//body[1]/div[1]/main[1]/main[1]/div[1]/div[1]/ol[1]']), 
    10)

'Click Link "ORGANIZATION STRUCTURE" '
WebUI.click(findTestObject('link_Content', [('href') : '#', ('text') : 'ORGANIZATION STRUCTURE']))

'Scroll Up to First Content'
WebUI.scrollToElement(findTestObject('var_Content', [('xpath') : '//body[1]/div[1]/main[1]/main[1]/div[1]/div[1]/ol[1]']), 
    10)

'Verify Text "ORGANIZATION STRUCTURE" is Present'
WebUI.verifyElementPresent(findTestObject('lbl_Content', [('text') : 'ORGANIZATION STRUCTURE']), 10)

'Verify Text "Organization Structure" is Present'
WebUI.verifyElementPresent(findTestObject('lbl_Content', [('text') : 'Organization Structure']), 10)

'Verify Text "PT Bussan Auto Finance" is Present'
WebUI.verifyElementPresent(findTestObject('lbl_Content', [('text') : 'PT Bussan Auto Finance']), 10)

'Verify Image "ORGANIZATION STRUCTURE" is Present'
WebUI.verifyElementPresent(findTestObject('img_Content', [('src') : '/_next/image?url=%2Fstatic%2Fimages%2Fimage%2Fstructure-organization.png&w=3840&q=75']), 
    10)

'Click Link "SHAREHOLDER STRUCTURE" '
WebUI.click(findTestObject('link_Content', [('href') : '#', ('text') : 'SHAREHOLDER STRUCTURE']))

'Scroll Up to First Content'
WebUI.scrollToElement(findTestObject('var_Content', [('xpath') : '//body[1]/div[1]/main[1]/main[1]/div[1]/div[1]/ol[1]']), 
    10)

'Verify Text "SHAREHOLDERS" is Present'
WebUI.verifyElementPresent(findTestObject('lbl_Content', [('text') : 'SHAREHOLDERS']), 10)

'Verify Table "SHAREHOLDERS" is Present'
WebUI.verifyElementPresent(findTestObject('var_Content', [('xpath') : '//body[1]/div[1]/main[1]/main[1]/div[2]/div[2]/div[1]/div[2]/div[1]/div[4]/div[1]/div[1]/div[1]/div[1]/div[1]/div[1]']), 
    10)

'Click Link "BOARD OF COMMISSIONERS" '
WebUI.click(findTestObject('link_Content', [('href') : '#', ('text') : 'BOARD OF COMMISSIONERS']))

'Scroll Up to First Content'
WebUI.scrollToElement(findTestObject('var_Content', [('xpath') : '//body[1]/div[1]/main[1]/main[1]/div[1]/div[1]/ol[1]']), 
    10)

'Verify Image "Toshiyuki Kojima" is Present'
WebUI.verifyElementPresent(findTestObject('img_Content', [('src') : '/_next/image?url=%2Fstatic%2Fimages%2Fimage%2FBOC%2FToshiyuki-Kojima.png&w=384&q=75']), 
    10)

'Verify Text "Toshiyuki Kojima" is Present'
WebUI.verifyElementPresent(findTestObject('lbl_Content', [('text') : 'Toshiyuki Kojima']), 10)

'Verify Text "President Commissioner" is Present'
WebUI.verifyElementPresent(findTestObject('lbl_Content', [('text') : 'President Commissioner']), 10)

'Verify Text Description About "Toshiyuki Kojima" is Present'
WebUI.verifyElementPresent(findTestObject('lbl_Content', [('text') : 'Japan Citizen, born in 1974. He earned Bachelor’s degree from Keio University, Japan, majoring in School of Education in 1986.']), 
    10)

'Click Read More on "Toshiyuki Kojima"'
WebUI.click(findTestObject('var_Content', [('xpath') : '//body[1]/div[1]/main[1]/main[1]/div[2]/div[2]/div[1]/div[2]/div[1]/div[5]/div[1]/div[1]/div[2]/div[2]/button[1]']))

'Verify Text Description About "Toshiyuki Kojima" is Present'
WebUI.verifyElementPresent(findTestObject('lbl_Content', [('text') : 'He has worked at Mitsui & Co. Ltd., Tokyo, Japan since 1997 and served in several positions under Mitsui Group, among others Executive Director & Chief Operating Officer Bussan Auto Finance India Pvt. Ltd. (2007-2009), Strategy Planning Yamaha Motor India Pvt. Ltd. (2009-2010), Automotive Strategy Department Mitsui & Co., Ltd. (2010-2013), Toyota Motor Corporation, Japan (2013-2015), and General Manager Divisi Third Motor Vehicles Mitsui & Co., Ltd. (2015-2018) General Manager Automotive Solution Business Div.,Mitsui & Co.,Ltd. (2022-present). He also served as Vice President Director of the Company (2018-2022). He is appointed for his first terms of office as President Commissioner of the Company according to Annual GMS of the Company dated May 8, 2023. He has no affiliation with other members of the Board of Commissioners, the members of the Board of Directors and the majority and/or controlling shareholders other than Mitsui & Co., Ltd.']), 
    10)

'Click Read Less on "Toshiyuki Kojima"'
WebUI.click(findTestObject('var_Content', [('xpath') : '//body[1]/div[1]/main[1]/main[1]/div[2]/div[2]/div[1]/div[2]/div[1]/div[5]/div[1]/div[1]/div[2]/div[2]/button[1]']))

'Scroll to "Masami Shiobara" Card'
WebUI.scrollToElement(findTestObject('var_Content', [('xpath') : '//body[1]/div[1]/main[1]/main[1]/div[2]/div[2]/div[1]/div[2]/div[1]/div[5]/div[1]/div[1]/div[2]/div[2]/p[1]']), 
    10)

'Verify Image "Masami Shiobara" is Present'
WebUI.verifyElementPresent(findTestObject('img_Content', [('src') : '/_next/image?url=%2Fstatic%2Fimages%2Fimage%2FBOC%2FMasami-Shiobara.jpg&w=384&q=75']), 
    10)

'Verify Text "Masami Shiobara" is Present'
WebUI.verifyElementPresent(findTestObject('lbl_Content', [('text') : 'Masami Shiobara']), 10)

'Verify Text "Commissioner" is Present'
WebUI.verifyElementPresent(findTestObject('lbl_Content', [('text') : 'Commissioner']), 10)

'Verify Text Description About "Masami Shiobara" is Present'
WebUI.verifyElementPresent(findTestObject('lbl_Content', [('text') : 'Japan Citizen, Born in 1968. He earned Bachelor’s degree from Meiji University, Japan, majoring in Commerce in 1992.']), 
    10)

'Click Read More on "Masami Shiobara"'
WebUI.click(findTestObject('var_Content', [('xpath') : '//body[1]/div[1]/main[1]/main[1]/div[2]/div[2]/div[1]/div[2]/div[1]/div[5]/div[1]/div[2]/div[2]/div[2]/button[1]']))

'Verify Text Description About "Masami Shiobara" is Present'
WebUI.verifyElementPresent(findTestObject('lbl_Content', [('text') : 'He has worked at JA Mitsui Leasing, Ltd. (includes Mitsui Leasing & Development, Ltd., a Predecessor company before merger), Tokyo Japan since 1992 and served in several position with the latest position as Deputy General Manager. He has assigned to several positions in JA Mitsui Leasing group among others as General Manager at Taipei branch (2012-2015), Executive Director at Mitsui Rail Capital, LLC (2015-2020), Deputy Divisional Operating Officer Ship & Transportation Division at JA Mitsui Leasing, Ltd. (2020-2023) and Deputy General Manager, Overseas Management Division, General Planning & Strategy Unit (2023 – current). He is appointed for his first terms of office as Commissioner of the Company according to Deed of Circular Resolution of Shareholders as a Member of the Extraordinary General Meeting of Shareholders No. 28 dated September 26, 2023*). He has no affiliation with other members of the Board of Commissioners, the members of the Board of Directors, the majority and/or controlling Shareholders and Shareholders other than JA Mitsui Leasing, Ltd.']), 
    10)

'Click Read Less on "Masami Shiobara"'
WebUI.click(findTestObject('var_Content', [('xpath') : '//body[1]/div[1]/main[1]/main[1]/div[2]/div[2]/div[1]/div[2]/div[1]/div[5]/div[1]/div[2]/div[2]/div[2]/button[1]']))

'Scroll to "Naotaka Takeshita" Card'
WebUI.scrollToElement(findTestObject('var_Content', [('xpath') : '//body[1]/div[1]/main[1]/main[1]/div[2]/div[2]/div[1]/div[2]/div[1]/div[5]/div[1]/div[2]/div[2]/div[2]/p[1]']), 
    10)

'Verify Image "Naotaka Takeshita" is Present'
WebUI.verifyElementPresent(findTestObject('img_Content', [('src') : '/_next/image?url=%2Fstatic%2Fimages%2Fimage%2FBOC%2FNaotaka-Takeshita.png&w=384&q=75']), 
    10, FailureHandling.STOP_ON_FAILURE)

'Verify Text "Naotaka Takeshita" is Present'
WebUI.verifyElementPresent(findTestObject('lbl_Content', [('text') : 'Naotaka Takeshita']), 10, FailureHandling.STOP_ON_FAILURE)

'Verify Text "Commissioner" is Present'
WebUI.verifyElementPresent(findTestObject('lbl_Content', [('text') : 'Commissioner']), 10, FailureHandling.STOP_ON_FAILURE)

'Verify Text Description About "Naotaka Takeshita" is Present'
WebUI.verifyElementPresent(findTestObject('lbl_Content', [('text') : 'Japan Citizen, Born in 1967. He earned Bachelor’s degree from Nagoya University, Japan, majoring in Education in 1990.']), 
    10, FailureHandling.STOP_ON_FAILURE)

'Click Read More on "Naotaka Takeshita"'
WebUI.click(findTestObject('var_Content', [('xpath') : '//body[1]/div[1]/main[1]/main[1]/div[2]/div[2]/div[1]/div[2]/div[1]/div[5]/div[1]/div[3]/div[2]/div[2]/button[1]']), 
    FailureHandling.STOP_ON_FAILURE)

'Verify Text Description About "Naotaka Takeshita" is Present'
WebUI.verifyElementPresent(findTestObject('var_Content', [('xpath') : '//body[1]/div[1]/main[1]/main[1]/div[2]/div[2]/div[1]/div[2]/div[1]/div[5]/div[1]/div[3]/div[2]/div[2]/p[2]']), 
    10, FailureHandling.STOP_ON_FAILURE)

'Click Read Less on "Naotaka Takeshita"'
WebUI.click(findTestObject('var_Content', [('xpath') : '//body[1]/div[1]/main[1]/main[1]/div[2]/div[2]/div[1]/div[2]/div[1]/div[5]/div[1]/div[3]/div[2]/div[2]/button[1]']), 
    FailureHandling.STOP_ON_FAILURE)

'Scroll to "Dani Firmansjah" Card'
WebUI.scrollToElement(findTestObject('var_Content', [('xpath') : '//body[1]/div[1]/main[1]/main[1]/div[2]/div[2]/div[1]/div[2]/div[1]/div[5]/div[1]/div[3]/div[2]/div[2]/p[1]']), 
    10)

'Verify Image "Dani Firmansjah" is Present'
WebUI.verifyElementPresent(findTestObject('img_Content', [('src') : '/_next/image?url=%2Fstatic%2Fimages%2Fimage%2FBOC%2FDani-Firmansyah.png&w=384&q=75']), 
    10, FailureHandling.STOP_ON_FAILURE)

'Verify Text "Dani Firmansjah" is Present'
WebUI.verifyElementPresent(findTestObject('lbl_Content', [('text') : 'Dani Firmansjah']), 10, FailureHandling.STOP_ON_FAILURE)

'Verify Text "Independent Commissioner" is Present'
WebUI.verifyElementPresent(findTestObject('lbl_Content', [('text') : 'Independent Commissioner']), 10, FailureHandling.STOP_ON_FAILURE)

'Verify Text Description About "Dani Firmansjah" is Present'
WebUI.verifyElementPresent(findTestObject('lbl_Content', [('text') : 'Indonesian Citizen, born in 1954. He earned master’s degree from Asian Institute of Management Philippines, Philippines Majoring Management in 1994.']), 
    10, FailureHandling.STOP_ON_FAILURE)

'Click Read More on "Dani Firmansjah"'
WebUI.click(findTestObject('var_Content', [('xpath') : '//body[1]/div[1]/main[1]/main[1]/div[2]/div[2]/div[1]/div[2]/div[1]/div[5]/div[1]/div[4]/div[2]/div[2]/button[1]']), 
    FailureHandling.STOP_ON_FAILURE)

'Verify Text Description About "Dani Firmansjah" is Present'
WebUI.verifyElementPresent(findTestObject('var_Content', [('xpath') : '//body[1]/div[1]/main[1]/main[1]/div[2]/div[2]/div[1]/div[2]/div[1]/div[5]/div[1]/div[4]/div[2]/div[2]/p[2]']), 
    10, FailureHandling.STOP_ON_FAILURE)

'Click Read Less on "Dani Firmansjah"'
WebUI.click(findTestObject('var_Content', [('xpath') : '//body[1]/div[1]/main[1]/main[1]/div[2]/div[2]/div[1]/div[2]/div[1]/div[5]/div[1]/div[4]/div[2]/div[2]/button[1]']), 
    FailureHandling.STOP_ON_FAILURE)

'Scroll to "Prabowo" Card'
WebUI.scrollToElement(findTestObject('var_Content', [('xpath') : '//body[1]/div[1]/main[1]/main[1]/div[2]/div[2]/div[1]/div[2]/div[1]/div[5]/div[1]/div[4]/div[2]/div[2]/p[1]']), 
    10)

'Verify Image "Prabowo" is Present'
WebUI.verifyElementPresent(findTestObject('img_Content', [('src') : '/_next/image?url=%2Fstatic%2Fimages%2Fimage%2FBOC%2FPrabowo.png&w=384&q=75']), 
    10, FailureHandling.STOP_ON_FAILURE)

'Verify Text "Prabowo" is Present'
WebUI.verifyElementPresent(findTestObject('lbl_Content', [('text') : 'Prabowo']), 10, FailureHandling.STOP_ON_FAILURE)

'Verify Text "Independent Commissioner" is Present'
WebUI.verifyElementPresent(findTestObject('lbl_Content', [('text') : 'Independent Commissioner']), 10, FailureHandling.STOP_ON_FAILURE)

'Verify Text Description About "Prabowo" is Present'
WebUI.verifyElementPresent(findTestObject('lbl_Content', [('text') : 'Indonesian Citizen, born in 1961. He earned Doctorate Degree from Institut Pertanian Bogor in 2012.']), 
    10, FailureHandling.STOP_ON_FAILURE)

'Click Read More on "Prabowo"'
WebUI.click(findTestObject('var_Content', [('xpath') : '//body[1]/div[1]/main[1]/main[1]/div[2]/div[2]/div[1]/div[2]/div[1]/div[5]/div[1]/div[5]/div[2]/div[2]/button[1]']), 
    FailureHandling.STOP_ON_FAILURE)

'Verify Text Description About "Prabowo" is Present'
WebUI.verifyElementPresent(findTestObject('var_Content', [('xpath') : '//body[1]/div[1]/main[1]/main[1]/div[2]/div[2]/div[1]/div[2]/div[1]/div[5]/div[1]/div[5]/div[2]/div[2]/p[2]']), 
    10, FailureHandling.STOP_ON_FAILURE)

'Click Read Less on "Prabowo"'
WebUI.click(findTestObject('var_Content', [('xpath') : '//body[1]/div[1]/main[1]/main[1]/div[2]/div[2]/div[1]/div[2]/div[1]/div[5]/div[1]/div[5]/div[2]/div[2]/button[1]']), 
    FailureHandling.STOP_ON_FAILURE)

'Scroll to "Nurdayadi" Card'
WebUI.scrollToElement(findTestObject('var_Content', [('xpath') : '//body[1]/div[1]/main[1]/main[1]/div[2]/div[2]/div[1]/div[2]/div[1]/div[5]/div[1]/div[5]/div[2]/div[2]/p[1]']), 
    10)

'Verify Image "Nurdayadi" is Present'
WebUI.verifyElementPresent(findTestObject('img_Content', [('src') : '/_next/image?url=%2Fstatic%2Fimages%2Fimage%2FBOC%2FNurdayadi.png&w=384&q=75']), 
    10, FailureHandling.STOP_ON_FAILURE)

'Verify Text "Nurdayadi" is Present'
WebUI.verifyElementPresent(findTestObject('lbl_Content', [('text') : 'Nurdayadi']), 10, FailureHandling.STOP_ON_FAILURE)

'Verify Text "Independent Commissioner" is Present'
WebUI.verifyElementPresent(findTestObject('lbl_Content', [('text') : 'Independent Commissioner']), 10, FailureHandling.STOP_ON_FAILURE)

'Verify Text Description About "Nurdayadi" is Present'
WebUI.verifyElementPresent(findTestObject('lbl_Content', [('text') : 'Indonesian Citizen, born in 1961. He earned master’s degree from The University of Brimingham, England, in 1989.']), 
    10, FailureHandling.STOP_ON_FAILURE)

'Click Read More on "Nurdayadi"'
WebUI.click(findTestObject('var_Content', [('xpath') : '//body[1]/div[1]/main[1]/main[1]/div[2]/div[2]/div[1]/div[2]/div[1]/div[5]/div[1]/div[6]/div[2]/div[2]/button[1]']), 
    FailureHandling.STOP_ON_FAILURE)

'Verify Text Description About "Nurdayadi" is Present'
WebUI.verifyElementPresent(findTestObject('var_Content', [('xpath') : '//body[1]/div[1]/main[1]/main[1]/div[2]/div[2]/div[1]/div[2]/div[1]/div[5]/div[1]/div[6]/div[2]/div[2]/p[2]']), 
    10, FailureHandling.STOP_ON_FAILURE)

'Click Read Less on "Nurdayadi"'
WebUI.click(findTestObject('var_Content', [('xpath') : '//body[1]/div[1]/main[1]/main[1]/div[2]/div[2]/div[1]/div[2]/div[1]/div[5]/div[1]/div[6]/div[2]/div[2]/button[1]']), 
    FailureHandling.STOP_ON_FAILURE)

'Scroll Up to First Content'
WebUI.focus(findTestObject('var_Content', [('xpath') : '//body[1]/div[1]/main[1]/main[1]/div[2]/div[1]/div[2]']), 
    FailureHandling.STOP_ON_FAILURE)

'Click Link "BOARD OF DIRECTORS" '
WebUI.click(findTestObject('link_Content', [('href') : '#', ('text') : 'BOARD OF DIRECTORS']))

'Scroll Up to First Content'
WebUI.scrollToElement(findTestObject('var_Content', [('xpath') : '//body[1]/div[1]/main[1]/main[1]/div[1]/div[1]/ol[1]']), 
    10)

'Verify Image "Lynn Ramli" is Present'
WebUI.verifyElementPresent(findTestObject('img_Content', [('src') : '/_next/image?url=%2Fstatic%2Fimages%2Fimage%2FBOD%2FLynn-Ramli.png&w=384&q=75']), 
    10)

'Verify Text "Lynn Ramli" is Present'
WebUI.verifyElementPresent(findTestObject('lbl_Content', [('text') : 'Lynn Ramli']), 10)

'Verify Text "President Director" is Present'
WebUI.verifyElementPresent(findTestObject('lbl_Content', [('text') : 'President Director']), 10)

'Verify Text Description About "Lynn Ramli" is Present'
WebUI.verifyElementPresent(findTestObject('lbl_Content', [('text') : 'Indonesian citizen, born in 1973. She earned a Bachelor of Administration from the University of Washington, USA in 1993 and a Master of Business Administration from the University of San Francisco, USA in 1994.']), 
    10)

'Click Read More on "Lynn Ramli"'
WebUI.click(findTestObject('var_Content', [('xpath') : '//body[1]/div[1]/main[1]/main[1]/div[2]/div[2]/div[1]/div[2]/div[1]/div[6]/div[1]/div[1]/div[2]/div[2]/button[1]']))

'Verify Text Description About "Lynn Ramli" is Present'
WebUI.verifyElementPresent(findTestObject('var_Content', [('xpath') : '//body[1]/div[1]/main[1]/main[1]/div[2]/div[2]/div[1]/div[2]/div[1]/div[6]/div[1]/div[1]/div[2]/div[2]/p[2]']), 
    10)

'Click Read Less on "Lynn Ramli"'
WebUI.click(findTestObject('var_Content', [('xpath') : '//body[1]/div[1]/main[1]/main[1]/div[2]/div[2]/div[1]/div[2]/div[1]/div[6]/div[1]/div[1]/div[2]/div[2]/button[1]']))

'Scroll to "Akira Sugai" Card'
WebUI.scrollToElement(findTestObject('var_Content', [('xpath') : '//body[1]/div[1]/main[1]/main[1]/div[2]/div[2]/div[1]/div[2]/div[1]/div[6]/div[1]/div[1]/div[2]/div[2]/p[1]']), 
    10)

'Verify Image "Akira Sugai" is Present'
WebUI.verifyElementPresent(findTestObject('img_Content', [('src') : '/_next/image?url=%2Fstatic%2Fimages%2Fimage%2FBOD%2FAkira-Sugai.png&w=384&q=75']), 
    10)

'Verify Text "Akira Sugai" is Present'
WebUI.verifyElementPresent(findTestObject('lbl_Content', [('text') : 'Akira Sugai']), 10)

'Verify Text "Vice President Director" is Present'
WebUI.verifyElementPresent(findTestObject('lbl_Content', [('text') : 'Vice President Director']), 10)

'Verify Text Description About "Akira Sugai" is Present'
WebUI.verifyElementPresent(findTestObject('lbl_Content', [('text') : 'Japan Citizen, born in 1969. He earned bachelor’s degree of Kyoto University, Japan majoring Economics in 1993.']), 
    10)

'Click Read More on "Akira Sugai"'
WebUI.click(findTestObject('var_Content', [('xpath') : '//body[1]/div[1]/main[1]/main[1]/div[2]/div[2]/div[1]/div[2]/div[1]/div[6]/div[1]/div[2]/div[2]/div[2]/button[1]']))

'Verify Text Description About "Akira Sugai" is Present'
WebUI.verifyElementPresent(findTestObject('var_Content', [('xpath') : '//body[1]/div[1]/main[1]/main[1]/div[2]/div[2]/div[1]/div[2]/div[1]/div[6]/div[1]/div[2]/div[2]/div[2]/p[2]']), 
    10)

'Click Read Less on "Akira Sugai"'
WebUI.click(findTestObject('var_Content', [('xpath') : '//body[1]/div[1]/main[1]/main[1]/div[2]/div[2]/div[1]/div[2]/div[1]/div[6]/div[1]/div[2]/div[2]/div[2]/button[1]']))

'Scroll to "Koji Kato" Card'
WebUI.scrollToElement(findTestObject('var_Content', [('xpath') : '//body[1]/div[1]/main[1]/main[1]/div[2]/div[2]/div[1]/div[2]/div[1]/div[6]/div[1]/div[2]/div[2]/div[2]/p[1]']), 
    10)

'Verify Image "Koji Kato" is Present'
WebUI.verifyElementPresent(findTestObject('img_Content', [('src') : '/_next/image?url=%2Fstatic%2Fimages%2Fimage%2FBOD%2FKoji-Kato.png&w=384&q=75']), 
    10, FailureHandling.STOP_ON_FAILURE)

'Verify Text "Koji Kato" is Present'
WebUI.verifyElementPresent(findTestObject('lbl_Content', [('text') : 'Koji Kato']), 10, FailureHandling.STOP_ON_FAILURE)

'Verify Text "Vice President Director" is Present'
WebUI.verifyElementPresent(findTestObject('lbl_Content', [('text') : 'Vice President Director']), 10, FailureHandling.STOP_ON_FAILURE)

'Verify Text Description About "Koji Kato" is Present'
WebUI.verifyElementPresent(findTestObject('lbl_Content', [('text') : 'Japan Citizen, born in 1972. He earned Bachelor’s degree from University of Tokyo, majoring in Information and Communication Engineering in 1997.']), 
    10, FailureHandling.STOP_ON_FAILURE)

'Click Read More on "Koji Kato"'
WebUI.click(findTestObject('var_Content', [('xpath') : '//body[1]/div[1]/main[1]/main[1]/div[2]/div[2]/div[1]/div[2]/div[1]/div[6]/div[1]/div[3]/div[2]/div[2]/button[1]']), 
    FailureHandling.STOP_ON_FAILURE)

'Verify Text Description About "Koji Kato" is Present'
WebUI.verifyElementPresent(findTestObject('var_Content', [('xpath') : '//body[1]/div[1]/main[1]/main[1]/div[2]/div[2]/div[1]/div[2]/div[1]/div[6]/div[1]/div[3]/div[2]/div[2]/p[2]']), 
    10, FailureHandling.STOP_ON_FAILURE)

'Click Read Less on "Koji Kato"'
WebUI.click(findTestObject('var_Content', [('xpath') : '//body[1]/div[1]/main[1]/main[1]/div[2]/div[2]/div[1]/div[2]/div[1]/div[6]/div[1]/div[3]/div[2]/div[2]/button[1]']), 
    FailureHandling.STOP_ON_FAILURE)

'Scroll to "Sigit Sembodo" Card'
WebUI.scrollToElement(findTestObject('var_Content', [('xpath') : '//body[1]/div[1]/main[1]/main[1]/div[2]/div[2]/div[1]/div[2]/div[1]/div[6]/div[1]/div[3]/div[2]/div[2]/p[1]']), 
    10)

'Verify Image "Sigit Sembodo" is Present'
WebUI.verifyElementPresent(findTestObject('img_Content', [('src') : '/_next/image?url=%2Fstatic%2Fimages%2Fimage%2FBOD%2FSigit-Sembodo.png&w=384&q=75']), 
    10, FailureHandling.STOP_ON_FAILURE)

'Verify Text "Dani Firmansjah" is Present'
WebUI.verifyElementPresent(findTestObject('lbl_Content', [('text') : 'Sigit Sembodo']), 10, FailureHandling.STOP_ON_FAILURE)

'Verify Text "Director" is Present'
WebUI.verifyElementPresent(findTestObject('lbl_Content', [('text') : 'Director']), 10, FailureHandling.STOP_ON_FAILURE)

'Verify Text Description About "Sigit Sembodo" is Present'
WebUI.verifyElementPresent(findTestObject('lbl_Content', [('text') : 'Indonesian Citizen, born in 1964. He earned bachelor’s degree from Universitas Indonesia majoring accounting in 1990 and master’s degree from Universitas Indonesia majoring management in 1992.']), 
    10, FailureHandling.STOP_ON_FAILURE)

'Click Read More on "Sigit Sembodo"'
WebUI.click(findTestObject('var_Content', [('xpath') : '//body[1]/div[1]/main[1]/main[1]/div[2]/div[2]/div[1]/div[2]/div[1]/div[6]/div[1]/div[4]/div[2]/div[2]/button[1]']), 
    FailureHandling.STOP_ON_FAILURE)

'Verify Text Description About "Sigit Sembodo" is Present'
WebUI.verifyElementPresent(findTestObject('var_Content', [('xpath') : '//body[1]/div[1]/main[1]/main[1]/div[2]/div[2]/div[1]/div[2]/div[1]/div[6]/div[1]/div[4]/div[2]/div[2]/p[2]']), 
    10, FailureHandling.STOP_ON_FAILURE)

'Click Read Less on "Sigit Sembodo"'
WebUI.click(findTestObject('var_Content', [('xpath') : '//body[1]/div[1]/main[1]/main[1]/div[2]/div[2]/div[1]/div[2]/div[1]/div[6]/div[1]/div[4]/div[2]/div[2]/button[1]']), 
    FailureHandling.STOP_ON_FAILURE)

'Scroll to "A Lung Ng" Card'
WebUI.scrollToElement(findTestObject('var_Content', [('xpath') : '//body[1]/div[1]/main[1]/main[1]/div[2]/div[2]/div[1]/div[2]/div[1]/div[6]/div[1]/div[4]/div[2]/div[2]/p[1]']), 
    10)

'Verify Image "A Lung Ng" is Present'
WebUI.verifyElementPresent(findTestObject('img_Content', [('src') : '/_next/image?url=%2Fstatic%2Fimages%2Fimage%2FBOD%2FAlung-Ng.png&w=384&q=75']), 
    10, FailureHandling.STOP_ON_FAILURE)

'Verify Text "A Lung Ng" is Present'
WebUI.verifyElementPresent(findTestObject('lbl_Content', [('text') : 'A Lung Ng']), 10, FailureHandling.STOP_ON_FAILURE)

'Verify Text "Director" is Present'
WebUI.verifyElementPresent(findTestObject('lbl_Content', [('text') : 'Director']), 10, FailureHandling.STOP_ON_FAILURE)

'Verify Text Description About "A Lung Ng" is Present'
WebUI.verifyElementPresent(findTestObject('lbl_Content', [('text') : 'Indonesian Citizen, born in 1971. He earned bachelor’s degree from Universitas Tarumanagara majoring management in 1990.']), 
    10, FailureHandling.STOP_ON_FAILURE)

'Click Read More on "A Lung Ng"'
WebUI.click(findTestObject('var_Content', [('xpath') : '//body[1]/div[1]/main[1]/main[1]/div[2]/div[2]/div[1]/div[2]/div[1]/div[6]/div[1]/div[5]/div[2]/div[2]/button[1]']), 
    FailureHandling.STOP_ON_FAILURE)

'Verify Text Description About "A Lung Ng" is Present'
WebUI.verifyElementPresent(findTestObject('var_Content', [('xpath') : '//body[1]/div[1]/main[1]/main[1]/div[2]/div[2]/div[1]/div[2]/div[1]/div[6]/div[1]/div[5]/div[2]/div[2]/p[2]']), 
    10, FailureHandling.STOP_ON_FAILURE)

'Click Read Less on "A Lung Ng"'
WebUI.click(findTestObject('var_Content', [('xpath') : '//body[1]/div[1]/main[1]/main[1]/div[2]/div[2]/div[1]/div[2]/div[1]/div[6]/div[1]/div[5]/div[2]/div[2]/button[1]']), 
    FailureHandling.STOP_ON_FAILURE)

'Scroll to "Yudono Chayadi" Card'
WebUI.scrollToElement(findTestObject('var_Content', [('xpath') : '//body[1]/div[1]/main[1]/main[1]/div[2]/div[2]/div[1]/div[2]/div[1]/div[6]/div[1]/div[5]/div[2]/div[2]/p[1]']), 
    10)

'Verify Image "Yudono Chayadi" is Present'
WebUI.verifyElementPresent(findTestObject('img_Content', [('src') : '/_next/image?url=%2Fstatic%2Fimages%2Fimage%2FBOD%2FYudono.png&w=384&q=75']), 
    10, FailureHandling.STOP_ON_FAILURE)

'Verify Text "Yudono Chayadi" is Present'
WebUI.verifyElementPresent(findTestObject('lbl_Content', [('text') : 'Yudono Chayadi']), 10, FailureHandling.STOP_ON_FAILURE)

'Verify Text "Director" is Present'
WebUI.verifyElementPresent(findTestObject('lbl_Content', [('text') : 'Director']), 10, FailureHandling.STOP_ON_FAILURE)

'Verify Text Description About "Yudono Chayadi" is Present'
WebUI.verifyElementPresent(findTestObject('lbl_Content', [('text') : 'Indonesian citizen, 41 year. He earned his Bachelor’s degree majoring Computer Science from Bina Nusantara University in 1999.']), 
    10, FailureHandling.STOP_ON_FAILURE)

'Click Read More on "Yudono Chayadi"'
WebUI.click(findTestObject('var_Content', [('xpath') : '//body[1]/div[1]/main[1]/main[1]/div[2]/div[2]/div[1]/div[2]/div[1]/div[6]/div[1]/div[6]/div[2]/div[2]/button[1]']), 
    FailureHandling.STOP_ON_FAILURE)

'Verify Text Description About "Yudono Chayadi" is Present'
WebUI.verifyElementPresent(findTestObject('var_Content', [('xpath') : '//body[1]/div[1]/main[1]/main[1]/div[2]/div[2]/div[1]/div[2]/div[1]/div[6]/div[1]/div[6]/div[2]/div[2]/p[2]']), 
    10, FailureHandling.STOP_ON_FAILURE)

'Click Read Less on "Yudono Chayadi"'
WebUI.click(findTestObject('var_Content', [('xpath') : '//body[1]/div[1]/main[1]/main[1]/div[2]/div[2]/div[1]/div[2]/div[1]/div[6]/div[1]/div[6]/div[2]/div[2]/button[1]']), 
    FailureHandling.STOP_ON_FAILURE)

'Scroll Up to First Content'
WebUI.focus(findTestObject('var_Content', [('xpath') : '//body[1]/div[1]/main[1]/main[1]/div[2]/div[1]/div[2]']), 
    FailureHandling.STOP_ON_FAILURE)

'Click Link "ACHIEVEMENTS" '
WebUI.click(findTestObject('link_Content', [('href') : '#', ('text') : 'ACHIEVEMENTS']))

'Scroll Up to First Content'
WebUI.scrollToElement(findTestObject('var_Content', [('xpath') : '//body[1]/div[1]/main[1]/main[1]/div[1]/div[1]/ol[1]']), 
    10)

'Verify Card "ACHIEVEMENTS" is Present'
WebUI.verifyElementPresent(findTestObject('var_Content', [('xpath') : '//body[1]/div[1]/main[1]/main[1]/div[2]/div[2]/div[1]/div[2]/div[1]/div[7]/div[1]/div[2]/div[1]/div[1]']), 
    10)

'Click Button Page 2'
WebUI.verifyElementPresent(findTestObject('var_Content', [('xpath') : '//body[1]/div[1]/main[1]/main[1]/div[2]/div[2]/div[1]/div[2]/div[1]/div[7]/div[1]/div[2]/div[1]/ul[1]/li[2]/a[1]']), 
    10)

'Verify Card "ACHIEVEMENTS" is Present'
WebUI.verifyElementPresent(findTestObject('var_Content', [('xpath') : '//body[1]/div[1]/main[1]/main[1]/div[2]/div[2]/div[1]/div[2]/div[1]/div[7]/div[1]/div[2]/div[1]/div[1]']), 
    10)

'Click Button Page 3'
WebUI.verifyElementPresent(findTestObject('var_Content', [('xpath') : '//body[1]/div[1]/main[1]/main[1]/div[2]/div[2]/div[1]/div[2]/div[1]/div[7]/div[1]/div[2]/div[1]/ul[1]/li[3]/a[1]']), 
    10)

'Verify Card "ACHIEVEMENTS" is Present'
WebUI.verifyElementPresent(findTestObject('var_Content', [('xpath') : '//body[1]/div[1]/main[1]/main[1]/div[2]/div[2]/div[1]/div[2]/div[1]/div[7]/div[1]/div[2]/div[1]/div[1]']), 
    10)

