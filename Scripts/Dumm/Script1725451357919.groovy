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
import io.appium.java_client.TouchAction as TouchAction
import io.appium.java_client.touch.offset.PointOption as PointOption

Mobile.startExistingApplication('com.senarios.dataplain.dev')

Mobile.tap(findTestObject('Object Repository/Dummy/android.widget.Button'), 0)

String adbTapCommand = 'adb shell input tap 660 420'

Runtime.getRuntime().exec(adbTapCommand)

Mobile.delay(2)

Mobile.tap(findTestObject('Object Repository/Dummy/android.widget.Button (1)'), 0)

// Define the ADB command for scrolling up
String adbScrollUpCommand = "adb shell input swipe 300 1000 300 500"

// Execute the ADB command
Runtime.getRuntime().exec(adbScrollUpCommand)

// Wait for a few seconds to observe the scroll
Mobile.delay(2)

//// Define the ADB command for scrolling down
//String adbScrollDownCommand = "adb shell input swipe 300 500 300 1000"
//
//// Execute the ADB command
//Runtime.getRuntime().exec(adbScrollDownCommand)

// Wait for a few seconds to observe the scroll
Mobile.delay(2)



Mobile.closeApplication()

