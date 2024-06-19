package com.example.controller;

public class ResponseMessage {

	public static final Object MERCHANT_Phone_EMAIL = null;
	public static final Object GOVTINSTITUTEDETAILS_NOT_FOUND = null;
	public static final Object DEPARTMANT_EMAIL = null;
	public static final Object DEPARTMANT_CONTACT = null;
	public static final Object Issuer_CONTACT = null;
	public static final Object Issuer_EMAIL = null;
	public static final Object IssuerD_CONTACT_EMAIL = null;
	public static final Object IssuerDetails_NOT_FOUND = null;
	public static final Object MERCHANT_EMAIL = null;
	public static final Object MERCHANT_Phone = null;
	public static final Object MERCHANT_NOT_FOUND = null;
	public static final Object BENIFICIERY_ACTIVATED = null;
	public static final Object BENIFICIERY_DEACTIVATED = null;
	public static final Object GOVTINSTITUTEDETAILS = null;
	public static final Object GOVTINSTITUTEDETAILS_UPDATED = null;
	public static final Object MERCHANT_CREATED = null;
	public static final Object MERCHANT_UPDATED = null;
	public static final Object MERCHANT_ACTIVATED = null;
	public static final Object MERCHANT_DEACTIVATED = null;

	public final static String ONBOARDING_LINK = "https://onboarding.fidypay.com";

	public final static String REGISTERED = "Registered";
	public final static String INITIATED = "Initiated";

	// Response Code
	public final static String SUCCESS = "0x0200";
	public final static String UNAUTHORISED = "0x0201";
	public final static String FAILED = "0x0202";
	public final static String MISSING_PARAMETER = "0x0203";
	public final static String CONNECTION_TIMEOUT = "0x0204";
	public final static String SOMETHING_WENT_WRONG = "0x0205";

	// Response Key
	public final static String CODE = "code";
	public final static String DESCRIPTION = "description";
	public final static String FIELD = "field";
	public final static String STATUS = "status";

	// Response Field
	public final static String FIELD_I = "Client-Id, Client-Secret";

	public final static String HEADERS_CANT_EMPTY = "Client-Id and Client-Secret can't be empty";
	// Response Description
	public final static String UNAUTHORISED_DESCRIPTION = "Unauthorized Access to FidyPay Platform";
	public final static String DEBIT_AMOUNT_NOT_AVAILABLE = "Debit Amount not available";
	public final static String MERCHANTTRXNREFID_ALREADY_EXIST = "merchantTrxnRefId already exist please try unique id";
	public final static String MISSING_PARAMETER_DESCRIPTION = "Some Parameter are missing ";
	public final static String CONNECTION_TIMEOUT_DESCRIPTION = "Connection Timeout";
	public final static String SOMETHING_WENT_WRONG_DESCRIPTION = "Something Went Wrong, please try again";
	public final static String BAD_REQUEST = "0x0202";
	public final static String INVALID_JSON_FORMATE = "Invalid Request";
	public final static String HEADERS_MISSING = "Missing Required Headers";
	public final static String SERVER_DOWN = "Server down, Please try again after some time";

	public static final String MERCHANT_SERVICE_IS_ACTIVE_MESSAGE = "Merchant service is active successfully";
	public static final String MERCHANT_SERVICE_IS_DEACTIVE_MESSAGE = "Merchant service is deactive successfully";
	public static final String PARTNER_SERVICE_IS_ACTIVE_MESSAGE = "Partner active successfully";
	public static final String PARTNER_SERVICE_IS_DEACTIVE_MESSAGE = "Partner deactive successfully";;
	public static final String ACTIVE_DEACTVIE_ELSE = "Please pass Y and N in isActive parameter";
	public static final String MERCHANT_SERVICE_NOT_EXIST = "Merchant service not exist";

