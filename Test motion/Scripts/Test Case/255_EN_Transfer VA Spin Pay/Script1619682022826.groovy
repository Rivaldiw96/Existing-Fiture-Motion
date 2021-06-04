import static com.kms.katalon.core.checkpoint.CheckpointFactory.findCheckpoint
import static com.kms.katalon.core.testcase.TestCaseFactory.findTestCase
import static com.kms.katalon.core.testdata.TestDataFactory.findTestData
import static com.kms.katalon.core.testobject.ObjectRepository.findTestObject
import static com.kms.katalon.core.testobject.ObjectRepository.findWindowsObject
import com.kms.katalon.core.checkpoint.Checkpoint as Checkpoint
import com.kms.katalon.core.cucumber.keyword.CucumberBuiltinKeywords as CucumberKW
import com.kms.katalon.core.mobile.keyword.MobileBuiltInKeywords as Mobile
import com.kms.katalon.core.mobile.keyword.internal.MobileAbstractKeyword
import com.kms.katalon.core.model.FailureHandling as FailureHandling
import com.kms.katalon.core.testcase.TestCase as TestCase
import com.kms.katalon.core.testdata.TestData as TestData
import com.kms.katalon.core.testobject.TestObject as TestObject
import com.kms.katalon.core.webservice.keyword.WSBuiltInKeywords as WS
import com.kms.katalon.core.webui.keyword.WebUiBuiltInKeywords as WebUI
import com.kms.katalon.core.windows.keyword.WindowsBuiltinKeywords as Windows
import internal.GlobalVariable as GlobalVariable

import org.openqa.selenium.Keys as Keys
import org.junit.After as After
import org.openqa.selenium.Keys as Keys
import com.kms.katalon.core.testdata.InternalData as InternalData
import org.openqa.selenium.WebElement as WebELement
import com.kms.katalon.core.testobject.ConditionType as Conditiontype
import com.kms.katalon.core.testobject.SelectorMethod as Selectormethod

//================================================================================
//Capture
/*
 * Mobile.delay(2) Mobile.takeScreenshot('C:\\Users\\Mukin_ri\\Downloads\\
 * Katalon_Studio_Windows_64-7.8.2\\Katalon_Studio_Windows_64-7.8.2\\
 * EN_TransferVASpin_1_A.png')
 * 
 * Mobile.tap(findTestObject('Object Repository/EN_Transfer VA Spin
 * Pay/android.widget.ImageView'), 0) Mobile.tap(findTestObject('Object
 * Repository/EN_Transfer VA Spin Pay/android.widget.TextView - MNC Virtual
 * Account'), 0)
 * 
 * Mobile.tap(findTestObject('Object Repository/EN_Transfer VA Spin
 * Pay/android.widget.TextView - 288010000009292'),0)
 * Mobile.setText(findTestObject('Object Repository/EN_Transfer VA Spin
 * Pay/android.widget.EditText - Enter virtual account number'),0, 0)
 */
	
