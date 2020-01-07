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
import org.openqa.selenium.Keys as Keys

WebUI.openBrowser('')

WebUI.navigateToUrl('http://192.168.5.46:9090/sso/sso/login/')

WebUI.setText(findTestObject('Object Repository/CRM_OR/RetailCustomer/input_WELCOME BACK_username'), 'fiyin')

WebUI.setEncryptedText(findTestObject('Object Repository/CRM_OR/RetailCustomer/input_WELCOME BACK_password'), 'bCEiM449H1A=')

WebUI.click(findTestObject('Object Repository/CRM_OR/RetailCustomer/button_Login'))

WebUI.click(findTestObject('Object Repository/CRM_OR/RetailCustomer/div_Applications_item__icon'))

WebUI.click(findTestObject('Object Repository/CRM_OR/RetailCustomer/a_Build No_aside__toggler'))

WebUI.click(findTestObject('Object Repository/CRM_OR/RetailCustomer/span_CRM'))

WebUI.click(findTestObject('Object Repository/CRM_OR/RetailCustomer/a_Retail'))

WebUI.click(findTestObject('Object Repository/CRM_OR/RetailCustomer/i_Complaints_anticon anticon-close'))

WebUI.click(findTestObject('Object Repository/CRM_OR/RetailCustomer/button_New Customer'))

WebUI.setText(findTestObject('Object Repository/CRM_OR/RetailCustomer/input_First Name_ant-input'), 'JOLAOSHO')

WebUI.setText(findTestObject('Object Repository/CRM_OR/RetailCustomer/input_Middle Name_ant-input'), 'TIMOTHY')

WebUI.setText(findTestObject('Object Repository/CRM_OR/RetailCustomer/input_Last Name_ant-input'), 'TOSIN')

WebUI.setText(findTestObject('CRM_OR/RetailCustomer/Customer_input_Phone Number_ant-input'), '080 6167 0707')

WebUI.click(findTestObject('CRM_OR/RetailCustomer/input_Date of Birth_ant-calendar-picker-input ant-input'))

WebUI.doubleClick(findTestObject('Object Repository/CRM_OR/RetailCustomer/a_Performing Contact Dedup Check_ant-calendar-prev-year-btn'))

WebUI.click(findTestObject('Object Repository/CRM_OR/RetailCustomer/a_Performing Contact Dedup Check_ant-calendar-prev-year-btn'))

WebUI.click(findTestObject('Object Repository/CRM_OR/RetailCustomer/a_Performing Contact Dedup Check_ant-calendar-prev-year-btn'))

WebUI.click(findTestObject('Object Repository/CRM_OR/RetailCustomer/a_Performing Contact Dedup Check_ant-calendar-prev-year-btn'))

WebUI.click(findTestObject('Object Repository/CRM_OR/RetailCustomer/a_Performing Contact Dedup Check_ant-calendar-prev-year-btn'))

WebUI.click(findTestObject('Object Repository/CRM_OR/RetailCustomer/a_Performing Contact Dedup Check_ant-calendar-prev-year-btn'))

WebUI.click(findTestObject('Object Repository/CRM_OR/RetailCustomer/a_Performing Contact Dedup Check_ant-calendar-prev-year-btn'))

WebUI.click(findTestObject('Object Repository/CRM_OR/RetailCustomer/a_Performing Contact Dedup Check_ant-calendar-prev-year-btn'))

WebUI.click(findTestObject('Object Repository/CRM_OR/RetailCustomer/a_Performing Contact Dedup Check_ant-calendar-prev-year-btn'))

WebUI.click(findTestObject('Object Repository/CRM_OR/RetailCustomer/a_Performing Contact Dedup Check_ant-calendar-prev-year-btn'))

WebUI.click(findTestObject('Object Repository/CRM_OR/RetailCustomer/div_30'))

WebUI.setText(findTestObject('Object Repository/CRM_OR/RetailCustomer/input_Identification Number_ant-input'), '89065')

WebUI.click(findTestObject('Object Repository/CRM_OR/RetailCustomer/button_Perform Dedup Check'))

WebUI.click(findTestObject('Object Repository/CRM_OR/RetailCustomer/button_Proceed to Create Customer'))

WebUI.click(findTestObject('CRM_OR/RetailCustomer/title'))

WebUI.click(findTestObject('Object Repository/CRM_OR/RetailCustomer/li_MR - MR'))

WebUI.click(findTestObject('CRM_OR/RetailCustomer/marital_status'))

WebUI.click(findTestObject('Object Repository/CRM_OR/RetailCustomer/li_S - SINGLE'))

