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

Mobile.startApplication('C:\\Users\\kemdan\\Katalon Studio\\EduApp\\mobileappapk\\Shopee MY_v2.94.25.apk', true)

Mobile.tap(findTestObject('ShopeeMY/Button - OK'), 0)

Mobile.tap(findTestObject('ShopeeMY/Button - START'), 0)

Mobile.tap(findTestObject('Object Repository/ShopeeMY/Product Details/android.widget.TextView - Up to 95 OFF Deals  18 Coins Cashback'), 
    0)

Mobile.setText(findTestObject('Object Repository/ShopeeMY/Product Details/android.widget.EditText'), 'minyak goreng', 0)

Mobile.tap(findTestObject('Object Repository/ShopeeMY/Product Details/android.widget.TextView - minyak goreng'), 0)

Mobile.tap(findTestObject('Object Repository/ShopeeMY/Product Details/android.view.ViewGroup'), 0)

Mobile.scrollToText('Product Details')

Mobile.getText(findTestObject(''), 0)

Mobile.closeApplication()

