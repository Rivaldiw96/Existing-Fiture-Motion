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

//Mobile.startApplication('C:\\Users\\Mukin_ri\\Downloads\\motion-debit_card_management-dev-automation-rev6.apk', true)

//================================================================================
//Capture
	Mobile.delay(2)
	Mobile.takeScreenshot('C:\\Users\\Mukin_ri\\Downloads\\Katalon_Studio_Windows_64-7.8.2\\Katalon_Studio_Windows_64-7.8.2\\ID_AddFavorite_Login_1.png')
	
Mobile.tap(findTestObject('Object Repository/ID_Add Favourite/android.widget.ImageView'), 0)

Mobile.tap(findTestObject('Object Repository/ID_Add Favourite/android.widget.TextView - Indonesia'), 0)

//================================================================================
//Capture
	Mobile.delay(2)
	Mobile.takeScreenshot('C:\\Users\\Mukin_ri\\Downloads\\Katalon_Studio_Windows_64-7.8.2\\Katalon_Studio_Windows_64-7.8.2\\ID_AddFavorite_Login_2.png')

//================================================================================
//Capture
	Mobile.delay(2)
	Mobile.takeScreenshot('C:\\Users\\Mukin_ri\\Downloads\\Katalon_Studio_Windows_64-7.8.2\\Katalon_Studio_Windows_64-7.8.2\\ID_AddFavorite_Login_3.png')

Mobile.tap(findTestObject('Object Repository/ID_Add Favourite/android.widget.Button - Login'), 0)

Mobile.setText(findTestObject('Object Repository/ID_Add Favourite/android.widget.EditText - Masukan passcode'),
	'Nico2410', 0)

Mobile.tap(findTestObject('Object Repository/ID_Add Favourite/android.widget.Button - Login (1)'),	0)

//================================================================================
//Capture
	Mobile.delay(2)
	Mobile.takeScreenshot('C:\\Users\\Mukin_ri\\Downloads\\Katalon_Studio_Windows_64-7.8.2\\Katalon_Studio_Windows_64-7.8.2\\AddFavorite_Login_4.png')
//Mobile.closeApplication()

