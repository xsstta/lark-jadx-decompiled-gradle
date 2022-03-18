package com.ss.lark.android.passport.biz.feature.auth_type;

import com.larksuite.suite.R;

public enum DisplayTypeEnum {
    PHONE(ContactPointTypeEnum.PHONE.value(), R.drawable.sign_sdk_cp_phone),
    MAIL(ContactPointTypeEnum.MAIL.value(), R.drawable.sign_sdk_cp_mail),
    OTP(3, R.drawable.sign_sdk_verify_otp),
    GOOGLE(4, R.drawable.sign_sdk_cp_google),
    APPLE(5, R.drawable.sign_sdk_cp_apple),
    IDP(ContactPointTypeEnum.IDP.value(), R.drawable.sign_sdk_cp_default),
    OTHERS(ContactPointTypeEnum.OTHERS.value(), R.drawable.sign_sdk_cp_default);
    
    private final int iconRes;
    private final int type;

    public int getIconRes() {
        return this.iconRes;
    }

    public int value() {
        return this.type;
    }

    public static DisplayTypeEnum fromValue(int i) {
        if (i == 1) {
            return PHONE;
        }
        if (i == 2) {
            return MAIL;
        }
        if (i == 3) {
            return OTP;
        }
        if (i != 32) {
            return OTHERS;
        }
        return IDP;
    }

    private DisplayTypeEnum(int i, int i2) {
        this.type = i;
        this.iconRes = i2;
    }
}
