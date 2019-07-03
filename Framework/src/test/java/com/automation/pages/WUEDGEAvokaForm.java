package com.automation.pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class WUEDGEAvokaForm {
	WebDriver driver;

	@FindBy(xpath = "//iframe[@id='framURL']")
	WebElement FrameAvoka;

	// Filling Legal Entity

	@FindBy(xpath = "//p[contains(text(),'Please identify the legal formation of your business from the list below')]")
	WebElement HeaderLegalEntity;
	@FindBy(xpath = "//div[contains(@class,'modalEntity')]//button")
	WebElement SelectLegalEntity;
	@FindBy(xpath = "//div[contains(@class,'modalEntity')]//input[@role='textbox']")
	WebElement InputLegalEntity;
	// li//span[contains(text(),'Private Company')]
	@FindBy(xpath = "//button[contains(text(),'Continue')]")
	WebElement BtnContinue;

	// Tactial Onboarding
	@FindBy(xpath = "//div[@id='OnboardingModallogindiv']//*[@class='modalheadertext' and ( contains(text(),'Registrati') or contains(text(),'Register for payments'))]")
	WebElement TacticalOnboardingHeader;
	@FindBy(xpath = "//div[@id='OnboardingModallogindiv']//i[@class='fa fa-times close launch-modal']")
	WebElement TacticalOnboardingClose;
	@FindBy(xpath = "//h2/*[contains(text(),'Register for Payment Services')]")
	WebElement HeaderRegsiterPage;

	// Step 1 - Let's get Started
	@FindBy(xpath = "//span[contains(text(),'Business Details')]")
	WebElement HeaderBusinessDetails;

	// State of Formation
	@FindBy(xpath = "//select[contains(@id,'stateOfFormation')]")
	WebElement DrpDwn_StateForm;
	// Is your business registered with the Canada Revenue Agency (CRA) program?
	// Is your business registered with the Secretary of State?
	@FindBy(xpath = "//legend[contains(text(),'Is your business registered with')]//following-sibling::div//span[contains(text(),'YES')]")
	WebElement CRA_Yes;
	@FindBy(xpath = "//legend[contains(text(),'Is your business registered with')]//following-sibling::div//span[contains(text(),'NO')]")
	WebElement CRA_No;

	// Legal business name
	@FindBy(xpath = "//input[contains(@id,'legalBusinessName')]")
	WebElement Input_LegalBN;
	@FindBy(xpath = "//span[contains(@id,'legalBusinessName')]/following-sibling::span[@role='alert']")
	WebElement Selected_LegalBN;

	// Registration Number
	@FindBy(xpath = "//input[contains(@id,'registrationNumber')]")
	WebElement Input_RegNum;

	// If applicable, 'Trading As' (T/A) business name
	@FindBy(xpath = "//input[contains(@id,'tradingAsBusinessName')]")
	WebElement Input_TA_BussName;

	@FindBy(xpath = "//span[contains(text(),'Your Details')]")
	WebElement HeaderYourDetails;
	@FindBy(xpath = "//select[contains(@id,'titleDropdown')]")
	WebElement DrpDwn_Title;
	@FindBy(xpath = "//input[contains(@id,'firstNameField')]")
	WebElement Input_FirstName;
	@FindBy(xpath = "//input[contains(@id,'middleNameField')]")
	WebElement Input_MiddleName;
	@FindBy(xpath = "//input[contains(@id,'lastNameField')]")
	WebElement Input_LastName;
	@FindBy(xpath = "//select[contains(@id,'countryCodeDropdown')]")
	WebElement DrpDwn_ContactPHNumber;
	@FindBy(xpath = "//input[contains(@id,'contactPhoneNumber')]")
	WebElement Input_ContactPHNumber;

	// Please advise your role at .*
	@FindBy(xpath = "//input[contains(@id,'adviseYourRoleField')]")
	WebElement Input_Role;

	@FindBy(xpath = "//span[contains(text(),'Authorization') or contains(text(),'Authorisation')]")
	WebElement HeaderAuthorization;

	// Are you the signing officer for Test Legal?
	// @FindBy(xpath ="//span[contains(text(),'Are you the signing
	// officer')]/ancestor::div[2]/following-sibling::div//span[contains(text(),'YES')]"
	// )
	// WebElement SigningOfficer_Yes;
	// @FindBy(xpath ="//span[contains(text(),'Are you the signing
	// officer')]/ancestor::div[2]/following-sibling::div//span[contains(text(),'NO')]"
	// )
	// WebElementSigningOfficer_No ;

	@FindBy(xpath = "//label[contains(@for,'authorizedSignatory')]//span[contains(text(),'YES')]")
	WebElement SigningOfficer_Yes;
	@FindBy(xpath = "//label[contains(@for,'authorizedSignatory')]//span[contains(text(),'NO')]")
	WebElement SigningOfficer_No;

	// Have you been delegated authority to sign this application,
	// @FindBy(xpath ="//span[contains(text(),'delegated authority to sign this
	// application')]/ancestor::div[2]/following-sibling::div//span[contains(text(),'YES')]"
	// )
	// WebElement DelegatedOfficer_Yes;
	// @FindBy(xpath ="//span[contains(text(),'delegated authority to sign this
	// application')]/ancestor::div[2]/following-sibling::div//span[contains(text(),'NO')]"
	// )
	// WebElement DelegatedOfficer_No;

	@FindBy(xpath = "//label[contains(@for,'delegatedAuthority')]//span[contains(text(),'YES')]")
	WebElement DelegatedOfficer_Yes;
	@FindBy(xpath = "//label[contains(@for,'delegatedAuthority')]//span[contains(text(),'NO')]")
	WebElement DelegatedOfficer_No;

	@FindBy(xpath = "//span[contains(text(),'Continue')]")
	WebElement Btn_Steps_Continue;
	@FindBy(xpath = "//span[contains(text(),'Submit')]")
	WebElement Btn_Steps_Submit;

	// Step 2 - About Your Business

	// In what industry does your business operate?
	@FindBy(xpath = "//select[contains(@id,'WhatIndustryDropdown')]")
	WebElement DrpDwn_Industry;

	// E-Cigarettes, Tobacco, Vape

	// Do you purchase eCigarettes, tobacco, vape or cannabis in bulk for resale to
	// retailers?
	@FindBy(xpath = "//span[contains(text(),'Do you purchase eCigarettes, tobacco, vape or cannabis in bulk for resale to retailers?')]")
	WebElement HeaderDoYouPurchaseBulk;

	//// span[contains(text(),'Yes -
	//// eCigarettes')]/ancestor::label//i[contains(@data-ng-class,'purchase')]

	@FindBy(xpath = "//span[contains(text(),'Do you sell e-Cigarettes, tobacco products, vape or cannabis for retail?')]")
	WebElement HeaderDoYouSellBulk;

	//// span[contains(text(),'Yes -
	//// eCigarettes')]/ancestor::label//i[contains(@data-ng-class,'sell')]

	@FindBy(xpath = "//legend[contains(text(),'Do you have a wholesaler')]")
	WebElement HeaderWholesalerPermit;

	// //label[contains(@for,'wholesalerPermitYesNo')]//span[text()='YES']

	@FindBy(xpath = "//legend[contains(text(),'Do you have a retail permit to do so?')]")
	WebElement HeaderRetailPermit;
	//// label[contains(@for,'retailPermitToDoSoYesNo')]//span[text()='YES']

	@FindBy(xpath = "//span[contains(text(),'Do you import and/or export tobacco overseas, or buy/sell tobacco')]")
	WebElement HeaderTobaImportExport;

	// span[contains(text(),'Yes - buy from other Canadian
	// provinces')]/ancestor::label//i[contains(@data-ng-class,'exchangeOverseas')]

	@FindBy(xpath = "//legend[contains(text(),'Do you sell tobacco vaporisers?')]")
	WebElement HeaderSellTobacco;

	// label[contains(@for,'tobaccoVaporisersYesNo')]//span[text()='YES']

	@FindBy(xpath = "//legend[contains(text(),'Do you sell Cannabis or Dry Herb vaporisers?')]")
	WebElement HeaderSellCannabis;

	// label[contains(@for,'cannabisDryHerbSellYesNo')]//span[text()='YES']

	@FindBy(xpath = "//span[contains(text(),'We’ll ask you to upload supporting documentation for this information provided on page 5 of this registration, prior to submitting.')]")
	WebElement TextSupportDoc;

	@FindBy(xpath = "//div[contains(@class,'reference_code')]//p")
	WebElement finalMsgHardstopInd;
	// Casinos / Other Wagering Institutions

	// Please provide the authorisation number provided by the gambling commission
	@FindBy(xpath = "//*[contains(@id,'casinos_athorizationNumberCommission')]")
	WebElement AuthNumber;

	// Please confirm this account with Western Union will only be used for treasury
	// payments?
	@FindBy(xpath = "//legend[contains(text(),'Please confirm this account with Western Union will only be used for treasury payments?')]")
	WebElement HeaderTreasuryPayments;
	// label[contains(@for,'casinos_confirmAccountTreasuryPaymentsYesNo')]//span[text()='YES']
	// label[contains(@for,'casinos_confirmAccountTreasuryPaymentsYesNo')]//span[text()='NO']

	// Do you disburse CAD 10,000 or more, either in a single transaction or in
	// multiple transactions?
	@FindBy(xpath = "//legend[contains(text(),'Do you disburse CAD 10,000 or more, either in a single transaction or in multiple transactions?')]")
	WebElement HeaderSingleMultiTrans;
	// label[contains(@for,'casinos_dispurseFundsMoreThanTenCAD')]//span[text()='NO']
	// label[contains(@for,'casinos_dispurseFundsMoreThanTenCAD')]//span[text()='YES']

	// Are you registered with FINTRAC?
	@FindBy(xpath = "//legend[contains(text(),'Are you registered with FINTRAC?')]")
	WebElement HeaderFintrac;
	// label[contains(@for,'casinos_registeredFINTRACYesNo')]//span[text()='NO']
	// label[contains(@for,'casinos_registeredFINTRACYesNo')]//span[text()='YES']

	// Please provide your FINTRAC registration number
	@FindBy(xpath = "//*[contains(@id,'casinos_fINTRACRegistrationNumber')]")
	WebElement InputFINTRAC_RegNum;

	// MLM

	@FindBy(xpath = "//label[text()='Does your business engage in Multi-Level Marketing (MLM)?']")
	WebElement MLMHeader;
	@FindBy(xpath = "//label[contains(@for,'aYB_mLMMarketingYesNo')]//span[contains(text(),'YES')]")
	WebElement MLMBusinessYes;
	@FindBy(xpath = "//label[contains(@for,'aYB_mLMMarketingYesNo')]//span[contains(text(),'NO')]")
	WebElement MLMBusinessNo;

	// if MLM = yes , the below question , industry =
	// Retail,services,Healthcare,Litigation finance,Legal,other industry
	@FindBy(xpath = "//label[text()='What types of goods and/or services does your business buy or sell?']")
	WebElement MLMGoodsHeader;
	@FindBy(xpath = "//textarea[contains(@id,'typesOfGoodsTextArea')]")
	WebElement MLMGoodsTextarea;

	@FindBy(xpath = "//legend[contains(text(),'Is your business authorised and regulated by The Law Society, UK?')]")
	WebElement HeaderLawSocietyUK;
	@FindBy(xpath = "//label[contains(@for,'theLawSocietyUKAuthorizedYesNo')]//span[contains(text(),'YES')]")
	WebElement LawSocietyUK_Yes;
	@FindBy(xpath = "//label[contains(@for,'theLawSocietyUKAuthorizedYesNo')]//span[contains(text(),'NO')]")
	WebElement LawSocietyUK_No;

	// Industry == Other Industry
	@FindBy(xpath = "//label[text()='Please specify your industry.']")
	WebElement HeaderSpecifyInd;
	@FindBy(xpath = "//label[text()='Please specify your industry.']/following-sibling::input")
	WebElement InputSpecifyInd;

	// Retail,services,Healthcare
	@FindBy(xpath = "//label[text()='Is your business franchised or non-franchised?']")
	WebElement HeaderFranchise;
	@FindBy(xpath = "//label[contains(@for,'businessFranchisedYesNo')]//*[text()='Franchised']")
	WebElement BtnFranchised;
	@FindBy(xpath = "//label[contains(@for,'businessFranchisedYesNo')]//*[text()='Non-Franchised']")
	WebElement BtnNonFranchised;

	// if non-franchise, below questions
	@FindBy(xpath = "//*[text()='Does your business provide massage services?']")
	WebElement HeaderMassageServices;
	@FindBy(xpath = "//label[contains(@for,'provideMassageServicesYesNo')]//span[contains(text(),'YES')]")
	WebElement Massage_Yes;
	@FindBy(xpath = "//label[contains(@for,'provideMassageServicesYesNo')]//span[contains(text(),'NO')]")
	WebElement Massage_No;

	// Precursor Chemicals
	@FindBy(xpath = "//*[text()='Does your business import, export and/or transport precursor chemicals?']")
	WebElement HeaderPrecursorChem;

	// *[text()='Import Precursor Chemical']/preceding-sibling::i

	@FindBy(xpath = "//*[text()='Are you registered under Canadian Precursor Control Regulations law?']")
	WebElement HeaderCADPrecursorLaw;
	@FindBy(xpath = "//*[text()='Are you registered with the UK Home Office to be able to trade with precursor chemicals?']")
	WebElement HeaderUKPrecursorLaw;
	@FindBy(xpath = "//*[text()='Are you registered with the Drug Enforcement Administration (DEA) to be able to trade with precursor chemicals?']")
	WebElement HeaderUSAPrecursorLaw;
	@FindBy(xpath = "//*[contains(@for,'precursorChecmicals')]//*[text()='YES']")
	WebElement Precursor_YES;
	@FindBy(xpath = "//*[contains(@for,'precursorChecmicals')]//*[text()='NO']")
	WebElement Precursor_NO;

	@FindBy(xpath = "//*[text()='Does your business import / export military or paramilitary goods (including arms)?']")
	WebElement HeaderImpExpArmsUSCAN;

	// *[text()='Yes - Import Arms']/preceding-sibling::i

	@FindBy(xpath = "//*[text()='Does your business import / export military or paramilitary goods?']")
	WebElement HeaderImpExpArmsUK;
	@FindBy(xpath = "//*[contains(@for,'paramilitaryGoodsYesNo')]//*[text()='YES']")
	WebElement ParaMilitary_YES;
	@FindBy(xpath = "//*[contains(@for,'paramilitaryGoodsYesNo')]//*[text()='NO']")
	WebElement ParaMilitary_NO;

	@FindBy(xpath = "//label[text()='Does your business import / export dual use goods, services or technology?']")
	WebElement HeaderPrecursorGoods;
	@FindBy(xpath = "//*[contains(@for,'doesYourBusinessImportExportDualUseYesNo')]//*[text()='YES']")
	WebElement PrecursorGoods_YES;
	@FindBy(xpath = "//*[contains(@for,'doesYourBusinessImportExportDualUseYesNo')]//*[text()='NO']")
	WebElement PrecursorGoods_NO;

	@FindBy(xpath = "//*[text()='Does your business provide mercenary services (including buying/distributing firearms)?']")
	WebElement HeaderMercenary;
	@FindBy(xpath = "//*[contains(@for,'doesYourBusinessProvideMercenaryServicesYesNo')]//*[text()='YES']")
	WebElement Mercenary_YES;
	@FindBy(xpath = "//*[contains(@for,'doesYourBusinessProvideMercenaryServicesYesNo')]//*[text()='NO']")
	WebElement Mercenary_NO;

	@FindBy(xpath = "//*[text()='Does your business manufacture firearms?']")
	WebElement HeaderManFireArms;
	@FindBy(xpath = "//*[contains(@for,'manufactureFirearmsYesNo')]//*[text()='YES']")
	WebElement FireArms_YES;
	@FindBy(xpath = "//*[contains(@for,'manufactureFirearmsYesNo')]//*[text()='NO']")
	WebElement FireArms_NO;

	// Travel, Tourism
	@FindBy(xpath = "//*[text()='Is your business registered with the Association of Canadian Travel Agencies (ACTA)?']")
	WebElement HeaderCAN_ACTA;
	@FindBy(xpath = "//*[contains(@for,'aCTARegistrationYesNo')]//*[text()='YES']")
	WebElement ACTA_Yes;
	@FindBy(xpath = "//*[contains(@for,'aCTARegistrationYesNo')]//*[text()='NO']")
	WebElement ACTA_No;

	@FindBy(xpath = "//*[text()='Is your business registered with the American Society of Travel Agents (ASTA)?']")
	WebElement HeaderUSA_ASTA;
	@FindBy(xpath = "//*[contains(@for,'aSTARegistrationYesNo')]//*[text()='YES']")
	WebElement ASTA_Yes;
	@FindBy(xpath = "//*[contains(@for,'aSTARegistrationYesNo')]//*[text()='NO']")
	WebElement ASTA_No;

	@FindBy(xpath = "//*[text()='Is your business registered with any of the following bodies?']")
	WebElement HeaderUKRegistered;

	@FindBy(xpath = "//label[text()='Is your business registered with the Office of Foreign Assets Control (OFAC)?']")
	WebElement HeaderOFAC;
	@FindBy(xpath = "//*[text()='Is your business registered with the office of Foreign Assets Control?']")
	WebElement HeaderTaskOFAC;
	@FindBy(xpath = "//*[contains(@for,'registeredWithOFACYesNo')]//*[text()='YES']")
	WebElement OFAC_Yes;
	@FindBy(xpath = "//*[contains(@for,'registeredWithOFACYesNo')]//*[text()='NO']")
	WebElement OFAC_No;

	@FindBy(xpath = "//*[text()='Office of Foreign Assets Control (OFAC)']")
	WebElement HeaderCubaOFAC;

	@FindBy(xpath = "//legend[contains(text(),'Has OFACissued a license to ?')]")
	WebElement HeaderOFACLicense;
	@FindBy(xpath = "//*[contains(@for,'oFACLicenseIssuedYesNo')]//*[text()='YES']")
	WebElement OFAC_Licensed_Yes;
	@FindBy(xpath = "//*[contains(@for,'oFACLicenseIssuedYesNo')]//*[text()='NO']")
	WebElement OFAC_Licensed_No;

	@FindBy(xpath = "//legend[contains(text(),'Does intend to use Western Union to process payments to/from the OFAC Sanctioned Jurisdictions (directly / indirectly)?')]")
	WebElement HeaderOFACSanctioned;
	@FindBy(xpath = "//*[contains(@for,'paymentsWithOFACSanctionedJurisdictionsYesNo')]//*[text()='YES']")
	WebElement OFAC_Sanctioned_Yes;
	@FindBy(xpath = "//*[contains(@for,'paymentsWithOFACSanctionedJurisdictionsYesNo')]//*[text()='NO']")
	WebElement OFAC_Sanctioned_No;

	@FindBy(xpath = "//h3/*[text()='Cuba']")
	WebElement HeaderCuba;

	@FindBy(xpath = "//*[text()='Please provide ultimate origin of goods and/or services provided to this country. If not applicable, please state N/A']")
	WebElement HeaderCubaOriginCountry;
	@FindBy(xpath = "//div[contains(@class,'cuba_countryOfOrigin')]//ul//input")
	WebElement InputCubaOriginCountry;

	@FindBy(xpath = "//*[text()='Please provide a detailed description of the types of goods and/or services provided to this country. Please also describe the purpose of the payment to this country.']")
	WebElement HeaderCubaTypesOfGoods;
	@FindBy(xpath = "//textarea[contains(@id,'cuba_typesOfGoodsAndServicesProvided')]")
	WebElement TextAreaTypesOfGoods;

	@FindBy(xpath = "//span[contains(text(),'Please confirm if the government of any OFAC sanctioned countries are involved in facilitating goods and/or services on behalf of')]")
	WebElement HeaderOFACCounInvGoods;
	@FindBy(xpath = "//*[contains(@for,'cuba_governmentOfSanctionedCountriesInvolvedYesNo')]//*[text()='YES']")
	WebElement OFACCounInvGoods_Yes;

	@FindBy(xpath = "//*[contains(@for,'cuba_governmentOfSanctionedCountriesInvolvedYesNo')]//*[text()='NO']")
	WebElement OFACCounInvGoods_No;

	// Automotive
	@FindBy(xpath = "//*[text()='Does your business import / export any of the following?']")
	WebElement HeaderAutoImpExp;

	@FindBy(xpath = "//*[text()='Are you importing or exporting any of the following?']")
	WebElement HeaderTaskAutoImpExp;
	// *[text()='Used cars']/preceding-sibling::i
	@FindBy(xpath = "//*[text()='Does your business disassemble any of the following?']")
	WebElement HeaderAutoDisassemble;
	// *[text()='Used cars']/preceding-sibling::i

	// Adult Entertainment
	@FindBy(xpath = "//*[text()='Does your business have a licence to operate in this industry?' or text()='Does your business have a license to operate in this industry?' ]")
	WebElement HeaderAdultLicense;
	@FindBy(xpath = "//*[contains(@for,'explicitContent_licenseToOperateYesNo')]//*[text()='YES']")
	WebElement AdultLicense_Yes;
	@FindBy(xpath = "//*[contains(@for,'explicitContent_licenseToOperateYesNo')]//*[text()='NO']")
	WebElement AdultLicense_No;

	@FindBy(xpath = "//*[contains(text(),'What is the principal activity that will be conducted on the business')]")
	WebElement HeaderAdultPriciple;
	@FindBy(xpath = "//textarea[contains(@id,'explicitContent_principleActivity')]")
	WebElement TextAreaAdult;

	@FindBy(xpath = "//legend[contains(text(),'primary business activity is the production or sale of sexually explicit photographs, films and/or books?')]")
	WebElement HeaderProdSale;
	@FindBy(xpath = "//*[contains(text(),'primary business activity is the production or sale of sexually explicit photographs, films and/or books?')]")
	WebElement HeaderTaskProdSale;
	@FindBy(xpath = "//*[contains(@for,'explicitContent_confirmBusinessActivityYesNo')]//*[text()='YES']")
	WebElement ConfirmActivity_Yes;
	@FindBy(xpath = "//*[contains(@for,'explicitContent_confirmBusinessActivityYesNo')]//*[text()='NO']")
	WebElement ConfirmActivity_No;

	// New Precious Metals
	@FindBy(xpath = "//*[text()='Who do you sell your products to (if applicable)?']")
	WebElement HeaderSellYrProducts;

	@FindBy(xpath = "//*[text()='Does your business buy or sell precious metals, precious stones or jewellery, in the amount of CAD 10,000 or more, in a single transaction?']")
	WebElement HeaderCADSingleTrans;
	@FindBy(xpath = "//*[text()='Please provide us with your FINTRAC registration number (if applicable).']")
	WebElement HeaderJewlryFintrac;
	@FindBy(xpath = "//*[contains(@id,'fINTRACRegistration')]")
	WebElement InputFintracNumber;

	@FindBy(xpath = "//span[contains(text(),'Does your business deal with rough diamonds in any way?')]")
	WebElement HeaderRoughDiamonds;
	@FindBy(xpath = "//*[contains(text(),'Does your business deal with rough diamonds in any way?')]")
	WebElement HeaderTaskRoughDiamonds;

	// CRA Business Number, *** Business Number is
	@FindBy(xpath = "//span[contains(text(),'Business Number is')]/ancestor::label/following-sibling::input[contains(@id,'Identification')]")
	WebElement InputBussNumber;

	// Yes, my Tax ID is
	@FindBy(xpath = "//label[contains(text(),'Yes, my Tax ID is')]/following-sibling::input[contains(@id,'vatIdentification')]")
	WebElement InputTaxID;

	// No, my business is exempt
	@FindBy(xpath = "//span[contains(text(),'No, my business is exempt')]//ancestor::label/i")
	WebElement CheckBoxIsBussExmpt;

	// Exempt / Not Applicable as
	@FindBy(xpath = "//*[contains(text(),'Exempt / Not Applicable')]//ancestor::label/i")
	WebElement CheckBoxExempt;
	@FindBy(xpath = "//textarea[contains(@id,'vatIdentificationTextArea') or contains(@id,'businessIDInformtionTextArea')]")
	WebElement TextAreaExempt;

	// Date Test Legal was established/incorporated (DD/MM/YYYY)
	@FindBy(xpath = "//input[contains(@id,'dateBusinessWasEstablished')]")
	WebElement InputDataIncorporated;

	// Annual sales turnover
	@FindBy(xpath = "//span[contains(text(),'$1m')]//ancestor::label/i")
	WebElement RadioAnnualSales;
	@FindBy(xpath = "//span[contains(text(),'$1m')]//ancestor::label")
	WebElement RadioAnnualSalesStatus;

	// Primary Business Address
	@FindBy(xpath = "//strong[contains(text(),'Primary business address')]")
	WebElement HeaderPrimaryBusinessAdd;
	@FindBy(xpath = "//input[contains(@id,'primaryBusinessAddress')]")
	WebElement InputPrimaryBussAddressSearch;
	@FindBy(xpath = "//label[contains(text(),'Primary business address 1')]//following-sibling::input")
	WebElement InputPrimaryBussAddress1;
	@FindBy(xpath = "//label[contains(text(),'Primary business address 2')]//following-sibling::input")
	WebElement InputPrimaryBussAddress2;
	@FindBy(xpath = "//strong[contains(text(),'Primary business address')]/ancestor::div[contains(@class,'primaryBusinessAddress')]//input[contains(@id,'suburbOrCity')]")
	WebElement InputPrimaryBussCity;
	@FindBy(xpath = "//strong[contains(text(),'Primary business address')]/ancestor::div[contains(@class,'primaryBusinessAddress')]//select[contains(@id,'stateOrProvince')]")
	WebElement SelectPrimaryBussProvince;
	@FindBy(xpath = "//strong[contains(text(),'Primary business address')]/ancestor::div[contains(@class,'primaryBusinessAddress')]//input[contains(@id,'postcodeOrZipcode')]")
	WebElement InputPrimaryBussPostal;

	// Registered business address
	@FindBy(xpath = "//strong[contains(text(),'Registered business address')]")
	WebElement HeaderRegBusinessAdd;
	@FindBy(xpath = "//input[contains(@id,'registeredBusinessAddress')]")
	WebElement InputRegBussAddressSearch;
	@FindBy(xpath = "//label[contains(text(),'Registered business address 1')]//following-sibling::input")
	WebElement InputRegBussAddress1;
	@FindBy(xpath = "//label[contains(text(),'Registered business address 2')]//following-sibling::input")
	WebElement InputRegBussAddress2;
	@FindBy(xpath = "//strong[contains(text(),'Registered business address')]/ancestor::div[contains(@class,'registeredBusinessAddress')]//select[contains(@id,'registeredBusinessAddress_country')]")
	WebElement SelectRegBussCountry;
	@FindBy(xpath = "//strong[contains(text(),'Registered business address')]/ancestor::div[contains(@class,'registeredBusinessAddress')]//input[contains(@id,'suburbOrCity')]")
	WebElement InputRegBussCity;
	@FindBy(xpath = "//strong[contains(text(),'Registered business address')]/ancestor::div[contains(@class,'registeredBusinessAddress')]//select[contains(@id,'stateOrProvince')]")
	WebElement SelectRegBussProvince;
	@FindBy(xpath = "//strong[contains(text(),'Registered business address')]/ancestor::div[contains(@class,'registeredBusinessAddress')]//input[contains(@id,'postcodeOrZipcode')]")
	WebElement InputRegBussPostal;

	// Mailing business address
	@FindBy(xpath = "//strong[contains(text(),'Mailing business address')]")
	WebElement HeaderMailBusinessAdd;
	@FindBy(xpath = "//input[contains(@id,'mailingBusinessAddress')]")
	WebElement InputMailBussAddressSearch;
	@FindBy(xpath = "//label[contains(text(),'Mailing business address 1')]//following-sibling::input")
	WebElement InputMailBussAddress1;
	@FindBy(xpath = "//label[contains(text(),'Mailing business address 2')]//following-sibling::input")
	WebElement InputMailBussAddress2;
	@FindBy(xpath = "//strong[contains(text(),'Mailing business address')]/ancestor::div[contains(@class,'mailingAddress')]//select[contains(@id,'mailingBusinessAddress_country')]")
	WebElement SelectMailBussCountry;
	@FindBy(xpath = "//strong[contains(text(),'Mailing business address')]/ancestor::div[contains(@class,'mailingAddress')]//input[contains(@id,'suburbOrCity')]")
	WebElement InputMailBussCity;
	@FindBy(xpath = "//strong[contains(text(),'Mailing business address')]/ancestor::div[contains(@class,'mailingAddress')]//select[contains(@id,'stateOrProvince')]")
	WebElement SelectMailBussProvince;
	@FindBy(xpath = "//strong[contains(text(),'Mailing business address')]/ancestor::div[contains(@class,'mailingAddress')]//input[contains(@id,'postcodeOrZipcode')]")
	WebElement InputMailBussPostal;

	// Residential address
	@FindBy(xpath = "//span[contains(text(),'Residential Address')]")
	WebElement HeaderResidentAdd;
	@FindBy(xpath = "//input[contains(@id,'ownerResidentialAddress')]")
	WebElement InputResidentAddressSearch;
	@FindBy(xpath = "//label[contains(text(),'Residential Address 1')]//following-sibling::input")
	WebElement InputResidentAddress1;
	@FindBy(xpath = "//label[contains(text(),'Residential Address 2')]//following-sibling::input")
	WebElement InputResidentAddress2;
	@FindBy(xpath = "//span[contains(text(),'Residential Address')]/ancestor::div[contains(@class,'ownerResidentialAddress')]//select[contains(@id,'ownerResidentialAddress_country')]")
	WebElement SelectResidentCountry;
	@FindBy(xpath = "//span[contains(text(),'Residential Address')]/ancestor::div[contains(@class,'ownerResidentialAddress')]//input[contains(@id,'suburbOrCity')]")
	WebElement InputResidentCity;
	@FindBy(xpath = "//span[contains(text(),'Residential Address')]/ancestor::div[contains(@class,'ownerResidentialAddress')]//select[contains(@id,'stateOrProvince')]")
	WebElement SelectResidentProvince;
	@FindBy(xpath = "//span[contains(text(),'Residential Address')]/ancestor::div[contains(@class,'ownerResidentialAddress')]//input[contains(@id,'postcodeOrZipcode')]")
	WebElement InputResidentPostal;

	// Business phone number
	@FindBy(xpath = "//span[contains(text(),'Business phone number')]")
	WebElement HeaderBussPhoneNum;
	@FindBy(xpath = "//label[contains(@for,'businessPhoneNumberIsSameCheck')]/i")
	WebElement CheckBoxBussPhoneNum;

	// Does your business have a website?
	@FindBy(xpath = "//legend[contains(text(),'Does your business have a website?')]")
	WebElement HeaderWebsite;
	@FindBy(xpath = "//legend[contains(text(),'Does your business have a website?')]//following-sibling::div//span[contains(text(),'Yes')]")
	WebElement RadioWebsite_Yes;
	@FindBy(xpath = "//legend[contains(text(),'Does your business have a website?')]//following-sibling::div//span[contains(text(),'No')]")
	WebElement RadioWebsite_No;
	@FindBy(xpath = "//span[contains(text(),'Website for')]/ancestor::label/following-sibling::input")
	WebElement InputWebsite;
	// Step - 3 Business Ownership & Structure

	// We are required to capture at least one controlling person
	@FindBy(xpath = "//span[contains(text(),'We are required to capture at least one controlling person')]")
	WebElement HeaderControllingPerson;

	// Are you a controlling person for Test Legal?
	@FindBy(xpath = "//span[contains(text(),'Are you a controlling person')]")
	WebElement HeaderControlPerson;
	@FindBy(xpath = "//span[contains(text(),'Are you a controlling person')]/ancestor::fieldset//span[contains(text(),'YES')]")
	WebElement BtnControlPerson_Yes;
	@FindBy(xpath  ="//span[contains(text(),'Are you a controlling person')]/ancestor::fieldset//span[contains(text(),'NO')]" ) 
		WebElement BtnControlPerson_No;

	// If Controlling PErson = No
	@FindBy(xpath = "//input[contains(@id,'roleWithinBusiness')]")
	WebElement InputRoleWitBusiness;
	@FindBy(xpath = "//input[contains(@id,'controllingPersonFirstName')]")
	WebElement InputControlPersonFN;
	@FindBy(xpath = "//input[contains(@id,'controllingPersonMiddleName')]")
	WebElement InputControlPersonMN;
	@FindBy(xpath = "//input[contains(@id,'controllingPersonLastName')]")
	WebElement InputControlPersonLN;

	// Residential address for controlling person
	@FindBy(xpath = "//label[contains(text(),'Residential address')]")
	WebElement HeaderResidentBusinessAdd;
	@FindBy(xpath = "//span[contains(text(),'Residential Address') or contains(text(),'Residential address')]")
	WebElement HeaderResidentBusinessAdd1;
	@FindBy(xpath = "//input[contains(@id,'ResidentialAddress') and contains(@placeholder,'Start typing full address here')]")
	WebElement InputResidentBussAddressSearch;
	@FindBy(xpath = "//input[contains(@id,'addressLineOne')]")
	WebElement InputResidentBussAddress1;
	@FindBy(xpath = "//input[contains(@id,'addressLineTwo')]")
	WebElement InputResidentBussAddress2;
	@FindBy(xpath = "//select[contains(@id,'country')]")
	WebElement DrpDwnResidentBussCountry;
	@FindBy(xpath = "//input[contains(@id,'suburbOrCity')]")
	WebElement InputResidentBussCity;
	@FindBy(xpath = "//select[contains(@id,'stateOrProvince')]")
	WebElement DrpDwnResidentBussProvince;
	@FindBy(xpath = "//select[contains(@id,'stateOrProvince')]")
	WebElement InputResidentBussProvince;
	@FindBy(xpath = "//input[contains(@id,'postcodeOrZipcode')]")
	WebElement InputResidentBussPostal;

	// Residential address for Benefciary Owner Individual Person
	@FindBy(xpath = "//label[(text()='Residential address' or text()='Business address') and (contains(@for,'beneficialOwner'))]")
	WebElement HeaderBeneOwnerAdd;
	@FindBy(xpath = "//input[contains(@id,'beneficialOwner') and contains(@placeholder,'Start typing full address here')]")
	WebElement InputBeneOwnerAddressSearch;
	@FindBy(xpath = "//input[contains(@id,'beneficialOwner') and contains(@id,'addressLineOne')]")
	WebElement InputBeneOwnerAddress1;
	@FindBy(xpath = "//input[contains(@id,'beneficialOwner') and contains(@id,'addressLineTwo')]")
	WebElement InputBeneOwnerAddress2;
	@FindBy(xpath = "//select[contains(@id,'beneficialOwner') and contains(@id,'country')]")
	WebElement DrpDwnBeneOwnerCountry;
	@FindBy(xpath = "//input[contains(@id,'beneficialOwner') and contains(@id,'suburbOrCity')]")
	WebElement InputBeneOwnerCity;
	@FindBy(xpath = "//select[contains(@id,'beneficialOwner') and contains(@id,'stateOrProvince')]")
	WebElement DrpDwnBeneOwnerProvince;
	@FindBy(xpath = "//input[contains(@id,'beneficialOwner') and contains(@id,'stateOrProvince')]")
	WebElement InputBeneOwnerProvince;
	@FindBy(xpath = "//input[contains(@id,'beneficialOwner') and contains(@id,'postcodeOrZipcode')]")
	WebElement InputBeneOwnerPostal;

	// Date of birth
	@FindBy(xpath = "//input[contains(@id,'controllingPersonDateOfBirth') or contains(@id,'ownerDateOfBirthMonth')]")
	WebElement InputDOB;
	@FindBy(xpath = "//input[contains(@id,'BeneficialOwnerDateOfBirth')]")
	WebElement InputOwnerDOB;

	// Step - 4 International Trade Needs

	// Are you an importer and/or exporter?
	@FindBy(xpath  ="//legend[contains(text(),'Are you an importer and/or exporter?')]" ) 
		WebElement HeaderImp_Exp;
	//// span[contains(text(),'Exporter')]/ancestor::label/i

	@FindBy(xpath  ="//label[contains(text(),'For what reason do you intend to use our services?')]" ) 
		WebElement Header_intend_Services;
	// span[contains(text(),'To send payments to my suppliers or service
	// providers')]/ancestor::label/i
	//// Textarea(To send payments to my suppliers or service provid,To receive
	// payments from my buyers or payers,To send payments to the parent company /
	// overseas offices, Other)
	// --- span[contains(text(),'To send payments to my suppliers or service
	// providers')]/ancestor::div[2]/following-sibling::div//textarea

	// Payments Made (Outgoing)
	@FindBy(xpath  ="//span[contains(text(),'Payments Made (Outgoing)')]" )
		WebElement HeaderPayments_Outgoing ;

	// Main currencies in which you send payments
	@FindBy(xpath  ="//div[contains(@class,'mainCurrenciesSendingPayments')]//ul//input" )
		WebElement InputOutgoingCurrency;

	// Average value per payment sent in
	@FindBy(xpath  ="//input[contains(@id,'averageValueSent')]" )
		WebElement InputAvgValSent;

	// How often does *** send payments?
	@FindBy(xpath  ="//select[contains(@id,'outgoingPaymentFrequency')]" ) 
		WebElement DrpDwn_OftenSentPayment;

	// To which countries do you send payments?
	@FindBy(xpath  ="//div[contains(@class,'paymentsToCountries')]//ul//input" ) 
		WebElement InputCountryToPayment;

	// Approximately how many payments does ** send, in the frequency selected
	// above?
	@FindBy(xpath  ="//input[contains(@id,'outgoingPaymentsQuantity')]" ) 
		WebElement InputOutPayQuantity;

	// Payments Received (Incoming)
	@FindBy(xpath = "//span[contains(text(),'Payments Received (Incoming)')]")
	WebElement HeaderPayments_Incoming;

	// Main currencies in which you receive payments
	@FindBy(xpath = "//div[contains(@class,'receivedPaymentCurrencies')]//ul//input")
	WebElement InputIncomingCurrency;

	// Average value per payment received in
	@FindBy(xpath = "//input[contains(@id,'averagePaymentReceived')]")
	WebElement InputAvgValReciev;

	// How often does *** receive payments
	@FindBy(xpath = "//select[contains(@id,'incomingPaymentFrequency')]")
	WebElement DrpDwn_OftenRecievePayment;

	// From which countries do you receive payments?
	@FindBy(xpath = "//div[contains(@class,'paymentsFromCountries')]//ul//input")
	WebElement InputCountryfromPayment;

	// Approximately how many payments does ** receive, in the frequency selected
	// above?
	@FindBy(xpath = "//input[contains(@id,'incomingPaymentsQuantity')]")
	WebElement InputIncPayQuantity;

	// Please advise the anticipated date of first transaction with Western
	// Union.(DD/MM/YYYY)
	@FindBy(xpath = "//input[contains(@id,'dateOfFirstTrade')]")
	WebElement InputFirstTrans;

	// Settlement currency
	@FindBy(xpath = "//label[contains(text(),'Settlement currency')]/ancestor::div/following-sibling::div/select[contains(@id,'settlementCurrency')]")
	WebElement DrpDwnSettleCurr;

	// Settlement Method for outgoing payments

	// span[contains(text(),'Direct debit')]/ancestor::label/i

	// Step -5 Uploads & Acknowledgements

	// Please upload Primary Identification (ID) for the individual signing the form
	// on behalf
	@FindBy(xpath = "//span[contains(text(),'Please upload Primary Identification (ID) for the individual signing the form')]/ancestor::div[2]/following-sibling::div//button[contains(text(),'Upload File')]")
	WebElement Btn_Upload_PI;
	@FindBy(xpath = "//span[contains(text(),'Please upload Primary Identification (ID) for the individual signing the form')]/ancestor::div[4]/following-sibling::div//textarea")
	WebElement TextArea_Comments_PI;

	// Please upload your 'Proof of Authority to Sign' on behalf of
	@FindBy(xpath = "//span[contains(text(),'Proof of Authority to Sign')]/ancestor::div[2]/following-sibling::div//button[contains(text(),'Upload File')]")
	WebElement Btn_Upload_PAS;
	@FindBy(xpath  ="//span[contains(text(),'Proof of Authority to Sign')]/ancestor::div[4]/following-sibling::div//textarea" )
		WebElement TextArea_Comments_PAS;
		
		
		//Please kindly provide some proof of formation of your legal entity where possible, formal or informal.
		@FindBy(xpath  ="//p[contains(text(),'Please kindly provide some proof of formation of your legal entity where possible')]/ancestor::label/following-sibling::div//button[contains(text(),'Upload File')]" ) 
		WebElement Btn_Upload_POF;
	@FindBy(xpath = "//p[contains(text(),'Please kindly provide some proof of formation of your legal entity where possible, formal or informal')]/ancestor::div[3]/following-sibling::div//textarea")
	WebElement TextArea_Comments_POF;

	@FindBy(xpath = "//label[contains(text(),'Please provide us with a license allowing you to import and/or export tobacco overseas, or buy/sell tobacco from other Canadian provinces, if applicable.')]")
	WebElement LabelECigText;
	@FindBy(xpath = "//label[contains(text(),'Please provide us with a license allowing you to import and/or export tobacco overseas, or buy/sell tobacco from other Canadian provinces, if applicable.')]/following-sibling::div//button[contains(text(),'Upload File')]")
	WebElement BtnECigUpload;

	@FindBy(xpath = "//h3/span[text()='Acknowledgements']")
	WebElement HeaderAck;
	@FindBy(xpath = "//a[contains(text(),'Online Privacy Statement')]")
	WebElement Terms2;
	@FindBy(xpath = "//a[contains(text(),'Terms and Conditions')][1]")
	WebElement Terms1;
	@FindBy(xpath = "//a[contains(text(),'here')][1]")
	WebElement Terms3;
	@FindBy(xpath = "//label[contains(@for,'regulationCheck')]/i")
	WebElement CheckBoxRC;
	@FindBy(xpath = "//label[contains(@for,'privacyCheck')]/i")
	WebElement CheckBoxPC;
	@FindBy(xpath = "//label[contains(@for,'protectionCheck')]/i")
	WebElement CheckBoxProtectionChk;

	// a[contains(text(),'Online Privacy Statement')]
	// a[contains(text(),'Terms and Conditions')]
	//// div[contains(text(),'Please wait while we prepare your agreement')]

	// Step - 6 -- Sign & Submit

	@FindBy(xpath = "//iframe[contains(@class,'adobesign-iframe')]")
	WebElement Frame_AdobeSign;
	@FindBy(xpath = "//span[contains(text(),'Your registration is ready to be eSigned!')]")
	WebElement MsgRegistrationSuccess;
	@FindBy(xpath = "//div[text()='Start']")
	WebElement BtnStart;
	@FindBy(xpath = "//div[contains(@aria-label,'Click here to sign')]")
	WebElement BtnClickHereToSign;
	@FindBy(xpath = "//input[@placeholder='Type your signature here']")
	WebElement InputSignature;
	@FindBy(xpath = "//button[text()='Apply']")
	WebElement BtnApply;
	@FindBy(xpath = "//span[contains(text(),'the reference number for your registration.')]/ancestor::div[1]/following-sibling::div/span")
	WebElement refNumber;

	/////// ------------------------------------------------------

	// added by srujna

	// Step - 3 Business Ownership & Structure Srujana for US private

	@FindBy(xpath = "//span[contains(text(),'We are required to identify a controlling person for')]")
	WebElement HeaderControllingPersonLegalBusiness;

	@FindBy(xpath = "//span[contains(text(),'Are you a controlling person') or contains(text(),'Are you the controlling person ')]")
	WebElement HeaderControlPersonLegalBusiness;

	@FindBy(xpath = "//span[contains(text(),'Are you a controlling person') or contains(text(),'Are you the controlling person ')]//ancestor::fieldset//span[contains(text(),'YES')]")
	WebElement BtnControlPerson_YesLegalBusiness;

	@FindBy(xpath = "//span[contains(text(),'Are you a controlling person') or contains(text(),'Are you the controlling person ')]//ancestor::fieldset//span[contains(text(),'NO')]")
	WebElement BtnControlPerson_NoLegalBusiness;
	// Header 25% more Ownership

	@FindBy(xpath = "(//span[contains(text(),'who have 25% or more ownership')])")
	WebElement HeaderPercentageOwnership;
	@FindBy(xpath = "(//span[contains(text(),'who have 25% or more ownership')]/ancestor::fieldset//span[contains(text(),'YES')])")
	WebElement BtnPercentageYes;
	@FindBy(xpath = "(//span[contains(text(),'who have 25% or more ownership')]/ancestor::fieldset//span[contains(text(),'NO')])")
	WebElement BtnPercentageNo;

	@FindBy(xpath = "(//span[contains(text(),'individuals have 25% or more ownership') or contains(text(),'individuals or organisations have 25% or more ownership')])")
	WebElement HeaderMorePercentageOwnership;
	@FindBy(xpath = "(//span[contains(text(),'individuals have 25% or more ownership') or contains(text(),'individuals or organisations have 25% or more ownership')]/ancestor::fieldset//span[contains(text(),'YES')])")
	WebElement BtnMorePercentageYes;
	@FindBy(xpath = "(//span[contains(text(),'individuals have 25% or more ownership') or contains(text(),'individuals or organisations have 25% or more ownership')]/ancestor::fieldset//span[contains(text(),'NO')])")
	WebElement BtnMorePercentageNo;

	// Disclose details

	@FindBy(xpath = "(//span[contains(text(),'Please disclose details of these ownerships below')])")
	WebElement DisclosedetailsHeader;

	@FindBy(xpath = "(//strong[text()='Beneficial Owner'])")
	WebElement BeneficialOwnerText;

	// select individual/entity

	@FindBy(xpath = "(//span[text()='Individual']/preceding-sibling::i)")
	WebElement IndividualCheckBox;
	@FindBy(xpath = "(//span[text()='Entity']/preceding-sibling::i)")
	WebElement EntityCheckBox;
	@FindBy(xpath = "(//span[text()='Organisation']/preceding-sibling::i)")
	WebElement OrganisationCheckBox;

	// Entity details
	@FindBy(xpath = "(//input[contains(@id,'OwnershipPercentage')])")
	WebElement EntityOwnershipPercentageInput;
	@FindBy(xpath = "(//input[contains(@id,'BeneficialOwnerBusinessName')])")
	WebElement EntityOwnerBusinessnameInput;
	@FindBy(xpath = "(//input[contains(@id,'BeneficialOwnerBusinessTradeName')])")
	WebElement EntityBusinessTradeNameInput;
	@FindBy(xpath = "(//label[text()='Business website']/following-sibling::input)")
	WebElement EntityBusinessWebssiteInput;
	@FindBy(xpath = "(//label[text()='Business phone number']/..//select)")
	WebElement EntityBusinessPhoneNumberDropDown;
	@FindBy(xpath = "(//input[contains(@id,'contactPhoneNumber')])")
	WebElement EntityBusinessPhoneNumberInput;

	// Individual details

	@FindBy(xpath = "(//input[contains(@id,'OwnershipPercentage')])")
	WebElement IndividualOwnershipPercentageInput;
	@FindBy(xpath = "(//input[contains(@id,'beneficialOwnerIndividualRoleWithinBusiness')])")
	WebElement RoleWithinBusinessInput;
	@FindBy(xpath = "(//legend[contains(text(),'Is this individual the Controlling Person identified at the top of this form')])")
	WebElement HeaderTextControlPersonidentified;
	@FindBy(xpath = "(//*[contains(@for,'beneficialOwnerIndividualIsControllingPersonYesNo')]//span[contains(text(),'YES')])")
	WebElement BtnControlPersonidentifiedYes;
	@FindBy(xpath = "(//*[contains(@for,'beneficialOwnerIndividualIsControllingPersonYesNo')]//span[contains(text(),'NO')])")
	WebElement BtnControlPersonidentifiedeNo;
	@FindBy(xpath = "(//span[contains(text(),'If you wish to edit any of the below fields, please change response to question')])")
	WebElement HeaderTextControlPersonidentifiedYes;
	@FindBy(xpath = "(//input[contains(@id,'beneficialOwnerIndividualFirstName')])")
	WebElement IndividualFN;
	@FindBy(xpath = "(//input[contains(@id,'beneficialOwnerIndividualMiddleName')])")
	WebElement IndividualMN;
	@FindBy(xpath = "(//input[contains(@id,'beneficialOwnerIndividualLastName')])")
	WebElement IndividualLN;

	@FindBy(xpath = "//span[contains(text(),'Return to Portal')]")
	WebElement BtnReturnToPortal;
	@FindBy(xpath = "//div[text()='Payments & Invoices']")
	WebElement HeaderPaymentInvoices;
	@FindBy(xpath = "//*[text()='Support']")
	WebElement MainSupportTab;
	@FindBy(xpath = "//a[text()='Support Cases']")
	WebElement SubSupportCasesTab;
	@FindBy(xpath = "//*[text()='Cases']")
	WebElement HeaderCases;
	@FindBy(xpath = "//table[@id='support-case']")
	WebElement TableSupportCases;
	@FindBy(xpath = "//table[@id='support-case']/tbody//td/*[@data-content='View']")
	WebElement LinkCasesView;
	@FindBy(xpath = "//table[@id='support-case']/tbody//td[2]")
	WebElement SupportCaseNo;
	@FindBy(xpath = "//table[@id='support-case']/tbody//td[4]")
	WebElement CaseReason;
	@FindBy(xpath = "//table[@id='support-case']/tbody//td[8]")
	WebElement CaseStatus;
	
	
	
	

}
