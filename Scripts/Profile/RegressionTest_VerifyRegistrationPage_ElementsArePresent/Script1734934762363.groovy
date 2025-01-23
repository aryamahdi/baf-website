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
import groovy.sql.Sql as Sql

'Click Button "Login"'
WebUI.click(findTestObject('var_Content', [('xpath') : '//body[1]/div[1]/main[1]/main[1]/nav[1]/div[1]/div[1]/div[1]/form[1]/button[1]']))

'Click "Register Now"'
WebUI.click(findTestObject('lbl_Content', [('text') : 'Register Now']))

'Verify Text "Let\'s Register for BAF Website" is Present'
WebUI.verifyElementPresent(findTestObject('lbl_Content', [('text') : 'Let\'s Register for BAF Website']), 10)

'Input Text in "Full Name" Field'
WebUI.setText(findTestObject('var_Content', [('xpath') : '//body[1]/div[1]/main[1]/main[1]/div[1]/div[1]/div[2]/div[1]/form[1]/div[1]/input[1]']), 
    FullName)

'Input Text in "Active Phone Number" Field'
WebUI.setText(findTestObject('var_Content', [('xpath') : '//body[1]/div[1]/main[1]/main[1]/div[1]/div[1]/div[2]/div[1]/form[1]/div[2]/input[1]']), 
    PhoneNumber)

'Input Text in "Email" Field'
WebUI.setText(findTestObject('var_Content', [('xpath') : '//body[1]/div[1]/main[1]/main[1]/div[1]/div[1]/div[2]/div[1]/form[1]/div[3]/input[1]']), 
    Email)

'Input Text in "Password" Field'
WebUI.setText(findTestObject('var_Content', [('xpath') : '//body[1]/div[1]/main[1]/main[1]/div[1]/div[1]/div[2]/div[1]/form[1]/div[4]/input[1]']), 
    Password)

'Input Text in "City" Field'
WebUI.setText(findTestObject('var_Content', [('xpath') : '//body[1]/div[1]/main[1]/main[1]/div[1]/div[1]/div[2]/div[1]/form[1]/div[5]/input[1]']), 
    City)

'Input Text in "Date of Birth" Field'
WebUI.setText(findTestObject('var_Content', [('xpath') : '//body[1]/div[1]/main[1]/main[1]/div[1]/div[1]/div[2]/div[1]/form[1]/div[6]/input[1]']), 
    DateofBirth)

'Delay 25 Seconds'
WebUI.delay(25)

'Click Button "Register"'
WebUI.click(findTestObject('var_Content', [('xpath') : '//body[1]/div[1]/main[1]/main[1]/div[1]/div[1]/div[2]/div[1]/form[1]/button[1]']))

'Click "SEND OTP"'
WebUI.click(findTestObject('var_Content', [('xpath') : '//body[1]/div[1]/main[1]/div[1]/div[1]/div[1]/button[1]']))

'Configuration URL for Connect Database'
def dbUrl = 'jdbc:postgresql://172.16.7.85:5444/baf_user_management'

'Configuration Username for Connect Database'
def dbUser = 'dev'

'Configuration Password for Connect Database'
def dbPassword = 'Bussan100!'

'Configuration Driver JDBC PostgreSQL for Connect Database'
def driver = 'org.postgresql.Driver'

'Establishing the Connection Database'
Sql sql = Sql.newInstance(dbUrl, dbUser, dbPassword, driver)

'Executing the Query'
def result = sql.rows('select otp, msisdn, "DTM_CRT" from baf."OTP_LOG" where  msisdn = \'085771720025\' order by "DTM_CRT" desc limit 1')

'Get OTP'
result.each({ def row ->
        OTP = row.otp
    })

'Close the Database Connection'
sql.close()

'Input OTP'
WebUI.setText(findTestObject('var_Content', [('xpath') : '//body[1]/div[1]/main[1]/div[1]/div[1]/div[2]/div[1]/div[1]/div[1]/input[1]']), 
    OTP)

'Verify Register Success'
WebUI.verifyElementPresent(findTestObject('lbl_Content', [('text') : 'Success']), 15)

'Click OK'
WebUI.click(findTestObject('lbl_Content', [('text') : 'OK']))

