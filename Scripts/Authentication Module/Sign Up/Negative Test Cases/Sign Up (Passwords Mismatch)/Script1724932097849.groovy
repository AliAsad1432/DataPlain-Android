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
import com.kms.katalon.core.util.KeywordUtil as KeywordUtil

// Replace 'your.package.name' with the actual package name of your application
String packageName = 'com.senarios.dataplain'

// Command to clear cache
String clearCacheCommand = 'adb shell pm clear ' + 'com.senarios.dataplain'

try {
    // Execute the command to clear cache and storage
    def process = Runtime.getRuntime().exec(clearCacheCommand)

    process.waitFor()

    // Log the output
    def output = process.getInputStream().text

    def error = process.getErrorStream().text

    if (output) {
        KeywordUtil.logInfo('Output: ' + output)
    }
    
    if (error) {
        KeywordUtil.logWarning('Error: ' + error)
    }
    
    KeywordUtil.logInfo('Cache and storage cleared for package: ' + 'com.senarios.dataplain')
}
catch (Exception e) {
    KeywordUtil.markFailed('Failed to clear cache and storage: ' + e.message)
} 

Mobile.startExistingApplication('com.senarios.dataplain')

Mobile.tap(findTestObject('Auth/Sign in/android.widget.Button - ALLOW'), 0)

Mobile.tap(findTestObject('Object Repository/Auth/Sign in/android.widget.Button'), 0)

Mobile.tap(findTestObject('Object Repository/Auth/Sign Up/android.widget.Button'), 0)

Mobile.delay(0.5, FailureHandling.STOP_ON_FAILURE)

Mobile.setText(findTestObject('Auth/Sign Up/Ex/android.widget.EditText'), 'Testing', 0)

Mobile.setText(findTestObject('Object Repository/Auth/Sign Up/android.widget.EditText (1)'), 'Account', 0)

Mobile.pressBack()

Mobile.setText(findTestObject('Object Repository/Auth/Sign Up/android.widget.EditText (2)'), 'testingaccount4@yopmail.com', 0)

Mobile.pressBack()

Mobile.setText(findTestObject('Object Repository/Auth/Sign Up/android.widget.EditText (3)'), 'Pakistan@1', 0)

Mobile.pressBack()

Mobile.setText(findTestObject('Object Repository/Auth/Sign Up/android.widget.EditText (4)'), 'Pakistan@12', 0)

Mobile.pressBack()

Mobile.tap(findTestObject('Object Repository/Auth/Sign Up/android.widget.Button (1)'), 0)

Mobile.verifyElementExist(findTestObject('Auth/Sign Up/Negative/android.view.View (4)'), 0)

Mobile.closeApplication()

