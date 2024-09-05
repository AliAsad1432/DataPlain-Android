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
String clearCacheCommand = 'adb shell pm clear ' + 'com.senarios.dataplain.dev'

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
    
    KeywordUtil.logInfo('Cache and storage cleared for package: ' + 'com.senarios.dataplain.dev')
}
catch (Exception e) {
    KeywordUtil.markFailed('Failed to clear cache and storage: ' + e.message)
} 

Mobile.startExistingApplication('com.senarios.dataplain.dev')

Mobile.tap(findTestObject('Auth/Sign in/android.widget.Button - ALLOW'), 0)

Mobile.tap(findTestObject('Object Repository/Auth/Sign in/android.widget.Button'), 0)

Mobile.setText(findTestObject('Object Repository/Auth/Sign in/android.widget.EditText'), 'Shahidkhan.com', 0)

Mobile.pressBack()

Mobile.setText(findTestObject('Auth/Sign in/n1/android.widget.EditText'), 'Sen@1234', 0)

Mobile.pressBack()

Mobile.tap(findTestObject('Auth/Sign in/n1/android.widget.CheckBox'), 0)

Mobile.tap(findTestObject('Auth/Sign in/n1/android.widget.Button'), 0)

Mobile.verifyElementExist(findTestObject('Auth/Extras/android.view.View'), 0)

Mobile.closeApplication()

//2

Mobile.startExistingApplication('com.senarios.dataplain.dev')

Mobile.tap(findTestObject('Object Repository/Auth/Sign in/android.widget.Button'), 0)

Mobile.setText(findTestObject('Object Repository/Auth/Sign in/android.widget.EditText'), 'Tahir@Gmail', 0)

Mobile.pressBack()

Mobile.setText(findTestObject('Auth/Sign in/n1/android.widget.EditText'), 'Sen@1234', 0)

Mobile.pressBack()

Mobile.tap(findTestObject('Auth/Sign in/n1/android.widget.CheckBox'), 0)

Mobile.tap(findTestObject('Auth/Sign in/n1/android.widget.Button'), 0)

Mobile.verifyElementExist(findTestObject('Auth/Extras/android.view.View'), 0)

Mobile.closeApplication()

//3

Mobile.startExistingApplication('com.senarios.dataplain.dev')

Mobile.tap(findTestObject('Object Repository/Auth/Sign in/android.widget.Button'), 0)

Mobile.setText(findTestObject('Object Repository/Auth/Sign in/android.widget.EditText'), 'Tester', 0)

Mobile.pressBack()

Mobile.setText(findTestObject('Auth/Sign in/n1/android.widget.EditText'), 'Sen@1234', 0)

Mobile.pressBack()

Mobile.tap(findTestObject('Auth/Sign in/n1/android.widget.CheckBox'), 0)

Mobile.tap(findTestObject('Auth/Sign in/n1/android.widget.Button'), 0)

Mobile.verifyElementExist(findTestObject('Auth/Extras/android.view.View'), 0)

Mobile.closeApplication()

//4

Mobile.startExistingApplication('com.senarios.dataplain.dev')

Mobile.tap(findTestObject('Object Repository/Auth/Sign in/android.widget.Button'), 0)

Mobile.setText(findTestObject('Object Repository/Auth/Sign in/android.widget.EditText'), 'Tester@.com', 0)

Mobile.pressBack()

Mobile.setText(findTestObject('Auth/Sign in/n1/android.widget.EditText'), 'Sen@1234', 0)

Mobile.pressBack()

Mobile.tap(findTestObject('Auth/Sign in/n1/android.widget.CheckBox'), 0)

Mobile.tap(findTestObject('Auth/Sign in/n1/android.widget.Button'), 0)

Mobile.verifyElementExist(findTestObject('Auth/Extras/android.view.View'), 0)

Mobile.closeApplication()

