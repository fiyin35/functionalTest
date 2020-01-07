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

WebUI.navigateToUrl('http://192.168.5.46:8081/core')

WebUI.setText(findTestObject('Object Repository/OfficeAccount/Page_Icon Login/input_WELCOME BACK_username'), 'fiyin')

WebUI.setEncryptedText(findTestObject('Object Repository/OfficeAccount/Page_Icon Login/input_WELCOME BACK_password'), 'bCEiM449H1A=')

WebUI.click(findTestObject('Object Repository/OfficeAccount/Page_Icon Login/button_Login'))

WebUI.maximizeWindow()

WebUI.click(findTestObject('Object Repository/OfficeAccount/Page_icon-app/div_Applications_item__icon'))

WebUI.click(findTestObject('OfficeAccount/Page_icon-app/a_Branch_aside__toggler_1'))

WebUI.click(findTestObject('CRM_OR/CorporateCutomer/Page_icon-app/span_CRM'))

WebUI.verifyElementClickable(findTestObject('CRM_OR/CorporateCutomer/Page_icon-app/a_Corporate'))

WebUI.waitForElementClickable(findTestObject('CRM_OR/CorporateCutomer/Page_icon-app/a_Corporate'), 3)

WebUI.doubleClick(findTestObject('CRM_OR/CorporateCutomer/Page_icon-app/a_Corporate'))

WebUI.delay(5)

WebUI.click(findTestObject('CRM_OR/CorporateCutomer/Page_icon-app/button_New Customer'))

WebUI.delay(3)

WebUI.setText(findTestObject('CRM_OR/CorporateCutomer/Page_icon-app/Page_icon-app/input_Company Name_ant-input'), 'PECULIAR NIG LIMITED')

WebUI.setText(findTestObject('CRM_OR/CorporateCutomer/Page_icon-app/input_Registration Number_ant-input'), '56087834')

WebUI.verifyElementClickable(findTestObject('CRM_OR/CorporateCutomer/CorporateLastTwoTab/Page_icon-app/button_Perform Dedup Check'))

WebUI.click(findTestObject('CRM_OR/CorporateCutomer/CorporateLastTwoTab/Page_icon-app/button_Perform Dedup Check'))

WebUI.delay(5)

WebUI.verifyElementClickable(findTestObject('CRM_OR/CorporateCutomer/CorporateLastTwoTab/Page_icon-app/button_Proceed to Create Customer'))

WebUI.click(findTestObject('CRM_OR/CorporateCutomer/CorporateLastTwoTab/Page_icon-app/button_Proceed to Create Customer'))

WebUI.delay(3)

WebUI.setText(findTestObject('CRM_OR/CorporateCutomer/Page_icon-app/Page_icon-app/input_Short Company Name_ant-input'), 
    'PEC NG LIM')

WebUI.setText(findTestObject('CRM_OR/CorporateCutomer/Page_icon-app/Page_icon-app/input_Swift Code_ant-input'), 'PEC9864')

WebUI.setText(findTestObject('CRM_OR/CorporateCutomer/Page_icon-app/Page_icon-app/input_Total Shares and Investment_ant-input ant-input'), 
    '900000000')

WebUI.setText(findTestObject('CRM_OR/CorporateCutomer/Page_icon-app/Page_icon-app/input_Total Worth_ant-input ant-input'), 
    '80000000')

WebUI.click(findTestObject('CRM_OR/CorporateCutomer/Page_icon-app/Page_icon-app/input_Incorporation Date_ant-calendar-picker-input ant-input'))

WebUI.delay(3)

WebUI.click(findTestObject('CRM_OR/CorporateCutomer/SpyCrm1/Page_icon-app/div_2'))

WebUI.click(findTestObject('CRM_OR/CorporateCutomer/SpyCrm1/Page_icon-app/div_'))

WebUI.delay(3)

WebUI.click(findTestObject('CRM_OR/CorporateCutomer/SpyCrm1/Page_icon-app/li_NIGERIA'))

WebUI.setText(findTestObject('CRM_OR/CorporateCutomer/Page_icon-app/Page_icon-app/Page_icon-app/input_Staff Strength_ant-input ant-input'), 
    '32')

WebUI.click(findTestObject('CRM_OR/CorporateCutomer/Page_icon-app/Page_icon-app/Page_icon-app/div_'))

WebUI.delay(3)

WebUI.click(findTestObject('CRM_OR/CorporateCutomer/SpyCrm1/Page_icon-app/li_JOINT'))

WebUI.setText(findTestObject('CRM_OR/CorporateCutomer/SpyCrm1/Page_icon-app/input_Tax Identification(TIN)_ant-input'), '09934556T')

WebUI.click(findTestObject('CRM_OR/CorporateCutomer/Page_icon-app/Page_icon-app/div_'))