WebUI.setText(findTestObject('Object Repository/CRM_OR/RetailCustomer/input_Preferred Name_ant-input'), 'TOSIN')

WebUI.click(findTestObject('CRM_OR/RetailCustomer/identification_type'))

WebUI.delay(3)

WebUI.click(findTestObject('Object Repository/CRM_OR/RetailCustomer/li_DRIVERS LICENSE - Identification type'))

WebUI.setText(findTestObject('CRM_OR/RetailCustomer/input_Bank Verification Number_ant-input ant-input'), '0839475436725')

WebUI.click(findTestObject('CRM_OR/RetailCustomer/preferred_mode_ofcontact'))

WebUI.click(findTestObject('CRM_OR/RetailCustomer/li_PHONE'))

WebUI.click(findTestObject('CRM_OR/RetailCustomer/input_Identification Issue Date_ant-calendar-picker-input ant-input'))

WebUI.click(findTestObject('CRM_OR/RetailCustomer/div_1'))

WebUI.click(findTestObject('CRM_OR/RetailCustomer/input_Identification Expiry Date_ant-calendar-picker-input ant-input'))

WebUI.click(findTestObject('CRM_OR/RetailCustomer/div_11'))

WebUI.click(findTestObject('CRM_OR/RetailCustomer/nationality1'))

WebUI.click(findTestObject('Object Repository/CRM_OR/RetailCustomer/li_NIGERIA'))

WebUI.click(findTestObject('CRM_OR/RetailCustomer/gender'))

WebUI.click(findTestObject('Object Repository/CRM_OR/RetailCustomer/li_MALE'))

WebUI.click(findTestObject('CRM_OR/RetailCustomer/button_Next1'))

WebUI.delay(3)

WebUI.click(findTestObject('CRM_OR/RetailCustomer/sector_'))

WebUI.click(findTestObject('CRM_OR/RetailCustomer/li_1000 - AGRICULTURE'))

WebUI.click(findTestObject('CRM_OR/RetailCustomer/sub_sector_code'))

WebUI.click(findTestObject('CRM_OR/RetailCustomer/li_1102 - POULTRY'))

WebUI.click(findTestObject('CRM_OR/RetailCustomer/input_Introducer Code_ant-input'))

WebUI.sendKeys(findTestObject('CRM_OR/RetailCustomer/input_Introducer Code_ant-input'), Keys.chord(Keys.ENTER))

WebUI.click(findTestObject('CRM_OR/RetailCustomer/button_Search_introducer_code'))

WebUI.click(findTestObject('CRM_OR/RetailCustomer/button_Select_introducer_code'))

WebUI.click(findTestObject('CRM_OR/RetailCustomer/segment'))

WebUI.click(findTestObject('CRM_OR/RetailCustomer/li_BUSOW - BUSINESS OWNER'))

WebUI.click(findTestObject('CRM_OR/RetailCustomer/sub_segment_code'))

WebUI.click(findTestObject('CRM_OR/RetailCustomer/li_123 - LARGE BUSINESS'))

WebUI.click(findTestObject('CRM_OR/RetailCustomer/occupation'))

WebUI.click(findTestObject('CRM_OR/RetailCustomer/li_FARMER - null'))

WebUI.click(findTestObject('CRM_OR/RetailCustomer/employment_status'))

WebUI.click(findTestObject('CRM_OR/RetailCustomer/li_EMPLOYED'))

WebUI.setText(findTestObject('CRM_OR/RetailCustomer/input_Employer_ant-input'), 'FGN')

WebUI.setText(findTestObject('CRM_OR/RetailCustomer/input_Asset Value_ant-input ant-input'), '9000')

WebUI.setText(findTestObject('CRM_OR/RetailCustomer/input_Total Income_ant-input ant-input'), '80000000000')

WebUI.click(findTestObject('CRM_OR/RetailCustomer/input_Relationship Manager_ant-input'))

WebUI.sendKeys(findTestObject('CRM_OR/RetailCustomer/input_Relationship Manager_ant-input'), Keys.chord(Keys.ENTER))

WebUI.delay(3)

WebUI.click(findTestObject('CRM_OR/RetailCustomer/button_Search_relationship_manager'))

WebUI.click(findTestObject('CRM_OR/RetailCustomer/button_Select_relationship_manager'))

WebUI.click(findTestObject('CRM_OR/RetailCustomer/input_Branch_ant-input'))

WebUI.sendKeys(findTestObject('CRM_OR/RetailCustomer/input_Branch_ant-input'), Keys.chord(Keys.ENTER))

WebUI.click(findTestObject('CRM_OR/RetailCustomer/button_Search_branch'))