for (x = 1 ; x >= 1 ; x++) {
	
	String Type = findTestData('Transfer VA SPIN').getValue(1, x)
	String RekeningSumber = findTestData('Transfer VA SPIN').getValue(2, x)
	String NoVirtualAccount = findTestData('Transfer VA SPIN').getValue(3, x)
	String PINTransaksi = findTestData('Transfer VA SPIN').getValue(4, x)
	
	
	//Capture
	Mobile.delay(2)
	Mobile.takeScreenshot('C:\\Users\\Mukin_ri\\Downloads\\Katalon_Studio_Windows_64-7.8.2\\Katalon_Studio_Windows_64-7.8.2\\EN_TransferMNCVirtualAccount' + x + '.1.png')
	
	//Tap menu Transfer
	Mobile.tap(findTestObject('Object Repository/EN_Transfer VA Spin Pay/android.widget.ImageView (2)'), 0)
	
	//Tap sub menu Transfer Antar Bank
	Mobile.tap(findTestObject('Object Repository/EN_Transfer VA Spin Pay/android.widget.TextView - MNC Virtual Account'), 0)
	
	//Pilih Rekening Sumber
	Mobile.tap(findTestObject('Object Repository/EN_Transfer VA Spin Pay/android.widget.TextView - Select Account'), 0)
	
	if (RekeningSumber == '') {
		
		Mobile.pressBack()
		
	} 
	else {
		
		Mobile.tap(findTestObject('Object Repository/EN_Transfer VA Spin Pay/android.widget.TextView - ' + RekeningSumber + ''), 0)
		
	}
	
	//Isi field No Virtual Account
	Mobile.setText(findTestObject('Object Repository/EN_Transfer VA Spin Pay/android.widget.EditText - Enter virtual account number'), NoVirtualAccount, 0)
	
	//Capture
	Mobile.delay(2)
	Mobile.takeScreenshot('C:\\Users\\Mukin_ri\\Downloads\\Katalon_Studio_Windows_64-7.8.2\\Katalon_Studio_Windows_64-7.8.2\\EN_TransferMNCVirtualAccount_' + x + '.2.png')
	
	//Tap button Lanjut
	//Mobile.tap(findTestObject('Object Repository/Motion_Android/Ad_Transfer/MNCVirtualAccount/EN/android.widget.Button - Next'), 0)
	
	//Buat kondisi ketika
	if (RekeningSumber == '') {
		
		//Capture
		Mobile.delay(2)
		Mobile.takeScreenshot('C:\\Users\\Mukin_ri\\Downloads\\Katalon_Studio_Windows_64-7.8.2\\Katalon_Studio_Windows_64-7.8.2\\EN_TransferMNCVirtualAccount_' + x + '.3.png')
		
		Mobile.pressBack()
		
	} else if (NoVirtualAccount == '') {
		
		//Capture
		Mobile.delay(2)
		Mobile.takeScreenshot('C:\\Users\\Mukin_ri\\Downloads\\Katalon_Studio_Windows_64-7.8.2\\Katalon_Studio_Windows_64-7.8.2\\EN_TransferMNCVirtualAccount_' + x + '.3.png')
		
		Mobile.pressBack()
		
	} else if (NoVirtualAccount == '1234567890') {
		
		//Capture
		Mobile.delay(5)
		Mobile.takeScreenshot('C:\\Users\\Mukin_ri\\Downloads\\Katalon_Studio_Windows_64-7.8.2\\Katalon_Studio_Windows_64-7.8.2\\EN_TransferMNCVirtualAccount_' + x + '.3.png')
		
		Mobile.pressBack()
		
	} else if (NoVirtualAccount == '70000012345678') {
	
	
			//Tap button Lanjut
		Mobile.tap(findTestObject('Object Repository/EN_Transfer VA Spin Pay/android.widget.Button - Next'), 0)
		
		//Capture
		Mobile.delay(2)
		Mobile.takeScreenshot('C:\\Users\\Mukin_ri\\Downloads\\Katalon_Studio_Windows_64-7.8.2\\Katalon_Studio_Windows_64-7.8.2\\EN_TransferMNCVirtualAccount_' + x + '.3.png')
		
		//Tap button OK
		Mobile.tap(findTestObject('Object Repository/EN_Transfer VA Spin Pay/android.widget.Button - OK'), 0)
		
		Mobile.pressBack()
		
	} 
	else {
		
		Mobile.tap(findTestObject('Object Repository/EN_Transfer VA Spin Pay/android.widget.Button - Next (1)'), 0)
		
		//Capture
		Mobile.delay(2)
		Mobile.takeScreenshot('C:\\Users\\Mukin_ri\\Downloads\\Katalon_Studio_Windows_64-7.8.2\\Katalon_Studio_Windows_64-7.8.2\\EN_TransferMNCVirtualAccount_' + x + '.3.png')
		
		Mobile.pressBack()
		Mobile.pressBack()
		
	}
}

