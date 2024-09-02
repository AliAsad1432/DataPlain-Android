package customKeywords

import com.kms.katalon.core.annotation.Keyword
import com.kms.katalon.core.mobile.keyword.MobileBuiltInKeywords as Mobile
import com.kms.katalon.core.testobject.TestObject
import com.kms.katalon.core.util.KeywordUtil

public class ScrollAndFind {

    @Keyword
    def scrollToElementAndTap(int maxSwipes) {
        boolean isVisible = false

        // Define the TestObject using the provided test object link
        TestObject signUpButton = new TestObject('SignUpButton')
        signUpButton.addProperty('class', com.kms.katalon.core.testobject.ConditionType.EQUALS, 'android.widget.Button')

        // Adjust swipe coordinates based on screen size (720x1600)
        int startX = 360  // Middle of the screen width
        int startY = 1200 // Slightly above the bottom of the screen height
        int endX = 360    // Same as startX to maintain vertical swipe
        int endY = 400    // Slightly above the middle of the screen height

        for (int i = 0; i < maxSwipes; i++) {
            try {
                isVisible = Mobile.verifyElementVisible(signUpButton, 5)
                if (isVisible) {
                    Mobile.tap(signUpButton, 10)
                    KeywordUtil.logInfo('Element found and tapped successfully.')
                    break
                }
            } catch (Exception e) {
                Mobile.swipe(startX, startY, endX, endY) // Perform the swipe action
                KeywordUtil.logInfo("Swiping screen... Attempt: " + (i + 1))
            }
        }

        if (!isVisible) {
            KeywordUtil.markFailed('Element not found after ' + maxSwipes + ' swipes.')
        }
    }
}
