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
import org.openqa.selenium.Keys as Keys
import org.junit.After as After
import com.kms.katalon.core.testdata.InternalData as InternalData
import org.openqa.selenium.WebElement as WebELement
import com.kms.katalon.core.testobject.ConditionType as Conditiontype
import com.kms.katalon.core.testobject.SelectorMethod as Selectormethod

//================================================================================
//Capture
Mobile.delay(2)

Mobile.takeScreenshot('C:\\Users\\Mukin_ri\\Downloads\\Katalon_Studio_Windows_64-7.8.2\\Katalon_Studio_Windows_64-7.8.2\\Screenshot Onboarding\\List Favorite\\AddFavorite\\280521\\ID_AddFavoritte_1_1.png')


Mobile.tap(findTestObject('Object Repository/ID_Add Favourite/android.widget.ImageView (1)'), 0)

for (int i = 1; i < 7; i++) {
    //variabel productservice
    String produkservice = findTestData('Data Files/Data Favorite').getValue(1, i)

    //variabel beneficiary account
    String beneficiaryAccount = findTestData('Data Files/Data Favorite').getValue(2, i)

    //Variabel alias name
    String NamaAlias = findTestData('Data Files/Data Favorite').getValue(3, i)

    Mobile.tap(findTestObject('Object Repository/ID_Add Favourite/android.widget.TextView - Transfer MNC Bank'), 0)

    Mobile.tap(findTestObject('Object Repository/ID_Add Favourite/android.widget.TextView - Transfer MNC Bank (1)'), 0)

    Mobile.setText(findTestObject('Object Repository/ID_Add Favourite/android.widget.EditText - Masukan nomor rekening'), 
        beneficiaryAccount, 0)

    Mobile.setText(findTestObject('Object Repository/ID_Add Favourite/android.widget.EditText - Isi Alias Name'), NamaAlias, 
        0)

    if (beneficiaryAccount == '') {
        //================================================================================
        //Capture
        Mobile.delay(2)

        Mobile.takeScreenshot('C:\\Users\\Mukin_ri\\Downloads\\Katalon_Studio_Windows_64-7.8.2\\Katalon_Studio_Windows_64-7.8.2\\Screenshot Onboarding\\List Favorite\\AddFavorite\\280521\\ID_AddFavoritte_2_1.png')

        Mobile.tap(findTestObject('Object Repository/ID_Add Favourite/android.widget.Button - OK'), 0)

        //================================================================================
        //Capture
        Mobile.delay(2)

        Mobile.takeScreenshot('C:\\Users\\Mukin_ri\\Downloads\\Katalon_Studio_Windows_64-7.8.2\\Katalon_Studio_Windows_64-7.8.2\\Screenshot Onboarding\\List Favorite\\AddFavorite\\280521\\ID_AddFavoritte_2_2.png')

        Mobile.pressBack()

        Mobile.tap(findTestObject('Object Repository/ID_Add Favourite/android.widget.ImageView (1)'), 0) ;
		
    } else if (beneficiaryAccount == '20101000021107') {
        Mobile.delay(2)

        Mobile.takeScreenshot('C:\\Users\\Mukin_ri\\Downloads\\Katalon_Studio_Windows_64-7.8.2\\Katalon_Studio_Windows_64-7.8.2\\Screenshot Onboarding\\List Favorite\\AddFavorite\\280521\\ID_AddFavoritte_2_3.png')

        Mobile.tap(findTestObject('Object Repository/ID_Add Favourite/android.widget.Button - OK'), 0)

        Mobile.delay(2)

        Mobile.takeScreenshot('C:\\Users\\Mukin_ri\\Downloads\\Katalon_Studio_Windows_64-7.8.2\\Katalon_Studio_Windows_64-7.8.2\\Screenshot Onboarding\\List Favorite\\AddFavorite\\280521\\ID_AddFavoritte_2_4.png')

        Mobile.pressBack()

        Mobile.pressBack()

        Mobile.tap(findTestObject('Object Repository/ID_Add Favourite/android.widget.ImageView (1)'), 0)
		
    } else if (beneficiaryAccount == '201010000211075') {
        Mobile.delay(2)

        Mobile.takeScreenshot('C:\\Users\\Mukin_ri\\Downloads\\Katalon_Studio_Windows_64-7.8.2\\Katalon_Studio_Windows_64-7.8.2\\Screenshot Onboarding\\List Favorite\\AddFavorite\\280521\\ID_AddFavoritte_2_5.png')

        Mobile.tap(findTestObject('Object Repository/ID_Add Favourite/android.widget.Button - OK'), 0)

        Mobile.delay(2)

        Mobile.takeScreenshot('C:\\Users\\Mukin_ri\\Downloads\\Katalon_Studio_Windows_64-7.8.2\\Katalon_Studio_Windows_64-7.8.2\\Screenshot Onboarding\\List Favorite\\AddFavorite\\280521\\ID_AddFavoritte_2_6.png')

        Mobile.pressBack()

        Mobile.pressBack()

        Mobile.tap(findTestObject('Object Repository/ID_Add Favourite/android.widget.ImageView (1)'), 0)
		
    } else if (NamaAlias == '') {
        Mobile.delay(2)

        Mobile.takeScreenshot('C:\\Users\\Mukin_ri\\Downloads\\Katalon_Studio_Windows_64-7.8.2\\Katalon_Studio_Windows_64-7.8.2\\Screenshot Onboarding\\List Favorite\\AddFavorite\\280521\\ID_AddFavoritte_2_7.png')

        Mobile.tap(findTestObject('Object Repository/ID_Add Favourite/android.widget.Button - OK'), 0)

        Mobile.delay(2)

        Mobile.takeScreenshot('C:\\Users\\Mukin_ri\\Downloads\\Katalon_Studio_Windows_64-7.8.2\\Katalon_Studio_Windows_64-7.8.2\\Screenshot Onboarding\\List Favorite\\AddFavorite\\280521\\ID_AddFavoritte_2_8.png')

        Mobile.pressBack()

        Mobile.tap(findTestObject('Object Repository/ID_Add Favourite/android.widget.ImageView (1)'), 0)
		
    } else if (NamaAlias == 'Richard Nicolaus SKO') {
        Mobile.delay(2)

        Mobile.takeScreenshot('C:\\Users\\Mukin_ri\\Downloads\\Katalon_Studio_Windows_64-7.8.2\\Katalon_Studio_Windows_64-7.8.2\\Screenshot Onboarding\\List Favorite\\AddFavorite\\280521\\ID_AddFavoritte_2_9.png')

        Mobile.tap(findTestObject('Object Repository/ID_Add Favourite/android.widget.Button - OK'), 0)

        Mobile.delay(2)

        Mobile.takeScreenshot('C:\\Users\\Mukin_ri\\Downloads\\Katalon_Studio_Windows_64-7.8.2\\Katalon_Studio_Windows_64-7.8.2\\Screenshot Onboarding\\List Favorite\\AddFavorite\\280521\\ID_AddFavoritte_2_10.png')

        Mobile.pressBack()

        Mobile.tap(findTestObject('Object Repository/ID_Add Favourite/android.widget.ImageView (1)'), 0)
		
    } else {
        Mobile.delay(2)

        Mobile.takeScreenshot('C:\\Users\\Mukin_ri\\Downloads\\Katalon_Studio_Windows_64-7.8.2\\Katalon_Studio_Windows_64-7.8.2\\Screenshot Onboarding\\List Favorite\\AddFavorite\\280521\\ID_AddFavoritte_2_11.png')

        Mobile.tap(findTestObject('Object Repository/ID_Add Favourite/android.widget.Button - OK'), 0)

        Mobile.delay(2)

        Mobile.takeScreenshot('C:\\Users\\Mukin_ri\\Downloads\\Katalon_Studio_Windows_64-7.8.2\\Katalon_Studio_Windows_64-7.8.2\\Screenshot Onboarding\\List Favorite\\AddFavorite\\280521\\ID_AddFavoritte_2_12.png')

       	Mobile.tap(findTestObject('Object Repository/ID_Add Favourite/android.widget.Button - Tambah Favorit'), 0)
        
		Mobile.tap(findTestObject('Object Repository/ID_Add Favourite/android.widget.Button - Batal'), 0)
		
        Mobile.tap(findTestObject('Object Repository/ID_Add Favourite/android.widget.Button - Tambah Favorit'), 0)

        Mobile.delay(2)

        Mobile.takeScreenshot('C:\\Users\\Mukin_ri\\Downloads\\Katalon_Studio_Windows_64-7.8.2\\Katalon_Studio_Windows_64-7.8.2\\Screenshot Onboarding\\List Favorite\\AddFavorite\\280521\\ID_AddFavoritte_2_13.png')

        Mobile.tap(findTestObject('Object Repository/ID_Add Favourite/android.widget.Button - OK (2)'), 0)
    }
}

