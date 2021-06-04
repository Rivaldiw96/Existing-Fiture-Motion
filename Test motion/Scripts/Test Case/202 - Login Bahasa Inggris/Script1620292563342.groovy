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
//Capture
	Mobile.delay(2)
	Mobile.takeScreenshot('C:\\Users\\Mukin_ri\\Downloads\\Katalon_Studio_Windows_64-7.8.2\\Katalon_Studio_Windows_64-7.8.2\\screenshot_NonPasscode.png')

Mobile.tap(findTestObject('Object Repository/Create Debit Card/Bahasa_CreateDebitCard/android.widget.ImageView'),0)

Mobile.tap(findTestObject('Object Repository/Create Debit Card/Bahasa_CreateDebitCard/android.widget.TextView - English'),0)
	
Mobile.tap(findTestObject('Object Repository/Change Debit Card PIN/android.widget.Button - Login'), 0)

Mobile.setText(findTestObject('Object Repository/Change Debit Card PIN/android.widget.EditText - Enter Passcode'), 'Nico2410',
	0)

//================================================================================
//Capture
	Mobile.delay(2)
	Mobile.takeScreenshot('C:\\Users\\Mukin_ri\\Downloads\\Katalon_Studio_Windows_64-7.8.2\\Katalon_Studio_Windows_64-7.8.2\\screenshot_PasscodeTerisi.png')

Mobile.tap(findTestObject('Object Repository/Change Debit Card PIN/android.widget.Button - Login (1)'), 0)