WebUI.click(findTestObject('CRM_OR/RetailCustomer/button_Select_branch'))

WebUI.click(findTestObject('CRM_OR/RetailCustomer/button_Available for Trading_ant-switch'))

WebUI.click(findTestObject('CRM_OR/RetailCustomer/KYC_indicator'))

WebUI.click(findTestObject('CRM_OR/RetailCustomer/li_HIGH'))

WebUI.click(findTestObject('CRM_OR/RetailCustomer/KYC_status'))

WebUI.click(findTestObject('CRM_OR/RetailCustomer/li_COMPLETE'))

WebUI.click(findTestObject('CRM_OR/RetailCustomer/button_Next2'))

WebUI.delay(3)

WebUI.click(findTestObject('CRM_OR/RetailCustomer/Address_type'))

WebUI.click(findTestObject('CRM_OR/RetailCustomer/li_MAILING_ADDRESS'))

WebUI.setText(findTestObject('CRM_OR/RetailCustomer/Add_address_input_Email Address_ant-input'), 'emailaddress@yahoo.com')

WebUI.setText(findTestObject('CRM_OR/RetailCustomer/add_address_input_Phone Number_ant-input'), '09087937549')

WebUI.setText(findTestObject('CRM_OR/RetailCustomer/input_Fax Number_ant-input'), '46547')

WebUI.setText(findTestObject('CRM_OR/RetailCustomer/input_Home Address_ant-input'), 'oba ile akure')

WebUI.setText(findTestObject('CRM_OR/RetailCustomer/input_Nearest Bus Stop_ant-input'), 'mobil round about')

WebUI.setText(findTestObject('CRM_OR/RetailCustomer/input_Zip Code_ant-input'), '234')

WebUI.click(findTestObject('CRM_OR/RetailCustomer/add_address_country'))

WebUI.click(findTestObject('CRM_OR/RetailCustomer/add_address_li_NIGERIA'))

WebUI.click(findTestObject('CRM_OR/RetailCustomer/add_address_state'))

WebUI.click(findTestObject('CRM_OR/RetailCustomer/add_address_state_li_ONDO'))

WebUI.click(findTestObject('CRM_OR/RetailCustomer/add_address_city'))

WebUI.click(findTestObject('CRM_OR/RetailCustomer/li_AKURE'))

WebUI.click(findTestObject('CRM_OR/RetailCustomer/button_Add          Address'))

WebUI.click(findTestObject('CRM_OR/RetailCustomer/button_Next3'))

WebUI.delay(3)

WebUI.click(findTestObject('CRM_OR/RetailCustomer/input_Contact Look Up_ant-input'))

WebUI.sendKeys(findTestObject('CRM_OR/RetailCustomer/input_Contact Look Up_ant-input'), Keys.chord(Keys.ENTER))

WebUI.click(findTestObject('CRM_OR/RetailCustomer/button_Search_contact'))

WebUI.click(findTestObject('CRM_OR/RetailCustomer/button_Select_contact'))

WebUI.click(findTestObject('CRM_OR/RetailCustomer/contact_type'))

WebUI.click(findTestObject('CRM_OR/RetailCustomer/li_NEXT_OF_KIN'))

WebUI.click(findTestObject('CRM_OR/RetailCustomer/add_address_relationship_type'))

WebUI.click(findTestObject('CRM_OR/RetailCustomer/add_address_li_SISTER'))

WebUI.click(findTestObject('CRM_OR/RetailCustomer/button_Add            Contact'))

WebUI.click(findTestObject('CRM_OR/RetailCustomer/button_Next4'))

WebUI.delay(3)

WebUI.setText(findTestObject('CRM_OR/RetailCustomer/input_Preferential Rate_ant-input ant-input'), '800')

WebUI.click(findTestObject('CRM_OR/RetailCustomer/input_Preferential Expiry Date_ant-calendar-picker-input ant-input'))

WebUI.click(findTestObject('CRM_OR/RetailCustomer/div_10 (1)'))

WebUI.click(findTestObject('CRM_OR/RetailCustomer/prefrential_rate_dr_indicator'))

WebUI.click(findTestObject('CRM_OR/RetailCustomer/li_CREDIT'))

WebUI.click(findTestObject('CRM_OR/RetailCustomer/product_type'))

WebUI.click(findTestObject('CRM_OR/RetailCustomer/li_SAVINGS'))

WebUI.click(findTestObject('CRM_OR/RetailCustomer/button_Add            Preferential Rate'))

not_run: WebUI.click(findTestObject('CRM_OR/RetailCustomer/button_Submit'))

WebUI.closeBrowser()

