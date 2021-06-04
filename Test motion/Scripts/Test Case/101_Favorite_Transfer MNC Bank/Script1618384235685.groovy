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
import org.openqa.selenium.Keys as Keys
import com.kms.katalon.core.testdata.InternalData as InternalData
import org.openqa.selenium.WebElement as WebELement
import com.kms.katalon.core.testobject.ConditionType as Conditiontype
import com.kms.katalon.core.testobject.SelectorMethod as Selectormethod

//================================================================================
//Capture
	Mobile.delay(2)
	Mobile.takeScreenshot('C:\\Users\\Mukin_ri\\Downloads\\Katalon_Studio_Windows_64-7.8.2\\Katalon_Studio_Windows_64-7.8.2\\Screenshot Onboarding\\List Favorite\\AddFavorite\\280521\\EN_AddFavoritte_1_1.png')

//Mobile.tap(findTestObject('Object Repository/EN_Add Favourite/android.widget.TextView - See all'), 0)

//================================================================================
//Capture
	//Mobile.delay(2)
	//Mobile.takeScreenshot('C:\\Users\\Mukin_ri\\Downloads\\Katalon_Studio_Windows_64-7.8.2\\Katalon_Studio_Windows_64-7.8.2\\EN_AddFavoritte_1_2.png')

//Mobile.tap(findTestObject('Object Repository/EN_Add Favourite/android.widget.TextView - Select All'), 0)
//================================================================================
//Capture
	//Mobile.delay(2)
	//Mobile.takeScreenshot('C:\\Users\\Mukin_ri\\Downloads\\Katalon_Studio_Windows_64-7.8.2\\Katalon_Studio_Windows_64-7.8.2\\EN_AddFavoritte_1_3.png')
//Mobile.tap(findTestObject('Object Repository/EN_Add Favourite/android.widget.Button - Remove'), 0)

/* Mobile.tap(findTestObject('null'), 0) */

Mobile.pressBack()

Mobile.tap(findTestObject('Object Repository/EN_Add Favourite/android.widget.ImageView (1)'), 0)

//variabel productservice
//String produkservice = findTestData('Data Files/Data Favorite').getValue(1, i);
//Mobile.getText(findTestObject('Object Repository/EN_Add Favourite/android.widget.TextView - Transfer MNC Bank'),produkservice, 0);