Mobile.tap(findTestObject('Object Repository/ID_Add Favourite/android.widget.TextView - Lihat semua'), 0)

//================================================================================
//Capture
Mobile.delay(2)

Mobile.takeScreenshot('C:\\Users\\Mukin_ri\\Downloads\\Katalon_Studio_Windows_64-7.8.2\\Katalon_Studio_Windows_64-7.8.2\\Screenshot Onboarding\\List Favorite\\AddFavorite\\280521\\ID_AddFavoritte_3_1.png')

Mobile.tap(findTestObject('Object Repository/ID_Add Favourite/android.widget.TextView - Pilih Semua'), 0)

//================================================================================
//Capture
Mobile.delay(2)

Mobile.takeScreenshot('C:\\Users\\Mukin_ri\\Downloads\\Katalon_Studio_Windows_64-7.8.2\\Katalon_Studio_Windows_64-7.8.2\\Screenshot Onboarding\\List Favorite\\AddFavorite\\280521\\ID_AddFavoritte_3_2.png')

Mobile.tap(findTestObject('Object Repository/ID_Add Favourite/android.widget.ImageView (3)'), 0)

Mobile.pressBack()

//Mobile.tap(findTestObject('Object Repository/ID_Add Favourite/android.widget.ImageView (1)'), 0)



