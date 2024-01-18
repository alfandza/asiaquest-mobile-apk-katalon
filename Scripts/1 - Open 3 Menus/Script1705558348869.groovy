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

CustomKeywords.'appRelease.keyword.firstOpenApp'()

Mobile.comment('Change to Search menu')

Mobile.delay(3)

Mobile.tap(findTestObject('Object Repository/Main Page/android.widget.ImageView (1)'), 0)

Mobile.verifyElementExist(findTestObject('Object Repository/Main Page/android.widget.EditText'), 0)

Mobile.verifyElementExist(findTestObject('Object Repository/Main Page/android.widget.ImageView (3)'), 0)

Mobile.comment('Change to Watchlist menu')

Mobile.delay(3)

Mobile.tap(findTestObject('Object Repository/Main Page/android.widget.ImageView (2)'), 0)

Mobile.verifyElementExist(findTestObject('Object Repository/Main Page/android.view.View (1)'), 0)

Mobile.comment('Return to Home menu')

Mobile.delay(3)

Mobile.tap(findTestObject('Object Repository/Main Page/android.widget.ImageView'), 0)

Mobile.verifyElementExist(findTestObject('Object Repository/Main Page/android.view.View'), 0)

Mobile.closeApplication()