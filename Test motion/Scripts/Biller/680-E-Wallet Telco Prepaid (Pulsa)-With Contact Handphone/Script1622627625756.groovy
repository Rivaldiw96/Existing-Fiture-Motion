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

Mobile.tap(findTestObject('Payment_Pulsa/android.widget.TextView - Payment'), 0)

Mobile.tap(findTestObject('Payment_Pulsa/android.widget-Button_Biller_Lainnya'), 0)

Mobile.tap(findTestObject('Payment_Pulsa/android.widget-Button_Pulsa'), 0)

Mobile.tap(findTestObject('Object Repository/Payment_Pulsa/android.widget-Button_phonebook'), 0)

Mobile.tap(findTestObject('Object Repository/Payment_Pulsa/android.widget-No_handphone'), 0)

//Mobile.setText(findTestObject('Payment_Pulsa/android.widget.EditText - Masukan Nomor Handphone'), '081234000001', 0)

Mobile.tap(findTestObject('Payment_Pulsa/android.widget.TextView - Pilih Nominal'), 0)

Mobile.tap(findTestObject('Payment_Pulsa/android.widget.TextView - IDR 50.000'), 0)

Mobile.tap(findTestObject('Payment_Pulsa/android.widget.TextView - Pilih Rekening'), 0)

Mobile.tap(findTestObject('Payment_Pulsa/android.widget.TextView - 206010001038802'), 0)

Mobile.tap(findTestObject('Object Repository/Payment_Pulsa/android.widget.Button - Lanjut_Pulsa'), 0)

Mobile.tap(findTestObject('Object Repository/Payment_Pulsa/android.widget.Button - Lanjut'), 0)

Mobile.setText(findTestObject('Payment_Pulsa/android.widget.EditText - Masukan PIN Transaksi'), '123456', 0)

Mobile.tap(findTestObject('Payment_Pulsa/android.widget.Button - OK'), 0)

Mobile.delay(2)

Mobile.tap(findTestObject('Payment_Pulsa/android.widget.LinearLayout (1)'), 0)

Mobile.tap(findTestObject('Payment_Pulsa/android.widget.TextView - Sedang Diproses'), 0)

Mobile.tap(findTestObject('Payment_Pulsa/android.widget.Button - OK (1)'), 0)

Mobile.delay(2)

Mobile.closeApplication()

