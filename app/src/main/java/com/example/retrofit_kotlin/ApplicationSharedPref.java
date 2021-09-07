package com.example.retrofit_kotlin;

import android.app.Activity;
import android.content.Context;
import android.content.SharedPreferences;

public class ApplicationSharedPref {

    public static final String MPIN = "MPIN";
    public static final String BUSINESSNAME = "BUSINESSNAME";
    public static final String CRNUMBER = "CRNUMBER";
    public static final String BANKNAME = "BANKNAME";
    public static final String VATNUMBER = "VATNUMBER";
    public static final String NITAQAT = "NITAQAT";
    public static final String EMPLOYEES = "EMPLOYEES";
    public static final String TYPE = "TYPE";
    public static final String WEBSITE = "WEBSITE";
    public static final String DEVICEID = "DEVICEID";
    public static final String IBANNUMBER = "IBANNUMBER";
    public static final String REFERRAL_CODE = "REFERRALCODE";
    public static final String TOTAL_VALUE = "TOTALVALUE";
    public static final String OPERATER_NAME = "OPERATER_NAME";
    public static final String LANGUAGE = "LANGUAGE";
    public static final String DOB = "DOB";
    public static final String NATIONALITY = "NATIONALITY";
    public static final String DEVICE_GENERATED_KEY = "DEVICE_GENERATED_KEY";
    public static final String GIFT_OPERATER_NAME = "GIFT_OPERATER_NAME";
    public static final String LATITUDE = "LATITUDE";
    public static final String LONGITUDE = "LONGITUDE";
    public static final String MESSAGE_LOGIN_CHECK = "MESSAGE_LOGIN_CHECK";
    public static final String COMPULSORY_UPDATE = "COMPULSORY_UPDATE";
    public static final String MPINSAVE = "MPINSAVE";
    public static final String TIMETAKING = "TIMETAKING";
    public static final String MPINCHECK = "MPINCHECK";
    public static final String SHOP_OPERATER_NAME = "SHOP_OPERATER_NAME";
    public static final String UPDATE_MSG = "UPDATE_MSG";
    public static final String FCHECK = "FCHECK" ;
    public static final String MAINTAINANCE_MSG = "MAINTAINANCE_MSG";
    public static final String RECHARGE_MSG = "RECHARGE_MSG";
    public static final String SENDMONEY_MSG = "SENDMONEY_MSG";
    public static final String WALLET_MSG = "WALLET_MSG";
    public static final String MAINTAINANCE_AR_TXT = "MAINTAINANCE_AR_TXT" ;
    public static final String MAINTAINANCE_EN_TXT = "MAINTAINANCE_EN_TXT";
    public static final String RECHARGE_AR_TXT = "RECHARGE_AR_TXT" ;
    public static final String RECHARGE_EN_TXT = "RECHARGE_EN_TXT";
    public static final String WALLET_AR_TXT = "WALLET_AR_TXT";
    public static final String WALLET_EN_TXT = "WALLET_EN_TXT";
    public static final String SENDMONEY_AR_TXT = "SENDMONEY_AR_TXT";
    public static final String SENDMONEY_EN_TXT = "SENDMONEY_EN_TXT";
    public static final String VOUCHER_CODE = "VOUCHER_CODE";
    public static final String COMMON_OPERATER_NAME = "COMMON_OPERATER_NAME" ;
    public static final String CONFIGFILE = "CONFIGFILE";
    public static final String OPERATER_LIST = "OPERATER_LIST";
    public static final String COUPON_CODE = "COUPON_CODE";
    public static final String DIAL_CODE = "DIAL_CODE";
    public static final String STATUS = "STATUS";
    public static final String WITH_DRAW_RESP = "WITH_DRAW_RESP";
    public static final String TRANS_AMOUNT = "TRANS_AMOUNT";
    public static final String REQ_POPUP = "REQ_POPUP";
    public static final String REQ_AMOUNT_DETAILS = "REQ_AMOUNT_DETAILS";
    public static final String REQ_NAME = "REQ_NAME";
    public static final String REQ_AMOUNT = "REQ_AMOUNT";
    public static final String REQ_TRANS_ID  = "REQ_TRANS_ID";
    public static final String REQ_NUMBER = "REQ_NUMBER";
    public static final String REQ_COMMENTS  = "REQ_COMMENTS";
    public static final String ADD_SELECT_MONEY = "ADD_SELECT_MONEY";
    public static final String CHK_DEFAULT = "CHK_DEFAULT";
    public static final String IMAGE_ELECTRICITY = "IMAGE_ELECTRICITY";
    public static final String GIFTCARD_EN_TXT = "GIFTCARD_EN_TXT" ;
    public static final String GIFTCARD_AR_TXT = "GIFTCARD_AR_TXT" ;
    public static final String SHOP_AR_TXT = "SHOP_AR_TXT" ;
    public static final String SHOP_EN_TXT = "SHOP_EN_TXT" ;
    public static final String GIFTCARD_MSG = "GIFTCARD_MSG";
    public static final String SHOP_MSG = "SHOP_MSG";
    public static final String SAWA_CARD_BALANCE = "SAWA_CARD_BALANCE";
    public static final String SAWA_CARD_BALANCE_STATUS = "SAWA_CARD_BALANCE_STATUS";
    public static final String OFFER_IMAGE_STATUS = "OFFER_IMAGE_STATUS" ;
    public static final String SPEECH_CONFIGFILE = "SPEECH_CONFIGFILE";
    public static final String CONFIG_CHECK = "CONFIG_CHECK";
    public static final String SCAN_CHECK = "SCAN_CHECK";
    public static final String SCAN_REFERAL = "SCAN_REFERAL";
    public static final String NO_MORE = "NO_MORE";
    public static final String HOME_VIEW_DONT_SHOW = "HOME_VIEW_DONT_SHOW";
    public static final String STATUS_CHECK = "STATUS_CHECK";
    public static final  String IMAGE_PROFILE = "IMAGE_PROFILE";
    public static final String WALLET_TYPE = "WALLET_TYPE";
    public static final String ROOT_CHECK = "ROOT_CHECK";