for (int i = 1; i < 7; i++) {
	//variabel productservice
	String produkservice = findTestData('Data Files/Data Favorite').getValue(1, i);
	
	//variabel beneficiary account
	String beneficiaryAccount = findTestData('Data Files/Data Favorite').getValue(2,i);
	
	//Variabel alias name
	String NamaAlias = findTestData('Data Files/Data Favorite').getValue(3, i);
	
	Mobile.tap(findTestObject('Object Repository/EN_Add Favourite/android.widget.TextView - Transfer MNC Bank'), 0)
	Mobile.tap(findTestObject('Object Repository/EN_Add Favourite/android.widget.TextView - MNC Bank Transfer'), 0)
	Mobile.setText(findTestObject('Object Repository/EN_Add Favourite/android.widget.EditText - Enter account number'), beneficiaryAccount, 0)
	//Mobile.clearText(findTestObject('Object Repository/EN_Add Favourite/android.widget.EditText - Fill Alias Name'), 0)
	Mobile.setText(findTestObject('Object Repository/EN_Add Favourite/android.widget.EditText - Fill Alias Name (1)'), NamaAlias, 0)
	
	  //if (produkservice == 'MNC Bank Transfer') {
	  //===========================================================================
	  //Capture Mobile(2)
	  //Mobile.delay(2)
	  //Mobile.takeScreenshot('C:\\Users\\Mukin_ri\\Downloads\\Katalon_Studio_Windows_64-7.8.2\\Katalon_Studio_Windows_64-7.8.2\\EN_AddFavoritte_2_1.png')
	  
	  //Mobile.tap(findTestObject('Object Repository/EN_AddFavourite/android.widget.ImageView (1)'), 0); 
	  
	  //}
	 
	if ((beneficiaryAccount == '')) {
		//================================================================================
		//Capture
			Mobile.delay(2)
			Mobile.takeScreenshot('C:\\Users\\Mukin_ri\\Downloads\\Katalon_Studio_Windows_64-7.8.2\\Katalon_Studio_Windows_64-7.8.2\\Screenshot Onboarding\\List Favorite\\AddFavorite\\280521\\EN_AddFavoritte_2_1.png')
		
			Mobile.tap(findTestObject('Object Repository/EN_Add Favourite/android.widget.Button - OK'),0);
			//================================================================================
			//Capture
				Mobile.delay(2)
				Mobile.takeScreenshot('C:\\Users\\Mukin_ri\\Downloads\\Katalon_Studio_Windows_64-7.8.2\\Katalon_Studio_Windows_64-7.8.2\\Screenshot Onboarding\\List Favorite\\AddFavorite\\280521\\EN_AddFavoritte_2_2.png')
			Mobile.pressBack();
			Mobile.tap(findTestObject('Object Repository/EN_Add Favourite/android.widget.ImageView (1)'), 0);
	}
	
	else if ((beneficiaryAccount == '20101000021107')) {
		//================================================================================
		//Capture
			Mobile.delay(2)
			Mobile.takeScreenshot('C:\\Users\\Mukin_ri\\Downloads\\Katalon_Studio_Windows_64-7.8.2\\Katalon_Studio_Windows_64-7.8.2\\Screenshot Onboarding\\List Favorite\\AddFavorite\\280521\\EN_AddFavoritte_2_3.png')
		
			Mobile.tap(findTestObject('Object Repository/EN_Add Favourite/android.widget.Button - OK'),0);
			//================================================================================
			//Capture
				Mobile.delay(2)
				Mobile.takeScreenshot('C:\\Users\\Mukin_ri\\Downloads\\Katalon_Studio_Windows_64-7.8.2\\Katalon_Studio_Windows_64-7.8.2\\Screenshot Onboarding\\List Favorite\\AddFavorite\\280521\\EN_AddFavoritte_2_4.png')
			
			Mobile.pressBack();
			Mobile.pressBack();
			Mobile.tap(findTestObject('Object Repository/EN_Add Favourite/android.widget.ImageView (1)'), 0);
	}
	
	else if ((beneficiaryAccount == '201010000211075')) {
		//================================================================================
		//Capture
			Mobile.delay(2)
			Mobile.takeScreenshot('C:\\Users\\Mukin_ri\\Downloads\\Katalon_Studio_Windows_64-7.8.2\\Katalon_Studio_Windows_64-7.8.2\\Screenshot Onboarding\\List Favorite\\AddFavorite\\280521\\EN_AddFavoritte_2_5.png')
		
			Mobile.tap(findTestObject('Object Repository/EN_Add Favourite/android.widget.Button - OK'),0);
			//Mobile.clearText(findTestObject('Object Repository/EN_Add Favourite/android.widget.EditText - Fill Alias Name (1)'), 0);
			//================================================================================
			//Capture
				Mobile.delay(2)
				Mobile.takeScreenshot('C:\\Users\\Mukin_ri\\Downloads\\Katalon_Studio_Windows_64-7.8.2\\Katalon_Studio_Windows_64-7.8.2\\Screenshot Onboarding\\List Favorite\\AddFavorite\\280521\\EN_AddFavoritte_2_6.png')
			Mobile.pressBack();
			Mobile.pressBack();
			Mobile.tap(findTestObject('Object Repository/EN_Add Favourite/android.widget.ImageView (1)'), 0);
	}
	
	else if ((NamaAlias == '')) {
		//================================================================================
		//Capture
			Mobile.delay(2)
			Mobile.takeScreenshot('C:\\Users\\Mukin_ri\\Downloads\\Katalon_Studio_Windows_64-7.8.2\\Katalon_Studio_Windows_64-7.8.2\\Screenshot Onboarding\\List Favorite\\AddFavorite\\280521\\EN_AddFavoritte_2_7.png')
		
			Mobile.tap(findTestObject('Object Repository/EN_Add Favourite/android.widget.Button - OK'),0);
			//Mobile.clearText(findTestObject('Object Repository/EN_Add Favourite/android.widget.EditText - Fill Alias Name (1)'), 0);
			//================================================================================
			//Capture
				Mobile.delay(2)
				Mobile.takeScreenshot('C:\\Users\\Mukin_ri\\Downloads\\Katalon_Studio_Windows_64-7.8.2\\Katalon_Studio_Windows_64-7.8.2\\Screenshot Onboarding\\List Favorite\\AddFavorite\\280521\\EN_AddFavoritte_2_8.png')
			
				Mobile.pressBack();
			
			Mobile.tap(findTestObject('Object Repository/EN_Add Favourite/android.widget.ImageView (1)'), 0);
	}
	
	else if ((NamaAlias == 'Richard Nicolaus SKO')) {
		//================================================================================
		//Capture
			Mobile.delay(2)
			Mobile.takeScreenshot('C:\\Users\\Mukin_ri\\Downloads\\Katalon_Studio_Windows_64-7.8.2\\Katalon_Studio_Windows_64-7.8.2\\Screenshot Onboarding\\List Favorite\\AddFavorite\\280521\\EN_AddFavoritte_2_9.png')
		
			Mobile.tap(findTestObject('Object Repository/EN_Add Favourite/android.widget.Button - OK'),0);
			//Mobile.clearText(findTestObject('Object Repository/EN_Add Favourite/android.widget.EditText - Fill Alias Name (1)'), 0)
			//================================================================================
			//Capture
				Mobile.delay(2)
				Mobile.takeScreenshot('C:\\Users\\Mukin_ri\\Downloads\\Katalon_Studio_Windows_64-7.8.2\\Katalon_Studio_Windows_64-7.8.2\\Screenshot Onboarding\\List Favorite\\AddFavorite\\280521\\EN_AddFavoritte_2_10.png')
			
			Mobile.pressBack();
			
			Mobile.tap(findTestObject('Object Repository/EN_Add Favourite/android.widget.ImageView (1)'), 0);
	}
	
	/*
	 * else if ((NamaAlias == 'Richard Nicolaus SKOP')) {
	 * //===========================================================================
	 * ===== //Capture Mobile.delay(2)
	 * Mobile.takeScreenshot('C:\\Users\\Mukin_ri\\Downloads\\
	 * Katalon_Studio_Windows_64-7.8.2\\Katalon_Studio_Windows_64-7.8.2\\
	 * EN_AddFavoritte_2_9.png')
	 * 
	 * Mobile.tap(findTestObject('Object Repository/EN_Add
	 * Favourite/android.widget.Button - OK'),0);
	 * //Mobile.clearText(findTestObject('Object Repository/EN_Add
	 * Favourite/android.widget.EditText - Fill Alias Name (1)'), 0)
	 * Mobile.pressBack(); Mobile.tap(findTestObject('Object Repository/EN_Add
	 * Favourite/android.widget.ImageView (1)'), 0); }
	 */
	
	else {
		//================================================================================
		//Capture
			Mobile.delay(2)
			Mobile.takeScreenshot('C:\\Users\\Mukin_ri\\Downloads\\Katalon_Studio_Windows_64-7.8.2\\Katalon_Studio_Windows_64-7.8.2\\Screenshot Onboarding\\List Favorite\\AddFavorite\\280521\\EN_AddFavoritte_2_11.png')
			
			Mobile.tap(findTestObject('Object Repository/EN_Add Favourite/android.widget.Button - OK'),0);
			//================================================================================
			//Capture
				Mobile.delay(2)
				Mobile.takeScreenshot('C:\\Users\\Mukin_ri\\Downloads\\Katalon_Studio_Windows_64-7.8.2\\Katalon_Studio_Windows_64-7.8.2\\Screenshot Onboarding\\List Favorite\\AddFavorite\\280521\\EN_AddFavoritte_2_12.png')
			Mobile.tap(findTestObject('Object Repository/EN_Add Favourite/android.widget.Button - Add Favorite'), 0)
			
			//================================================================================
			//Capture
				Mobile.delay(2)
				Mobile.takeScreenshot('C:\\Users\\Mukin_ri\\Downloads\\Katalon_Studio_Windows_64-7.8.2\\Katalon_Studio_Windows_64-7.8.2\\Screenshot Onboarding\\List Favorite\\AddFavorite\\280521\\EN_AddFavoritte_2_13.png')
			
			Mobile.tap(findTestObject('Object Repository/EN_Add Favourite/android.widget.Button - Cancel'),0)
			Mobile.tap(findTestObject('Object Repository/EN_Add Favourite/android.widget.Button - Add Favorite'), 0)
			//================================================================================
			//Capture
				Mobile.delay(2)
				Mobile.takeScreenshot('C:\\Users\\Mukin_ri\\Downloads\\Katalon_Studio_Windows_64-7.8.2\\Katalon_Studio_Windows_64-7.8.2\\Screenshot Onboarding\\List Favorite\\AddFavorite\\280521\\EN_AddFavoritte_2_14.png')
			Mobile.tap(findTestObject('Object Repository/EN_Add Favourite/android.widget.Button - OK (2)'),0);
			//Mobile.pressBack();
			//Mobile.tap(findTestObject('Object Repository/EN_Add Favourite/android.widget.ImageView (1)'), 0);
		
	}
		
}


