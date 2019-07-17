import static com.kms.katalon.core.checkpoint.CheckpointFactory.findCheckpoint
import static com.kms.katalon.core.testcase.TestCaseFactory.findTestCase
import static com.kms.katalon.core.testdata.TestDataFactory.findTestData
import static com.kms.katalon.core.testobject.ObjectRepository.findTestObject
import com.kms.katalon.core.checkpoint.Checkpoint as Checkpoint
import com.kms.katalon.core.cucumber.keyword.CucumberBuiltinKeywords as CucumberKW
import com.kms.katalon.core.mobile.keyword.MobileBuiltInKeywords as Mobile
import com.kms.katalon.core.model.FailureHandling as FailureHandling
import com.kms.katalon.core.testcase.TestCase as TestCase
import com.kms.katalon.core.testdata.TestData as TestData
import com.kms.katalon.core.testobject.TestObject as TestObject
import com.kms.katalon.core.webservice.keyword.WSBuiltInKeywords as WS
import com.kms.katalon.core.webui.keyword.WebUiBuiltInKeywords as WebUI
import internal.GlobalVariable as GlobalVariable

WebUI.openBrowser('')

WebUI.navigateToUrl('https://wb.fynd.com/signin')

WebUI.setText(findTestObject('Object Repository/Page_Workbench - Data and ML product suite/input_Email_email'), 'sanamulla@gofynd.com')

WebUI.setEncryptedText(findTestObject('Object Repository/Page_Workbench - Data and ML product suite/input_Password_password'), 
    'XGTRhfuJCtyxiQu+Byrp7A==')

WebUI.click(findTestObject('Object Repository/Page_Workbench - Data and ML product suite/span_Log in'))

WebUI.click(findTestObject('Object Repository/Page_Workbench - Data and ML product suite/button_Lets Go'))

WebUI.click(findTestObject('Object Repository/Page_Workbench - Data and ML product suite/span_CityMongo1'))

WebUI.click(findTestObject('Object Repository/Page_Workbench - Data and ML product suite/button_ExecuteExisting'))

WebUI.click(findTestObject('Object Repository/Page_Workbench - Data and ML product suite/button_Execute'))

WebUI.click(findTestObject('Object Repository/Page_Workbench - Data and ML product suite/button_Edit API'))

WebUI.click(findTestObject('Object Repository/Page_Workbench - Data and ML product suite/button_Test Query'))

WebUI.closeBrowser()