WebUI.click(findTestObject('CRM_OR/CorporateCutomer/SpyCrm1/Page_icon-app/li_English'))

WebUI.setText(findTestObject('CRM_OR/CorporateCutomer/Page_icon-app/Page_icon-app/textarea_Business Description_ant-input'), 
    'PECULIAR NIGERIA LIMITED IS A LEADING ICT COMPANY ')

WebUI.click(findTestObject('CRM_OR/CorporateCutomer/SpyCrm1/Page_icon-app/button_Next'))

WebUI.click(findTestObject('CRM_OR/CorporateCutomer/SpyBUSDet/Page_icon-app/input_Relationship Manager_ant-input'))

WebUI.click(findTestObject('CRM_OR/CorporateCutomer/SpyBUSDet/Page_icon-app/svg'))

WebUI.click(findTestObject('CRM_OR/CorporateCutomer/SpyBUSDet/Page_icon-app/button_Search'))

WebUI.click(findTestObject('CRM_OR/CorporateCutomer/SpyBUSDet/Page_icon-app/button_Select'))

WebUI.click(findTestObject('CRM_OR/CorporateCutomer/SpyBUSDet/Page_icon-app/div_'))

WebUI.click(findTestObject('CRM_OR/CorporateCutomer/SpyBUSDet/Page_icon-app/li_1000 - AGRICULTURE'))

WebUI.click(findTestObject('CRM_OR/CorporateCutomer/SPyBusDe_Sub_Sect/Page_icon-app/div_'))

WebUI.click(findTestObject('CRM_OR/CorporateCutomer/SPyBusDe_Sub_Sect/Page_icon-app/li_1103 - FISHERY'))

WebUI.click(findTestObject('CRM_OR/CorporateCutomer/SPyBusDe_Sub_Sect/Page_icon-app/Page_icon-app/div_'))

WebUI.click(findTestObject('CRM_OR/CorporateCutomer/SPyBusDe_Sub_Sect/Page_icon-app/Page_icon-app/li_CORP - CORPORATE'))

WebUI.click(findTestObject('CRM_OR/CorporateCutomer/Page_icon-app/Page_icon-app/Page_icon-app/Page_icon-app/div_'))

WebUI.click(findTestObject('CRM_OR/CorporateCutomer/Page_icon-app/Page_icon-app/Page_icon-app/Page_icon-app/li_MAN 2 - MANUFACTURING'))

WebUI.setText(findTestObject('CRM_OR/CorporateCutomer/SPyBusDe_Sub_Sect/Page_icon-app/input_SCUML_ant-input'), '76894THS')

WebUI.click(findTestObject('CRM_OR/CorporateCutomer/SPyBusDe_Sub_Sect/Page_icon-app/Page_icon-app/Page_icon-app/div_'))

WebUI.click(findTestObject('CRM_OR/CorporateCutomer/SPyBusDe_Sub_Sect/Page_icon-app/Page_icon-app/Page_icon-app/li_EMAIL'))

WebUI.click(findTestObject('CRM_OR/CorporateCutomer/Page_icon-app/Page_icon-app/input_Branch_ant-input'))

WebUI.click(findTestObject('CRM_OR/CorporateCutomer/SpyCrm1/Page_icon-app/svg'))

WebUI.delay(3)

WebUI.click(findTestObject('CRM_OR/CorporateCutomer/SpyCrm1/Page_icon-app/button_Search1_branch'))

WebUI.delay(3)

WebUI.click(findTestObject('CRM_OR/CorporateCutomer/SpyCrm1/Page_icon-app/button_Select1_branch'))

WebUI.click(findTestObject('CRM_OR/CorporateCutomer/SPyBusDe_Sub_Sect/Page_icon-app/button_Available for Trading_ant-switch'))

not_run: WebUI.click(findTestObject('CRM_OR/CorporateCutomer/Page_icon-app/Page_icon-app/Page_icon-app/Page_icon-app/Page_icon-app/input_Introducer Code_ant-input'))

not_run: WebUI.sendKeys(findTestObject('CRM_OR/CorporateCutomer/Page_icon-app/Page_icon-app/Page_icon-app/Page_icon-app/Page_icon-app/input_Introducer Code_ant-input'), 
    Keys.chord(Keys.ENTER))

not_run: WebUI.click(findTestObject('CRM_OR/CorporateCutomer/Page_icon-app/Page_icon-app/Page_icon-app/Page_icon-app/Page_icon-app/li_QA200 - DEBBY AYENI'))

WebUI.click(findTestObject('CRM_OR/CorporateCutomer/SpyCrm1/KYC_indicator'))

WebUI.click(findTestObject('CRM_OR/CorporateCutomer/Page_icon-app/Page_icon-app/Page_icon-app/Page_icon-app/Page_icon-app/Page_icon-app/li_HIGH'))

