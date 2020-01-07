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

WebUI.callTestCase(findTestCase('Login/Login'), [:], FailureHandling.CONTINUE_ON_FAILURE)

WebUI.click(findTestObject('CRM_OR/CorporateCutomer/Corporate/Approve_Corporate_Customer/a_Build No_aside__toggler'))

WebUI.click(findTestObject('CRM_OR/CorporateCutomer/Corporate/Approve_Corporate_Customer/span_CRM'))

WebUI.click(findTestObject('CRM_OR/RetailCustomer/Retail/ApproveRetailUser/a_Retail'))

WebUI.click(findTestObject('CRM_OR/RetailCustomer/Retail/ApproveRetailUser/span_Pending Authorization'))

WebUI.click(findTestObject('CRM_OR/RetailCustomer/Retail/ApproveRetailUser/search_button'))

WebUI.click(findTestObject('CRM_OR/RetailCustomer/Retail/ApproveRetailUser/button_Search Request'))

WebUI.click(findTestObject('CRM_OR/RetailCustomer/Retail/ApproveRetailUser/E_icon_button'))

WebUI.click(findTestObject('CRM_OR/RetailCustomer/Retail/RejectRetailUser/button_Reject1'))

WebUI.setText(findTestObject('CRM_OR/RetailCustomer/Retail/RejectRetailUser/textarea_Reason_ant-input'), 'FOR TESTING PURPOSE')

WebUI.click(findTestObject('CRM_OR/RetailCustomer/Retail/RejectRetailUser/button_Reject2'))

WebUI.closeBrowser()

