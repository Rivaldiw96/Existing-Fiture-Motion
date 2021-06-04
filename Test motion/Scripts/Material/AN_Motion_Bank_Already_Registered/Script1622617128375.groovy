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
import com.kms.katalon.core.testng.keyword.TestNGBuiltinKeywords as TestNGKW
import com.kms.katalon.core.testobject.TestObject as TestObject
import com.kms.katalon.core.webservice.keyword.WSBuiltInKeywords as WS
import com.kms.katalon.core.webui.keyword.WebUiBuiltInKeywords as WebUI
import com.kms.katalon.core.windows.keyword.WindowsBuiltinKeywords as Windows
import internal.GlobalVariable as GlobalVariable
import org.openqa.selenium.Keys as Keys

Mobile.scrollToText('lewati')

Mobile.tap(findTestObject('Already_Registered/android.widget.TextView - Lewati'), 0)

Mobile.tap(findTestObject('Already_Registered/android.widget.Button - Ya, saya sudah punya'), 0)

Mobile.setText(findTestObject('Already_Registered/android.widget.EditText - Masukan nomor kartu debitkredit'), No_Kartu, 
    0)

Mobile.tap(findTestObject('Already_Registered/android.widget.EditText - DDMMYYYY'), 0)

Mobile.tap(findTestObject('Already_Registered/android.widget.Button - Batal'), 0)

Mobile.setText(findTestObject('Already_Registered/android.widget.EditText - DDMMYYYY'), '27/12/1996', 0)

Mobile.setText(findTestObject('Already_Registered/android.widget.EditText - Cth 812 3456 7890'), '081336233017', 0)

Mobile.setText(findTestObject('Already_Registered/android.widget.EditText - Masukan alamat e-mail'), 'wijayantorivaldi@gmail.com', 
    0)

Mobile.tap(findTestObject('Already_Registered/android.widget.CheckBox - Saya menyetujui syarat dan ketentuan'), 0)

Mobile.scrollToText('yang akan diberitahukan oleh Bank kepada Nasabah sesuai dengan ketentuan perundang-undangan yang berlaku.')

Mobile.tap(findTestObject('Already_Registered/android.widget.Button - Setuju'), 0)

Mobile.hideKeyboard()

Mobile.tap(findTestObject('Already_Registered/android.widget.Button - Lanjut'), 0)

Mobile.setText(findTestObject('Already_Registered/android.widget.EditText - Masukan passcode'), 'Qwe12345', 0)

Mobile.tap(findTestObject('Already_Registered/android.widget.Button - Aktivasi'), 0)

Mobile.scrollToText('OTP')

for (int i=1; i<=6; i++)
{
	//Mobile.setText(findTestObject('Object Repository/Already_Registered/android.widget.EditText - OTP1 - Copy'),'1',0)
	Mobile.setText(findTestObject('Object Repository/Already_Registered/android.widget.EditText - OTP' + i + ''),'1',0)
}

Mobile.tap(findTestObject('Already_Registered/android.widget.Button - Lanjut (1)'), 0)

//Capture
Mobile.delay(2)

Mobile.takeScreenshot('/Users/wijayanto_ri/Katalon Stuido/Sc/ID_Registered.png')

