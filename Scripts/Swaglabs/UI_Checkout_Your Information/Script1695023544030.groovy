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

WebUI.click(findTestObject('Object Repository/Page_Swag Labs/Login Page/div_Accepted usernames arestandard_userlock_483a53'))

WebUI.setText(findTestObject('Object Repository/Page_Swag Labs/Login Page/input_Swag Labs_user-name'), 'standard_user')

WebUI.click(findTestObject('Object Repository/Page_Swag Labs/Login Page/div_Accepted usernames arestandard_userlock_0ab16f'))

WebUI.setEncryptedText(findTestObject('Object Repository/Page_Swag Labs/Login Page/input_Swag Labs_password'), 'qcu24s4901FyWDTwXGr6XA==')

WebUI.click(findTestObject('Object Repository/Page_Swag Labs/Login Page/input_Swag Labs_login-button'))

WebUI.click(findTestObject('Page_Swag Labs/Home Page/After Add to Cart/button_Add to cart'))

WebUI.click(findTestObject('Page_Swag Labs/Home Page/After Add to Cart/button_Add to cart_1'))

WebUI.click(findTestObject('Page_Swag Labs/Home Page/button_shopping_cart'))

WebUI.click(findTestObject('Page_Swag Labs/Cart Page/button_Checkout'))

import com.kms.katalon.core.webui.keyword.WebUiBuiltInKeywords as WebUI

def inputData = [
	['Page_Swag Labs/Checkout Page/input_Checkout Your Information_firstName', 'kemal'],
	['Page_Swag Labs/Checkout Page/input_Checkout Your Information_lastName', 'abdan'],
	['Page_Swag Labs/Checkout Page/input_Checkout Your Information_postalCode', '123']
]

for (def data : inputData) {
	def inputField = findTestObject(data[0])
	def expectedInput = data[1]

	WebUI.waitForElementClickable(inputField, 10)

	WebUI.setText(inputField, expectedInput)

	WebUI.verifyElementAttributeValue(inputField, 'value', expectedInput, 10)
}


