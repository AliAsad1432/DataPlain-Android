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

String command = 'adb shell pm clear com.senarios.dataplain'

try {
    Runtime.getRuntime().exec(command)

    println('App data cleared and permissions revoked.')
}
catch (IOException e) {
    e.printStackTrace()
} 

Mobile.startExistingApplication('com.senarios.dataplain')

Mobile.tap(findTestObject('Auth/Sign in/android.widget.Button - ALLOW'), 0)

Mobile.tap(findTestObject('Object Repository/Auth/Sign in/android.widget.Button'), 0)

Mobile.setText(findTestObject('Object Repository/Auth/Sign in/android.widget.EditText'), 'tester20@yopmail.com', 0)

Mobile.pressBack()

Mobile.setText(findTestObject('Object Repository/Auth/Sign in/android.widget.EditText (1)'), 'Pakistan@1', 0)

Mobile.pressBack()

Mobile.tap(findTestObject('Object Repository/Auth/Sign in/android.widget.CheckBox'), 0)

Mobile.tap(findTestObject('Object Repository/Auth/Sign in/android.widget.Button (1)'), 0)

Mobile.delay(8, FailureHandling.STOP_ON_FAILURE)

Mobile.verifyElementExist(findTestObject('Auth/Sign in/n1/android.view.View'), 0)

Mobile.verifyElementExist(findTestObject('Auth/Sign in/n1/android.widget.ImageView'), 0)

Mobile.verifyElementExist(findTestObject('Object Repository/Teams Module/Positive/android.widget.ImageView'), 0)

Mobile.tap(findTestObject('Object Repository/Teams Module/Positive/android.widget.ImageView'), 0)

Mobile.verifyElementExist(findTestObject('Object Repository/Teams Module/Positive/android.widget.Button'), 0)

Mobile.tap(findTestObject('Object Repository/Teams Module/Positive/android.widget.Button'), 0)

Mobile.verifyElementExist(findTestObject('Object Repository/Teams Module/Positive/android.widget.EditText'), 0)

Mobile.setText(findTestObject('Object Repository/Teams Module/Positive/android.widget.EditText'), 'Dummy', 0)

Mobile.pressBack()

Mobile.verifyElementExist(findTestObject('Object Repository/Teams Module/Positive/android.widget.EditText (1)'), 0)

Mobile.setText(findTestObject('Teams Module/Positive/android.widget.EditText (1)'), 'Account', 0)

Mobile.pressBack()

Mobile.verifyElementExist(findTestObject('Object Repository/Teams Module/Positive/android.widget.EditText (2)'), 0)

Mobile.setText(findTestObject('Object Repository/Teams Module/Positive/android.widget.EditText (2)'), 'Dummy4@mail.com', 
    0)

Mobile.pressBack()

Mobile.verifyElementExist(findTestObject('Object Repository/Teams Module/Positive/android.widget.Button (1)'), 0)

Mobile.tap(findTestObject('Object Repository/Teams Module/Positive/android.widget.Button (1)'), 0)

Mobile.verifyElementExist(findTestObject('Object Repository/Teams Module/Positive/android.widget.Button (2)'), 0)

Mobile.tap(findTestObject('Object Repository/Teams Module/Positive/android.widget.Button (2)'), 0)

Mobile.verifyElementExist(findTestObject('Object Repository/Teams Module/Positive/android.widget.EditText (3)'), 0)

Mobile.setText(findTestObject('Object Repository/Teams Module/Positive/android.widget.EditText (3)'), '3640294845896', 0)

Mobile.pressBack()

Mobile.verifyElementExist(findTestObject('Object Repository/Teams Module/Positive/android.widget.EditText (4)'), 0)

Mobile.setText(findTestObject('Object Repository/Teams Module/Positive/android.widget.EditText (4)'), '923056666666', 0)

Mobile.pressBack()

Mobile.verifyElementExist(findTestObject('Object Repository/Teams Module/Positive/android.widget.Button (3)'), 0)

Mobile.tap(findTestObject('Object Repository/Teams Module/Positive/android.widget.Button (3)'), 0)

int xStart = 300

int yStart = 1000

int yEnd = yStart - 1200

String adbScrollUpCommand = "adb shell input swipe $xStart $yStart $xStart $yEnd"

Runtime.getRuntime().exec(adbScrollUpCommand)

Mobile.delay(1)

Mobile.verifyElementVisible(findTestObject('Object Repository/Teams Module/Positive/android.widget.Button (4)'), 0)

Mobile.tap(findTestObject('Teams Module/Positive/android.widget.Button (4)'), 0)

Mobile.verifyElementExist(findTestObject('Teams Module/Positive/android.widget.Button (5)'), 0)

Mobile.tap(findTestObject('Teams Module/Positive/android.widget.Button (5)'), 0)

Mobile.delay(2, FailureHandling.STOP_ON_FAILURE)

Mobile.verifyElementExist(findTestObject('Teams Module/Positive/android.widget.Button'), 0)

Mobile.delay(0.5, FailureHandling.STOP_ON_FAILURE)

Mobile.closeApplication()

