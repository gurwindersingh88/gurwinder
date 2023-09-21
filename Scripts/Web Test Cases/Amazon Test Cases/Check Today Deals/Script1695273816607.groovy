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

WebUI.openBrowser('')

WebUI.navigateToUrl('https://www.amazon.in/')

WebUI.click(findTestObject('Object Repository/Amazon Today Deals/Page_Online Shopping site in India Shop Onl_10c5f3/a_Todays Deals'))

WebUI.click(findTestObject('Object Repository/Amazon Today Deals/Page_Amazon.in - Todays Deals/img_All Deals_GridPresets-module__gridPrese_2ebf44'))

WebUI.click(findTestObject('Object Repository/Amazon Today Deals/Page_Amazon.in - Todays Deals/div_Branded Suitcase, Backpacks and Duffles_f5893e'))

WebUI.click(findTestObject('Object Repository/Amazon Today Deals/Page_Branded Suitcase, Backpacks and Duffle_79a5d2/a_Valex 28 Ltrs Laptop Backpack with Bottle_5c1892'))

WebUI.verifyElementPresent(findTestObject('Object Repository/Amazon Today Deals/Page_Buy American Tourister Valex 28 Ltrs L_bffab4/span_Deal of the Day'), 
    0)

WebUI.closeBrowser()

