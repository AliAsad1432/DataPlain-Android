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
String packageName = 'com.senarios.dataplain.dev'

// Command to clear cache
String clearCacheCommand = 'adb shell pm clear ' + packageName

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
    
    KeywordUtil.logInfo('Cache and storage cleared for package: ' + packageName)
}
catch (Exception e) {
    KeywordUtil.markFailed('Failed to clear cache and storage: ' + e.message)
} 

// Start the application
Mobile.startExistingApplication(packageName)

// Perform initial actions
Mobile.tap(findTestObject('Auth/Sign in/android.widget.Button - ALLOW'), 0)

Mobile.tap(findTestObject('Object Repository/Auth/Sign in/android.widget.Button'), 0)

Mobile.tap(findTestObject('Object Repository/Auth/Sign Up/android.widget.Button'), 0)

// Delay to allow for transitions
//Mobile.delay(2, FailureHandling.STOP_ON_FAILURE)
//Mobile.scrollToText('Sign Up', FailureHandling.OPTIONAL)
//
//// Verify the element is visible and then tap it
//if (Mobile.verifyElementVisible(findTestObject('Auth/Sign Up/Ex/android.widget.Button'), 0, FailureHandling.STOP_ON_FAILURE)) {
//    Mobile.tap(findTestObject('Auth/Sign Up/Ex/android.widget.Button'), 0)
//} else {
//    KeywordUtil.markFailed('Element Sign Up/Ex/android.widget.Button is not visible.')
//}
Mobile.delay(0.5, FailureHandling.STOP_ON_FAILURE)

Mobile.tap(findTestObject('Object Repository/Auth/Sign Up/Negative/android.widget.EditText'), 0)

Mobile.pressBack()

Mobile.tap(findTestObject('Object Repository/Auth/Sign Up/Negative/android.widget.Button'), 0)

Mobile.verifyElementExist(findTestObject('Object Repository/Auth/Sign Up/Negative/android.view.View'), 0)

Mobile.verifyElementExist(findTestObject('Object Repository/Auth/Sign Up/Negative/android.view.View (1)'), 0)

Mobile.verifyElementExist(findTestObject('Object Repository/Auth/Sign Up/Negative/android.view.View (2)'), 0)

Mobile.verifyElementExist(findTestObject('Object Repository/Auth/Sign Up/Negative/android.view.View (3)'), 0)

Mobile.closeApplication()

