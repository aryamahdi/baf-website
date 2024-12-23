package database

import static com.kms.katalon.core.checkpoint.CheckpointFactory.findCheckpoint
import static com.kms.katalon.core.testcase.TestCaseFactory.findTestCase
import static com.kms.katalon.core.testdata.TestDataFactory.findTestData
import static com.kms.katalon.core.testobject.ObjectRepository.findTestObject
import static com.kms.katalon.core.testobject.ObjectRepository.findWindowsObject

import com.kms.katalon.core.annotation.Keyword
import com.kms.katalon.core.checkpoint.Checkpoint
import com.kms.katalon.core.cucumber.keyword.CucumberBuiltinKeywords as CucumberKW
import com.kms.katalon.core.mobile.keyword.MobileBuiltInKeywords as Mobile
import com.kms.katalon.core.model.FailureHandling
import com.kms.katalon.core.testcase.TestCase
import com.kms.katalon.core.testdata.TestData
import com.kms.katalon.core.testobject.TestObject
import com.kms.katalon.core.webservice.keyword.WSBuiltInKeywords as WS
import com.kms.katalon.core.webui.keyword.WebUiBuiltInKeywords as WebUI
import com.kms.katalon.core.windows.keyword.WindowsBuiltinKeywords as Windows

import internal.GlobalVariable
import java.sql.Connection
import java.sql.DriverManager
import java.sql.ResultSet
import java.sql.Statement

import groovy.sql.Sql

public class OTP {
	// Static method to fetch OTP
    public static void OTPRegist() {
        // Database connection details
        def dbUrl = 'jdbc:postgresql://172.16.7.85:5444/baf_user_management'
        def dbUser = 'dev'
        def dbPassword = 'Bussan100!'
        def driverClassName = 'org.postgresql.Driver'

        def sql = Sql.newInstance(dbUrl, dbUser, dbPassword, driverClassName)

        try {
            // SQL query to get the latest OTP
            def query = "SELECT otp FROM baf.\"OTP_LOG\" WHERE msisdn = '0895336550957' ORDER BY DTM_CRT DESC LIMIT 1"

            // Execute the query and fetch the OTP
            def row = sql.firstRow(query)

            if (row) {
                println "OTP: ${row.otp}"
                // Assign the OTP to a global variable or class-level variable
                GlobalVariable.OTP = row.otp
            } else {
                println "No data found."
            }
        } catch (Exception e) {
            // Handle errors (e.g., database connection errors)
            println "Error occurred: ${e.message}"
        } finally {
            // Close the database connection
            sql?.close()
        }
    }
}
