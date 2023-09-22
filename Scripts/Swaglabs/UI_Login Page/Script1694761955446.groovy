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

WebUI.openBrowser('')

WebUI.navigateToUrl('https://www.saucedemo.com/')

WebUI.click(findTestObject('Object Repository/Page_Swag Labs/Login Page/input_Swag Labs_login-button'))

//negative
def testObjectsn1 = ['Page_Swag Labs/Login Page/negative/button_Epic sadface Username is required_error-button', 'Page_Swag Labs/Login Page/negative/div_Epic sadface Username is required'
    , 'Page_Swag Labs/Login Page/negative/h3_Epic sadface Username is required', 'Page_Swag Labs/Login Page/negative/svg_Swag Labs_svg-inline--fa fa-times-circle fa-w-16 error_icon']

for (def testObjectV : testObjectsn1) {
    try {
        WebUI.verifyElementVisible(findTestObject(testObjectV))

        println("Element '$testObjectV' is visible.")
    }
    catch (Exception e) {
        println("Element '$testObjectV' is NOT visible. Error: ${e.getMessage()}")
    } 
}

WebUI.verifyElementClickable(findTestObject('Page_Swag Labs/Login Page/negative/svg_Swag Labs_svg-inline--fa fa-times-circle fa-w-16 error_icon'))

//positive
def testObjectsp1 = ['Page_Swag Labs/Login Page/div_Swag Labs', 'Page_Swag Labs/Login Page/input_Swag Labs_user-name', 'Page_Swag Labs/Login Page/input_Swag Labs_password'
    , 'Page_Swag Labs/Login Page/input_Swag Labs_login-button']

for (def testObjectV : testObjectsp1) {
    try {
        WebUI.verifyElementVisible(findTestObject(testObjectV))

        println("Element '$testObjectV' is visible.")
    }
    catch (Exception e) {
        println("Element '$testObjectV' is NOT visible. Error: ${e.getMessage()}")
    } 
}

for (def testObjectC : testObjectsp1) {
    try {
        WebUI.verifyElementClickable(findTestObject(testObjectC))

        println("Element '$testObjectC' is clickable.")
    }
    catch (Exception e) {
        println("Element '$testObjectC' is NOT clickable. Error: ${e.getMessage()}")
    } 
}