	public static final Character Y = 'Y';
	public static final Character N = 'N';
	public static final String MERCHANT_SERVICE_CHARGE_ACTIVATED = "Merchant service charge is active successfully";
	public static final String MERCHANT_SERVICE_CHARGE_DEACTIVATED = "Merchant service charge is deactive successfully";
	public static final String MERCHANT_SERVICE_CHARGE_NOT_EXIST = "Merchant service charge not exist";
	public static final String MERCHANT_SERVICE_COMMISSION_ACTIVATED = "Merchant service commission is active successfully";
	public static final String MERCHANT_SERVICE_COMMISSION_DEACTIVATED = "Merchant service commission is deactive successfully";
	public static final String MERCHANT_SERVICE_COMMISSION_NOT_EXIST = "Merchant service commission not exist";
	public static final String PARTNER_SERVICE_CHARGE_ACTIVATED = "Partner service charge is active successfully";
	public static final String PARTNER_SERVICE_CHARGE_DEACTIVATED = "Partner service charge is deactive successfully";
	public static final String PARTNER_SERVICE_CHARGE_NOT_EXIST = "Partner service charge not exist";
	public static final String PARTNER_SERVICE_COMMISSION_ACTIVATED = "Partner service commission is active successfully";
	public static final String PARTNER_SERVICE_COMMISSION_DEACTIVATED = "Partner service commission is deactive successfully";
	public static final String PARTNER_SERVICE_COMMISSION_NOT_EXIST = "Partner service commission not exist";
	public static final String MOBILE_NUMBER_NOT_REGISTERED = "Mobile number is not registered";

	public final static String STATUS_REFUND = "Refunded";
	public final static String STATUS_SUCCESS = "Success";
	public final static String STATUS_PENDING = "Pending";
	public final static String STATUS_FAILED = "Fail";
	public final static String STATUS_REVERSED = "Reversed";
	public final static String TRANSACTION_NOT_FOUND = "Transaction Not Found";

	public final static String API_BAD_REQUEST = "BAD_REQUEST";
	public final static String API_STATUS_SUCCESS = "Success";
	public final static String API_STATUS_PENDING = "Pending";
	public final static String API_STATUS_FAILED = "Failed";
	public final static String API_STATUS_REFUND = "REFUND";

	// onboarding

	public final static String EMAIL_AND_MOBILE_ALREADY_ACTIVATED = "Email id and Phone Number already registered";
	public final static String BASIC_INFO_CONFIRMED = "Basic Info Already Confirm";
	public final static String REGISTER_SUCCESSFULLY = "Register Successfully";
	public final static String EMAIL_NOT_ACTIVATED = "Email id is not registered";
	public final static String PHONE_NOT_ACTIVATED = "Phone Number is not registered";
	public final static String EMAIL_ALREADY_ACTIVATED = "Email id is already registered";
	public final static String PHONE_ALREADY_ACTIVATED = "Phone Number is already registered";
	public final static String DATA_NOT_FOUND = "Data Not Found";
	public final static String DATA_FOUND = "Data found successfully";
	public final static String NOTIFICATION_SEND = "Notification Send successfully";
	public final static String INVALID_ACCOUNT_MANAGER = "Enter Valid Account Manager Details";
	public final static String OTP_BANKINFO_FAILED = "OTP Verification failed";
	public final static String OTP_BANKINFO_EXPIRED = "Your otp has expired, Please generate again";
	public final static String VALID_OTP_MERTRXNREFID = "OTP verified Successfully";
	public final static String STATUS_REJECTED = "Rejected";
	public final static String STATUS_ACCEPTED = "Accepted";
	public final static String UPDATE_SUCCEESSFULLY = "Updated Successfully";
	public final static String ACCOUNT_ALREADY_REGISTER = "Account No is Already Registered";
	public final static String INVALID_IFSCCODE = "beneficiaryifsccode -> Invalid beneficiaryifsccode";
	public final static String INVALID_SETTLEMENT_IFSCCODE = "Invalid merchantSettlementBankIfsc";
	public static final String MERCHANT_TRXN_DETAILS_IS_ACTIVE_MESSAGE = "Merchant trxn details activated";
	public static final String MERCHANT_TRXN_DETAILS_IS_DEACTIVE_MESSAGE = "Merchant trxn details deActivated";
	public static final String MERCHANT_TRXN_DETAILS_NOT_EXIST = "Merchant trxn details does not exist";
	public final static String SERVICEID_NOT_EXIST = "To subscribe for this service, get in touch with the FidyPay team.";
	public final static String UPI_NOT_EXITS = "VPA is not exists";
	public final static String INVALID_DATE_FORMATE = "Invalid Date Format please try yyyy-MM-dd format";
	public final static String INVALID_FROM_TO_DATE = "from Date cannot be greater than to Date";
	public final static String STARTDATE_ENDDATE = "Start Date cannot be greater than end Date";

