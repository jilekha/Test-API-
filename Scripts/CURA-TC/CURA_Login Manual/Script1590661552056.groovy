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

WebUI.openBrowser('')

WebUI.deleteAllCookies()

WebUI.navigateToUrl('https://katalon-demo-cura.herokuapp.com/')

WebUI.click(findTestObject('CURA-OR/Make a Appointment'))

WebUI.setText(findTestObject('CURA-OR/CURA-UserName'), 'John Doe')

WebUI.setText(findTestObject('CURA-OR/CURA-PSW'), 'ThisIsNotAPassword')

WebUI.click(findTestObject('CURA-OR/CURA-Login'))

WebUI.selectOptionByValue(findTestObject('CURA-OR/CURA-Facility'), 'Tokyo CURA Healthcare Center', false)

WebUI.click(findTestObject('CURA-OR/CURA-Calender'))

WebUI.setText(findTestObject('CURA-OR/CURA-Date'), '14/05/2020')

WebUI.setText(findTestObject('CURA-OR/CURA-Comment'), 'Testing')

WebUI.click(findTestObject('CURA-OR/CURA-Book Appt'))

WebUI.click(findTestObject('CURA-OR/CURA-Toggle'))

WebUI.click(findTestObject('CURA-OR/CURA-Logout'))

WebUI.closeBrowser()