//Mobile.tap(findTestObject('Object Repository/EN_Add Favourite/android.widget.ImageView (2)'), 0)

Mobile.tap(findTestObject('Object Repository/EN_Add Favourite/android.widget.TextView - See all'), 0)

//================================================================================
//Capture
	Mobile.delay(2)
	Mobile.takeScreenshot('C:\\Users\\Mukin_ri\\Downloads\\Katalon_Studio_Windows_64-7.8.2\\Katalon_Studio_Windows_64-7.8.2\\Screenshot Onboarding\\List Favorite\\AddFavorite\\280521\\EN_AddFavoritte_3_1.png')

Mobile.tap(findTestObject('Object Repository/EN_Add Favourite/android.widget.TextView - Select All'), 0)
//================================================================================
//Capture
	Mobile.delay(2)
	Mobile.takeScreenshot('C:\\Users\\Mukin_ri\\Downloads\\Katalon_Studio_Windows_64-7.8.2\\Katalon_Studio_Windows_64-7.8.2\\Screenshot Onboarding\\List Favorite\\AddFavorite\\280521\\EN_AddFavoritte_3_2.png')
//Mobile.tap(findTestObject('Object Repository/EN_Add Favourite/android.widget.Button - Remove'), 0)

/* Mobile.tap(findTestObject('null'), 0) */

Mobile.pressBack()

//Mobile.closeApplication()

