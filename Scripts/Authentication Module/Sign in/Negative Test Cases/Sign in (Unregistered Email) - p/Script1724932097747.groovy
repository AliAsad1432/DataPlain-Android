import com.kms.katalon.core.util.KeywordUtil as KeywordUtil
import com.kms.katalon.core.mobile.keyword.MobileBuiltInKeywords as Mobile
import java.io.BufferedReader
import java.io.InputStreamReader

Mobile.startExistingApplication('com.senarios.dataplain')

// Perform your actions here
Mobile.tap(findTestObject('Object Repository/Sign in/android.widget.Button - ALLOW'), 0)
Mobile.tap(findTestObject('Object Repository/Sign in/android.widget.Button'), 0)
Mobile.setText(findTestObject('Object Repository/Sign in/android.widget.EditText'), 'tester24@yopmail.com', 0)
Mobile.pressBack()
Mobile.setText(findTestObject('Object Repository/Sign in/android.widget.EditText (1)'), 'Sen@12341', 0)
Mobile.pressBack()
Mobile.tap(findTestObject('Object Repository/Sign in/android.widget.CheckBox'), 0)

// Tap the button that triggers the toast message
Mobile.tap(findTestObject('Object Repository/Sign in/android.widget.Button (1)'), 0)

// Wait for the toast message to appear
Mobile.delay(3)  // Increased delay to allow the toast to show

// Close the application
Mobile.closeApplication()