WebUI.click(findTestObject('CRM_OR/CorporateCutomer/SPyBusDe_Sub_Sect/Page_icon-app/Page_icon-app/Page_icon-app/Page_icon-app/Page_icon-app/button_Next'))

WebUI.click(findTestObject('CRM_OR/CorporateCutomer/SPyBusDe_Sub_Sect/Page_icon-app/Page_icon-app/Page_icon-app/Page_icon-app/Page_icon-app/div_'))

WebUI.click(findTestObject('CRM_OR/CorporateCutomer/SPyBusDe_Sub_Sect/Page_icon-app/Page_icon-app/Page_icon-app/Page_icon-app/Page_icon-app/li_MAILING_ADDRESS'))

WebUI.setText(findTestObject('CRM_OR/CorporateCutomer/Newspy/Add_address_input_Email Address_ant-input'), 'AUTOTESTER@YAHOO.COM')

WebUI.setText(findTestObject('CRM_OR/CorporateCutomer/Newspy/add_address_input_Phone Number_ant-input'), '09089047452')

WebUI.setText(findTestObject('CRM_OR/CorporateCutomer/Newspy/add_address_input_Fax Number_ant-input'), '56230')

WebUI.setText(findTestObject('CRM_OR/CorporateCutomer/Newspy/add_address_input_Home Address_ant-input'), 'PLOT 3B ABIOLA AVENUE IJAPO')

WebUI.setText(findTestObject('CRM_OR/CorporateCutomer/Newspy/add_address_input_Landmark_ant-input'), 'PLOT 3B')

WebUI.setText(findTestObject('CRM_OR/CorporateCutomer/Newspy/add_address_input_Nearest Bus Stop_ant-input'), 'A DIVISION BUS STOP')

WebUI.click(findTestObject('CRM_OR/CorporateCutomer/NewSpyCrm/Page_icon-app/div_'))

// the part giving problem
WebUI.click(findTestObject('CRM_OR/CorporateCutomer/NewSpyCrm/Page_icon-app/li_NIGERIA'))

WebUI.click(findTestObject('CRM_OR/CorporateCutomer/CRMCORPADDRESS/Page_icon-app/Page_icon-app/div_'))

WebUI.delay(3)

WebUI.click(findTestObject('CRM_OR/CorporateCutomer/CRMCORPADDRESS/Page_icon-app/Page_icon-app/li_LAGOS'))

WebUI.click(findTestObject('CRM_OR/CorporateCutomer/CRMCORPADDRESS/Page_icon-app/Page_icon-app/Page_icon-app/div_'))

WebUI.delay(3)

WebUI.click(findTestObject('CRM_OR/CorporateCutomer/CRMCORPADDRESS/Page_icon-app/Page_icon-app/Page_icon-app/li_ALAUSA'))

WebUI.setText(findTestObject('CRM_OR/CorporateCutomer/CRMCORPADDRESS/Page_icon-app/input_Zip Code_ant-input'), '321234')

WebUI.click(findTestObject('CRM_OR/CorporateCutomer/CRMCORPADDRESS/Page_icon-app/button_Add          Address'))

WebUI.click(findTestObject('CRM_OR/CorporateCutomer/Newspy/Next_div_Add Contact'))

WebUI.click(findTestObject('CRM_OR/CorporateCutomer/Newspy/contact_input_Contact_Look Up_ant-input'))

WebUI.click(findTestObject('CRM_OR/RetailCustomer/svg'))

// WebUI.sendKeys(findTestObject('CRM_OR/CorporateCutomer/Newspy/contact_input_Contact_Look Up_ant-input'), Keys.chord(Keys.ENTER))
WebUI.click(findTestObject('CRM_OR/CorporateCutomer/Newspy/button_Search_contact'))

WebUI.delay(3)

WebUI.click(findTestObject('CRM_OR/CorporateCutomer/Newspy/button_Select_contact'))

WebUI.click(findTestObject('CRM_OR/CorporateCutomer/Newspy/contact_type'))

WebUI.click(findTestObject('CRM_OR/CorporateCutomer/Newspy/li_DIRECTOR'))

WebUI.setText(findTestObject('CRM_OR/CorporateCutomer/Newspy/add_contact_input_Tax Id Number_ant-input'), '876544')

not_run: WebUI.click(findTestObject('CRM_OR/CorporateCutomer/NewSpyCrm/KYC_indicator'))

not_run: WebUI.click(findTestObject('CRM_OR/CorporateCutomer/NewSpyCrm/Add_contatct_li_HIGH'))

WebUI.setText(findTestObject('CRM_OR/CorporateCutomer/NewSpyCrm/add_contact_input_Middle Name_ant-input'), 'FEYI')

WebUI.click(findTestObject('CRM_OR/CorporateCutomer/NewSpyCrm/button_Add_Contact'))

WebUI.closeBrowser()