	// UAT
	public final static String MERCHANT_ENVIRONMENT = "UAT";
	public final static String MERCHANT_DASHBOARD_URL = "https://uatdashboard.fidypay.com/pages/authentication/login-v2";
	public static final String CREATE_VIRTUAL_ACCOUNT_URL = "https://developer.fidypay.com/payout/";
	public static final String SUBMERCHANT_LIST_REGISTER_URL = "https://developer.fidypay.com/dashboard/subMerchantInfo/subMerchantList";
	public final static String CLIENT_ID = "RC/lkx9cJi45hLGiJ15oMg==";
	public final static String CLIENT_SECRET = "yvmWkC6M0UZAJlLGpHf9TKhTaOuwtqggX6JHczuZOpE8Z0E07f8ADd4+kGPKKswm";
	public final static String AUTHORIZATION = "Basic QXJwYW46MTIzNDU2";
	public final static String DOMESTIC_PAYMENT = "https://developer.fidypay.com/payout/v3/domesticPayment";
	public final static String BANK_ACCOUNT_KEY = "290PHX14Q8MR9SO";
	public final static String TOKEN_URL = "https://developer.fidypay.com/payout/v3/";
	public final static String PAYOUT_STATUS_API_URL = "https://developer.fidypay.com/payout/domesticPaymentStatus/";
	public final static String PAYOUT_API_URL = "https://developer.fidypay.com/payout/domesticPayment";
	public final static String PAYOUT_TRANSACTION_API_URL = "https://developer.fidypay.com/payout/YesBank/domesticPaymentStatus/";
	public final static String SERVICE_PROVIDER_NAME = "FidyPay";
	public static final String SUBMERCHANT_REGISTER_URL = "https://developer.fidypay.com/dashboard/subMerchantInfo/createSubMerchant";
	public final static String SUBMERCHANT_EDIT = "SubMerchant Details Updated Successfully";
	public static final String CALLBACKURL = "https://developer.fidypay.com/payin/yesBank/callBackUNverified";
	public static final String QR_STRING_URL = "https://api.fidypay.com/payin/collectUPIQR/";
	public static final String QR_REPORT_URL = "https://api.fidypay.com/payin/qrReportAPI";
	public final static String PAYOUT_STATUS_URL = "domesticPaymentStatus";
	public final static String TONE_TAG_SUB_MERCHANT_URL = "https://developer.fidypay.com/payin/submerchant/registerInsubMerchantinfo";
	public static final String MERCHANT_SUBMERCHANT_REGISTER_URL = "";
	public final static String REGISTER_SUBMERCHNAT_URL = "https://developer.fidypay.com/payin/submerchant/createSubMerchant";
	public final static String UPI_APPLICATION_URL_ZOHO = "https://workdrive.zohoexternal.com/external/fcbc0d34d32778effe1e281d5398f99a73774016b3b18cc70a713d79396e8ce7";
	public final static String UPI_APPLICATION_URL = "https://play.google.com/store/apps/details?id=com.merchant.foscrm";

