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
import com.kms.katalon.core.testobject.TestObject as TestObject
import com.kms.katalon.core.webservice.keyword.WSBuiltInKeywords as WS
import com.kms.katalon.core.webui.keyword.WebUiBuiltInKeywords as WebUI
import com.kms.katalon.core.windows.keyword.WindowsBuiltinKeywords as Windows
import internal.GlobalVariable as GlobalVariable

import org.junit.After as After
import org.openqa.selenium.Keys as Keys
import com.kms.katalon.core.testdata.InternalData as InternalData
import org.openqa.selenium.WebElement as WebELement
import com.kms.katalon.core.testobject.ConditionType as Conditiontype
import com.kms.katalon.core.testobject.SelectorMethod as Selectormethod

//================================================================================

String BillPasscode = 'Tes12345' //findTestData('Motion').getValue(1, 1) //'Tes12345'

//================================================================================

//Capture
Mobile.delay(2)
Mobile.takeScreenshot('/Users/lucyana/Workspace/Project_MNCB/AUTOMATION/Motion_MNCBank_Capture/Motion_Android/ID_Login_1.png')

//Klik button login
Mobile.tap(findTestObject('Motion_Android/Ad_Login/ID/android.widget.Button - Login_Awal'), 0)
Mobile.delay(5)

//Isi passcode
Mobile.tap(findTestObject('Motion_Android/Ad_Login/ID/android.widget.EditText - Masukan passcode'), 0)
Mobile.setText(findTestObject('Motion_Android/Ad_Login/ID/android.widget.EditText - Masukan passcode'), BillPasscode, 0)
Mobile.hideKeyboard()

//Capture
//Mobile.takeScreenshot('C:\\Users\\lucyana_lu\\Documents\\Task_Project\\Automate\\Motion_MNCBank_Capture\\Motion_Android\\Login_1.png')
//Capture
Mobile.delay(2)
Mobile.takeScreenshot('/Users/lucyana/Workspace/Project_MNCB/AUTOMATION/Motion_MNCBank_Capture/Motion_Android/ID_Login_2.png')

Mobile.tap(findTestObject('Motion_Android/Ad_Login/ID/android.widget.Button - Login'), 0)
Mobile.delay(10)

//Mobile.takeScreenshot('C:\\Users\\lucyana_lu\\Documents\\Task_Project\\Automate\\Motion_MNCBank_Capture\\Motion_Android\\Login_2.png')