    private static SharedPreferences mSharedPref;
    public static final String NAME = "NAME";
    public static final String USERID = "USERID";
    public static final String EMAIL = "EMAIL";
    public static final String MOBILE = "MOBILE";
    public static final String IMAGE = "IMAGE";
    public static final String WALLET_AMOUNT = "WALLETAMOUNT";
    public static final String PASSWORD = "PASSWORD";
    public static final String CITY = "CITY";
    public static final String COUNTRY_CODE = "COUNTRY_CODE";
    public static final String IPADDRES = "IPADDRES";

    public static final String LOGINCHECK = "LOGINCHECK";
    public static final String NOTIFICATION_TOKEN = "NOTIFICATION_TOKEN";
    public static final String GUESTSHOW = "GUESTSHOW";
    public static final String INSERT_DEVICE_DETAILS = "INSERT_DEVICE_DETAILS";
    public static final String USER_NAME = "USER_NAME";
    public static final String PASS_WORD = "PASSWORD";
    public static final String ACCESS_TOKEN = "ACCESS_TOKEN";
    public static final String ACTUAL_CASH = "ACTUAL_CASH";
    public static final String BONUS_CASH = "BONUS_CASH";
    public static final String MESSAGE_LOGIN = "MESSAGE_LOGIN";
    public static final String BANNERS = "BANNERS";
    public static final String RECHARGE_TRANSACTIONS = "RECHARGE_TRANSACTIONS";
    public static final String DRIVER_TRANSACTIONS = "DRIVER_TRANSACTIONS";
    public static final String WALLET_TRANSACTIONS = "WALLET_TRANSACTIONS";
    public static final String COUNTRY_NAME = "COUNTRY_NAME" ;
    public static final String IS_MAIL_VERIFIED = "IS_MAIL_VERIFIED" ;
    public static final String IS_MOBILE_VERIFIED = "IS_MOBILE_VERIFIED" ;
    public static final String READ_CONTACTS = "READ_CONTACTS" ;

    public static final String HELP_CONFIGFILE="HELP_CONFIGFILE";
    public static final String COUNTRY_FLAG = "COUNTRY_FLAG";
    public static final String LOCATIONS = "locations";
    public static final String DRIVER_BALANCE = "DRIVER_BALANCE";

    public static final String MOBILE_CHECK = "MOBILE_CHECK";
    public static final String IMAGE_PROFILE_URI1 = "IMAGE_PROFILE_URI1";




    public static SharedPreferences init(Context context)
    {
        if(mSharedPref == null) {
            mSharedPref = context.getSharedPreferences(context.getPackageName(), Activity.MODE_PRIVATE);
        }
        return mSharedPref;
    }

    public static String read(String key, String defValue) {
        return mSharedPref.getString(key, defValue);
    }

    public static void write(String key, String value) {
        SharedPreferences.Editor prefsEditor = mSharedPref.edit();
        prefsEditor.putString(key, value);
        prefsEditor.apply();
        prefsEditor.commit();

    }
//    public static void remove(String key) {
//        SharedPreferences.Editor prefsEditor = mSharedPref.edit();
//        prefsEditor.remove(key);
//        prefsEditor.apply();
//       // prefsEditor.commit();
//
//    }

    public static boolean read(String key, boolean defValue) {
        return mSharedPref.getBoolean(key, defValue);
    }


    public static void write(String key, boolean value) {
        SharedPreferences.Editor prefsEditor = mSharedPref.edit();
        prefsEditor.putBoolean(key, value);
        prefsEditor.apply();
        prefsEditor.commit();
    }

    public static Integer read(String key, int defValue) {
        return mSharedPref.getInt(key, defValue);
    }

    public static void write(String key, Integer value) {
        SharedPreferences.Editor prefsEditor = mSharedPref.edit();
        prefsEditor.putInt(key, value).commit();
    }
}