	// PRODUCTION
//		public final static String MERCHANT_ENVIRONMENT = "Production";
//		public static final String MERCHANT_SUBMERCHANT_REGISTER_URL = "https://partner.fidypay.com/cbank/accountDetails/merchantRegister";
//		public final static String MERCHANT_DASHBOARD_URL = "https://dashboard.fidypay.com/pages/authentication/login-v2";
//		public static final String CREATE_VIRTUAL_ACCOUNT_URL = "https://api.fidypay.com/payout/";
//		public static final String SUBMERCHANT_LIST_REGISTER_URL = "https://api.fidypay.com/dashboard/subMerchantInfo/subMerchantList";
//		public final static String DOMESTIC_PAYMENT = "https://api.fidypay.com/payout/banking/payment";
//		public final static String BANK_ACCOUNT_KEY = "1PHARBLK6TLCA4G4XM";
//		public final static String TOKEN_URL = "https://api.fidypay.com/payout/banking/";
//		public final static String CLIENT_ID = "tiFANIMp/fxEy8GNKHyCAg==";
//		public final static String CLIENT_SECRET = "KN247egL1iL6aBqA8uDKdJ6lR+aG0Xh+N00TvZKKVi8=";
//		public final static String AUTHORIZATION = "Basic TWFuYW46RmlkeUA2NTQzMjE=";
//		public final static String PAYOUT_STATUS_API_URL = "https://api.fidypay.com/payout/domesticPaymentStatus/";
//		public final static String PAYOUT_API_URL = "https://api.fidypay.com/payout/domesticPayment";
//		public final static String PAYOUT_TRANSACTION_API_URL = "https://api.fidypay.com/payout/YesBank/domesticPaymentStatus/";
//		public final static String SERVICE_PROVIDER_NAME = "FidyPay";
//		public static final String SUBMERCHANT_REGISTER_URL = "https://api.fidypay.com/dashboard/subMerchantInfo/createSubMerchant";
//		public final static String SUBMERCHANT_EDIT = "SubMerchant Details Updated Successfully";
//		public static final String CALLBACKURL = "https://api.fidypay.com/payin/yesBank/callBackUNverified";
//		public static final String QR_STRING_URL = "https://api.fidypay.com/payin/collectUPIQR/";
//		public static final String QR_REPORT_URL = "https://api.fidypay.com/payin/qrReportAPI";
//		public final static String PAYOUT_STATUS_URL = "paymentStatus";
//		public final static String TONE_TAG_SUB_MERCHANT_URL = "https://api.fidypay.com/payin/submerchant/registerInsubMerchantinfo";
//		public final static String REGISTER_SUBMERCHNAT_URL = "https://api.fidypay.com/payin/submerchant/createSubMerchant";
//		public final static String UPI_APPLICATION_URL_ZOHO = "https://workdrive.zohoexternal.com/external/fcbc0d34d32778effe1e281d5398f99a73774016b3b18cc70a713d79396e8ce7";
//		public final static String UPI_APPLICATION_URL = "https://play.google.com/store/apps/details?id=com.merchant.foscrm";

	public final static String getTrxnStatusDescription(String responseCode) {
		String response = null;

		switch (responseCode) {
		case "U01":
			response = "The request is duplicate";
			break;
		case "U02":
			response = "Amount CAP is exceeded";
			break;
		case "U03":
			response = "Net debit CAP is exceeded";
			break;
		case "U04":
			response = "Request is not found";
			break;
		case "U05":
			response = "Formation is not proper";
			break;
		case "U06":
			response = "Transaction ID is mismatched";
			break;
		case "U07":
			response = "Validation error";
			break;
		case "U08":
			response = "System exception";
			break;
		case "U09":
			response = "ReqAuth Time out for PAY";
			break;
		case "U10":
			response = "Illegal operation";
			break;
		case "U11":
			response = "Credentials is not present";
			break;
		case "U12":
			response = "Amount or currency mismatch";
			break;
		case "U13":
			response = "External error";
			break;
		case "U14":
			response = "Encryption error";
			break;
		case "U15":
			response = "Checksum failed";
			break;
		case "U16":
			response = "Risk threshold exceeded";
			break;
		case "U17":
			response = "PSP is not registered";
			break;
		case "U18":
			response = "Request authorization acknowledgement is not received";
			break;
		case "U19":
			response = "Request authorization is declined";
			break;
		case "U20":
			response = "Request authorization timeout";
			break;
		case "U21":
			response = "Request authorization is not found";
			break;
		case "U22":
			response = "CM request is declined";
			break;
		case "U23":
			response = "CM request timeout";

			break;
		case "U24":
			response = "CM request acknowledgement is not received";

			break;
		case "U25":
			response = "CM URL is not found";

			break;
		case "U26":
			response = "PSP request credit pay acknowledgement is not received";

			break;
		case "U27":
			response = "No response from PSP";

			break;
		case "U28":
			response = "PSP not available";

			break;
		case "U29":
			response = "Address resolution is failed";
			break;
		case "U30":
			response = "Debit has been failed";
			break;
		case "U31":
			response = "Credit has been failed";
			break;
		case "U32":

			response = "Credit revert has been failed";
			break;
		case "U33":
			response = "Debit revert has been failed";
			break;
		case "U34":
			response = "Reverted";
			break;
		case "U35":
			response = "Response is already been received";
			break;
		case "U36":
			response = "Request is already been sent";
			break;
		case "U37":
			response = "Reversal has been sent";
			break;
		case "U38":
			response = "Response is already been sent";
			break;
		case "U39":
			response = "Transaction is already been failed";
			break;
		case "U40":
			response = "IMPS processing failed in UPI";
			break;
		case "U41":
			response = "IMPS is signed off";
			break;
		case "U42":
			response = "IMPS transaction is already been processed";
			break;
		case "U43":
			response = "IMPS is declined";
			break;
		case "U44":
			response = "Form has been signed off";
			break;
		case "U45":
			response = "Form processing has been failed in UPI";
			break;
		case "U46":
			response = "Request credit is not found";
			break;
		case "U47":
			response = "Request debit is not found";
			break;
		case "U48":
			response = "Transaction is id not present";
			break;
		case "U49":
			response = "Request message id is not present";
			break;
		case "U50":
			response = "IFSC is not present";
			break;
		case "U51":
			response = "Request refund is not found";
			break;
		case "U52":
			response = "PSP orgId not found";
			break;
		case "U53":
			response = "PSP Request Pay Debit Acknowledgement not received";
			break;
		case "U54":
			response = "Transaction Id or Amount in credential block does not match with that in ReqPay";
			break;
		case "U66":
			response = "Device Fingerprint mismatch";
			break;
		case "U67":
			response = "Debit Time Out";
			break;

		case "U68":
			response = "Credit Time Out";
			break;
		case "U69":
			response = "Collect Expired";
			break;
		case "U70":
			response = "Received Late Response";
			break;
		case "U77":
			response = "Merchant blocked";
			break;
		case "U78":
			response = "Beneficiary bank offline";
			break;
		case "OC":
			response = "Original Credit Not Found";
			break;
		case "OD":
			response = "Original Debit Not Found";
			break;
		case "NC":
			response = "Credit Not Done";
			break;
		case "ND":
			response = "Debit Not Done";
			break;
		case "MT01":
			response = "Debit Transaction Failed";
			break;
		case "MT02":
			response = "Credit Transaction Failed";
			break;
		case "MT03":
			response = "Insufficient Balance in Account";
			break;

		case "MT04":
			response = "Transaction Limit Exceeded";
			break;
		case "MT05":
			response = "Transaction Amount Exceeded";
			break;
		case "MT06":
			response = "Closed Account";
			break;
		case "MT07":
			response = "Inactive/Dormant account (Remitter)";
			break;
		case "MT08":
			response = "Invalid UPI PIN entered";
			break;
		case "MT09":
			response = "Inactive/Dormant account (Beneficiary)";
			break;
		case "MT10":
			response = "No Credit Account";
			break;
		case "MT11":
			response = "Credit decline reversal";
			break;
		case "MT12":
			response = "Partial Decline";
			break;
		case "MT13":
			response = "Invalid amount (Remitter)";
			break;
		case "MT14":
			response = "Incorrect/Invalid Payer Virtual Address";
			break;
		case "MT15":
			response = "Incorrect/Invalid Payee Virtual Address";
			break;
		case "MT16":
			response = "Collect rejected successfully";
			break;
		case "MT17":
			response = "Number of PIN tries exceeded.";
			break;
		case "MT18":
			response = "Account does not exist (Remitter)";
			break;
		case "MT19":
			response = "Account does not exist (Beneficiary)";
			break;
		case "MT20":
			response = "Account not whitelisted";
			break;
		case "MT21":
			response = "Cutoff is in process(Remitter)";
			break;
		case "MT22":
			response = "Cutoff is in process(Beneficiary)";
			break;
		case "MT23":
			response = "Remitter CBS offline";
			break;
		case "MT24":
			response = "Beneficiary CBS offline";
			break;
		case "MT25":
			response = "Invalid transaction (Remitter)";
			break;
		case "MT26":
			response = "Invalid transaction (Beneficiary)";
			break;
		case "MT27":
			response = "Transaction not permitted to account";
			break;
		case "MT28":
			response = "Requested function not supported (Remitter)";
			break;
		case "MT29":
			response = "Requested function not supported (Beneficiary)";
			break;
		case "MT30":
			response = "Beneficiary account blocked / Frozen";
			break;
		case "MT31":
			response = "Remitter account blocked / Frozen";
			break;
		case "Z9":
			response = "INSUFFICIENT FUNDS IN CUSTOMER (REMITTER) ACCOUNT";
			break;
		case "RM":
			response = "Invalid UPI PIN (Violation of policies while setting/changing UPI PIN )";
			break;
		case "RN":
			response = "Registration is temporary blocked due to maximum no of attempts exceeded";
			break;
		case "RZ":
			response = "Account is already registered with MBEBA flag as 'Y'";
			break;
		case "BR":
			response = "Mobile number registered with multiple customer IDs";
			break;
		case "B2":
			response = "Account linked with multiple names";
			break;
		case "SP":
			response = "Invalid/Incorrect ATM PIN";
			break;
		case "AJ":
			response = "Customer has never created/activated an ATM PIN";
			break;
		case "K1":
			response = "SUSPECTED FRAUD, DECLINE / TRANSACTIONS DECLINED BASED ON RISK SCORE BY REMITTER";
			break;
		case "ZI":
			response = "SUSPECTED FRAUD, DECLINE / TRANSACTIONS DECLINED BASED ON RISK SCORE BY BENEFICIARY";
			break;
		case "Z8":
			response = "PER TRANSACTION LIMIT EXCEEDED AS SET BY REMITTING MEMBER";
			break;
		case "Z7":
			response = "TRANSACTION FREQUENCY LIMIT EXCEEDED AS SET BY REMITTING MEMBER";
			break;
		case "Z6":
			response = "NUMBER OF PIN TRIES EXCEEDED";
			break;
		case "ZM":
			response = "INVALID UPI PIN";
			break;
		case "ZD":
			response = "VALIDATION ERROR";
			break;
		case "ZR":
			response = "INVALID / INCORRECT OTP";
			break;
		case "ZS":
			response = "OTP EXPIRED";
			break;

		case "ZT":
			response = "OTP TRANSACTION LIMIT EXCEEDED";
			break;
		case "ZX":
			response = "INACTIVE OR DORMANT ACCOUNT (REMITTER)";
			break;
		case "XD":
			response = "INVALID AMOUNT (REMITTER)";
			break;
		case "XF":
			response = "FORMAT ERROR (INVALID FORMAT) (REMITTER)";
			break;
		case "XH":
			response = "ACCOUNT DOES NOT EXIST (REMITTER)";
			break;
		case "XJ":
			response = "REQUESTED FUNCTION NOT SUPPORTED";
			break;
		case "XL":
			response = "EXPIRED CARD, DECLINE (REMITTER)";
			break;
		case "XN":
			response = "NO CARD RECORD (REMITTER)";
			break;
		case "XP":
			response = "TRANSACTION NOT PERMITTED TO CARDHOLDER (REMITTER)";
			break;
		case "XR":
			response = "RESTRICTED CARD, DECLINE (REMITTER)";
			break;
		case "XT":
			response = "CUT-OFF IS IN PROCESS (REMITTER)";
			break;
		case "XV":
			response = "TRANSACTION CANNOT BE COMPLETED. COMPLIANCE VIOLATION (REMITTER)";
			break;
		case "XY":
			response = "REMITTER CBS OFFLINE";
			break;
		case "YA":
			response = "LOST OR STOLEN CARD (REMITTER)";
			break;
		case "YC":
			response = "DO NOT HONOUR (REMITTER)";
			break;
		case "YE":
			response = "REMITTING ACCOUNT BLOCKED/FROZEN";
			break;
		case "Z5":
			response = "INVALID BENEFICIARY CREDENTIALS";
			break;
		case "ZP":
			response = "BANKS AS BENEFICIARY NOT LIVE ON PARTICULAR TXN TYPE";
			break;
		case "ZY":
			response = "INACTIVE OR DORMANT ACCOUNT (BENEFICIARY)";
			break;
		case "XE":
			response = "INVALID AMOUNT (BENEFICIARY)";
			break;
		case "XG":
			response = "FORMAT ERROR (INVALID FORMAT) (BENEFICIARY)";
			break;
		case "XI":
			response = "ACCOUNT DOES NOT EXIST (BENEFICIARY)";
			break;
		case "XK":
			response = "REQUESTED FUNCTION NOT SUPPORTED";
			break;
		case "XM":
			response = "EXPIRED CARD, DECLINE (BENEFICIARY)";
			break;
		case "XO":
			response = "NO CARD RECORD (BENEFICIARY)";
			break;
		case "XQ":
			response = "TRANSACTION NOT PERMITTED TO CARDHOLDER (BENEFICIARY)";
			break;
		case "XS":
			response = "RESTRICTED CARD, DECLINE (BENEFICIARY)";
			break;
		case "XU":
			response = "CUT-OFF IS IN PROCESS (BENEFICIARY)";
			break;
		case "XW":
			response = "TRANSACTION CANNOT BE COMPLETED. COMPLIANCE VIOLATION (BENEFICIARY)";
			break;
		case "Y1":
			response = "BENEFICIARY CBS OFFLINE";
			break;
		case "YB":
			response = "LOST OR STOLEN CARD (BENEFICIARY)";
			break;
		case "YD":
			response = "DO NOT HONOUR (BENEFICIARY)";
			break;
		case "YF":
			response = "BENEFICIARY ACCOUNT BLOCKED/FROZEN";
			break;
		case "X6":
			response = "INVALID MERCHANT (ACQURIER)";
			break;
		case "X7":
			response = "MERCHANT not reachable (ACQURIER)";
			break;
		case "XB":
			response = "INVALID TRANSACTION OR IF MEMBER IS NOT ABLE TO FIND ANY APPROPRIATE RESPONSE CODE (REMITTER)";
			break;
		case "XC":
			response = "INVALID TRANSACTION OR IF MEMBER IS NOT ABLE TO FIND ANY APPROPRIATE RESPONSE CODE (BENEFICIARY)";
			break;
		case "AM":
			response = "UPI PIN not set by customer";
			break;

		case "B1":
			response = "Registered Mobile number linked to the account has been changed/removed";
			break;
		case "B3":
			response = "Transaction not permitted to the account";
			break;
		case "0":
			response = "APPROVED OR COMPLETED SUCCESSFULLY";
			break;
		case "ZA":
			response = "TRANSACTION DECLINED BY CUSTOMER";
			break;
		case "ZH":
			response = "INVALID VIRTUAL ADDRESS";
			break;
		case "UX":
			response = "EXPIRED VIRTUAL ADDRESS";
			break;
		case "ZG":
			response = "VPA RESTRICTED BY CUSTOMER";
			break;
		case "ZE":
			response = "TRANSACTION NOT PERMITTED TO VPA by the PSP";
			break;
		case "ZB":
			response = "INVALID MERCHANT (PAYEE PSP)";
			break;

		case "YG":
			response = "MERCHANT ERROR (PAYEE PSP)";
			break;
		case "X1":
			response = "RESPONSE NOT RECEIVED WITHIN TAT AS SET BY PAYEE";
			break;
		case "UT":
			response = "REMITTER/ISSUER UNAVAILABLE (TIMEOUT)";
			break;
		case "BT":
			response = "ACQUIRER/BENEFICIARY UNAVAILABLE(TIMEOUT)";
			break;
		case "RB":
			response = "CREDIT REVERSAL TIMEOUT(REVERSAL)";
			break;
		case "RR":
			response = "DEBIT REVERSAL TIMEOUT(REVERSAL)";
			break;
		case "32":
			response = "PARTIAL REVERSAL";
			break;

		case "21":
			response = "NO ACTION TAKEN (FULL REVERSAL)";
			break;

		default:
			response = "No Description Available By Bank";

			break;
		}

		return response;
	}

}
